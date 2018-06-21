package com.sttri.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConstants;
import com.sttri.entity.SysOrder;
import com.sttri.entity.SysOrderCriteria;
import com.sttri.entity.SysUser;
import com.sttri.enums.OrderIsCommentEnum;
import com.sttri.enums.OrderStatusEnum;
import com.sttri.enums.PayStatusEnum;
import com.sttri.enums.UserTypeEnum;
import com.sttri.service.ISysOrderService;
import com.sttri.service.ISysShopService;
import com.sttri.service.ISysUserService;
import com.sttri.utils.R;
import com.sttri.utils.Util;
import com.sttri.wxpay.Config;
import com.sttri.wxpay.MyPayConfig;

/**
 * 微信公众号支付，调用微信公众号支付接口
 * @author thj
 *
 */
@RestController
@RequestMapping("/sys/pay")
public class PayController extends BaseController {
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private ISysShopService sysShopService;
	
	@RequestMapping(value="/doPay",method=RequestMethod.POST)
	public R doPay(@RequestParam(value="wxId", required=true) String wxId,
				 @RequestParam(value="shopId", required=true) String shopId,
				 @RequestParam(value="orderId", required=false) String orderId,
				 @RequestParam(value="payDesc", required=true) String payDesc,
				 @RequestParam(value="devInfo", required=false) String devInfo,
				 @RequestParam(value="totalFee", required=true) String totalFee,
				 @RequestParam(value="appIP", required=true) String appIP,
				 @RequestParam(value="notifyUrl", required=true) String notifyUrl,
				 @RequestParam(value="businessType",required=true) Integer businessType,
				 @RequestParam(value="carNo",required=true) String carNo){
		logger.info("**wxPay**:"+wxId);
		try {
			SysUser user = this.sysUserService.selectByWxId(wxId);
			if (user == null) {
				if(createUser(wxId) == 1){
					user = this.sysUserService.selectByWxId(wxId);
				}else {
					return R.error("1000", "该用户不存在");
				}
			}
			String out_trade_no ="";
			SysOrder order = null;
			if (StringUtils.isEmpty(orderId)) {
				String lastOrderNo = this.sysOrderService.findMaxOrderNo();
				out_trade_no = Util.createOrderNo(lastOrderNo);
				createOrder(Integer.parseInt(shopId),user.getId(),out_trade_no, businessType,carNo,totalFee);
				order = getOrder(out_trade_no);
			}else {
				order = this.sysOrderService.selectByPrimaryKey(Integer.parseInt(orderId));
				out_trade_no = order.getOrderNo();
			}
			
			MyPayConfig config = new MyPayConfig(Config.APPID, Config.MCHID, Config.KEY, null, Config.httpConnectTimeoutMs, Config.httpReadTimeoutMs);
			WXPay wxPay = new WXPay(config);
			Map<String, String> map = new HashMap<String, String>();
			map.put("body", payDesc);
			map.put("out_trade_no", out_trade_no);
			map.put("device_info", devInfo);
			map.put("fee_type", "CNY");
			map.put("total_fee", Util.getMoney(totalFee));//元转化为分
			map.put("spbill_create_ip", appIP);
			map.put("notify_url", notifyUrl);
			map.put("trade_type", "JSAPI");  // 此处指定为扫码支付
			map.put("openid", "11111111");//当trade_type=jsapi的时候，openid必传
		
			Map<String, String> resMap = wxPay.unifiedOrder(map);
			System.out.println(resMap.get("return_code"));
			if (WXPayConstants.FAIL.equals(resMap.get("return_code"))) {
				return R.error("6000", resMap.get("return_msg"));
			}
			if (WXPayConstants.FAIL.equals(resMap.get("result_code"))) {
				return R.error(resMap.get("err_code"), resMap.get("err_code_des"));
			}
			order.setStatus(OrderStatusEnum.COMPLETED.getType());
			this.sysOrderService.updateByPrimaryKeySelective(order);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return R.ok();
	}
	
	//创建订单
	public void createOrder(int shopId,int userId,String orderNo,int businessType,String carNo,String totalFee){
		SysOrder order = new SysOrder();
		order.setShopId(shopId);
		order.setUserId(userId);
		order.setOrderNo(orderNo);
		order.setStatus(OrderStatusEnum.FOR_PAYMENT.getType());
		order.setBusinessType(businessType);
		order.setCarNo(carNo);
		order.setOrderSource(1);
		order.setOrderFee(Long.parseLong(totalFee));
		order.setPayStatus(PayStatusEnum.UN_PAY.getType());
		order.setAmount(Long.parseLong(totalFee));
		order.setIsComment(OrderIsCommentEnum.NO_COMMENT.getType());
		order.setOrderCreate(new Date());
		this.sysOrderService.insertSelective(order);
	}
	
	/**
	 * 根据订单编号获取该订单信息
	 * @param orderNo
	 * @return
	 */
	public SysOrder getOrder(String orderNo){
		SysOrder order = null;
		try {
			SysOrderCriteria example = new SysOrderCriteria();
			example.createCriteria().andOrderNoEqualTo(orderNo);
			List<SysOrder> list = this.sysOrderService.selectByExample(example);
			if (list != null && list.size() >0) {
				order = list.get(0);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return order;
	}
	
	/**
	 * 根据微信ID创建新用户，然后返回该wxId的用户对象
	 * @param wxId
	 * @return
	 */
	public int  createUser(String wxId){
		SysUser user = new SysUser();
		user.setWxid(wxId);
		user.setNickname(wxId);
		user.setSex(0);
		user.setCity("");
		user.setAddress("");
		user.setUserName(wxId);
		user.setMobile("");
		user.setBirthday("");
		user.setStatus(0);
		user.setType(UserTypeEnum.N.getType());
		user.setLoveMot(0);
		user.setLoveMaintain(0);
		user.setLoveInsurance(0);
		user.setAddtime(new Date());
		int result = this.sysUserService.insertSelective(user);
		return result;
	}
}

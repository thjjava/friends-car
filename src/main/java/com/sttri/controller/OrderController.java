package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysOrder;
import com.sttri.entity.SysUser;
import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.enums.OrderIsCommentEnum;
import com.sttri.enums.PayStatusEnum;
import com.sttri.service.ISysOrderService;
import com.sttri.service.ISysUserService;
import com.sttri.service.IUserCarService;
import com.sttri.utils.R;
import com.sttri.utils.Util;
import com.sttri.vo.OrderVo;

@RestController
@RequestMapping("/sys/order")
public class OrderController extends BaseController {
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private IUserCarService userCarService;
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public R save(@RequestParam(value="shopId",required=true) Integer shopId,
				@RequestParam(value="wxId",required=true) String wxId,
				@RequestParam(value="businessType",required=true) Integer businessType,
				@RequestParam(value="status",required=true) Integer status,
				@RequestParam(value="carNo",required=true) String carNo,
				@RequestParam(value="orderSource",required=true) Integer orderSource,
				@RequestParam(value="orderTime",required=false) String orderTime,
				@RequestParam(value="orderFee",required=true) Long orderFee,
				@RequestParam(value="serviceEmployee",required=false) String serviceEmployee,
				@RequestParam(value="serviceContent",required=false) String serviceContent,
				@RequestParam(value="serviceSuggest",required=false) String serviceSuggest,
				@RequestParam(value="serviceEnsure",required=false) String serviceEnsure,
				@RequestParam(value="carCurrentMileage",required=false) String carCurrentMileage,
				@RequestParam(value="remark",required=false) String remark){
		
		logger.info("**createOrder**:"+wxId);
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		String lastOrderNo = this.sysOrderService.findMaxOrderNo();
		SysOrder order = new SysOrder();
		order.setShopId(shopId);
		order.setUserId(user.getId());
		order.setOrderNo(Util.createOrderNo(lastOrderNo));
		order.setStatus(status);
		order.setBusinessType(businessType);
		order.setCarNo(carNo);
		order.setOrderSource(orderSource);
		order.setOrderTime(orderTime);
		order.setOrderFee(orderFee);
		order.setServiceEmployee(serviceEmployee);
		order.setServiceContent(serviceContent);
		order.setServiceSuggest(serviceSuggest);
		order.setServiceEnsure(serviceEnsure);
		order.setCarCurrentMileage(carCurrentMileage);
		order.setRemark(remark);
		order.setPayStatus(PayStatusEnum.UN_PAY.getType());
		order.setAmount(orderFee);
		order.setIsComment(OrderIsCommentEnum.NO_COMMENT.getType());
		order.setOrderCreate(new Date());
		int result = this.sysOrderService.insertSelective(order);
		if (result == 1) {
			return R.ok();
		}else {
			return R.error("4000", "订单创建失败");
		}
	}
	
	/**
	 * 根据用户微信Id查询所有的订单，根据创建日期倒序查询
	 * @param wxId
	 * @return
	 */
	@RequestMapping("/queryUserOrders")
	public R queryUserOrders(@RequestParam(required=true) String wxId){
		logger.info("**queryUserOrders**:"+wxId);
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		List<OrderVo> list = this.sysOrderService.queryUserOrders(user.getId());
		logger.info("**queryUserOrders**:"+list);
		return R.ok().put("order", list);
	}
	
	@RequestMapping("/info/{id}")
	public R getDetail(@PathVariable("id") Integer id){
		SysOrder order = this.sysOrderService.selectByPrimaryKey(id);
		if (order == null) {
			return R.error("4000", "订单不存在");
		}
		String carNo = order.getCarNo();
		UserCarCriteria example = new UserCarCriteria();
		example.createCriteria().andCarNoEqualTo(carNo);
		List<UserCar> uCars = this.userCarService.selectByExample(example);
		UserCar userCar = null;
		if (uCars != null && uCars.size() >0) {
			userCar = uCars.get(0);
		}
		return R.ok().put("order", order).put("car", userCar);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public R update(@RequestParam(value="orderId",required=true) Integer orderId,
			@RequestParam(value="status",required=true) Integer status,
			@RequestParam(value="orderFee",required=true) Long orderFee,
			@RequestParam(value="amount",required=true) Long amount,
			@RequestParam(value="payStatus",required=true) Integer payStatus,
			@RequestParam(value="orderTime",required=false) String orderTime,
			@RequestParam(value="serviceEmployee",required=false) String serviceEmployee,
			@RequestParam(value="serviceContent",required=false) String serviceContent,
			@RequestParam(value="serviceSuggest",required=false) String serviceSuggest,
			@RequestParam(value="serviceEnsure",required=false) String serviceEnsure,
			@RequestParam(value="carCurrentMileage",required=false) String carCurrentMileage,
			@RequestParam(value="remark",required=false) String remark){
		logger.info("**updateOrder**:"+orderId);
		SysOrder order = this.sysOrderService.selectByPrimaryKey(orderId);
		if (order == null) {
			return R.error("4000", "该订单不存在!");
		}
		order.setStatus(status);
		order.setOrderFee(orderFee);
		order.setAmount(amount);
		order.setPayStatus(payStatus);
		order.setOrderTime(orderTime);
		order.setServiceEmployee(serviceEmployee);
		order.setServiceContent(serviceContent);
		order.setServiceSuggest(serviceSuggest);
		order.setServiceEnsure(serviceEnsure);
		order.setCarCurrentMileage(carCurrentMileage);
		order.setRemark(remark);
		order.setEdittime(new Date());
		this.sysOrderService.updateByPrimaryKeySelective(order);
		logger.info("**after_update_order**:"+order);
		return R.ok().put("order", order);
	}
	
	
}

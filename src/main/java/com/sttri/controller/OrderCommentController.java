package com.sttri.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.OrderComment;
import com.sttri.entity.SysOrder;
import com.sttri.entity.SysShop;
import com.sttri.entity.SysUser;
import com.sttri.service.IOrderCommentService;
import com.sttri.service.ISysOrderService;
import com.sttri.service.ISysShopService;
import com.sttri.service.ISysUserService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/orderComment")
public class OrderCommentController extends BaseController {
	@Autowired
	private IOrderCommentService orderCommentService;
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private ISysShopService sysShopService;
	
	@RequestMapping("/save")
	@ResponseBody
	public R save(@RequestParam(value="wxId",required=true) String wxId,
			@RequestParam(value="orderId",required=true) Integer orderId,
			@RequestParam(value="shopId",required=true) Integer shopId,
			@RequestParam(value="serviceLevel",required=true) Integer serviceLevel,
			@RequestParam(value="waitLevel",required=true) Integer waitLevel,
			@RequestParam(value="attitudeLevel",required=true) Integer attitudeLevel,
			@RequestParam(value="qualityLevel",required=true) Integer qualityLevel,
			@RequestParam(value="timeLenLevel",required=true) Integer timeLenLevel,
			@RequestParam(value="content",required=true) String content,
			@RequestParam(value="nextServiceAdvice",required=false) String nextServiceAdvice){
		
		logger.info("**createOrderComment**:"+wxId);
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		SysShop shop = this.sysShopService.selectByPrimaryKey(shopId);
		if (shop == null) {
			return R.error("2000","店铺不存在");
		}
		SysOrder order = this.sysOrderService.selectByPrimaryKey(orderId);
		if (order == null) {
			return R.error("4000","订单不存在");
		}
		OrderComment orderComment = new OrderComment();
		orderComment.setUserId(user.getId());
		orderComment.setShopId(shopId);
		orderComment.setOrderId(orderId);
		orderComment.setAttitudeLevel(attitudeLevel);
		orderComment.setServiceLevel(serviceLevel);
		orderComment.setWaitLevel(waitLevel);
		orderComment.setQualityLevel(qualityLevel);
		orderComment.setTimelenLevel(timeLenLevel);
		orderComment.setContent(content);
		orderComment.setNextServiceAdvice(nextServiceAdvice);
		orderComment.setFlag(0);
		orderComment.setBusinessType(order.getBusinessType());
		orderComment.setCommentTime(new Date());
		this.orderCommentService.insert(orderComment);
		return R.ok();
	}
	
	
}

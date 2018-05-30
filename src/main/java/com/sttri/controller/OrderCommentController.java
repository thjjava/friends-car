package com.sttri.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.OrderComment;
import com.sttri.entity.SysOrder;
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
	public R save(@RequestParam(value="orderId",required=true) Integer orderId,
			@RequestParam(value="serviceLevel",required=true) Integer serviceLevel,
			@RequestParam(value="waitLevel",required=true) Integer waitLevel,
			@RequestParam(value="attitudeLevel",required=true) Integer attitudeLevel,
			@RequestParam(value="qualityLevel",required=true) Integer qualityLevel,
			@RequestParam(value="timeLenLevel",required=true) Integer timeLenLevel,
			@RequestParam(value="content",required=true) String content,
			@RequestParam(value="nextServiceAdvice",required=false) String nextServiceAdvice){
		
		logger.info("**createOrderComment**:"+orderId);
		SysOrder order = this.sysOrderService.selectByPrimaryKey(orderId);
		if (order == null) {
			return R.error("4000","订单不存在");
		}
		OrderComment orderComment = new OrderComment();
		orderComment.setUserId(order.getUserId());
		orderComment.setShopId(order.getShopId());
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

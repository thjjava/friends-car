package com.sttri.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.OrderComment;
import com.sttri.service.IOrderCommentService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/orderComment")
public class OrderCommentController extends BaseController {
	@Autowired
	private IOrderCommentService orderCommentService;
	
	@RequestMapping("/save")
	public R save(@RequestBody OrderComment orderComment){
		if (orderComment.getUserId() == null) {
			return R.error("1000", "用户不存在");
		}
		if (orderComment.getShopId() == null) {
			return R.error("2000","店铺不存在");
		}
		if (orderComment.getOrderId() == null) {
			return R.error("4000","订单不存在");
		}
		orderComment.setCommentTime(new Date());
		this.orderCommentService.insert(orderComment);
		return R.ok();
	}
	
	
}

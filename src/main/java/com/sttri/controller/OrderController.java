package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysOrder;
import com.sttri.entity.SysOrderCriteria;
import com.sttri.service.ISysOrderService;
import com.sttri.service.ISysUserService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/order")
public class OrderController extends BaseController {
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private ISysUserService sysUserService;
	
	
	@RequestMapping("/save")
	public R save(@RequestBody SysOrder order){
		order.setStatus(0);
		order.setOrderCreate(new Date());
		int result = this.sysOrderService.insertSelective(order);
		if (result == 1) {
			return R.ok();
		}else {
			return R.error("4000", "订单创建失败");
		}
	}
	
	/**
	 * 根据用户Id查询所有的订单，根据创建日期倒序查询
	 * @param userId
	 * @return
	 */
	@RequestMapping("/queryUserOrders")
	public R queryUserOrders(@RequestParam(required=true) Integer userId){
		logger.info("**queryUserOrders**:"+userId);
		SysOrderCriteria example = new SysOrderCriteria();
		example.setOrderByClause("orderCreate desc");
		example.createCriteria().andUserIdEqualTo(userId);
		List<SysOrder> list = this.sysOrderService.selectByExample(example);
		return R.ok().put("order", list);
	}
	
	@RequestMapping("/info/{id}")
	public R getDetail(@PathVariable("id") Integer id){
		SysOrder order = this.sysOrderService.selectByPrimaryKey(id);
		if (order == null) {
			return R.error("4000", "订单不存在");
		}
		return R.ok().put("order", order);
	}
	
	@RequestMapping("/update")
	public R update(@RequestBody SysOrder order){
		order.setEdittime(new Date());
		this.sysOrderService.updateByPrimaryKeySelective(order);
		return R.ok();
	}
	
	
}

package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysOrder;
import com.sttri.entity.SysOrderCriteria;
import com.sttri.entity.SysUser;
import com.sttri.service.ISysOrderService;
import com.sttri.service.ISysUserService;
import com.sttri.utils.R;
import com.sttri.utils.Util;

@RestController
@RequestMapping("/sys/order")
public class OrderController extends BaseController {
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private ISysUserService sysUserService;
	
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public R save(@RequestBody SysOrder order){
		String lastOrderNo = this.sysOrderService.findMaxOrderNo();
		order.setOrderNo(Util.createOrderNo(lastOrderNo));
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
		SysOrderCriteria example = new SysOrderCriteria();
		example.setOrderByClause("orderCreate desc");
		example.createCriteria().andUserIdEqualTo(user.getId());
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

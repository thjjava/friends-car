package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.sttri.entity.ShopAppointment;
import com.sttri.entity.ShopAppointmentCriteria;
import com.sttri.entity.ShopAppointmentCriteria.Criteria;
import com.sttri.entity.SysOrder;
import com.sttri.enums.OrderStatusEnum;
import com.sttri.service.IShopAppointmentService;
import com.sttri.service.ISysOrderService;
import com.sttri.utils.DateUtils;
import com.sttri.utils.R;

/**
 * 预约服务接口
 * @author thj
 *
 */
@RestController
@RequestMapping("/sys/appointment")
public class AppointmentController extends BaseController {
	@Autowired
	private IShopAppointmentService shopAppointmentService;
	@Autowired
	private ISysOrderService sysOrderService;
	
	
	
	/**
	 * 根据店铺编号，业务类型，预约日期，获取该店铺各个时段的预约情况
	 * @param shopId
	 * @param businessType
	 * @param businessDate
	 * @return
	 */
	@RequestMapping("/queryShopAppointment")
	public R queryShopAppointment(@RequestParam(required=true) int shopId,
			@RequestParam(required=true) int businessType,
			@RequestParam(required=true) String businessDate){
		ShopAppointmentCriteria example = new ShopAppointmentCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andShopIdEqualTo(shopId)
				.andBusinessTypeEqualTo(businessType)
				.andBusinessDateEqualTo(businessDate);
		JSONObject obj = null;
		JSONArray array = new JSONArray();
		for (int i = 0; i < 26; i++) {
			criteria.andTimeNoEqualTo(i);
			List<ShopAppointment> list = this.shopAppointmentService.selectByExample(example);
			obj = new JSONObject();
			obj.put("time_no", i);
			obj.put("business_num", list.size());
			boolean flag = false;//表示是否预约满
			if (list != null && list.size() >0) {
				int total = list.get(0).getBusinessTotal();//总共可预约数
				 flag = list.size() < total?false:true;
			}
			obj.put("isFull", flag);
			array.add(obj);
		}
		logger.info("**queryShopAppointment**:"+array.toJSONString());
		return R.ok().put("appointment", array);
	}
	
	/**
	 * 根据店铺编号查询该店铺未来半个月内的预约情况
	 * @return
	 */
	@RequestMapping("queryDaysAppointment")
	public R queryDaysAppointment(@RequestParam(required=true) Integer shopId,
			@RequestParam(required=true) Integer businessType){
		ShopAppointmentCriteria example = new ShopAppointmentCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andShopIdEqualTo(shopId)
				.andBusinessTypeEqualTo(businessType);
		JSONObject obj = null;
		JSONArray array = new JSONArray();
		for (int i = 0; i < 15; i++) {
			String day = DateUtils.plusDays(i);
			criteria.andBusinessDateEqualTo(day);
			List<ShopAppointment> list = this.shopAppointmentService.selectByExample(example);
			obj = new JSONObject();
			obj.put(day, list.size());
			boolean flag = false;//表示是否预约满
			if (list != null && list.size()>0) {
				int total = list.get(0).getBusinessTotal();
				flag = list.size() < (total * 26)? false:true;
			}
			obj.put("isFull", flag);
			array.add(obj);
		}
		return R.ok().put("appointment", array);
	}
	
	/**
	 * 预约
	 * @param shopId
	 * @param userId
	 * @param businessType
	 * @param businessDate
	 * @param timeNo
	 * @return
	 */
	@RequestMapping("/save")
	public R save(@RequestParam(required=true) int shopId,
			@RequestParam(required=true) int userId,
			@RequestParam(required=true) int businessType,
			@RequestParam(required=true) String businessDate,
			@RequestParam(required=true) int timeNo ){
		ShopAppointmentCriteria example = new ShopAppointmentCriteria();
		example.createCriteria().andShopIdEqualTo(shopId)
								.andBusinessTypeEqualTo(businessType)
								.andBusinessDateEqualTo(businessDate)
								.andTimeNoEqualTo(timeNo);
		List<ShopAppointment> list = this.shopAppointmentService.selectByExample(example);
		if (list != null && list.size()>0) {
			return R.error("3002", "已经预约过了");
		}
		ShopAppointment shopAppointment = new ShopAppointment();
		shopAppointment.setShopId(shopId);
		shopAppointment.setBusinessDate(businessDate);
		shopAppointment.setBusinessType(businessType);
		shopAppointment.setTimeNo(timeNo);
		shopAppointment.setAddtime(new Date());
		this.shopAppointmentService.insert(shopAppointment);
		//创建待服务状态的订单
		SysOrder order = new SysOrder();
		order.setUserId(userId);
		order.setShopId(shopId);
		order.setBusinessType(businessType);
		order.setOrderNo("111");
		order.setOrderSource(1);
		order.setOrderTime(businessDate);
		order.setStatus(OrderStatusEnum.FOR_SERVICE.getType());
		order.setAppointmentId(timeNo);
		order.setOrderCreate(new Date());
		this.sysOrderService.insert(order);
		return R.ok("预约成功");
	}
	
}

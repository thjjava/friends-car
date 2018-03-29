package com.sttri.service;


import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.PathVariable;

import com.sttri.entity.SysBusiness;
import com.sttri.entity.SysBusinessCriteria;
import com.sttri.entity.SysOrderCriteria;
import com.sttri.entity.SysOrderCriteria.Criteria;
import com.sttri.entity.SysShop;
import com.sttri.entity.SysShopCriteria;
import com.sttri.entity.SysUser;
import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.enums.OrderIsCommentEnum;
import com.sttri.enums.OrderStatusEnum;
import com.sttri.service.ISysShopService;
import com.sttri.utils.R;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml",
		"classpath:spring-mybatis.xml"})
public class TestService {

	@Autowired
	private ISysShopService sysShopService;
	@Autowired
	private ISysBusinessService sysBusinessService;
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private IOrderCommentService orderCommentService;
	@Autowired
	private IUserCarService userCarService;
	
/*	@Test
	public void addShop(){
		SysShop shop = new SysShop();
		shop.setShopNo("SN002");
		shop.setShopName("test002");
		shop.setAddress("上海");
		shop.setBusinessStartTime("09:00:00");
		shop.setBusinessEndTime("20:00:00");
		shop.setContact("test");
		shop.setMobile("18900000000");
		shop.setLat("123");
		shop.setLon("123");
		shop.setShopQrcode("11");
		shop.setEmployeesQrcode("22");
		shop.setRegisterDate(new Date());
		int result = this.sysShopService.insert(shop);
		System.out.println("测试新增结果:"+result);
		System.out.println(shop);
	}*/

	/*@Test
	public void queryShopById(){
		SysShop shop = this.sysShopService.selectByPrimaryKey(1);
		System.out.println("查询对象："+shop.toString());
		SysShopCriteria example = new SysShopCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(1);
		List<SysShop> list = this.sysShopService.selectByExample(example);
		System.out.println("shop:"+list.toString());
	}
	
	@Test
	public void queryShopByBusinessType(){
		List<SysShop> list = this.sysShopService.queryShopByBusinessType(0);
		System.out.println(list.toString());
	}
	
	@Test
	public void queryBusiness(){
		SysBusinessCriteria businessCriteria = new SysBusinessCriteria();
		com.sttri.entity.SysBusinessCriteria.Criteria criteria = businessCriteria.createCriteria();
		criteria.andTypeEqualTo(0);
		List<SysBusiness> bList = this.sysBusinessService.selectByExample(businessCriteria);
		System.out.println("business:"+bList.toString());
	}*/
	
	/*@Test
	public void queryOrdersByStatus(){
		int result = this.sysOrderService.countByStatus(1, 2);
		System.out.println(result);
		SysOrderCriteria orderCriteria = new SysOrderCriteria();
		orderCriteria.createCriteria().andIsCommentEqualTo(OrderIsCommentEnum.NO_COMMENT.getType());
		int not_comment_orders = this.sysOrderService.countByExample(orderCriteria);
		System.out.println(not_comment_orders);
	}*/
	
	@Test
	public void queryBusinessType(){
		SysBusinessCriteria example = new SysBusinessCriteria();
		example.setOrderByClause("type asc");
		List<SysBusiness> businesses = this.sysBusinessService.selectByExample(example);
		System.out.println(businesses);
	}
}

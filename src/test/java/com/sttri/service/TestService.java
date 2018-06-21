package com.sttri.service;


import java.math.BigDecimal;
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
import com.sttri.entity.SysOrder;
import com.sttri.entity.SysShop;
import com.sttri.entity.SysShopCriteria;
import com.sttri.entity.SysUser;
import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.entity.UserShop;
import com.sttri.enums.OrderIsCommentEnum;
import com.sttri.enums.OrderStatusEnum;
import com.sttri.service.ISysShopService;
import com.sttri.utils.R;
import com.sttri.vo.OrderVo;

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
	@Autowired
	private IUserShopService userShopService;
	
/*	@Test
	public void addShop(){
		SysShop shop = new SysShop();
		shop.setShopNo("SN003");
		shop.setShopName("test003");
		shop.setAddress("上海");
		shop.setBusinessStartTime("09:00:00");
		shop.setBusinessEndTime("20:00:00");
		shop.setContact("test");
		shop.setMobile("18900000000");
		shop.setLat("123");
		shop.setLon("123");
		shop.setShopQrcode("11");
		shop.setEmployeesQrcode("22");
		shop.setScore(BigDecimal.valueOf(0));
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
	
	/*@Test
	public void queryBusinessType(){
		SysBusinessCriteria example = new SysBusinessCriteria();
		example.setOrderByClause("type asc");
		List<SysBusiness> businesses = this.sysBusinessService.selectByExample(example);
		System.out.println(businesses);
	}*/
	
/*	@Test
	public void bindShop(){
		SysUser user = this.sysUserService.selectByPrimaryKey(1);
		System.out.println("1="+user);
		SysShop shop = this.sysShopService.selectByPrimaryKey(2);
		UserShop userShop = new UserShop();
		userShop.setUserId(1);
		userShop.setShopId(2);
		userShop.setStatus(0);
		userShop.setType("N");
		userShop.setAttentionTime(new Date());
		this.userShopService.insert(userShop);
		user.setLabel(shop.getShopNo()+"-"+user.getNickname());
		user.setType("N");
		user.setEdittime(new Date());
		this.sysUserService.updateByPrimaryKeySelective(user);
		System.out.println("2="+user);
	}*/
	
	/*@Test
	public void queryMaxShopNo(){
		System.out.println(sysShopService.findMaxShopNo());
	}*/
	
	@Test
	public void queryOrdersByUser(){
		/*SysOrderCriteria example = new SysOrderCriteria();
		example.setOrderByClause("order_create desc");
		example.createCriteria().andUserIdEqualTo(1);
		List<SysOrder> list = this.sysOrderService.selectByExample(example);*/
		List<OrderVo> list = this.sysOrderService.queryUserOrders(1);
		System.out.println(list);
	}
	
	/*@Test
	public void queryShopByUser(){
		List<SysShop> shop = this.sysShopService.queryShopByUser(1);
		System.out.println(shop);
	}*/
}

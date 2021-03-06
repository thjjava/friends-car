package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysOrderCriteria;
import com.sttri.entity.SysUser;
import com.sttri.entity.SysUserCriteria;
import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.enums.OrderIsCommentEnum;
import com.sttri.enums.OrderStatusEnum;
import com.sttri.enums.UserTypeEnum;
import com.sttri.service.IOrderCommentService;
import com.sttri.service.ISysOrderService;
import com.sttri.service.ISysUserService;
import com.sttri.service.IUserCarService;
import com.sttri.utils.R;

/**
 * 用户
 * @author thj
 *
 */
@RestController
@RequestMapping("/sys/user")
public class UserController extends BaseController{
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private ISysOrderService sysOrderService;
	@Autowired
	private IOrderCommentService orderCommentService;
	@Autowired
	private IUserCarService userCarService;


	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public R save(@RequestParam(value="wxId", required=true) String wxId,
				@RequestParam(value="nickName", required=true) String nickName,
				@RequestParam(value="sex", required=true) Integer sex,
				@RequestParam(value="city", required=true) String city,
				@RequestParam(value="address", required=false) String address,
				@RequestParam(value="userName", required=false) String userName,
				@RequestParam(value="mobile", required=false) String mobile,
				@RequestParam(value="birthday", required=false) String birthday){
		
		if (StringUtils.isEmpty(wxId)) {
			return R.error("1004", "微信ID不能为空");
		}
		SysUserCriteria example = new SysUserCriteria();
		example.createCriteria().andWxidEqualTo(wxId);
		List<SysUser> uList = this.sysUserService.selectByExample(example);
		if (uList != null && uList.size() >0) {
			SysUser user =  uList.get(0);
			if (user.getStatus() == 0) {
				return R.error("1005", "该用户已存在");
			}else {
				user.setNickname(nickName);
				user.setSex(sex);
				user.setCity(city);
				user.setAddress(address);
				user.setUserName(userName);
				user.setMobile(mobile);
				user.setBirthday(birthday);
				user.setStatus(0);
				user.setEdittime(new Date());
				this.sysUserService.updateByPrimaryKeySelective(user);
			}
		}else {
			SysUser user = new SysUser();
			user.setWxid(wxId);
			user.setNickname(nickName);
			user.setSex(sex);
			user.setCity(city);
			user.setAddress(address);
			user.setUserName(userName);
			user.setMobile(mobile);
			user.setBirthday(birthday);
			user.setStatus(0);
			user.setType(UserTypeEnum.N.getType());
			user.setLoveMot(0);
			user.setLoveMaintain(0);
			user.setLoveInsurance(0);
			user.setAddtime(new Date());
			this.sysUserService.insertSelective(user);
		}
		return R.ok();
	}
	
	/**
	 * 获取用户信息 ，查询用户下待服务的订单数，代付款的订单数，带评论的订单数，用户的车库
	 * @param id
	 * @return
	 */
	@RequestMapping("/info")
	public R getUser(@RequestParam(required=true) String wxId){
		//查询用户信息
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		//查询待付款数
		int not_pay_orders = this.sysOrderService.countByStatus(user.getId(), OrderStatusEnum.FOR_PAYMENT.getType());
		//查询待服务数
		int not_service_orders = this.sysOrderService.countByStatus(user.getId(), OrderStatusEnum.FOR_SERVICE.getType());
		//查询待评价数
		SysOrderCriteria orderCriteria = new SysOrderCriteria();
		orderCriteria.createCriteria().andIsCommentEqualTo(OrderIsCommentEnum.NO_COMMENT.getType());
		int not_comment_orders = this.sysOrderService.countByExample(orderCriteria);
		//查询用户汽车库
		UserCarCriteria userCarCriteria = new UserCarCriteria();
		userCarCriteria.createCriteria().andUserIdEqualTo(user.getId());
		List<UserCar> uCars = this.userCarService.selectByExample(userCarCriteria);
		return R.ok().put("user", user)
					.put("not_pay_orders", not_pay_orders)
					.put("not_service_orders", not_service_orders)
					.put("not_comment_orders", not_comment_orders)
					.put("car", uCars);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public R update(@RequestParam(value="wxId", required=true) String wxId,
			@RequestParam(value="nickName", required=true) String nickName,
			@RequestParam(value="sex", required=true) Integer sex,
			@RequestParam(value="city", required=true) String city,
			@RequestParam(value="address", required=false) String address,
			@RequestParam(value="userName", required=false) String userName,
			@RequestParam(value="mobile", required=false) String mobile,
			@RequestParam(value="birthday", required=false) String birthday){
		
		if (StringUtils.isEmpty(wxId)) {
			return R.error("1004", "微信ID不能为空");
		}
		SysUserCriteria example = new SysUserCriteria();
		example.createCriteria().andWxidEqualTo(wxId);
		List<SysUser> uList = this.sysUserService.selectByExample(example);
		if (uList != null && uList.size() >0) {
			SysUser user = uList.get(0);
			user.setWxid(wxId);
			user.setNickname(nickName);
			user.setSex(sex);
			user.setCity(city);
			user.setAddress(address);
			user.setUserName(userName);
			user.setMobile(mobile);
			user.setBirthday(birthday);
			user.setEdittime(new Date());
			this.sysUserService.updateByPrimaryKeySelective(user);
			return R.ok();
		}else {
			return R.error("1000", "该用户不存在");
		}
	}
}

package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysShop;
import com.sttri.entity.SysUser;
import com.sttri.entity.UserShop;
import com.sttri.entity.UserShopCriteria;
import com.sttri.entity.UserShopCriteria.Criteria;
import com.sttri.service.ISysShopService;
import com.sttri.service.ISysUserService;
import com.sttri.service.IUserShopService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/usershop")
public class UserShopController extends BaseController {

	@Autowired
	private IUserShopService userShopService;
	@Autowired
	private ISysUserService sysUserService;
	@Autowired
	private ISysShopService sysShopService;
	
	/**
	 * 用户关注店铺
	 * @param userId
	 * @param shopId
	 * @return
	 * http://plat.youlincar.com/friends-car/sys/usershop/bindShop?userId=1&shopId=1
	 */
	/**
	 * @param userId
	 * @param shopId
	 * @return
	 */
	@RequestMapping("/bindShop")
	public R bindShop(@RequestParam(required=true) String wxId,@RequestParam(required=true) int shopId){
		logger.info("***bindShop_wxId***:"+wxId+"&&shopId="+shopId);
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		SysShop shop = this.sysShopService.selectByPrimaryKey(shopId);
		if (shop == null) {
			return R.error("2000", "该店铺不存在");
		}
		UserShopCriteria example = new UserShopCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(user.getId());
		criteria.andShopIdEqualTo(shopId);
		List<UserShop> usList = this.userShopService.selectByExample(example);
		if (usList == null || usList.size() ==0) {
			UserShop userShop = new UserShop();
			userShop.setUserId(user.getId());
			userShop.setShopId(shopId);
			userShop.setStatus(0);
			userShop.setType("N");
			userShop.setAttentionTime(new Date());
			this.userShopService.insert(userShop);
		}
		String label = "";
		user.setLabel(label);
		user.setType("N");
		user.setEdittime(new Date());
		this.sysUserService.updateByPrimaryKeySelective(user);
		logger.info("**user_after_update**:"+user);
		return R.ok("关注成功").put("user", user);
	}
	
	/**
	 * 取消用户关注店铺
	 * @param id
	 * @return
	 * http://localhost:8080/friends-car/sys/usershop/delete/1
	 */
	@RequestMapping("/delete/{id}")
	public R cancleBindShop(@PathVariable("id") int id){
		logger.info("**取消关注店铺**"+id);
		UserShop userShop = this.userShopService.selectByPrimaryKey(id);
		if (userShop != null) {
			userShop.setStatus(1);
			this.userShopService.updateByPrimaryKey(userShop);
		}
		return R.ok("取消关注成功");
	}
	
	@RequestMapping("/queryShopByUser")
	public R queryShopByUser(@RequestParam String wxId){
		logger.info("**查询关注店铺**:"+wxId);
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		
		return R.ok();
	}
}

package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.UserShop;
import com.sttri.entity.UserShopCriteria;
import com.sttri.entity.UserShopCriteria.Criteria;
import com.sttri.service.IUserShopService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/usershop")
public class UserShopController extends BaseController {

	@Autowired
	private IUserShopService userShopService;
	
	
	/**
	 * 用户关注店铺
	 * @param userId
	 * @param shopId
	 * @return
	 * http://plat.youlincar.com/friends-car/sys/user?userId=1&shopId=1
	 */
	@RequestMapping("/bindShop")
	public R bindShop(@RequestParam(required=true) int userId,@RequestParam(required=true) int shopId){
		logger.info("***bindShop_userId***:"+userId+"&&shopId="+shopId);
		UserShopCriteria example = new UserShopCriteria();
		Criteria criteria = example.createCriteria();
		criteria.andUserIdEqualTo(userId);
		criteria.andShopIdEqualTo(shopId);
		List<UserShop> usList = this.userShopService.selectByExample(example);
		if (usList == null || usList.size() ==0) {
			UserShop userShop = new UserShop();
			userShop.setUserId(userId);
			userShop.setShopId(shopId);
			userShop.setStatus(0);
			userShop.setType("N");
			userShop.setAttentionTime(new Date());
			this.userShopService.insert(userShop);
		}
		return R.ok("关注成功");
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
}

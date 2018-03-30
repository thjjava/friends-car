package com.sttri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.service.IUserCarService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/userCar")
public class UserCarController extends BaseController {
	@Autowired
	private IUserCarService userCarService;
	
	
	@RequestMapping("/queryByUserId")
	public R queryByUserId(@RequestParam Integer userId){
		UserCarCriteria example = new UserCarCriteria();
		example.createCriteria().andUserIdEqualTo(userId);
		List<UserCar> uCars = this.userCarService.selectByExample(example);
		return R.ok().put("car", uCars);
	}
	
	@RequestMapping("/save")
	public R save(@RequestBody UserCar userCar){
		if (StringUtils.isEmpty(userCar.getCarNo())) {
			return R.error("5001", "车牌号不能为空");
		}
		int result = this.userCarService.insert(userCar);
		if (result == 1) {
			return R.ok();
		}else {
			return R.error();
		}
	}
	
	@RequestMapping("/update")
	public R update(@RequestBody UserCar userCar){
		if (StringUtils.isEmpty(userCar.getCarNo())) {
			return R.error("5001", "车牌号不能为空");
		}
		int result = this.userCarService.updateByPrimaryKeySelective(userCar);
		if (result == 1) {
			return R.ok();
		}else {
			return R.error();
		}
	}
	
	@RequestMapping("/delete/{id}")
	public R delete(@PathVariable("id") Integer id){
		int result = this.userCarService.deleteByPrimaryKey(id);
		if (result == 1) {
			return R.ok();
		}else {
			return R.error();
		}
	}
}

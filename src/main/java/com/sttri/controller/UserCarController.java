package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysUser;
import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.service.ISysUserService;
import com.sttri.service.IUserCarService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/userCar")
public class UserCarController extends BaseController {
	@Autowired
	private IUserCarService userCarService;
	@Autowired
	private ISysUserService sysUserService;
	
	
	@RequestMapping("/queryByUserId")
	public R queryByUserId(@RequestParam Integer userId){
		UserCarCriteria example = new UserCarCriteria();
		example.createCriteria().andUserIdEqualTo(userId);
		List<UserCar> uCars = this.userCarService.selectByExample(example);
		return R.ok().put("car", uCars);
	}
	
	@RequestMapping("/save")
	@ResponseBody
	public R save(@RequestParam(value="wxId",required=true) String wxId,
			@RequestParam(value="carNo",required=true) String carNo,
			@RequestParam(value="carBrand",required=false) String carBrand,
			@RequestParam(value="carModels",required=false) String carModels,
			@RequestParam(value="carVin",required=false) String carVin,
			@RequestParam(value="carEngine",required=false) String carEngine,
			@RequestParam(value="carBuyTime",required=false) String carBuyTime,
			@RequestParam(value="carLastMaintenanceTime",required=false) String carLastMaintenanceTime,
			@RequestParam(value="carLastMaintenanceMileage",required=false) String carLastMaintenanceMileage,
			@RequestParam(value="carInsuranceTime",required=false) String carInsuranceTime,
			@RequestParam(value="carNextMaintenanceTime",required=false) String carNextMaintenanceTime,
			@RequestParam(value="carNextMaintenanceMileage",required=false) String carNextMaintenanceMileage,
			@RequestParam(value="carAnnualTime",required=false) String carAnnualTime,
			@RequestParam(value="carIllegal",required=false) String carIllegal,
			@RequestParam(value="isDefault",required=true) Integer isDefault){
		
		logger.info("**saveUserCar**:"+wxId);
		SysUser user = this.sysUserService.selectByWxId(wxId);
		if (user == null) {
			return R.error("1000", "该用户不存在");
		}
		if (StringUtils.isEmpty(carNo)) {
			return R.error("5001", "车牌号不能为空");
		}
		UserCar userCar = new UserCar();
		userCar.setUserId(user.getId());
		userCar.setCarNo(carNo);
		userCar.setCarAnnualTime(carAnnualTime);
		userCar.setCarBrand(carBrand);
		userCar.setCarBuyTime(carBuyTime);
		userCar.setCarEngine(carEngine);
		userCar.setCarIllegal(carIllegal);
		userCar.setCarInsuranceTime(carInsuranceTime);
		userCar.setCarLastMaintenanceMileage(carLastMaintenanceMileage);
		userCar.setCarLastMaintenanceTime(carLastMaintenanceTime);
		userCar.setCarModels(carModels);
		userCar.setCarNextMaintenanceMileage(carNextMaintenanceMileage);
		userCar.setCarNextMaintenanceTime(carNextMaintenanceTime);
		userCar.setCarVin(carVin);
		userCar.setIsDefault(isDefault);
		userCar.setAddtime(new Date());
		int result = this.userCarService.insert(userCar);
		if (result == 1) {
			return R.ok();
		}else {
			return R.error();
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public R update(@RequestParam(value="id",required=true) Integer id,
			@RequestParam(value="carNo",required=true) String carNo,
			@RequestParam(value="carBrand",required=false) String carBrand,
			@RequestParam(value="carModels",required=false) String carModels,
			@RequestParam(value="carVin",required=false) String carVin,
			@RequestParam(value="carEngine",required=false) String carEngine,
			@RequestParam(value="carBuyTime",required=false) String carBuyTime,
			@RequestParam(value="carLastMaintenanceTime",required=false) String carLastMaintenanceTime,
			@RequestParam(value="carLastMaintenanceMileage",required=false) String carLastMaintenanceMileage,
			@RequestParam(value="carInsuranceTime",required=false) String carInsuranceTime,
			@RequestParam(value="carNextMaintenanceTime",required=false) String carNextMaintenanceTime,
			@RequestParam(value="carNextMaintenanceMileage",required=false) String carNextMaintenanceMileage,
			@RequestParam(value="carAnnualTime",required=false) String carAnnualTime,
			@RequestParam(value="carIllegal",required=false) String carIllegal,
			@RequestParam(value="isDefault",required=true) Integer isDefault){
		
		logger.info("**updateUserCar**:"+carNo);
		UserCar userCar = this.userCarService.selectByPrimaryKey(id);
		if (userCar == null) {
			return R.error("5000", "车辆不存在");
		}
		if (StringUtils.isEmpty(userCar.getCarNo())) {
			return R.error("5001", "车牌号不能为空");
		}
		userCar.setCarNo(carNo);
		userCar.setCarAnnualTime(carAnnualTime);
		userCar.setCarBrand(carBrand);
		userCar.setCarBuyTime(carBuyTime);
		userCar.setCarEngine(carEngine);
		userCar.setCarIllegal(carIllegal);
		userCar.setCarInsuranceTime(carInsuranceTime);
		userCar.setCarLastMaintenanceMileage(carLastMaintenanceMileage);
		userCar.setCarLastMaintenanceTime(carLastMaintenanceTime);
		userCar.setCarModels(carModels);
		userCar.setCarNextMaintenanceMileage(carNextMaintenanceMileage);
		userCar.setCarNextMaintenanceTime(carNextMaintenanceTime);
		userCar.setCarVin(carVin);
		userCar.setIsDefault(isDefault);
		userCar.setEdittime(new Date());
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

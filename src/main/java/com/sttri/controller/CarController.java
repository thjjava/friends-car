package com.sttri.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysCar;
import com.sttri.entity.SysCarCriteria;
import com.sttri.service.ISysCarService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/car")
public class CarController extends BaseController {
	@Autowired
	private ISysCarService carService;
	
	@RequestMapping("/save")
	public R save(@RequestBody SysCar car) {
		car.setAddtime(new Date());
		this.carService.insert(car);
		return R.ok();
	}
	
	@RequestMapping("/update")
	public R update(@RequestBody SysCar car){
		car.setEdittime(new Date());
		this.carService.updateByPrimaryKey(car);
		return R.ok();
	}
	
	@RequestMapping("/delete")
	public R delete(@RequestParam Integer id){
		this.carService.deleteByPrimaryKey(id);
		return R.ok();
	}
	
	@RequestMapping("/list")
	public R list(@RequestParam String carBrand){
		SysCarCriteria example = new SysCarCriteria();
		example.createCriteria().andCarBrandLike(carBrand);
		List<SysCar> list = this.carService.selectByExample(example);
		return R.ok().put("cars", list);
	}
}

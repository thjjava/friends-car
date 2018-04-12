package com.sttri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.CarBrand;
import com.sttri.entity.CarBrandCriteria;
import com.sttri.entity.CarBrandCriteria.Criteria;
import com.sttri.entity.CarSeries;
import com.sttri.entity.CarSeriesCriteria;
import com.sttri.service.ICarBrandService;
import com.sttri.service.ICarSeriesService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/car")
public class CarController extends BaseController {
	@Autowired
	private ICarBrandService carBrandService;
	@Autowired
	private ICarSeriesService carSeriesService;
	
	/**
	 * 查询车辆品牌
	 * @param letter
	 * @param brand
	 * @return
	 */
	@RequestMapping("/queryCarBrand")
	public R queryCarBrand(@RequestParam(required=false) String letter,@RequestParam(required=false) String brand){
		CarBrandCriteria example = new CarBrandCriteria();
		Criteria criteria = example.createCriteria();
		if (!StringUtils.isEmpty(letter)) {
			criteria.andCarLetterEqualTo(letter);
		}
		if (!StringUtils.isEmpty(brand)) {
			criteria.andCarBrandLike(brand);
		}
		List<CarBrand> list = this.carBrandService.selectByExample(example);
		logger.info("**brands**:"+list);
		return R.ok().put("carBrands", list);
	}
	
	/**
	 * 根据品牌编号获取车系
	 * @param brandId
	 * @return
	 */
	@RequestMapping("/queryCarSeries")
	public R queryCarSeries(@RequestParam Integer brandId){
		CarSeriesCriteria example = new CarSeriesCriteria();
		example.createCriteria().andCarBrandIdEqualTo(brandId);
		List<CarSeries> list = this.carSeriesService.selectByExample(example);
		return R.ok().put("carSeries", list);
	}
}

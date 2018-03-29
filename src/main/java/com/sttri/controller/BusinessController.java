package com.sttri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sttri.entity.SysBusiness;
import com.sttri.entity.SysBusinessCriteria;
import com.sttri.service.IShopBusinessService;
import com.sttri.service.ISysBusinessService;
import com.sttri.utils.R;

@RestController
@RequestMapping("/sys/business")
public class BusinessController extends BaseController {
	@Autowired
	private ISysBusinessService sysBusinessService;
	@Autowired
	private IShopBusinessService shopBusinessService;
	
	/**
	 * 查询所有的业务类型
	 * @return
	 */
	@RequestMapping("/queryBusinessType")
	public R queryBusinessType(){
		SysBusinessCriteria example = new SysBusinessCriteria();
		example.setOrderByClause("type asc");
		List<SysBusiness> businesses = this.sysBusinessService.selectByExample(example);
		return R.ok("查询成功").put("business",businesses);
	}
	
	
}

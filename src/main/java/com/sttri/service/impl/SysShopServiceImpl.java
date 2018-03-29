package com.sttri.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sttri.dao.SysShopMapper;
import com.sttri.entity.SysShop;
import com.sttri.entity.SysShopCriteria;
import com.sttri.service.ISysShopService;

@Service
public class SysShopServiceImpl implements ISysShopService {
	@Autowired
	private SysShopMapper sysShopMapper;
	
	@Override
	public int countByExample(SysShopCriteria example) {
		// TODO Auto-generated method stub
		return sysShopMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysShopCriteria example) {
		// TODO Auto-generated method stub
		return sysShopMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sysShopMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysShop record) {
		// TODO Auto-generated method stub
		return sysShopMapper.insert(record);
	}

	@Override
	public int insertSelective(SysShop record) {
		// TODO Auto-generated method stub
		return sysShopMapper.insertSelective(record);
	}

	@Override
	public List<SysShop> selectByExample(SysShopCriteria example) {
		// TODO Auto-generated method stub
		return sysShopMapper.selectByExample(example);
	}

	@Override
	public SysShop selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return sysShopMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysShop record, SysShopCriteria example) {
		// TODO Auto-generated method stub
		return sysShopMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysShop record, SysShopCriteria example) {
		// TODO Auto-generated method stub
		return sysShopMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysShop record) {
		// TODO Auto-generated method stub
		return sysShopMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysShop record) {
		// TODO Auto-generated method stub
		return sysShopMapper.updateByPrimaryKey(record);
	}
	
	public List<SysShop> queryShopByBusinessType(Integer businessType) {
		return sysShopMapper.queryShopByBusinessType(businessType);
	}
}

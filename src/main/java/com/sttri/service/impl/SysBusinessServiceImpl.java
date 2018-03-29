package com.sttri.service.impl;

import com.sttri.dao.SysBusinessMapper;
import com.sttri.entity.SysBusiness;
import com.sttri.entity.SysBusinessCriteria;
import com.sttri.service.ISysBusinessService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysBusinessServiceImpl implements ISysBusinessService{

	@Autowired
	private SysBusinessMapper sysBusinessMapper;
	
	
	
	
	@Override
	public int countByExample(SysBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysBusiness record) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.insert(record);
	}

	@Override
	public int insertSelective(SysBusiness record) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.insertSelective(record);
	}

	@Override
	public List<SysBusiness> selectByExample(SysBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.selectByExample(example);
	}

	@Override
	public SysBusiness selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysBusiness record,
			SysBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysBusiness record, SysBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysBusiness record) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysBusiness record) {
		// TODO Auto-generated method stub
		return this.sysBusinessMapper.updateByPrimaryKey(record);
	}
}
package com.sttri.service.impl;

import com.sttri.dao.SysAreaMapper;
import com.sttri.entity.SysArea;
import com.sttri.entity.SysAreaCriteria;
import com.sttri.service.ISysAreaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAreaServiceImpl implements ISysAreaService{

	@Autowired
	private SysAreaMapper sysAreaMapper;
	
	@Override
	public int countByExample(SysAreaCriteria example) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysAreaCriteria example) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysArea record) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.insert(record);
	}

	@Override
	public int insertSelective(SysArea record) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.insertSelective(record);
	}

	@Override
	public List<SysArea> selectByExample(SysAreaCriteria example) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.selectByExample(example);
	}

	@Override
	public SysArea selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysArea record, SysAreaCriteria example) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysArea record, SysAreaCriteria example) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysArea record) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysArea record) {
		// TODO Auto-generated method stub
		return this.sysAreaMapper.updateByPrimaryKey(record);
	}
}
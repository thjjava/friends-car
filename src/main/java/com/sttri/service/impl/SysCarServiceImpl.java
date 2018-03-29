package com.sttri.service.impl;

import com.sttri.dao.SysCarMapper;
import com.sttri.entity.SysCar;
import com.sttri.entity.SysCarCriteria;
import com.sttri.service.ISysCarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysCarServiceImpl implements ISysCarService {

	@Autowired
	private SysCarMapper sysCarMapper;
	@Override
	public int countByExample(SysCarCriteria example) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysCarCriteria example) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysCar record) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.insert(record);
	}

	@Override
	public int insertSelective(SysCar record) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.insertSelective(record);
	}

	@Override
	public List<SysCar> selectByExample(SysCarCriteria example) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.selectByExample(example);
	}

	@Override
	public SysCar selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysCar record, SysCarCriteria example) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysCar record, SysCarCriteria example) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysCar record) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysCar record) {
		// TODO Auto-generated method stub
		return this.sysCarMapper.updateByPrimaryKey(record);
	}
}
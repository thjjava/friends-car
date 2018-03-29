package com.sttri.service.impl;

import com.sttri.dao.SysEmployeeMapper;
import com.sttri.entity.SysEmployee;
import com.sttri.entity.SysEmployeeCriteria;
import com.sttri.service.ISysEmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysEmployeeServiceImpl implements ISysEmployeeService{
	@Autowired
	private SysEmployeeMapper sysEmployeeMapper;

	@Override
	public int countByExample(SysEmployeeCriteria example) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysEmployeeCriteria example) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysEmployee record) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.insert(record);
	}

	@Override
	public int insertSelective(SysEmployee record) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.insertSelective(record);
	}

	@Override
	public List<SysEmployee> selectByExample(SysEmployeeCriteria example) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.selectByExample(example);
	}

	@Override
	public SysEmployee selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysEmployee record,
			SysEmployeeCriteria example) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysEmployee record, SysEmployeeCriteria example) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysEmployee record) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysEmployee record) {
		// TODO Auto-generated method stub
		return this.sysEmployeeMapper.updateByPrimaryKey(record);
	}
}
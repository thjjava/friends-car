package com.sttri.service.impl;

import com.sttri.dao.SysOrderMapper;
import com.sttri.entity.SysOrder;
import com.sttri.entity.SysOrderCriteria;
import com.sttri.service.ISysOrderService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysOrderServiceImpl implements ISysOrderService{

	@Autowired
	private SysOrderMapper sysOrderMapper;
	
	@Override
	public int countByExample(SysOrderCriteria example) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysOrderCriteria example) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysOrder record) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.insert(record);
	}

	@Override
	public int insertSelective(SysOrder record) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.insertSelective(record);
	}

	@Override
	public List<SysOrder> selectByExample(SysOrderCriteria example) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.selectByExample(example);
	}

	@Override
	public SysOrder selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysOrder record,
			SysOrderCriteria example) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysOrder record, SysOrderCriteria example) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysOrder record) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysOrder record) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.updateByPrimaryKey(record);
	}

	@Override
	public int countByStatus(Integer user_id, Integer status) {
		// TODO Auto-generated method stub
		return this.sysOrderMapper.countByStatus(user_id, status);
	}
	
	@Override
	public String findMaxOrderNo(){
		return this.sysOrderMapper.findMaxOrderNo();
	}
}
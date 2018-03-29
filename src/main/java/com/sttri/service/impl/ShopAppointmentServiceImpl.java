package com.sttri.service.impl;

import com.sttri.dao.ShopAppointmentMapper;
import com.sttri.entity.ShopAppointment;
import com.sttri.entity.ShopAppointmentCriteria;
import com.sttri.service.IShopAppointmentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopAppointmentServiceImpl implements IShopAppointmentService{
	
	@Autowired
	private ShopAppointmentMapper shopAppointmentMapper;
	
	
	@Override
	public int countByExample(ShopAppointmentCriteria example) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ShopAppointmentCriteria example) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ShopAppointment record) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.insert(record);
	}

	@Override
	public int insertSelective(ShopAppointment record) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.insertSelective(record);
	}

	@Override
	public List<ShopAppointment> selectByExample(ShopAppointmentCriteria example) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.selectByExample(example);
	}

	@Override
	public ShopAppointment selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ShopAppointment record,
			ShopAppointmentCriteria example) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ShopAppointment record,
			ShopAppointmentCriteria example) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ShopAppointment record) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ShopAppointment record) {
		// TODO Auto-generated method stub
		return this.shopAppointmentMapper.updateByPrimaryKey(record);
	}
	
}
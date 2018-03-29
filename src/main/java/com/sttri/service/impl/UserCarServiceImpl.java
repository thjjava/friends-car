package com.sttri.service.impl;

import com.sttri.dao.UserCarMapper;
import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import com.sttri.service.IUserCarService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCarServiceImpl implements IUserCarService{

	@Autowired
	private UserCarMapper userCarMapper;
	
	@Override
	public int countByExample(UserCarCriteria example) {
		// TODO Auto-generated method stub
		return this.userCarMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserCarCriteria example) {
		// TODO Auto-generated method stub
		return this.userCarMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.userCarMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(UserCar record) {
		// TODO Auto-generated method stub
		return this.userCarMapper.insert(record);
	}

	@Override
	public int insertSelective(UserCar record) {
		// TODO Auto-generated method stub
		return this.userCarMapper.insertSelective(record);
	}

	@Override
	public List<UserCar> selectByExample(UserCarCriteria example) {
		// TODO Auto-generated method stub
		return this.userCarMapper.selectByExample(example);
	}

	@Override
	public UserCar selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.userCarMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(UserCar record, UserCarCriteria example) {
		// TODO Auto-generated method stub
		return this.userCarMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(UserCar record, UserCarCriteria example) {
		// TODO Auto-generated method stub
		return this.userCarMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(UserCar record) {
		// TODO Auto-generated method stub
		return this.userCarMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserCar record) {
		// TODO Auto-generated method stub
		return this.userCarMapper.updateByPrimaryKey(record);
	}
}
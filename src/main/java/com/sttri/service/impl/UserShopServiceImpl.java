package com.sttri.service.impl;

import com.sttri.dao.UserShopMapper;
import com.sttri.entity.UserShop;
import com.sttri.entity.UserShopCriteria;
import com.sttri.service.IUserShopService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShopServiceImpl implements IUserShopService{
	@Autowired
	private UserShopMapper userShopMapper;

	@Override
	public int countByExample(UserShopCriteria example) {
		// TODO Auto-generated method stub
		return this.userShopMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(UserShopCriteria example) {
		// TODO Auto-generated method stub
		return this.userShopMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.userShopMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(UserShop record) {
		// TODO Auto-generated method stub
		return this.userShopMapper.insert(record);
	}

	@Override
	public int insertSelective(UserShop record) {
		// TODO Auto-generated method stub
		return this.userShopMapper.insertSelective(record);
	}

	@Override
	public List<UserShop> selectByExample(UserShopCriteria example) {
		// TODO Auto-generated method stub
		return this.userShopMapper.selectByExample(example);
	}

	@Override
	public UserShop selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.userShopMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(UserShop record,
			UserShopCriteria example) {
		// TODO Auto-generated method stub
		return this.userShopMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(UserShop record, UserShopCriteria example) {
		// TODO Auto-generated method stub
		return this.userShopMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(UserShop record) {
		// TODO Auto-generated method stub
		return this.userShopMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(UserShop record) {
		// TODO Auto-generated method stub
		return this.userShopMapper.updateByPrimaryKey(record);
	}
}
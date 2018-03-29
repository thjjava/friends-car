package com.sttri.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sttri.dao.ShopBusinessMapper;
import com.sttri.entity.ShopBusiness;
import com.sttri.entity.ShopBusinessCriteria;
import com.sttri.service.IShopBusinessService;

@Service
public class ShopBusinessServiceImpl implements IShopBusinessService {
	
	@Autowired
	private ShopBusinessMapper shopBusinessMapper;
	
	
	@Override
	public int countByExample(ShopBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ShopBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(ShopBusiness record) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.insert(record);
	}

	@Override
	public int insertSelective(ShopBusiness record) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.insertSelective(record);
	}

	@Override
	public List<ShopBusiness> selectByExample(ShopBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.selectByExample(example);
	}

	@Override
	public ShopBusiness selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(ShopBusiness record,
			ShopBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(ShopBusiness record, ShopBusinessCriteria example) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(ShopBusiness record) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ShopBusiness record) {
		// TODO Auto-generated method stub
		return this.shopBusinessMapper.updateByPrimaryKey(record);
	}

}

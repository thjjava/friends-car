package com.sttri.service.impl;

import com.sttri.dao.CarBrandMapper;
import com.sttri.entity.CarBrand;
import com.sttri.entity.CarBrandCriteria;
import com.sttri.service.ICarBrandService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarBrandServiceImpl implements ICarBrandService {

	@Autowired
	private CarBrandMapper carBrandMapper;
	@Override
	public int countByExample(CarBrandCriteria example) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CarBrandCriteria example) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CarBrand record) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.insert(record);
	}

	@Override
	public int insertSelective(CarBrand record) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.insertSelective(record);
	}

	@Override
	public List<CarBrand> selectByExample(CarBrandCriteria example) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.selectByExample(example);
	}

	@Override
	public CarBrand selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CarBrand record, CarBrandCriteria example) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CarBrand record, CarBrandCriteria example) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CarBrand record) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CarBrand record) {
		// TODO Auto-generated method stub
		return this.carBrandMapper.updateByPrimaryKey(record);
	}
}
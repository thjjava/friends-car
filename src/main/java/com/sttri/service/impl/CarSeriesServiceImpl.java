package com.sttri.service.impl;

import com.sttri.dao.CarSeriesMapper;
import com.sttri.entity.CarSeries;
import com.sttri.entity.CarSeriesCriteria;
import com.sttri.service.ICarSeriesService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CarSeriesServiceImpl implements ICarSeriesService {

	@Autowired
	private CarSeriesMapper carSeriesMapper;
	@Override
	public int countByExample(CarSeriesCriteria example) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(CarSeriesCriteria example) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CarSeries record) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.insert(record);
	}

	@Override
	public int insertSelective(CarSeries record) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.insertSelective(record);
	}

	@Override
	public List<CarSeries> selectByExample(CarSeriesCriteria example) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.selectByExample(example);
	}

	@Override
	public CarSeries selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(CarSeries record, CarSeriesCriteria example) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(CarSeries record, CarSeriesCriteria example) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(CarSeries record) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CarSeries record) {
		// TODO Auto-generated method stub
		return this.carSeriesMapper.updateByPrimaryKey(record);
	}
}
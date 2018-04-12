package com.sttri.service;

import com.sttri.entity.CarSeries;
import com.sttri.entity.CarSeriesCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ICarSeriesService {
	public int countByExample(CarSeriesCriteria example);

	public int deleteByExample(CarSeriesCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(CarSeries record);

	public int insertSelective(CarSeries record);

	public List<CarSeries> selectByExample(CarSeriesCriteria example);

	public CarSeries selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") CarSeries record, @Param("example") CarSeriesCriteria example);

	public int updateByExample(@Param("record") CarSeries record, @Param("example") CarSeriesCriteria example);

	public int updateByPrimaryKeySelective(CarSeries record);

	public int updateByPrimaryKey(CarSeries record);
}
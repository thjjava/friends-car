package com.sttri.service;

import com.sttri.entity.CarBrand;
import com.sttri.entity.CarBrandCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ICarBrandService {
	public int countByExample(CarBrandCriteria example);

	public int deleteByExample(CarBrandCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(CarBrand record);

	public int insertSelective(CarBrand record);

	public List<CarBrand> selectByExample(CarBrandCriteria example);

	public CarBrand selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") CarBrand record, @Param("example") CarBrandCriteria example);

	public int updateByExample(@Param("record") CarBrand record, @Param("example") CarBrandCriteria example);

	public int updateByPrimaryKeySelective(CarBrand record);

	public int updateByPrimaryKey(CarBrand record);
}
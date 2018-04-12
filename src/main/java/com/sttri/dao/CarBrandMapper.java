package com.sttri.dao;

import com.sttri.entity.CarBrand;
import com.sttri.entity.CarBrandCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarBrandMapper {
    int countByExample(CarBrandCriteria example);

    int deleteByExample(CarBrandCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarBrand record);

    int insertSelective(CarBrand record);

    List<CarBrand> selectByExample(CarBrandCriteria example);

    CarBrand selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarBrand record, @Param("example") CarBrandCriteria example);

    int updateByExample(@Param("record") CarBrand record, @Param("example") CarBrandCriteria example);

    int updateByPrimaryKeySelective(CarBrand record);

    int updateByPrimaryKey(CarBrand record);
}
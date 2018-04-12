package com.sttri.dao;

import com.sttri.entity.CarSeries;
import com.sttri.entity.CarSeriesCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarSeriesMapper {
    int countByExample(CarSeriesCriteria example);

    int deleteByExample(CarSeriesCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(CarSeries record);

    int insertSelective(CarSeries record);

    List<CarSeries> selectByExample(CarSeriesCriteria example);

    CarSeries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CarSeries record, @Param("example") CarSeriesCriteria example);

    int updateByExample(@Param("record") CarSeries record, @Param("example") CarSeriesCriteria example);

    int updateByPrimaryKeySelective(CarSeries record);

    int updateByPrimaryKey(CarSeries record);
}
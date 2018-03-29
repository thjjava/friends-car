package com.sttri.dao;

import com.sttri.entity.SysCar;
import com.sttri.entity.SysCarCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCarMapper {
    int countByExample(SysCarCriteria example);

    int deleteByExample(SysCarCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysCar record);

    int insertSelective(SysCar record);

    List<SysCar> selectByExample(SysCarCriteria example);

    SysCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysCar record, @Param("example") SysCarCriteria example);

    int updateByExample(@Param("record") SysCar record, @Param("example") SysCarCriteria example);

    int updateByPrimaryKeySelective(SysCar record);

    int updateByPrimaryKey(SysCar record);
}
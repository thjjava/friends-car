package com.sttri.dao;

import com.sttri.entity.SysBusiness;
import com.sttri.entity.SysBusinessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysBusinessMapper {
    int countByExample(SysBusinessCriteria example);

    int deleteByExample(SysBusinessCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysBusiness record);

    int insertSelective(SysBusiness record);

    List<SysBusiness> selectByExample(SysBusinessCriteria example);

    SysBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysBusiness record, @Param("example") SysBusinessCriteria example);

    int updateByExample(@Param("record") SysBusiness record, @Param("example") SysBusinessCriteria example);

    int updateByPrimaryKeySelective(SysBusiness record);

    int updateByPrimaryKey(SysBusiness record);
}
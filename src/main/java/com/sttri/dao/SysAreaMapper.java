package com.sttri.dao;

import com.sttri.entity.SysArea;
import com.sttri.entity.SysAreaCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAreaMapper {
    int countByExample(SysAreaCriteria example);

    int deleteByExample(SysAreaCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    List<SysArea> selectByExample(SysAreaCriteria example);

    SysArea selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaCriteria example);

    int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaCriteria example);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}
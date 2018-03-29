package com.sttri.dao;

import com.sttri.entity.SysEmployee;
import com.sttri.entity.SysEmployeeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysEmployeeMapper {
    int countByExample(SysEmployeeCriteria example);

    int deleteByExample(SysEmployeeCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysEmployee record);

    int insertSelective(SysEmployee record);

    List<SysEmployee> selectByExample(SysEmployeeCriteria example);

    SysEmployee selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysEmployee record, @Param("example") SysEmployeeCriteria example);

    int updateByExample(@Param("record") SysEmployee record, @Param("example") SysEmployeeCriteria example);

    int updateByPrimaryKeySelective(SysEmployee record);

    int updateByPrimaryKey(SysEmployee record);
}
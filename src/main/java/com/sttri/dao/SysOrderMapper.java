package com.sttri.dao;

import com.sttri.entity.SysOrder;
import com.sttri.entity.SysOrderCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysOrderMapper {
    int countByExample(SysOrderCriteria example);

    int deleteByExample(SysOrderCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysOrder record);

    int insertSelective(SysOrder record);

    List<SysOrder> selectByExample(SysOrderCriteria example);

    SysOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysOrder record, @Param("example") SysOrderCriteria example);

    int updateByExample(@Param("record") SysOrder record, @Param("example") SysOrderCriteria example);

    int updateByPrimaryKeySelective(SysOrder record);

    int updateByPrimaryKey(SysOrder record);
    
    int countByStatus(@Param("user_id") Integer user_id,@Param("status") Integer status);
}
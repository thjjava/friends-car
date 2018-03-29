package com.sttri.dao;

import com.sttri.entity.ShopAppointment;
import com.sttri.entity.ShopAppointmentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopAppointmentMapper {
    int countByExample(ShopAppointmentCriteria example);

    int deleteByExample(ShopAppointmentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopAppointment record);

    int insertSelective(ShopAppointment record);

    List<ShopAppointment> selectByExample(ShopAppointmentCriteria example);

    ShopAppointment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopAppointment record, @Param("example") ShopAppointmentCriteria example);

    int updateByExample(@Param("record") ShopAppointment record, @Param("example") ShopAppointmentCriteria example);

    int updateByPrimaryKeySelective(ShopAppointment record);

    int updateByPrimaryKey(ShopAppointment record);
}
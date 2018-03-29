package com.sttri.service;

import com.sttri.entity.ShopAppointment;
import com.sttri.entity.ShopAppointmentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IShopAppointmentService {
	public int countByExample(ShopAppointmentCriteria example);

	public int deleteByExample(ShopAppointmentCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(ShopAppointment record);

	public int insertSelective(ShopAppointment record);

	public List<ShopAppointment> selectByExample(ShopAppointmentCriteria example);

	public ShopAppointment selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") ShopAppointment record, @Param("example") ShopAppointmentCriteria example);

	public int updateByExample(@Param("record") ShopAppointment record, @Param("example") ShopAppointmentCriteria example);

	public int updateByPrimaryKeySelective(ShopAppointment record);

	public int updateByPrimaryKey(ShopAppointment record);
}
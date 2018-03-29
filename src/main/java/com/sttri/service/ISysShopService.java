package com.sttri.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sttri.entity.SysShop;
import com.sttri.entity.SysShopCriteria;


public interface ISysShopService {

	public int countByExample(SysShopCriteria example);
	
	public int deleteByExample(SysShopCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(SysShop record);

	public int insertSelective(SysShop record);

	public List<SysShop> selectByExample(SysShopCriteria example);

	public SysShop selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") SysShop record, @Param("example") SysShopCriteria example);

	public int updateByExample(@Param("record") SysShop record, @Param("example") SysShopCriteria example);

	public int updateByPrimaryKeySelective(SysShop record);

	public int updateByPrimaryKey(SysShop record);
	
	public List<SysShop> queryShopByBusinessType(Integer businessType);
}
package com.sttri.service;

import com.sttri.entity.ShopBusiness;
import com.sttri.entity.ShopBusinessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IShopBusinessService {
	public int countByExample(ShopBusinessCriteria example);

	public int deleteByExample(ShopBusinessCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(ShopBusiness record);

	public int insertSelective(ShopBusiness record);

	public List<ShopBusiness> selectByExample(ShopBusinessCriteria example);

	public ShopBusiness selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") ShopBusiness record, @Param("example") ShopBusinessCriteria example);

	public int updateByExample(@Param("record") ShopBusiness record, @Param("example") ShopBusinessCriteria example);

	public int updateByPrimaryKeySelective(ShopBusiness record);

	public int updateByPrimaryKey(ShopBusiness record);
}
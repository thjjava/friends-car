package com.sttri.dao;

import com.sttri.entity.ShopBusiness;
import com.sttri.entity.ShopBusinessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopBusinessMapper {
    int countByExample(ShopBusinessCriteria example);

    int deleteByExample(ShopBusinessCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopBusiness record);

    int insertSelective(ShopBusiness record);

    List<ShopBusiness> selectByExample(ShopBusinessCriteria example);

    ShopBusiness selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopBusiness record, @Param("example") ShopBusinessCriteria example);

    int updateByExample(@Param("record") ShopBusiness record, @Param("example") ShopBusinessCriteria example);

    int updateByPrimaryKeySelective(ShopBusiness record);

    int updateByPrimaryKey(ShopBusiness record);
}
package com.sttri.dao;

import com.sttri.entity.SysShop;
import com.sttri.entity.SysShopCriteria;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface SysShopMapper {
    int countByExample(SysShopCriteria example);

    int deleteByExample(SysShopCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysShop record);

    int insertSelective(SysShop record);

    List<SysShop> selectByExample(SysShopCriteria example);

    SysShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysShop record, @Param("example") SysShopCriteria example);

    int updateByExample(@Param("record") SysShop record, @Param("example") SysShopCriteria example);

    int updateByPrimaryKeySelective(SysShop record);

    int updateByPrimaryKey(SysShop record);
    
    //新增接口，根据业务类型获取店铺列表
    List<SysShop> queryShopByBusinessType(Integer businessType);
    
    //新增接口，获取最新店铺编号
    String findMaxShopNo();
    
    //新增接口，根据用户id查询关注的店铺列表
    List<SysShop> queryShopByUser(Integer user_id);
}
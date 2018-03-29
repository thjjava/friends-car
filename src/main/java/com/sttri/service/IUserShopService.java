package com.sttri.service;

import com.sttri.entity.UserShop;
import com.sttri.entity.UserShopCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserShopService {
    int countByExample(UserShopCriteria example);

    int deleteByExample(UserShopCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserShop record);

    int insertSelective(UserShop record);

    List<UserShop> selectByExample(UserShopCriteria example);

    UserShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserShop record, @Param("example") UserShopCriteria example);

    int updateByExample(@Param("record") UserShop record, @Param("example") UserShopCriteria example);

    int updateByPrimaryKeySelective(UserShop record);

    int updateByPrimaryKey(UserShop record);
}
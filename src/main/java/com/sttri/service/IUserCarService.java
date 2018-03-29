package com.sttri.service;

import com.sttri.entity.UserCar;
import com.sttri.entity.UserCarCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserCarService {
    int countByExample(UserCarCriteria example);

    int deleteByExample(UserCarCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserCar record);

    int insertSelective(UserCar record);

    List<UserCar> selectByExample(UserCarCriteria example);

    UserCar selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserCar record, @Param("example") UserCarCriteria example);

    int updateByExample(@Param("record") UserCar record, @Param("example") UserCarCriteria example);

    int updateByPrimaryKeySelective(UserCar record);

    int updateByPrimaryKey(UserCar record);
}
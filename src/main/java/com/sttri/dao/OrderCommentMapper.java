package com.sttri.dao;

import com.sttri.entity.OrderComment;
import com.sttri.entity.OrderCommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderCommentMapper {
    int countByExample(OrderCommentCriteria example);

    int deleteByExample(OrderCommentCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(OrderComment record);

    int insertSelective(OrderComment record);

    List<OrderComment> selectByExample(OrderCommentCriteria example);

    OrderComment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentCriteria example);

    int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentCriteria example);

    int updateByPrimaryKeySelective(OrderComment record);

    int updateByPrimaryKey(OrderComment record);
}
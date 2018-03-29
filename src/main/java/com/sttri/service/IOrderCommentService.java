package com.sttri.service;

import com.sttri.entity.OrderComment;
import com.sttri.entity.OrderCommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IOrderCommentService {
	public int countByExample(OrderCommentCriteria example);

	public int deleteByExample(OrderCommentCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(OrderComment record);

	public int insertSelective(OrderComment record);

	public List<OrderComment> selectByExample(OrderCommentCriteria example);

	public OrderComment selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") OrderComment record, @Param("example") OrderCommentCriteria example);

	public int updateByExample(@Param("record") OrderComment record, @Param("example") OrderCommentCriteria example);

	public int updateByPrimaryKeySelective(OrderComment record);

	public int updateByPrimaryKey(OrderComment record);
}
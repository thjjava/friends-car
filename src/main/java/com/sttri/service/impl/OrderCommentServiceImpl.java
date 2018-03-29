package com.sttri.service.impl;

import com.sttri.dao.OrderCommentMapper;
import com.sttri.entity.OrderComment;
import com.sttri.entity.OrderCommentCriteria;
import com.sttri.service.IOrderCommentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderCommentServiceImpl implements IOrderCommentService{

	@Autowired
	private OrderCommentMapper orderCommentMapper;
	
	
	@Override
	public int countByExample(OrderCommentCriteria example) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(OrderCommentCriteria example) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(OrderComment record) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.insert(record);
	}

	@Override
	public int insertSelective(OrderComment record) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.insertSelective(record);
	}

	@Override
	public List<OrderComment> selectByExample(OrderCommentCriteria example) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.selectByExample(example);
	}

	@Override
	public OrderComment selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(OrderComment record,
			OrderCommentCriteria example) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(OrderComment record, OrderCommentCriteria example) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderComment record) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OrderComment record) {
		// TODO Auto-generated method stub
		return this.orderCommentMapper.updateByPrimaryKey(record);
	}
	
}
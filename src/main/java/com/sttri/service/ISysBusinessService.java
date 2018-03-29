package com.sttri.service;

import com.sttri.entity.SysBusiness;
import com.sttri.entity.SysBusinessCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysBusinessService {
	public int countByExample(SysBusinessCriteria example);

	public int deleteByExample(SysBusinessCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(SysBusiness record);

	public int insertSelective(SysBusiness record);

	public List<SysBusiness> selectByExample(SysBusinessCriteria example);

	public SysBusiness selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") SysBusiness record, @Param("example") SysBusinessCriteria example);

	public int updateByExample(@Param("record") SysBusiness record, @Param("example") SysBusinessCriteria example);

	public int updateByPrimaryKeySelective(SysBusiness record);

	public int updateByPrimaryKey(SysBusiness record);
}
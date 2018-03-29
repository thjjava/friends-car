package com.sttri.service;

import com.sttri.entity.SysEmployee;
import com.sttri.entity.SysEmployeeCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysEmployeeService {
	public int countByExample(SysEmployeeCriteria example);

	public int deleteByExample(SysEmployeeCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(SysEmployee record);

	public int insertSelective(SysEmployee record);

	public List<SysEmployee> selectByExample(SysEmployeeCriteria example);

	public SysEmployee selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") SysEmployee record, @Param("example") SysEmployeeCriteria example);

	public int updateByExample(@Param("record") SysEmployee record, @Param("example") SysEmployeeCriteria example);

	public int updateByPrimaryKeySelective(SysEmployee record);

	public int updateByPrimaryKey(SysEmployee record);
}
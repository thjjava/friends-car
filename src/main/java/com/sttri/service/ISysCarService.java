package com.sttri.service;

import com.sttri.entity.SysCar;
import com.sttri.entity.SysCarCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ISysCarService {
	public int countByExample(SysCarCriteria example);

	public int deleteByExample(SysCarCriteria example);

	public int deleteByPrimaryKey(Integer id);

	public int insert(SysCar record);

	public int insertSelective(SysCar record);

	public List<SysCar> selectByExample(SysCarCriteria example);

	public SysCar selectByPrimaryKey(Integer id);

	public int updateByExampleSelective(@Param("record") SysCar record, @Param("example") SysCarCriteria example);

	public int updateByExample(@Param("record") SysCar record, @Param("example") SysCarCriteria example);

	public int updateByPrimaryKeySelective(SysCar record);

	public int updateByPrimaryKey(SysCar record);
}
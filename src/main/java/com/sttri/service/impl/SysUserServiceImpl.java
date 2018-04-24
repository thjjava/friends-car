package com.sttri.service.impl;

import com.sttri.dao.SysUserMapper;
import com.sttri.entity.SysUser;
import com.sttri.entity.SysUserCriteria;
import com.sttri.service.ISysUserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements ISysUserService{

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public int countByExample(SysUserCriteria example) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(SysUserCriteria example) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(SysUser record) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.insert(record);
	}

	@Override
	public int insertSelective(SysUser record) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.insertSelective(record);
	}

	@Override
	public List<SysUser> selectByExample(SysUserCriteria example) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.selectByExample(example);
	}

	@Override
	public SysUser selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByExampleSelective(SysUser record, SysUserCriteria example) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(SysUser record, SysUserCriteria example) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(SysUser record) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SysUser record) {
		// TODO Auto-generated method stub
		return this.sysUserMapper.updateByPrimaryKey(record);
	}

	@Override
	public SysUser selectByWxId(String wxId) {
		// TODO Auto-generated method stub
		SysUserCriteria example = new SysUserCriteria();
		example.createCriteria()
				.andWxidEqualTo(wxId);
		List<SysUser> list = selectByExample(example);
		if (list != null && list.size() >0 ) {
			return list.get(0);
		}
		return null;
	}
}
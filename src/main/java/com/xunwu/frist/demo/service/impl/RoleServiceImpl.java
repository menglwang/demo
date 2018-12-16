package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.RoleDao;
import com.xunwu.frist.demo.entity.RoleEntity;
import com.xunwu.frist.demo.service.RoleService;



@Service("roleService")
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao roleDao;
	
	@Override
	public RoleEntity queryObject(Integer id){
		return roleDao.queryObject(id);
	}
	
	@Override
	public List<RoleEntity> queryList(Map<String, Object> map){
		return roleDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return roleDao.queryTotal(map);
	}
	
	@Override
	public void save(RoleEntity role){
		roleDao.save(role);
	}
	
	@Override
	public void update(RoleEntity role){
		roleDao.update(role);
	}
	
	@Override
	public void delete(Integer id){
		roleDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		roleDao.deleteBatch(ids);
	}
	
}

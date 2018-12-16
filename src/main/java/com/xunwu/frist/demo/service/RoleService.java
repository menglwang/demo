package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.RoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户角色表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface RoleService {
	
	RoleEntity queryObject(Integer id);
	
	List<RoleEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(RoleEntity role);
	
	void update(RoleEntity role);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

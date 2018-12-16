package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户基本信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface UserService {
	
	UserEntity queryObject(Integer id);
	
	List<UserEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserEntity user);
	
	void update(UserEntity user);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

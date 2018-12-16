package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.SupportAddressEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface SupportAddressService {
	
	SupportAddressEntity queryObject(Integer id);
	
	List<SupportAddressEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SupportAddressEntity supportAddress);
	
	void update(SupportAddressEntity supportAddress);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

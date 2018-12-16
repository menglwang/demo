package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.HouseEntity;

import java.util.List;
import java.util.Map;

/**
 * 房屋信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface HouseService {
	
	HouseEntity queryObject(Integer id);
	
	List<HouseEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HouseEntity house);
	
	void update(HouseEntity house);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

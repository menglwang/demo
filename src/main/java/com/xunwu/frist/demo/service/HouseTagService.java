package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.HouseTagEntity;

import java.util.List;
import java.util.Map;

/**
 * 房屋标签映射关系表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface HouseTagService {
	
	HouseTagEntity queryObject(Integer id);
	
	List<HouseTagEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HouseTagEntity houseTag);
	
	void update(HouseTagEntity houseTag);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

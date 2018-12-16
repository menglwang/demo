package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.HouseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface HouseDetailService {
	
	HouseDetailEntity queryObject(Integer id);
	
	List<HouseDetailEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HouseDetailEntity houseDetail);
	
	void update(HouseDetailEntity houseDetail);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

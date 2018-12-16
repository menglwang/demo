package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.HouseSubscribeEntity;

import java.util.List;
import java.util.Map;

/**
 * 预约看房信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface HouseSubscribeService {
	
	HouseSubscribeEntity queryObject(Integer id);
	
	List<HouseSubscribeEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HouseSubscribeEntity houseSubscribe);
	
	void update(HouseSubscribeEntity houseSubscribe);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

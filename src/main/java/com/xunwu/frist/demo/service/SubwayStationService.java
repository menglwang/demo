package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.SubwayStationEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface SubwayStationService {
	
	SubwayStationEntity queryObject(Integer id);
	
	List<SubwayStationEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SubwayStationEntity subwayStation);
	
	void update(SubwayStationEntity subwayStation);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.SubwayEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface SubwayService {
	
	SubwayEntity queryObject(Integer id);
	
	List<SubwayEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(SubwayEntity subway);
	
	void update(SubwayEntity subway);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

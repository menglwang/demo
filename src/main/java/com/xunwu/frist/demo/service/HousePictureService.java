package com.xunwu.frist.demo.service;

import com.xunwu.frist.demo.entity.HousePictureEntity;

import java.util.List;
import java.util.Map;

/**
 * 房屋图片信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public interface HousePictureService {
	
	HousePictureEntity queryObject(Integer id);
	
	List<HousePictureEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(HousePictureEntity housePicture);
	
	void update(HousePictureEntity housePicture);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}

package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.HousePictureDao;
import com.xunwu.frist.demo.entity.HousePictureEntity;
import com.xunwu.frist.demo.service.HousePictureService;



@Service("housePictureService")
public class HousePictureServiceImpl implements HousePictureService {
	@Autowired
	private HousePictureDao housePictureDao;
	
	@Override
	public HousePictureEntity queryObject(Integer id){
		return housePictureDao.queryObject(id);
	}
	
	@Override
	public List<HousePictureEntity> queryList(Map<String, Object> map){
		return housePictureDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return housePictureDao.queryTotal(map);
	}
	
	@Override
	public void save(HousePictureEntity housePicture){
		housePictureDao.save(housePicture);
	}
	
	@Override
	public void update(HousePictureEntity housePicture){
		housePictureDao.update(housePicture);
	}
	
	@Override
	public void delete(Integer id){
		housePictureDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		housePictureDao.deleteBatch(ids);
	}
	
}

package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.HouseTagDao;
import com.xunwu.frist.demo.entity.HouseTagEntity;
import com.xunwu.frist.demo.service.HouseTagService;



@Service("houseTagService")
public class HouseTagServiceImpl implements HouseTagService {
	@Autowired
	private HouseTagDao houseTagDao;
	
	@Override
	public HouseTagEntity queryObject(Integer id){
		return houseTagDao.queryObject(id);
	}
	
	@Override
	public List<HouseTagEntity> queryList(Map<String, Object> map){
		return houseTagDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return houseTagDao.queryTotal(map);
	}
	
	@Override
	public void save(HouseTagEntity houseTag){
		houseTagDao.save(houseTag);
	}
	
	@Override
	public void update(HouseTagEntity houseTag){
		houseTagDao.update(houseTag);
	}
	
	@Override
	public void delete(Integer id){
		houseTagDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		houseTagDao.deleteBatch(ids);
	}
	
}

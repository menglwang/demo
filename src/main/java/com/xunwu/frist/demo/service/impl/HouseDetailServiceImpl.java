package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.HouseDetailDao;
import com.xunwu.frist.demo.entity.HouseDetailEntity;
import com.xunwu.frist.demo.service.HouseDetailService;



@Service("houseDetailService")
public class HouseDetailServiceImpl implements HouseDetailService {
	@Autowired
	private HouseDetailDao houseDetailDao;
	
	@Override
	public HouseDetailEntity queryObject(Integer id){
		return houseDetailDao.queryObject(id);
	}
	
	@Override
	public List<HouseDetailEntity> queryList(Map<String, Object> map){
		return houseDetailDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return houseDetailDao.queryTotal(map);
	}
	
	@Override
	public void save(HouseDetailEntity houseDetail){
		houseDetailDao.save(houseDetail);
	}
	
	@Override
	public void update(HouseDetailEntity houseDetail){
		houseDetailDao.update(houseDetail);
	}
	
	@Override
	public void delete(Integer id){
		houseDetailDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		houseDetailDao.deleteBatch(ids);
	}
	
}

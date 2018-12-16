package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.HouseSubscribeDao;
import com.xunwu.frist.demo.entity.HouseSubscribeEntity;
import com.xunwu.frist.demo.service.HouseSubscribeService;



@Service("houseSubscribeService")
public class HouseSubscribeServiceImpl implements HouseSubscribeService {
	@Autowired
	private HouseSubscribeDao houseSubscribeDao;
	
	@Override
	public HouseSubscribeEntity queryObject(Integer id){
		return houseSubscribeDao.queryObject(id);
	}
	
	@Override
	public List<HouseSubscribeEntity> queryList(Map<String, Object> map){
		return houseSubscribeDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return houseSubscribeDao.queryTotal(map);
	}
	
	@Override
	public void save(HouseSubscribeEntity houseSubscribe){
		houseSubscribeDao.save(houseSubscribe);
	}
	
	@Override
	public void update(HouseSubscribeEntity houseSubscribe){
		houseSubscribeDao.update(houseSubscribe);
	}
	
	@Override
	public void delete(Integer id){
		houseSubscribeDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		houseSubscribeDao.deleteBatch(ids);
	}
	
}

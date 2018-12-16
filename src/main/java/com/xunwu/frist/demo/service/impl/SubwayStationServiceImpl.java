package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.SubwayStationDao;
import com.xunwu.frist.demo.entity.SubwayStationEntity;
import com.xunwu.frist.demo.service.SubwayStationService;



@Service("subwayStationService")
public class SubwayStationServiceImpl implements SubwayStationService {
	@Autowired
	private SubwayStationDao subwayStationDao;
	
	@Override
	public SubwayStationEntity queryObject(Integer id){
		return subwayStationDao.queryObject(id);
	}
	
	@Override
	public List<SubwayStationEntity> queryList(Map<String, Object> map){
		return subwayStationDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return subwayStationDao.queryTotal(map);
	}
	
	@Override
	public void save(SubwayStationEntity subwayStation){
		subwayStationDao.save(subwayStation);
	}
	
	@Override
	public void update(SubwayStationEntity subwayStation){
		subwayStationDao.update(subwayStation);
	}
	
	@Override
	public void delete(Integer id){
		subwayStationDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		subwayStationDao.deleteBatch(ids);
	}
	
}

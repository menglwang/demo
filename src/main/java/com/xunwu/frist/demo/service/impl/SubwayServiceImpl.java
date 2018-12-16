package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.SubwayDao;
import com.xunwu.frist.demo.entity.SubwayEntity;
import com.xunwu.frist.demo.service.SubwayService;



@Service("subwayService")
public class SubwayServiceImpl implements SubwayService {
	@Autowired
	private SubwayDao subwayDao;
	
	@Override
	public SubwayEntity queryObject(Integer id){
		return subwayDao.queryObject(id);
	}
	
	@Override
	public List<SubwayEntity> queryList(Map<String, Object> map){
		return subwayDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return subwayDao.queryTotal(map);
	}
	
	@Override
	public void save(SubwayEntity subway){
		subwayDao.save(subway);
	}
	
	@Override
	public void update(SubwayEntity subway){
		subwayDao.update(subway);
	}
	
	@Override
	public void delete(Integer id){
		subwayDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		subwayDao.deleteBatch(ids);
	}
	
}

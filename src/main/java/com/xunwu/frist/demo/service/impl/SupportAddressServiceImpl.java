package com.xunwu.frist.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.xunwu.frist.demo.dao.SupportAddressDao;
import com.xunwu.frist.demo.entity.SupportAddressEntity;
import com.xunwu.frist.demo.service.SupportAddressService;



@Service("supportAddressService")
public class SupportAddressServiceImpl implements SupportAddressService {
	@Autowired
	private SupportAddressDao supportAddressDao;
	
	@Override
	public SupportAddressEntity queryObject(Integer id){
		return supportAddressDao.queryObject(id);
	}
	
	@Override
	public List<SupportAddressEntity> queryList(Map<String, Object> map){
		return supportAddressDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return supportAddressDao.queryTotal(map);
	}
	
	@Override
	public void save(SupportAddressEntity supportAddress){
		supportAddressDao.save(supportAddress);
	}
	
	@Override
	public void update(SupportAddressEntity supportAddress){
		supportAddressDao.update(supportAddress);
	}
	
	@Override
	public void delete(Integer id){
		supportAddressDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		supportAddressDao.deleteBatch(ids);
	}
	
}

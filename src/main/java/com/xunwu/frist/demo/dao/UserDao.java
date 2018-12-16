package com.xunwu.frist.demo.dao;

import com.xunwu.frist.demo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户基本信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@Mapper
public interface UserDao extends BaseDao<UserEntity>{
	
}

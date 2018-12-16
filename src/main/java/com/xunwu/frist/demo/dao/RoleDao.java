package com.xunwu.frist.demo.dao;

import com.xunwu.frist.demo.entity.RoleEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户角色表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@Mapper
public interface RoleDao extends BaseDao<RoleEntity> {
	
}

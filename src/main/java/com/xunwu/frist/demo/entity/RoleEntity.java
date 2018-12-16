package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户角色表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class RoleEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//用户id
	private Integer userId;
	//用户角色名
	private String name;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户id
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * 设置：用户角色名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：用户角色名
	 */
	public String getName() {
		return name;
	}
}

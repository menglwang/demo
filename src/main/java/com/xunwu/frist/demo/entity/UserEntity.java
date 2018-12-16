package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户基本信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//用户唯一id
	private Integer id;
	//用户名
	private String name;
	//电子邮箱
	private String email;
	//电话号码
	private String phoneNumber;
	//密码
	private String password;
	//用户状态 0-正常 1-封禁
	private Integer status;
	//用户账号创建时间
	private Date createTime;
	//上次登录时间
	private Date lastLoginTime;
	//上次更新记录时间
	private Date lastUpdateTime;
	//头像
	private String avatar;

	/**
	 * 设置：用户唯一id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：用户唯一id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：用户名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：用户名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：电子邮箱
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 获取：电子邮箱
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 设置：电话号码
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 获取：电话号码
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：用户状态 0-正常 1-封禁
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：用户状态 0-正常 1-封禁
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：用户账号创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：用户账号创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：上次登录时间
	 */
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	/**
	 * 获取：上次登录时间
	 */
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	/**
	 * 设置：上次更新记录时间
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	/**
	 * 获取：上次更新记录时间
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	/**
	 * 设置：头像
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * 获取：头像
	 */
	public String getAvatar() {
		return avatar;
	}
}

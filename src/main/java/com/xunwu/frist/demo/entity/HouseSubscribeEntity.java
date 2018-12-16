package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 预约看房信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class HouseSubscribeEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//房源id
	private Integer houseId;
	//用户id
	private Integer userId;
	//用户描述
	private String desc;
	//预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
	private Integer status;
	//数据创建时间
	private Date createTime;
	//记录更新时间
	private Date lastUpdateTime;
	//预约时间
	private Date orderTime;
	//联系电话
	private String telephone;
	//房源发布者id
	private Integer adminId;

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
	 * 设置：房源id
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：房源id
	 */
	public Integer getHouseId() {
		return houseId;
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
	 * 设置：用户描述
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	/**
	 * 获取：用户描述
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * 设置：预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：预约状态 1-加入待看清单 2-已预约看房时间 3-看房完成
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：数据创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：数据创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：记录更新时间
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	/**
	 * 获取：记录更新时间
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	/**
	 * 设置：预约时间
	 */
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	/**
	 * 获取：预约时间
	 */
	public Date getOrderTime() {
		return orderTime;
	}
	/**
	 * 设置：联系电话
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	/**
	 * 获取：联系电话
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 设置：房源发布者id
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	/**
	 * 获取：房源发布者id
	 */
	public Integer getAdminId() {
		return adminId;
	}
}

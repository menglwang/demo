package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 房屋标签映射关系表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class HouseTagEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//房屋id
	private Integer houseId;
	//标签id
	private Integer id;
	//
	private String name;

	/**
	 * 设置：房屋id
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：房屋id
	 */
	public Integer getHouseId() {
		return houseId;
	}
	/**
	 * 设置：标签id
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：标签id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：
	 */
	public String getName() {
		return name;
	}
}

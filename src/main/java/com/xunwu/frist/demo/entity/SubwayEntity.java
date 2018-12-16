package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class SubwayEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//线路名
	private String name;
	//所属城市英文名缩写
	private String cityEnName;

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
	 * 设置：线路名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：线路名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：所属城市英文名缩写
	 */
	public void setCityEnName(String cityEnName) {
		this.cityEnName = cityEnName;
	}
	/**
	 * 获取：所属城市英文名缩写
	 */
	public String getCityEnName() {
		return cityEnName;
	}
}

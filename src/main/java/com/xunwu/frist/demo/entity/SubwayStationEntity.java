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
public class SubwayStationEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//所属地铁线id
	private Integer subwayId;
	//站点名称
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
	 * 设置：所属地铁线id
	 */
	public void setSubwayId(Integer subwayId) {
		this.subwayId = subwayId;
	}
	/**
	 * 获取：所属地铁线id
	 */
	public Integer getSubwayId() {
		return subwayId;
	}
	/**
	 * 设置：站点名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：站点名称
	 */
	public String getName() {
		return name;
	}
}

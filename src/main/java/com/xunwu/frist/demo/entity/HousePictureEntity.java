package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 房屋图片信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class HousePictureEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//所属房屋id
	private Integer houseId;
	//图片路径
	private String cdnPrefix;
	//宽
	private Integer width;
	//高
	private Integer height;
	//所属房屋位置
	private String location;
	//文件名
	private String path;

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
	 * 设置：所属房屋id
	 */
	public void setHouseId(Integer houseId) {
		this.houseId = houseId;
	}
	/**
	 * 获取：所属房屋id
	 */
	public Integer getHouseId() {
		return houseId;
	}
	/**
	 * 设置：图片路径
	 */
	public void setCdnPrefix(String cdnPrefix) {
		this.cdnPrefix = cdnPrefix;
	}
	/**
	 * 获取：图片路径
	 */
	public String getCdnPrefix() {
		return cdnPrefix;
	}
	/**
	 * 设置：宽
	 */
	public void setWidth(Integer width) {
		this.width = width;
	}
	/**
	 * 获取：宽
	 */
	public Integer getWidth() {
		return width;
	}
	/**
	 * 设置：高
	 */
	public void setHeight(Integer height) {
		this.height = height;
	}
	/**
	 * 获取：高
	 */
	public Integer getHeight() {
		return height;
	}
	/**
	 * 设置：所属房屋位置
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * 获取：所属房屋位置
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * 设置：文件名
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * 获取：文件名
	 */
	public String getPath() {
		return path;
	}
}

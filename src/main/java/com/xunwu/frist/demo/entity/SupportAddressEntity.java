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
public class SupportAddressEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//上一级行政单位名
	private String belongTo;
	//行政单位英文名缩写
	private String enName;
	//行政单位中文名
	private String cnName;
	//行政级别 市-city 地区-region
	private String level;
	//百度地图经度
	private Double baiduMapLng;
	//百度地图纬度
	private Double baiduMapLat;

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
	 * 设置：上一级行政单位名
	 */
	public void setBelongTo(String belongTo) {
		this.belongTo = belongTo;
	}
	/**
	 * 获取：上一级行政单位名
	 */
	public String getBelongTo() {
		return belongTo;
	}
	/**
	 * 设置：行政单位英文名缩写
	 */
	public void setEnName(String enName) {
		this.enName = enName;
	}
	/**
	 * 获取：行政单位英文名缩写
	 */
	public String getEnName() {
		return enName;
	}
	/**
	 * 设置：行政单位中文名
	 */
	public void setCnName(String cnName) {
		this.cnName = cnName;
	}
	/**
	 * 获取：行政单位中文名
	 */
	public String getCnName() {
		return cnName;
	}
	/**
	 * 设置：行政级别 市-city 地区-region
	 */
	public void setLevel(String level) {
		this.level = level;
	}
	/**
	 * 获取：行政级别 市-city 地区-region
	 */
	public String getLevel() {
		return level;
	}
	/**
	 * 设置：百度地图经度
	 */
	public void setBaiduMapLng(Double baiduMapLng) {
		this.baiduMapLng = baiduMapLng;
	}
	/**
	 * 获取：百度地图经度
	 */
	public Double getBaiduMapLng() {
		return baiduMapLng;
	}
	/**
	 * 设置：百度地图纬度
	 */
	public void setBaiduMapLat(Double baiduMapLat) {
		this.baiduMapLat = baiduMapLat;
	}
	/**
	 * 获取：百度地图纬度
	 */
	public Double getBaiduMapLat() {
		return baiduMapLat;
	}
}

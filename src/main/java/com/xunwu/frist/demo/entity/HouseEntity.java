package com.xunwu.frist.demo.entity;

import java.io.Serializable;
import java.util.Date;



/**
 * 房屋信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
public class HouseEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//house唯一标识
	private Integer id;
	//
	private String title;
	//价格
	private Integer price;
	//面积
	private Integer area;
	//卧室数量
	private Integer room;
	//楼层
	private Integer floor;
	//总楼层
	private Integer totalFloor;
	//被看次数
	private Integer watchTimes;
	//建立年限
	private Integer buildYear;
	//房屋状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除
	private Integer status;
	//创建时间
	private Date createTime;
	//最近数据更新时间
	private Date lastUpdateTime;
	//城市标记缩写 如 北京bj
	private String cityEnName;
	//地区英文简写 如昌平区 cpq
	private String regionEnName;
	//封面
	private String cover;
	//房屋朝向
	private Integer direction;
	//距地铁距离 默认-1 附近无地铁
	private Integer distanceToSubway;
	//客厅数量
	private Integer parlour;
	//所在小区
	private String district;
	//所属管理员id
	private Integer adminId;
	//
	private Integer bathroom;
	//街道
	private String street;

	/**
	 * 设置：house唯一标识
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：house唯一标识
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 获取：
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * 设置：面积
	 */
	public void setArea(Integer area) {
		this.area = area;
	}
	/**
	 * 获取：面积
	 */
	public Integer getArea() {
		return area;
	}
	/**
	 * 设置：卧室数量
	 */
	public void setRoom(Integer room) {
		this.room = room;
	}
	/**
	 * 获取：卧室数量
	 */
	public Integer getRoom() {
		return room;
	}
	/**
	 * 设置：楼层
	 */
	public void setFloor(Integer floor) {
		this.floor = floor;
	}
	/**
	 * 获取：楼层
	 */
	public Integer getFloor() {
		return floor;
	}
	/**
	 * 设置：总楼层
	 */
	public void setTotalFloor(Integer totalFloor) {
		this.totalFloor = totalFloor;
	}
	/**
	 * 获取：总楼层
	 */
	public Integer getTotalFloor() {
		return totalFloor;
	}
	/**
	 * 设置：被看次数
	 */
	public void setWatchTimes(Integer watchTimes) {
		this.watchTimes = watchTimes;
	}
	/**
	 * 获取：被看次数
	 */
	public Integer getWatchTimes() {
		return watchTimes;
	}
	/**
	 * 设置：建立年限
	 */
	public void setBuildYear(Integer buildYear) {
		this.buildYear = buildYear;
	}
	/**
	 * 获取：建立年限
	 */
	public Integer getBuildYear() {
		return buildYear;
	}
	/**
	 * 设置：房屋状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：房屋状态 0-未审核 1-审核通过 2-已出租 3-逻辑删除
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：最近数据更新时间
	 */
	public void setLastUpdateTime(Date lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	/**
	 * 获取：最近数据更新时间
	 */
	public Date getLastUpdateTime() {
		return lastUpdateTime;
	}
	/**
	 * 设置：城市标记缩写 如 北京bj
	 */
	public void setCityEnName(String cityEnName) {
		this.cityEnName = cityEnName;
	}
	/**
	 * 获取：城市标记缩写 如 北京bj
	 */
	public String getCityEnName() {
		return cityEnName;
	}
	/**
	 * 设置：地区英文简写 如昌平区 cpq
	 */
	public void setRegionEnName(String regionEnName) {
		this.regionEnName = regionEnName;
	}
	/**
	 * 获取：地区英文简写 如昌平区 cpq
	 */
	public String getRegionEnName() {
		return regionEnName;
	}
	/**
	 * 设置：封面
	 */
	public void setCover(String cover) {
		this.cover = cover;
	}
	/**
	 * 获取：封面
	 */
	public String getCover() {
		return cover;
	}
	/**
	 * 设置：房屋朝向
	 */
	public void setDirection(Integer direction) {
		this.direction = direction;
	}
	/**
	 * 获取：房屋朝向
	 */
	public Integer getDirection() {
		return direction;
	}
	/**
	 * 设置：距地铁距离 默认-1 附近无地铁
	 */
	public void setDistanceToSubway(Integer distanceToSubway) {
		this.distanceToSubway = distanceToSubway;
	}
	/**
	 * 获取：距地铁距离 默认-1 附近无地铁
	 */
	public Integer getDistanceToSubway() {
		return distanceToSubway;
	}
	/**
	 * 设置：客厅数量
	 */
	public void setParlour(Integer parlour) {
		this.parlour = parlour;
	}
	/**
	 * 获取：客厅数量
	 */
	public Integer getParlour() {
		return parlour;
	}
	/**
	 * 设置：所在小区
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	/**
	 * 获取：所在小区
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * 设置：所属管理员id
	 */
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	/**
	 * 获取：所属管理员id
	 */
	public Integer getAdminId() {
		return adminId;
	}
	/**
	 * 设置：
	 */
	public void setBathroom(Integer bathroom) {
		this.bathroom = bathroom;
	}
	/**
	 * 获取：
	 */
	public Integer getBathroom() {
		return bathroom;
	}
	/**
	 * 设置：街道
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * 获取：街道
	 */
	public String getStreet() {
		return street;
	}
}

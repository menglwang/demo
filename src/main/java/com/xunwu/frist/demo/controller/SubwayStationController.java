package com.xunwu.frist.demo.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xunwu.frist.demo.entity.SubwayStationEntity;
import com.xunwu.frist.demo.service.SubwayStationService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;




/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("subwaystation")
public class SubwayStationController {
	@Autowired
	private SubwayStationService subwayStationService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("subwaystation:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SubwayStationEntity> subwayStationList = subwayStationService.queryList(query);
		int total = subwayStationService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(subwayStationList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("subwaystation:info")
	public R info(@PathVariable("id") Integer id){
		SubwayStationEntity subwayStation = subwayStationService.queryObject(id);
		
		return R.ok().put("subwayStation", subwayStation);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("subwaystation:save")
	public R save(@RequestBody SubwayStationEntity subwayStation){
		subwayStationService.save(subwayStation);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("subwaystation:update")
	public R update(@RequestBody SubwayStationEntity subwayStation){
		subwayStationService.update(subwayStation);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("subwaystation:delete")
	public R delete(@RequestBody Integer[] ids){
		subwayStationService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

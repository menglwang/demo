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

import com.xunwu.frist.demo.entity.HouseEntity;
import com.xunwu.frist.demo.service.HouseService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;




/**
 * 房屋信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("house")
public class HouseController {
	@Autowired
	private HouseService houseService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("house:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HouseEntity> houseList = houseService.queryList(query);
		int total = houseService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(houseList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("house:info")
	public R info(@PathVariable("id") Integer id){
		HouseEntity house = houseService.queryObject(id);
		
		return R.ok().put("house", house);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("house:save")
	public R save(@RequestBody HouseEntity house){
		houseService.save(house);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("house:update")
	public R update(@RequestBody HouseEntity house){
		houseService.update(house);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("house:delete")
	public R delete(@RequestBody Integer[] ids){
		houseService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

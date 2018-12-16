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

import com.xunwu.frist.demo.entity.HouseTagEntity;
import com.xunwu.frist.demo.service.HouseTagService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;




/**
 * 房屋标签映射关系表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("housetag")
public class HouseTagController {
	@Autowired
	private HouseTagService houseTagService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("housetag:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HouseTagEntity> houseTagList = houseTagService.queryList(query);
		int total = houseTagService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(houseTagList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("housetag:info")
	public R info(@PathVariable("id") Integer id){
		HouseTagEntity houseTag = houseTagService.queryObject(id);
		
		return R.ok().put("houseTag", houseTag);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("housetag:save")
	public R save(@RequestBody HouseTagEntity houseTag){
		houseTagService.save(houseTag);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("housetag:update")
	public R update(@RequestBody HouseTagEntity houseTag){
		houseTagService.update(houseTag);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("housetag:delete")
	public R delete(@RequestBody Integer[] ids){
		houseTagService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

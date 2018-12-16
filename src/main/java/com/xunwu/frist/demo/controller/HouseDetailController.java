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

import com.xunwu.frist.demo.entity.HouseDetailEntity;
import com.xunwu.frist.demo.service.HouseDetailService;
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
@RequestMapping("housedetail")
public class HouseDetailController {
	@Autowired
	private HouseDetailService houseDetailService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("housedetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HouseDetailEntity> houseDetailList = houseDetailService.queryList(query);
		int total = houseDetailService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(houseDetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("housedetail:info")
	public R info(@PathVariable("id") Integer id){
		HouseDetailEntity houseDetail = houseDetailService.queryObject(id);
		
		return R.ok().put("houseDetail", houseDetail);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("housedetail:save")
	public R save(@RequestBody HouseDetailEntity houseDetail){
		houseDetailService.save(houseDetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("housedetail:update")
	public R update(@RequestBody HouseDetailEntity houseDetail){
		houseDetailService.update(houseDetail);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("housedetail:delete")
	public R delete(@RequestBody Integer[] ids){
		houseDetailService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

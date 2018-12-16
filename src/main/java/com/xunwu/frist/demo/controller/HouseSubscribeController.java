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

import com.xunwu.frist.demo.entity.HouseSubscribeEntity;
import com.xunwu.frist.demo.service.HouseSubscribeService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;




/**
 * 预约看房信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("housesubscribe")
public class HouseSubscribeController {
	@Autowired
	private HouseSubscribeService houseSubscribeService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("housesubscribe:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HouseSubscribeEntity> houseSubscribeList = houseSubscribeService.queryList(query);
		int total = houseSubscribeService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(houseSubscribeList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("housesubscribe:info")
	public R info(@PathVariable("id") Integer id){
		HouseSubscribeEntity houseSubscribe = houseSubscribeService.queryObject(id);
		
		return R.ok().put("houseSubscribe", houseSubscribe);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("housesubscribe:save")
	public R save(@RequestBody HouseSubscribeEntity houseSubscribe){
		houseSubscribeService.save(houseSubscribe);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("housesubscribe:update")
	public R update(@RequestBody HouseSubscribeEntity houseSubscribe){
		houseSubscribeService.update(houseSubscribe);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("housesubscribe:delete")
	public R delete(@RequestBody Integer[] ids){
		houseSubscribeService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

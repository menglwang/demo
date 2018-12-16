package com.xunwu.frist.demo.controller;

import com.xunwu.frist.demo.entity.SubwayEntity;
import com.xunwu.frist.demo.service.SubwayService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;




/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("subway")
public class SubwayController {
	@Autowired
	private SubwayService subwayService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("subway:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SubwayEntity> subwayList = subwayService.queryList(query);
		int total = subwayService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(subwayList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("subway:info")
	public R info(@PathVariable("id") Integer id){
		SubwayEntity subway = subwayService.queryObject(id);
		
		return R.ok().put("subway", subway);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("subway:save")
	public R save(@RequestBody SubwayEntity subway){
		subwayService.save(subway);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("subway:update")
	public R update(@RequestBody SubwayEntity subway){
		subwayService.update(subway);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("subway:delete")
	public R delete(@RequestBody Integer[] ids){
		subwayService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

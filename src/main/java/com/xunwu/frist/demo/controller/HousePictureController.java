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

import com.xunwu.frist.demo.entity.HousePictureEntity;
import com.xunwu.frist.demo.service.HousePictureService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;




/**
 * 房屋图片信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("housepicture")
public class HousePictureController {
	@Autowired
	private HousePictureService housePictureService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("housepicture:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<HousePictureEntity> housePictureList = housePictureService.queryList(query);
		int total = housePictureService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(housePictureList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("housepicture:info")
	public R info(@PathVariable("id") Integer id){
		HousePictureEntity housePicture = housePictureService.queryObject(id);
		
		return R.ok().put("housePicture", housePicture);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("housepicture:save")
	public R save(@RequestBody HousePictureEntity housePicture){
		housePictureService.save(housePicture);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("housepicture:update")
	public R update(@RequestBody HousePictureEntity housePicture){
		housePictureService.update(housePicture);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("housepicture:delete")
	public R delete(@RequestBody Integer[] ids){
		housePictureService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

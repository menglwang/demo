package com.xunwu.frist.demo.controller;

import com.xunwu.frist.demo.entity.RoleEntity;
import com.xunwu.frist.demo.service.RoleService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;



/**
 * 用户角色表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("role:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<RoleEntity> roleList = roleService.queryList(query);
		int total = roleService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(roleList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("role:info")
	public R info(@PathVariable("id") Integer id){
		RoleEntity role = roleService.queryObject(id);
		
		return R.ok().put("role", role);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("role:save")
	public R save(@RequestBody RoleEntity role){
		roleService.save(role);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("role:update")
	public R update(@RequestBody RoleEntity role){
		roleService.update(role);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("role:delete")
	public R delete(@RequestBody Integer[] ids){
		roleService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

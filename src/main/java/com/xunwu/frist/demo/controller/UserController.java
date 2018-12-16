package com.xunwu.frist.demo.controller;

import com.xunwu.frist.demo.entity.UserEntity;
import com.xunwu.frist.demo.service.UserService;
import com.xunwu.frist.demo.utils.PageUtils;
import com.xunwu.frist.demo.utils.Query;
import com.xunwu.frist.demo.utils.R;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;




/**
 * 用户基本信息表
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-12-13 23:08:30
 */
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("user:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<UserEntity> userList = userService.queryList(query);
		int total = userService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(userList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("user:info")
	public R info(@PathVariable("id") Integer id){
		UserEntity user = userService.queryObject(id);
		
		return R.ok().put("user", user);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("user:save")
	public R save(@RequestBody UserEntity user){
		userService.save(user);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("user:update")
	public R update(@RequestBody UserEntity user){
		userService.update(user);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("user:delete")
	public R delete(@RequestBody Integer[] ids){
		userService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

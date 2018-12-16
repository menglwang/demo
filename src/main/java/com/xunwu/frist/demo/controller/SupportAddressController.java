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

import com.xunwu.frist.demo.entity.SupportAddressEntity;
import com.xunwu.frist.demo.service.SupportAddressService;
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
@RequestMapping("supportaddress")
public class SupportAddressController {
	@Autowired
	private SupportAddressService supportAddressService;
	
	/**
	 * 列表
	 */
	@RequestMapping("/list")
	@RequiresPermissions("supportaddress:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<SupportAddressEntity> supportAddressList = supportAddressService.queryList(query);
		int total = supportAddressService.queryTotal(query);
		
		PageUtils pageUtil = new PageUtils(supportAddressList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}
	
	
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("supportaddress:info")
	public R info(@PathVariable("id") Integer id){
		SupportAddressEntity supportAddress = supportAddressService.queryObject(id);
		
		return R.ok().put("supportAddress", supportAddress);
	}
	
	/**
	 * 保存
	 */
	@RequestMapping("/save")
	@RequiresPermissions("supportaddress:save")
	public R save(@RequestBody SupportAddressEntity supportAddress){
		supportAddressService.save(supportAddress);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("supportaddress:update")
	public R update(@RequestBody SupportAddressEntity supportAddress){
		supportAddressService.update(supportAddress);
		
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@RequestMapping("/delete")
	@RequiresPermissions("supportaddress:delete")
	public R delete(@RequestBody Integer[] ids){
		supportAddressService.deleteBatch(ids);
		
		return R.ok();
	}
	
}

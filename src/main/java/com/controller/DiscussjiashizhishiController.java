package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussjiashizhishiEntity;
import com.entity.view.DiscussjiashizhishiView;

import com.service.DiscussjiashizhishiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 驾驶知识评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
@RestController
@RequestMapping("/discussjiashizhishi")
public class DiscussjiashizhishiController {
    @Autowired
    private DiscussjiashizhishiService discussjiashizhishiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussjiashizhishiEntity discussjiashizhishi,
		HttpServletRequest request){
        EntityWrapper<DiscussjiashizhishiEntity> ew = new EntityWrapper<DiscussjiashizhishiEntity>();

		PageUtils page = discussjiashizhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjiashizhishi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussjiashizhishiEntity discussjiashizhishi, 
		HttpServletRequest request){
        EntityWrapper<DiscussjiashizhishiEntity> ew = new EntityWrapper<DiscussjiashizhishiEntity>();

		PageUtils page = discussjiashizhishiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussjiashizhishi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussjiashizhishiEntity discussjiashizhishi){
       	EntityWrapper<DiscussjiashizhishiEntity> ew = new EntityWrapper<DiscussjiashizhishiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussjiashizhishi, "discussjiashizhishi")); 
        return R.ok().put("data", discussjiashizhishiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussjiashizhishiEntity discussjiashizhishi){
        EntityWrapper< DiscussjiashizhishiEntity> ew = new EntityWrapper< DiscussjiashizhishiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussjiashizhishi, "discussjiashizhishi")); 
		DiscussjiashizhishiView discussjiashizhishiView =  discussjiashizhishiService.selectView(ew);
		return R.ok("查询驾驶知识评论表成功").put("data", discussjiashizhishiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussjiashizhishiEntity discussjiashizhishi = discussjiashizhishiService.selectById(id);
        return R.ok().put("data", discussjiashizhishi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussjiashizhishiEntity discussjiashizhishi = discussjiashizhishiService.selectById(id);
        return R.ok().put("data", discussjiashizhishi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussjiashizhishiEntity discussjiashizhishi, HttpServletRequest request){
    	discussjiashizhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjiashizhishi);
        discussjiashizhishiService.insert(discussjiashizhishi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussjiashizhishiEntity discussjiashizhishi, HttpServletRequest request){
    	discussjiashizhishi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussjiashizhishi);
        discussjiashizhishiService.insert(discussjiashizhishi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussjiashizhishiEntity discussjiashizhishi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussjiashizhishi);
        discussjiashizhishiService.updateById(discussjiashizhishi);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussjiashizhishiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussjiashizhishiEntity> wrapper = new EntityWrapper<DiscussjiashizhishiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussjiashizhishiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}

package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussjiashizhishiDao;
import com.entity.DiscussjiashizhishiEntity;
import com.service.DiscussjiashizhishiService;
import com.entity.vo.DiscussjiashizhishiVO;
import com.entity.view.DiscussjiashizhishiView;

@Service("discussjiashizhishiService")
public class DiscussjiashizhishiServiceImpl extends ServiceImpl<DiscussjiashizhishiDao, DiscussjiashizhishiEntity> implements DiscussjiashizhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiashizhishiEntity> page = this.selectPage(
                new Query<DiscussjiashizhishiEntity>(params).getPage(),
                new EntityWrapper<DiscussjiashizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiashizhishiEntity> wrapper) {
		  Page<DiscussjiashizhishiView> page =new Query<DiscussjiashizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiashizhishiVO> selectListVO(Wrapper<DiscussjiashizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiashizhishiVO selectVO(Wrapper<DiscussjiashizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiashizhishiView> selectListView(Wrapper<DiscussjiashizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiashizhishiView selectView(Wrapper<DiscussjiashizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.JiashizhishiDao;
import com.entity.JiashizhishiEntity;
import com.service.JiashizhishiService;
import com.entity.vo.JiashizhishiVO;
import com.entity.view.JiashizhishiView;

@Service("jiashizhishiService")
public class JiashizhishiServiceImpl extends ServiceImpl<JiashizhishiDao, JiashizhishiEntity> implements JiashizhishiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiashizhishiEntity> page = this.selectPage(
                new Query<JiashizhishiEntity>(params).getPage(),
                new EntityWrapper<JiashizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiashizhishiEntity> wrapper) {
		  Page<JiashizhishiView> page =new Query<JiashizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiashizhishiVO> selectListVO(Wrapper<JiashizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiashizhishiVO selectVO(Wrapper<JiashizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiashizhishiView> selectListView(Wrapper<JiashizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiashizhishiView selectView(Wrapper<JiashizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

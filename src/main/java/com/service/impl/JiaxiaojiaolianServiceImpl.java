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


import com.dao.JiaxiaojiaolianDao;
import com.entity.JiaxiaojiaolianEntity;
import com.service.JiaxiaojiaolianService;
import com.entity.vo.JiaxiaojiaolianVO;
import com.entity.view.JiaxiaojiaolianView;

@Service("jiaxiaojiaolianService")
public class JiaxiaojiaolianServiceImpl extends ServiceImpl<JiaxiaojiaolianDao, JiaxiaojiaolianEntity> implements JiaxiaojiaolianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxiaojiaolianEntity> page = this.selectPage(
                new Query<JiaxiaojiaolianEntity>(params).getPage(),
                new EntityWrapper<JiaxiaojiaolianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxiaojiaolianEntity> wrapper) {
		  Page<JiaxiaojiaolianView> page =new Query<JiaxiaojiaolianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxiaojiaolianVO> selectListVO(Wrapper<JiaxiaojiaolianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxiaojiaolianVO selectVO(Wrapper<JiaxiaojiaolianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxiaojiaolianView> selectListView(Wrapper<JiaxiaojiaolianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxiaojiaolianView selectView(Wrapper<JiaxiaojiaolianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.KaoshiyuyueDao;
import com.entity.KaoshiyuyueEntity;
import com.service.KaoshiyuyueService;
import com.entity.vo.KaoshiyuyueVO;
import com.entity.view.KaoshiyuyueView;

@Service("kaoshiyuyueService")
public class KaoshiyuyueServiceImpl extends ServiceImpl<KaoshiyuyueDao, KaoshiyuyueEntity> implements KaoshiyuyueService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshiyuyueEntity> page = this.selectPage(
                new Query<KaoshiyuyueEntity>(params).getPage(),
                new EntityWrapper<KaoshiyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshiyuyueEntity> wrapper) {
		  Page<KaoshiyuyueView> page =new Query<KaoshiyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshiyuyueVO> selectListVO(Wrapper<KaoshiyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshiyuyueVO selectVO(Wrapper<KaoshiyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshiyuyueView> selectListView(Wrapper<KaoshiyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshiyuyueView selectView(Wrapper<KaoshiyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

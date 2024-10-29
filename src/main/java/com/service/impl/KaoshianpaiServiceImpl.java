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


import com.dao.KaoshianpaiDao;
import com.entity.KaoshianpaiEntity;
import com.service.KaoshianpaiService;
import com.entity.vo.KaoshianpaiVO;
import com.entity.view.KaoshianpaiView;

@Service("kaoshianpaiService")
public class KaoshianpaiServiceImpl extends ServiceImpl<KaoshianpaiDao, KaoshianpaiEntity> implements KaoshianpaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshianpaiEntity> page = this.selectPage(
                new Query<KaoshianpaiEntity>(params).getPage(),
                new EntityWrapper<KaoshianpaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshianpaiEntity> wrapper) {
		  Page<KaoshianpaiView> page =new Query<KaoshianpaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshianpaiVO> selectListVO(Wrapper<KaoshianpaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshianpaiVO selectVO(Wrapper<KaoshianpaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshianpaiView> selectListView(Wrapper<KaoshianpaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshianpaiView selectView(Wrapper<KaoshianpaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

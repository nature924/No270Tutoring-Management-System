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


import com.dao.QuxiaokaoshiDao;
import com.entity.QuxiaokaoshiEntity;
import com.service.QuxiaokaoshiService;
import com.entity.vo.QuxiaokaoshiVO;
import com.entity.view.QuxiaokaoshiView;

@Service("quxiaokaoshiService")
public class QuxiaokaoshiServiceImpl extends ServiceImpl<QuxiaokaoshiDao, QuxiaokaoshiEntity> implements QuxiaokaoshiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuxiaokaoshiEntity> page = this.selectPage(
                new Query<QuxiaokaoshiEntity>(params).getPage(),
                new EntityWrapper<QuxiaokaoshiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuxiaokaoshiEntity> wrapper) {
		  Page<QuxiaokaoshiView> page =new Query<QuxiaokaoshiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuxiaokaoshiVO> selectListVO(Wrapper<QuxiaokaoshiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuxiaokaoshiVO selectVO(Wrapper<QuxiaokaoshiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuxiaokaoshiView> selectListView(Wrapper<QuxiaokaoshiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuxiaokaoshiView selectView(Wrapper<QuxiaokaoshiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

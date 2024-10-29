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


import com.dao.JiaxiaocheliangDao;
import com.entity.JiaxiaocheliangEntity;
import com.service.JiaxiaocheliangService;
import com.entity.vo.JiaxiaocheliangVO;
import com.entity.view.JiaxiaocheliangView;

@Service("jiaxiaocheliangService")
public class JiaxiaocheliangServiceImpl extends ServiceImpl<JiaxiaocheliangDao, JiaxiaocheliangEntity> implements JiaxiaocheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaxiaocheliangEntity> page = this.selectPage(
                new Query<JiaxiaocheliangEntity>(params).getPage(),
                new EntityWrapper<JiaxiaocheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaxiaocheliangEntity> wrapper) {
		  Page<JiaxiaocheliangView> page =new Query<JiaxiaocheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaxiaocheliangVO> selectListVO(Wrapper<JiaxiaocheliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaxiaocheliangVO selectVO(Wrapper<JiaxiaocheliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaxiaocheliangView> selectListView(Wrapper<JiaxiaocheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaxiaocheliangView selectView(Wrapper<JiaxiaocheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

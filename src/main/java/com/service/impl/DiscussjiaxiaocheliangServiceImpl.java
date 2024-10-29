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


import com.dao.DiscussjiaxiaocheliangDao;
import com.entity.DiscussjiaxiaocheliangEntity;
import com.service.DiscussjiaxiaocheliangService;
import com.entity.vo.DiscussjiaxiaocheliangVO;
import com.entity.view.DiscussjiaxiaocheliangView;

@Service("discussjiaxiaocheliangService")
public class DiscussjiaxiaocheliangServiceImpl extends ServiceImpl<DiscussjiaxiaocheliangDao, DiscussjiaxiaocheliangEntity> implements DiscussjiaxiaocheliangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjiaxiaocheliangEntity> page = this.selectPage(
                new Query<DiscussjiaxiaocheliangEntity>(params).getPage(),
                new EntityWrapper<DiscussjiaxiaocheliangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjiaxiaocheliangEntity> wrapper) {
		  Page<DiscussjiaxiaocheliangView> page =new Query<DiscussjiaxiaocheliangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjiaxiaocheliangVO> selectListVO(Wrapper<DiscussjiaxiaocheliangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjiaxiaocheliangVO selectVO(Wrapper<DiscussjiaxiaocheliangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjiaxiaocheliangView> selectListView(Wrapper<DiscussjiaxiaocheliangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjiaxiaocheliangView selectView(Wrapper<DiscussjiaxiaocheliangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

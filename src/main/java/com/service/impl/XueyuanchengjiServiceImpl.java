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


import com.dao.XueyuanchengjiDao;
import com.entity.XueyuanchengjiEntity;
import com.service.XueyuanchengjiService;
import com.entity.vo.XueyuanchengjiVO;
import com.entity.view.XueyuanchengjiView;

@Service("xueyuanchengjiService")
public class XueyuanchengjiServiceImpl extends ServiceImpl<XueyuanchengjiDao, XueyuanchengjiEntity> implements XueyuanchengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueyuanchengjiEntity> page = this.selectPage(
                new Query<XueyuanchengjiEntity>(params).getPage(),
                new EntityWrapper<XueyuanchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueyuanchengjiEntity> wrapper) {
		  Page<XueyuanchengjiView> page =new Query<XueyuanchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueyuanchengjiVO> selectListVO(Wrapper<XueyuanchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueyuanchengjiVO selectVO(Wrapper<XueyuanchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueyuanchengjiView> selectListView(Wrapper<XueyuanchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueyuanchengjiView selectView(Wrapper<XueyuanchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

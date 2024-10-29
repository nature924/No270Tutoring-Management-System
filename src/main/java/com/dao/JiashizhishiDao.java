package com.dao;

import com.entity.JiashizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiashizhishiVO;
import com.entity.view.JiashizhishiView;


/**
 * 驾驶知识
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface JiashizhishiDao extends BaseMapper<JiashizhishiEntity> {
	
	List<JiashizhishiVO> selectListVO(@Param("ew") Wrapper<JiashizhishiEntity> wrapper);
	
	JiashizhishiVO selectVO(@Param("ew") Wrapper<JiashizhishiEntity> wrapper);
	
	List<JiashizhishiView> selectListView(@Param("ew") Wrapper<JiashizhishiEntity> wrapper);

	List<JiashizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<JiashizhishiEntity> wrapper);
	
	JiashizhishiView selectView(@Param("ew") Wrapper<JiashizhishiEntity> wrapper);
	

}

package com.dao;

import com.entity.DiscussjiashizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiashizhishiVO;
import com.entity.view.DiscussjiashizhishiView;


/**
 * 驾驶知识评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
public interface DiscussjiashizhishiDao extends BaseMapper<DiscussjiashizhishiEntity> {
	
	List<DiscussjiashizhishiVO> selectListVO(@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);
	
	DiscussjiashizhishiVO selectVO(@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);
	
	List<DiscussjiashizhishiView> selectListView(@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);

	List<DiscussjiashizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);
	
	DiscussjiashizhishiView selectView(@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);
	

}

package com.dao;

import com.entity.QuxiaokaoshiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuxiaokaoshiVO;
import com.entity.view.QuxiaokaoshiView;


/**
 * 取消考试
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface QuxiaokaoshiDao extends BaseMapper<QuxiaokaoshiEntity> {
	
	List<QuxiaokaoshiVO> selectListVO(@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);
	
	QuxiaokaoshiVO selectVO(@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);
	
	List<QuxiaokaoshiView> selectListView(@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);

	List<QuxiaokaoshiView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);
	
	QuxiaokaoshiView selectView(@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);
	

}

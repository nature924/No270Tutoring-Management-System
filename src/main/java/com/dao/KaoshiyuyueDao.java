package com.dao;

import com.entity.KaoshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KaoshiyuyueVO;
import com.entity.view.KaoshiyuyueView;


/**
 * 考试预约
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface KaoshiyuyueDao extends BaseMapper<KaoshiyuyueEntity> {
	
	List<KaoshiyuyueVO> selectListVO(@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);
	
	KaoshiyuyueVO selectVO(@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);
	
	List<KaoshiyuyueView> selectListView(@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);

	List<KaoshiyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);
	
	KaoshiyuyueView selectView(@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);
	

}

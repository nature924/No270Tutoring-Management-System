package com.dao;

import com.entity.DiscussjiaxiaocheliangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjiaxiaocheliangVO;
import com.entity.view.DiscussjiaxiaocheliangView;


/**
 * 驾校车辆评论表
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
public interface DiscussjiaxiaocheliangDao extends BaseMapper<DiscussjiaxiaocheliangEntity> {
	
	List<DiscussjiaxiaocheliangVO> selectListVO(@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
	
	DiscussjiaxiaocheliangVO selectVO(@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
	
	List<DiscussjiaxiaocheliangView> selectListView(@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);

	List<DiscussjiaxiaocheliangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
	
	DiscussjiaxiaocheliangView selectView(@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
	

}

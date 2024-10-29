package com.dao;

import com.entity.XueyuanchengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueyuanchengjiVO;
import com.entity.view.XueyuanchengjiView;


/**
 * 学员成绩
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface XueyuanchengjiDao extends BaseMapper<XueyuanchengjiEntity> {
	
	List<XueyuanchengjiVO> selectListVO(@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);
	
	XueyuanchengjiVO selectVO(@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);
	
	List<XueyuanchengjiView> selectListView(@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);

	List<XueyuanchengjiView> selectListView(Pagination page,@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);
	
	XueyuanchengjiView selectView(@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);
	

}

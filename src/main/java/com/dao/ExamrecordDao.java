package com.dao;

import com.entity.ExamrecordEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ExamrecordVO;
import com.entity.view.ExamrecordView;


/**
 * 驾校考试记录表
 * 
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
public interface ExamrecordDao extends BaseMapper<ExamrecordEntity> {
	
	List<ExamrecordVO> selectListVO(@Param("ew") Wrapper<ExamrecordEntity> wrapper);
	
	ExamrecordVO selectVO(@Param("ew") Wrapper<ExamrecordEntity> wrapper);
	
	List<ExamrecordView> selectListView(@Param("ew") Wrapper<ExamrecordEntity> wrapper);

	List<ExamrecordView> selectListView(Pagination page,@Param("ew") Wrapper<ExamrecordEntity> wrapper);
	
	ExamrecordView selectView(@Param("ew") Wrapper<ExamrecordEntity> wrapper);
	
	List<ExamrecordView> selectGroupBy(Pagination page,@Param("ew") Wrapper<ExamrecordEntity> wrapper);

}

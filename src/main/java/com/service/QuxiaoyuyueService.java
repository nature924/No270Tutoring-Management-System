package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaoyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaoyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaoyuyueView;


/**
 * 取消预约
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface QuxiaoyuyueService extends IService<QuxiaoyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaoyuyueVO> selectListVO(Wrapper<QuxiaoyuyueEntity> wrapper);
   	
   	QuxiaoyuyueVO selectVO(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
   	
   	List<QuxiaoyuyueView> selectListView(Wrapper<QuxiaoyuyueEntity> wrapper);
   	
   	QuxiaoyuyueView selectView(@Param("ew") Wrapper<QuxiaoyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaoyuyueEntity> wrapper);
   	

}


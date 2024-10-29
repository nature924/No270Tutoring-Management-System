package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiashizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiashizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiashizhishiView;


/**
 * 驾驶知识
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface JiashizhishiService extends IService<JiashizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiashizhishiVO> selectListVO(Wrapper<JiashizhishiEntity> wrapper);
   	
   	JiashizhishiVO selectVO(@Param("ew") Wrapper<JiashizhishiEntity> wrapper);
   	
   	List<JiashizhishiView> selectListView(Wrapper<JiashizhishiEntity> wrapper);
   	
   	JiashizhishiView selectView(@Param("ew") Wrapper<JiashizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiashizhishiEntity> wrapper);
   	

}


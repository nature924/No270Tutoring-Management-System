package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiashizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiashizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiashizhishiView;


/**
 * 驾驶知识评论表
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
public interface DiscussjiashizhishiService extends IService<DiscussjiashizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiashizhishiVO> selectListVO(Wrapper<DiscussjiashizhishiEntity> wrapper);
   	
   	DiscussjiashizhishiVO selectVO(@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);
   	
   	List<DiscussjiashizhishiView> selectListView(Wrapper<DiscussjiashizhishiEntity> wrapper);
   	
   	DiscussjiashizhishiView selectView(@Param("ew") Wrapper<DiscussjiashizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiashizhishiEntity> wrapper);
   	

}


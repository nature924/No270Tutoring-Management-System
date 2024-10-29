package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjiaxiaocheliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjiaxiaocheliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjiaxiaocheliangView;


/**
 * 驾校车辆评论表
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
public interface DiscussjiaxiaocheliangService extends IService<DiscussjiaxiaocheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjiaxiaocheliangVO> selectListVO(Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
   	
   	DiscussjiaxiaocheliangVO selectVO(@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
   	
   	List<DiscussjiaxiaocheliangView> selectListView(Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
   	
   	DiscussjiaxiaocheliangView selectView(@Param("ew") Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjiaxiaocheliangEntity> wrapper);
   	

}


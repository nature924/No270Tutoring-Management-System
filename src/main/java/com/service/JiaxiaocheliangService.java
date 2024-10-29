package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaxiaocheliangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaxiaocheliangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaxiaocheliangView;


/**
 * 驾校车辆
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface JiaxiaocheliangService extends IService<JiaxiaocheliangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaxiaocheliangVO> selectListVO(Wrapper<JiaxiaocheliangEntity> wrapper);
   	
   	JiaxiaocheliangVO selectVO(@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);
   	
   	List<JiaxiaocheliangView> selectListView(Wrapper<JiaxiaocheliangEntity> wrapper);
   	
   	JiaxiaocheliangView selectView(@Param("ew") Wrapper<JiaxiaocheliangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaxiaocheliangEntity> wrapper);
   	

}


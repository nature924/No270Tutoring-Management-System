package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshiyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshiyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshiyuyueView;


/**
 * 考试预约
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface KaoshiyuyueService extends IService<KaoshiyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshiyuyueVO> selectListVO(Wrapper<KaoshiyuyueEntity> wrapper);
   	
   	KaoshiyuyueVO selectVO(@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);
   	
   	List<KaoshiyuyueView> selectListView(Wrapper<KaoshiyuyueEntity> wrapper);
   	
   	KaoshiyuyueView selectView(@Param("ew") Wrapper<KaoshiyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshiyuyueEntity> wrapper);
   	

}


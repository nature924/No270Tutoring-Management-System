package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuxiaokaoshiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuxiaokaoshiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuxiaokaoshiView;


/**
 * 取消考试
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface QuxiaokaoshiService extends IService<QuxiaokaoshiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaokaoshiVO> selectListVO(Wrapper<QuxiaokaoshiEntity> wrapper);
   	
   	QuxiaokaoshiVO selectVO(@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);
   	
   	List<QuxiaokaoshiView> selectListView(Wrapper<QuxiaokaoshiEntity> wrapper);
   	
   	QuxiaokaoshiView selectView(@Param("ew") Wrapper<QuxiaokaoshiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaokaoshiEntity> wrapper);
   	

}


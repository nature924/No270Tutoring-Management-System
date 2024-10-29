package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueyuanchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueyuanchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueyuanchengjiView;


/**
 * 学员成绩
 *
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public interface XueyuanchengjiService extends IService<XueyuanchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueyuanchengjiVO> selectListVO(Wrapper<XueyuanchengjiEntity> wrapper);
   	
   	XueyuanchengjiVO selectVO(@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);
   	
   	List<XueyuanchengjiView> selectListView(Wrapper<XueyuanchengjiEntity> wrapper);
   	
   	XueyuanchengjiView selectView(@Param("ew") Wrapper<XueyuanchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueyuanchengjiEntity> wrapper);
   	

}


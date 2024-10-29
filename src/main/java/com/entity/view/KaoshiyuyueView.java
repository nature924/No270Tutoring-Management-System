package com.entity.view;

import com.entity.KaoshiyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
@TableName("kaoshiyuyue")
public class KaoshiyuyueView  extends KaoshiyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshiyuyueView(){
	}
 
 	public KaoshiyuyueView(KaoshiyuyueEntity kaoshiyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshiyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

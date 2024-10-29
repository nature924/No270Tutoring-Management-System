package com.entity.view;

import com.entity.KaoshianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 考试安排
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
@TableName("kaoshianpai")
public class KaoshianpaiView  extends KaoshianpaiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KaoshianpaiView(){
	}
 
 	public KaoshianpaiView(KaoshianpaiEntity kaoshianpaiEntity){
 	try {
			BeanUtils.copyProperties(this, kaoshianpaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

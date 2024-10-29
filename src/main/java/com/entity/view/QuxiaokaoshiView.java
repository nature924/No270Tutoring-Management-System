package com.entity.view;

import com.entity.QuxiaokaoshiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 取消考试
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
@TableName("quxiaokaoshi")
public class QuxiaokaoshiView  extends QuxiaokaoshiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuxiaokaoshiView(){
	}
 
 	public QuxiaokaoshiView(QuxiaokaoshiEntity quxiaokaoshiEntity){
 	try {
			BeanUtils.copyProperties(this, quxiaokaoshiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

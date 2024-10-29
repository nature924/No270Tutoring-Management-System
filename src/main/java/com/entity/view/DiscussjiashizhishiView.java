package com.entity.view;

import com.entity.DiscussjiashizhishiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾驶知识评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
@TableName("discussjiashizhishi")
public class DiscussjiashizhishiView  extends DiscussjiashizhishiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjiashizhishiView(){
	}
 
 	public DiscussjiashizhishiView(DiscussjiashizhishiEntity discussjiashizhishiEntity){
 	try {
			BeanUtils.copyProperties(this, discussjiashizhishiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

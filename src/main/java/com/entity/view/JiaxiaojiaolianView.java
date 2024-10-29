package com.entity.view;

import com.entity.JiaxiaojiaolianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 驾校教练
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
@TableName("jiaxiaojiaolian")
public class JiaxiaojiaolianView  extends JiaxiaojiaolianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaxiaojiaolianView(){
	}
 
 	public JiaxiaojiaolianView(JiaxiaojiaolianEntity jiaxiaojiaolianEntity){
 	try {
			BeanUtils.copyProperties(this, jiaxiaojiaolianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.vo;

import com.entity.KaoshianpaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 考试安排
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
public class KaoshianpaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 考试费用
	 */
	
	private Integer kaoshifeiyong;
		
	/**
	 * 考试地点
	 */
	
	private String kaoshididian;
		
	/**
	 * 考试时间
	 */
	
	private String kaoshishijian;
		
	/**
	 * 考试介绍
	 */
	
	private String kaoshijieshao;
		
	/**
	 * 驾驶证类型
	 */
	
	private String jiashizhengleixing;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：考试费用
	 */
	 
	public void setKaoshifeiyong(Integer kaoshifeiyong) {
		this.kaoshifeiyong = kaoshifeiyong;
	}
	
	/**
	 * 获取：考试费用
	 */
	public Integer getKaoshifeiyong() {
		return kaoshifeiyong;
	}
				
	
	/**
	 * 设置：考试地点
	 */
	 
	public void setKaoshididian(String kaoshididian) {
		this.kaoshididian = kaoshididian;
	}
	
	/**
	 * 获取：考试地点
	 */
	public String getKaoshididian() {
		return kaoshididian;
	}
				
	
	/**
	 * 设置：考试时间
	 */
	 
	public void setKaoshishijian(String kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	
	/**
	 * 获取：考试时间
	 */
	public String getKaoshishijian() {
		return kaoshishijian;
	}
				
	
	/**
	 * 设置：考试介绍
	 */
	 
	public void setKaoshijieshao(String kaoshijieshao) {
		this.kaoshijieshao = kaoshijieshao;
	}
	
	/**
	 * 获取：考试介绍
	 */
	public String getKaoshijieshao() {
		return kaoshijieshao;
	}
				
	
	/**
	 * 设置：驾驶证类型
	 */
	 
	public void setJiashizhengleixing(String jiashizhengleixing) {
		this.jiashizhengleixing = jiashizhengleixing;
	}
	
	/**
	 * 获取：驾驶证类型
	 */
	public String getJiashizhengleixing() {
		return jiashizhengleixing;
	}
			
}

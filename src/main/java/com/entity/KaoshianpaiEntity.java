package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 考试安排
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:52
 */
@TableName("kaoshianpai")
public class KaoshianpaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshianpaiEntity() {
		
	}
	
	public KaoshianpaiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 考试科目
	 */
					
	private String kaoshikemu;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考试科目
	 */
	public void setKaoshikemu(String kaoshikemu) {
		this.kaoshikemu = kaoshikemu;
	}
	/**
	 * 获取：考试科目
	 */
	public String getKaoshikemu() {
		return kaoshikemu;
	}
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

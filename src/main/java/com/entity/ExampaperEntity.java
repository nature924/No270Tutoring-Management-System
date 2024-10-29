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
 * 笔试考试表
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-02-09 16:41:53
 */
@TableName("exampaper")
public class ExampaperEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ExampaperEntity() {
		
	}
	
	public ExampaperEntity(T t) {
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
	 * 笔试考试名称
	 */
					
	private String name;
	
	/**
	 * 驾校考试时长(分钟)
	 */
					
	private Integer time;
	
	/**
	 * 笔试考试状态
	 */
					
	private Integer status;
	
	
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
	 * 设置：笔试考试名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：笔试考试名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：驾校考试时长(分钟)
	 */
	public void setTime(Integer time) {
		this.time = time;
	}
	/**
	 * 获取：驾校考试时长(分钟)
	 */
	public Integer getTime() {
		return time;
	}
	/**
	 * 设置：笔试考试状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：笔试考试状态
	 */
	public Integer getStatus() {
		return status;
	}

}

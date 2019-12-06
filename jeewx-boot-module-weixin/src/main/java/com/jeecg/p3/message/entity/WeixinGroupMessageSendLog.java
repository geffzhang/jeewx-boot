package com.jeecg.p3.message.entity;

import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>群发消息日志表<br>
 * @author weijian.zhang
 * @since：2018年08月03日 14时43分17秒 星期五 
 * @version:1.0
 */
public class WeixinGroupMessageSendLog implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	public String getTemplateName() {
		return templateName;
	}
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}
	/**
	//update-begin--Author:zhangweijian Date:20181015 for：添加标签名称引用
	
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	/**
	//update-end--Author:zhangweijian Date:20181015 for：添加标签名称引用
	/**
	 *创建人
	 */
	private String createBy;
	/**
	 *创建时间
	 */
	private Date createTime;
	
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}

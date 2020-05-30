package com.jeecg.p3.cms.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>广告管理<br>
 * @author junfeng.zhou
 * @since：2018年09月25日 17时45分31秒 星期二 
 * @version:1.0
 */
public class CmsAd implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 站点ID
	 */
	private String mainId;
	
	/**
	 * html5网站网址
	 */
	private String htmlLink;
	public String getMainId() {
		return mainId;
	}
	public void setMainId(String mainId) {
		this.mainId = mainId;
	}
	/**
	 * @return the htmlLink
	 */
	public String getHtmlLink() {
		return htmlLink;
	}
	/**
	 * @param htmlLink the htmlLink to set
	 */
	public void setHtmlLink(String htmlLink) {
		this.htmlLink = htmlLink;
	}
	
}

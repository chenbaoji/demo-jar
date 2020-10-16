package com.lanqiao.query;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lanqiao.util.NullUtil;


/**
 * 列表查询的查询对象.
 * @author Acci.
 * 2016年12月11日.
 */
public class SearchDTO implements Serializable{

	private static final long serialVersionUID = 1317665968517579170L;
	/**
	 * 关键字.
	 */
	private String keywords;
	/**
	 * 分页信息.
	 */
	private Page page;
	/**
	 * 排序方式.
	 */
	private String orderCause;
	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getOrderCause() {
		return orderCause;
	}
	public void setOrderCause(String orderCause) {
		this.orderCause = orderCause;
	}
	public String getKeywords() {
		return keywords;
	}
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	/**
	 * 用于 keywords SQL like的写法.
	 * @return
	 */
	@JsonIgnore
	public String getKeywordsLike() {
		if(NullUtil.isNull(keywords)){
			return "%%";
		}else{
			return "%"+ keywords.replace("'", "''")+"%";
		}
	}
	
	
}

package com.lanqiao.model.order.dto;

import java.util.Date;

import com.lanqiao.query.SearchDTO;
import com.lanqiao.util.DateUtil;

/**
 * 订单查询条件.
 * @author Acci.
 * 2020年4月1日.
 */
public class OdInvoiceSearchDTO extends SearchDTO {
	
	private Integer lanqiaoProjectId;	
	private Integer orderSubTypeId;
	private Integer invoiceConfigId;

	private String orgName;
	private Integer orderDataId;
	
	Long ssoUserId;
	
	private Date createdStart;
	private Date createdEnd;
	
	private Date orderPayTimeStart;
	private Date orderPayTimeEnd;
	
	private Date issueTimeStart;
	private Date issueTimeEnd;

	private Integer invoiceType;
	
	private Integer invoiceStatus;
	
	
	/**
	 * 是否用户财务导出.
	 */
	private boolean forExport=false;
	
	public Long getSsoUserId() {
		return ssoUserId;
	}

	public void setSsoUserId(Long ssoUserId) {
		this.ssoUserId = ssoUserId;
	}

	public Integer getLanqiaoProjectId() {
		return lanqiaoProjectId;
	}

	public void setLanqiaoProjectId(Integer lanqiaoProjectId) {
		this.lanqiaoProjectId = lanqiaoProjectId;
	}

	public Integer getOrderSubTypeId() {
		return orderSubTypeId;
	}

	public void setOrderSubTypeId(Integer orderSubTypeId) {
		this.orderSubTypeId = orderSubTypeId;
	}

	public Integer getInvoiceConfigId() {
		return invoiceConfigId;
	}

	public void setInvoiceConfigId(Integer invoiceConfigId) {
		this.invoiceConfigId = invoiceConfigId;
	}



	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public Integer getOrderDataId() {
		return orderDataId;
	}

	public void setOrderDataId(Integer orderDataId) {
		this.orderDataId = orderDataId;
	}

	public Date getCreatedStart() {
		return createdStart;
	}

	public void setCreatedStart(Date createdStart) {
		this.createdStart = createdStart;
	}

	public Date getCreatedEnd() {
		return createdEnd;
	}

	public void setCreatedEnd(Date createdEnd) {
		this.createdEnd = createdEnd;
	}

	public Date getOrderPayTimeStart() {
		return orderPayTimeStart;
	}

	public void setOrderPayTimeStart(Date orderPayTimeStart) {		
		if(orderPayTimeStart!=null) {
			this.orderPayTimeStart = DateUtil.getDate( DateUtil.getSingleNumDate(orderPayTimeStart)+" 00:00:00");
		}
	}

	public Date getOrderPayTimeEnd() {
		return orderPayTimeEnd;
	}

	public void setOrderPayTimeEnd(Date orderPayTimeEnd) {
		if(orderPayTimeEnd!=null) {
			this.orderPayTimeEnd = DateUtil.getDate( DateUtil.getSingleNumDate(orderPayTimeEnd)+" 23:59:59");
		}
	}

	public Date getIssueTimeStart() {
		return issueTimeStart;
	}

	public void setIssueTimeStart(Date issueTimeStart) {		
		if(issueTimeStart!=null) {
			this.issueTimeStart = DateUtil.getDate( DateUtil.getSingleNumDate(issueTimeStart)+" 00:00:00");
		}
	}

	public Date getIssueTimeEnd() {
		return issueTimeEnd;
	}

	public void setIssueTimeEnd(Date issueTimeEnd) {		
		if(issueTimeEnd!=null) {
			this.issueTimeEnd = DateUtil.getDate( DateUtil.getSingleNumDate(issueTimeEnd)+" 23:59:59");
		}
	}

	public Integer getInvoiceType() {
		return invoiceType;
	}

	public void setInvoiceType(Integer invoiceType) {
		this.invoiceType = invoiceType;
	}

	public boolean isForExport() {
		return forExport;
	}

	public void setForExport(boolean forExport) {
		this.forExport = forExport;
	}

	public Integer getInvoiceStatus() {
		return invoiceStatus;
	}

	public void setInvoiceStatus(Integer invoiceStatus) {
		this.invoiceStatus = invoiceStatus;
	}
	
	
}

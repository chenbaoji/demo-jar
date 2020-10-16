package com.lanqiao.model.order.dto;

import java.util.Date;

import com.lanqiao.query.SearchDTO;
import com.lanqiao.util.DateUtil;

/**
 * 订单查询条件.
 * @author Acci.
 * 2020年4月1日.
 */
public class OdOrderSearchDTO extends SearchDTO {
	
	private Integer lanqiaoProjectId;	
	private Integer orderSubTypeId;
	private Integer invoiceConfigId;
	
	private Integer payPlatformId;
	private Integer manageType;
	private String orgName;
	private Integer orderDataId;
	private String orderStatuses;
	Long ssoUserId;
	Long orgId;
	
	private Date createdStart;
	private Date createdEnd;
	
	private Date orderPayTimeStart;
	private Date orderPayTimeEnd;
	
	private Boolean checkCanPay;
	
	Integer  exceptionStatus;
	
	/**
	 * 订单状态.
	 */
	Integer orderStatus;

	/**
	 * 退款状态.
	 */
	private Integer refundStatusId;
	/**
	 * 退款状态(多个).
	 */
	private String refundStatusIds;
	/**
	 * 查询退款标记(==1时,只查退款的订单).
	 */
	private Integer refundAll;
	
	
	public Integer getRefundAll() {
		return refundAll;
	}

	public String getRefundStatusIds() {
		return refundStatusIds;
	}

	public void setRefundStatusIds(String refundStatusIds) {
		this.refundStatusIds = refundStatusIds;
	}

	public void setRefundAll(Integer refundAll) {
		this.refundAll = refundAll;
	}

	public Integer getRefundStatusId() {
		return refundStatusId;
	}

	public void setRefundStatusId(Integer refundStatusId) {
		this.refundStatusId = refundStatusId;
	}

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

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

	public Integer getPayPlatformId() {
		return payPlatformId;
	}

	public void setPayPlatformId(Integer payPlatformId) {
		this.payPlatformId = payPlatformId;
	}

	public Integer getManageType() {
		return manageType;
	}

	public void setManageType(Integer manageType) {
		this.manageType = manageType;
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
		if(createdStart!=null) {
			this.createdStart = DateUtil.getDate( DateUtil.getSingleNumDate(createdStart)+" 00:00:00");
		}
	}

	public Date getCreatedEnd() {
		return createdEnd;
	}

	public void setCreatedEnd(Date createdEnd) {		
		if(createdEnd!=null) {
			this.createdEnd = DateUtil.getDate( DateUtil.getSingleNumDate(createdEnd)+" 23:59:59");
		}
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

	public String getOrderStatuses() {
		return orderStatuses;
	}

	public void setOrderStatuses(String orderStatuses) {
		this.orderStatuses = orderStatuses;
	}

	public Boolean getCheckCanPay() {
		return checkCanPay;
	}

	public void setCheckCanPay(Boolean checkCanPay) {
		this.checkCanPay = checkCanPay;
	}

	public Long getOrgId() {
		return orgId;
	}

	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}

	public Integer getExceptionStatus()
	{
		return exceptionStatus;
	}

	public void setExceptionStatus(Integer exceptionStatus)
	{
		this.exceptionStatus = exceptionStatus;
	}
	
	
}

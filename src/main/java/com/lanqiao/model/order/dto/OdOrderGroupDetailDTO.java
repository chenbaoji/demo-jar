package com.lanqiao.model.order.dto;
/**
    *    订单详情结构.
 * @author Acci(Chunsun Qin)
 * @date 2020年3月14日
 */

import java.io.Serializable;
import java.math.BigDecimal;

public class OdOrderGroupDetailDTO implements Serializable {
	/**
	 * 蓝桥项目ID.
	 */
	private Integer lanqiaoProjectId;
	/**
	 * 关联信息ID.
	 */
	private Long dataId;
	
	/**
	 * 数量.
	 */
	private int count;
	/**
	 * 单价.
	 */
	private BigDecimal unitPrice;
	/**
	 * 总金额.
	 */
	private BigDecimal totalAmount;
	
	/**
	 * 支付项目ID(预留,可空).
	 * 如:gradeId
	 */
	private Long payItemId;
	/**
	 * 支付项目名称.
	 * 如:java B组
	 */
	private String payItemName;
	
	/**
	 * 名称扩展.
	 * 
	 */
	private String payDataName;
	/**
	 * 其它说明.
	 */
	private String remark;
	/**
	 * @return the lanqiaoProjectId
	 */
	public Integer getLanqiaoProjectId() {
		return lanqiaoProjectId;
	}
	/**
	 * @param lanqiaoProjectId the lanqiaoProjectId to set
	 */
	public void setLanqiaoProjectId(Integer lanqiaoProjectId) {
		this.lanqiaoProjectId = lanqiaoProjectId;
	}
	/**
	 * @return the dataId
	 */
	public Long getDataId() {
		return dataId;
	}
	/**
	 * @param dataId the dataId to set
	 */
	public void setDataId(Long dataId) {
		this.dataId = dataId;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the unitPrice
	 */
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	/**
	 * @param unitPrice the unitPrice to set
	 */
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	/**
	 * @return the totalAmount
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the payItemId
	 */
	public Long getPayItemId() {
		return payItemId;
	}
	/**
	 * @param payItemId the payItemId to set
	 */
	public void setPayItemId(Long payItemId) {
		this.payItemId = payItemId;
	}
	/**
	 * @return the payItemName
	 */
	public String getPayItemName() {
		return payItemName;
	}
	/**
	 * @param payItemName the payItemName to set
	 */
	public void setPayItemName(String payItemName) {
		this.payItemName = payItemName;
	}

	public String getPayDataName() {
		return payDataName;
	}
	public void setPayDataName(String payDataName) {
		this.payDataName = payDataName;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;		
	}
	
	
	
	
	
}

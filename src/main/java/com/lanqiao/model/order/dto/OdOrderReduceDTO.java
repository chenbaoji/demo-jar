package com.lanqiao.model.order.dto;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单减免金额结构.
 * @author Acci(Chunsun Qin)
 * @date 2020年3月14日
 */
public class OdOrderReduceDTO implements Serializable {
	/**
	 * 减免项目ID(预留,可空).
	 */
	private Long reduceItemId;
	/**
	 * 减免项目名称.
	 */
	private String reduceItemName;
	
	/**
	 * 总金额.
	 */
	private BigDecimal reduceAmount;
	/**
	 * 其它说明.
	 */
	private String remark;
	public Long getReduceItemId() {
		return reduceItemId;
	}
	public void setReduceItemId(Long reduceItemId) {
		this.reduceItemId = reduceItemId;
	}
	public String getReduceItemName() {
		return reduceItemName;
	}
	public void setReduceItemName(String reduceItemName) {
		this.reduceItemName = reduceItemName;
	}
	public BigDecimal getReduceAmount() {
		return reduceAmount;
	}
	public void setReduceAmount(BigDecimal reduceAmount) {
		this.reduceAmount = reduceAmount;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
}

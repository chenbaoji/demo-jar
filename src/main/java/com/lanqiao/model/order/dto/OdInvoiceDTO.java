package com.lanqiao.model.order.dto;

import com.lanqiao.model.order.OdDictInvoiceExportConfig;
import com.lanqiao.model.order.OdInvoice;
import com.lanqiao.util.NullUtil;
import com.lanqiao.util.RefUtil;

/**
 * 发票对象.
 * @author Acci(Chunsun Qin)
 * @date 2020年3月30日
 */
public class OdInvoiceDTO extends OdInvoice {
	//private String issueAdminName;
	private String orderContent;
	private OdDictInvoiceExportConfig exportCfg;
	private Boolean autoSplit; //是否启用智能拆分,此属性在开发票时使用 (按订单orderGroupDetails智能拆分)
	public OdInvoiceDTO() {
		
	}
	public OdInvoiceDTO(final OdInvoice invoice) {
		RefUtil.copyPropertiesSimple(invoice, this);
	}
	
	
	
	public String getOrderContent() {
		return orderContent;
	}
	public void setOrderContent(String orderContent) {
		this.orderContent = orderContent;
	}
	
	
	/**
	 * 购货方银行账号(导出使用).
	 * @return
	 */
	public String getBuyerBankInfo() {
		return NullUtil.getString(getBuyerBankName())+" "+NullUtil.getString(getBuyerBankNo());
	}
	public OdDictInvoiceExportConfig getExportCfg() {
		return exportCfg;
	}
	public void setExportCfg(OdDictInvoiceExportConfig exportCfg) {
		this.exportCfg = exportCfg;
	}
	public String getInvoiceStatusStr() {
		return OdOrderEnumUtils.InvoiceStatusEnum.getTextByValue(getInvoiceStatus());
	}
	
	public String getInvoiceConfigStr() {
		return OdOrderEnumUtils.InvoiceConfigEnum.getTextByValue(getInvoiceConfigId());
	}
	public Boolean getAutoSplit() {
		return autoSplit;
	}
	public void setAutoSplit(Boolean autoSplit) {
		this.autoSplit = autoSplit;
	}
	
}

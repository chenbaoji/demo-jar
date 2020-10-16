package com.lanqiao.ISerivce.order;

import java.util.Date;

import com.lanqiao.common.Result;
import com.lanqiao.model.order.OdDictInvoiceExportConfig;
import com.lanqiao.model.order.OdInvoice;
import com.lanqiao.model.order.dto.OdInvoiceSearchDTO;

/**
 * 发票相关.
 * @author Acci(Chunsun Qin)
 * @date 2020年4月4日
 */
public interface IOdInvoiceService {
	/**
	 * 查找发票列表.
	 * @param search
	 * @return
	 */
	Result findList(OdInvoiceSearchDTO search);


	Result add(OdInvoice invoice);

	/**
	 * 开具发票.
	 * @param orderId 订单ID
	 * @param issueAdminId 开具人
	 * @param issueIime 开具时间
	 * @return
	 */
	Result issue(Long invoiceId,long orderId, long issueAdminId,  String issueAdminName,Date issueIime);

	/**
	 * 按orderId找发票.
	 * @param orderId
	 * @return
	 */
	Result findByOrderId(long orderId);

	/**
	 * 发票配置.
	 * @param invoiceExportId 导出编号
	 * @param invoiceConfigId 开票项目
	 * @return
	 */
	OdDictInvoiceExportConfig findExportCfg(Integer projectId, Integer invoiceExportId, Integer invoiceConfigId);



}

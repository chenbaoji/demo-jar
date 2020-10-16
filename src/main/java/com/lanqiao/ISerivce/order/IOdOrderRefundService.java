package com.lanqiao.ISerivce.order;

import java.math.BigDecimal;

import com.lanqiao.common.Result;
import com.lanqiao.model.order.OdOrderRefundWithBLOBs;
import com.lanqiao.model.order.dto.OdOrderSearchDTO;

public interface IOdOrderRefundService {
	/**
	 * 创建退款申请.
	 * @param info
	 * @return
	 */
	Result createRefundByOrder(OdOrderRefundWithBLOBs info);
	/**
	 * 业务方审核退款信息.
	 * @param lanqiaoProjectId 
	 * @param refundId 
	 * @param refundHandleAdminId 业务方管理员
	 * @param refundHandleContent 审核意见
	 * @param refundStatusId 审核状态 (4:同意退款,5:拒绝退款)
	 * @param refundTotalAmount 退款金额(审核时允许修改一次金额)
	 * @return
	 */
	Result handleRefund(int lanqiaoProjectId,long refundId,long orderId, long refundHandleAdminId,final String refundHandleAdminName, String refundHandleContent, int refundStatusId,
			BigDecimal refundTotalAmount);
	Result findOrderWithRefund(OdOrderSearchDTO search);
	Result cancelRefund(int lanqiaoProjectId, long refundId, long orderId);

}

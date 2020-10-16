package com.lanqiao.model.order.dto;

import java.io.Serializable;

import com.lanqiao.model.order.OdOrderRefund;
import com.lanqiao.model.order.OdOrderRefundWithBLOBs;
import com.lanqiao.model.order.dto.OdOrderEnumUtils.OrderRefundStatusEnum;
import com.lanqiao.util.RefUtil;
/**
 * 退款信息扩展类.
 * @author Acci(Chunsun Qin)
 * @date 2020年4月28日
 */
public class OdOrderRefundDTO extends OdOrderRefundWithBLOBs implements Serializable{
	
	//private String refundHandleAdminName;
	
	public OdOrderRefundDTO() {}
	public OdOrderRefundDTO(OdOrderRefund refund) {
		RefUtil.copyPropertiesSimple(refund, this);		
	}
	public String getRefundStatusIdStr(){
		return OrderRefundStatusEnum.getTextByValue(this.getRefundStatusId());
	}
//	public String getRefundHandleAdminName() {
//		return refundHandleAdminName;
//	}
//	public void setRefundHandleAdminName(String refundHandleAdminName) {
//		this.refundHandleAdminName = refundHandleAdminName;
//	}
	
	
}

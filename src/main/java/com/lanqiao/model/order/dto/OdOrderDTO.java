package com.lanqiao.model.order.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.lanqiao.model.order.OdInvoice;
import com.lanqiao.model.order.OdOrder;
import com.lanqiao.model.order.OdOrderWithBLOBs;
import com.lanqiao.model.order.dto.OdOrderEnumUtils.OrderRefundStatusEnum;
import com.lanqiao.model.order.dto.OdOrderEnumUtils.OrderStatusEnum;
import com.lanqiao.util.DateUtil;
import com.lanqiao.util.NullUtil;
import com.lanqiao.util.RefUtil;

public class OdOrderDTO extends OdOrderWithBLOBs implements Serializable {
	
	
	
	public OdOrderDTO() {}
	
	public OdOrderDTO(final OdOrder order) {
		RefUtil.copyPropertiesSimple(order, this);
	}
	
	private OdInvoiceDTO invoiceDTO; //发票信息,如果有多个发票,此信息仅为第一条
	
	private List<OdInvoiceDTO> invoiceDTOs; //发票信息(列表)
	
	private Boolean canPay; //是否能支付
	
	//private String orderPublicAdminName;
	
	private Boolean canRefund; //是否能退款
	
	private OdOrderRefundDTO refundOne; //退款信息(最新一条)
	
	private List<OdOrderRefundDTO> refundli; //退款信息(所有)
	
	
	/**
	 * 订单详情.
	 */
	private List<OdOrderGroupDetailDTO> orderGroupDetails;
	/**
	 * 减免详情.
	 */
	private List<OdOrderReduceDTO> orderReduceDetails;
	
	

	public List<OdOrderReduceDTO> getOrderReduceDetails() {
		return orderReduceDetails;
	}
	public void setOrderReduceDetails(List<OdOrderReduceDTO> orderReduceDetails) {
		this.orderReduceDetails = orderReduceDetails;
	}
	/**
	 * 将对象变成json用于存储.
	 */
	public void resetGroupDetailToJson() {
		if(!CollectionUtils.isEmpty(orderGroupDetails)) {
			this.setOrderGroupDetailJson(RefUtil.toJSONString(orderGroupDetails));
		}
	}
	public void resetGroupDetailToJson(List<OdOrderGroupDetailDTO> _orderGroupDetails) {
		this.orderGroupDetails=_orderGroupDetails;
		if(!CollectionUtils.isEmpty(orderGroupDetails)) {
			this.setOrderGroupDetailJson(RefUtil.toJSONString(_orderGroupDetails));
		}
	}
	
	/**
	 * 将对象变成json用于存储.
	 */
	public void resetReduceToJson() {
		if(!CollectionUtils.isEmpty(orderReduceDetails)) {
			this.setOrderReduceDetailJson(RefUtil.toJSONString(orderReduceDetails));
		}
	}
	public void resetReduceToJson(List<OdOrderReduceDTO>_orderReduceDetails) {
		this.orderReduceDetails=_orderReduceDetails;
		if(!CollectionUtils.isEmpty(orderReduceDetails)) {
			this.setOrderReduceDetailJson(RefUtil.toJSONString(orderReduceDetails));
		}
	}
	
	/**
	 * 将json转为对象以便操作.
	 */
	public void resetJsonToReduce() {
		if(NullUtil.isNotNull( this.getOrderReduceDetailJson())) {
			final List<OdOrderReduceDTO> dataList
			= RefUtil.jsonToObj(this.getOrderReduceDetailJson(),  new TypeReference<List<OdOrderReduceDTO>>(){});
			this.setOrderReduceDetails(dataList);
		}
	}
	
	public OdInvoice getInvoiceDTO() {
		return invoiceDTO;
	}
	public void setInvoiceDTO(OdInvoiceDTO invoice) {
		this.invoiceDTO = invoice;
	}
	
	public Boolean getCanPay() { 
		if(canPay!=null) {
			//不可支付状态
			if(getOrderStatus()!=OrderStatusEnum.unPay.getValue() 
					&& getOrderStatus()!=OrderStatusEnum.toThird.getValue() 
					&& getOrderStatus()!=OrderStatusEnum.waitAppro.getValue() 
					&& getOrderStatus()!=OrderStatusEnum.approError.getValue()) {
				return false; 
			}
		}
		return canPay;
	}
	public Boolean getCanInvoice(){
		if(getCanPay()==null){
			return null;
		}
		if(getCanPay()){
			return false;
		}
		if(this.getOrderTotalAmount().compareTo(BigDecimal.ZERO)<=0){ //没钱开啥发票
			return false;
		}
		if(this.getInvoiceStatus()==0 && getCanRefund()!=null && getCanRefund()){
			return true;
		}
		return false;
	}

	public void setCanPay(Boolean canPay) {
		this.canPay = canPay;
	}

	
	public Boolean getCanRefund() {	
		if(canRefund!=null && canRefund){
			if(getRefundOne()!=null){	
				switch (OrderRefundStatusEnum.getByValue(getRefundOne().getRefundStatusId())) {
					case disagree:
					case cancel:				
					case overTimeClose:				
						return canRefund;
						//break;
		
					default:
						return false;
						//break;
				}
			}else{
				return canRefund;
			}
		}
		return canRefund;
	} 
	public Boolean getCanSeeRefundDetail() {	
		if(getRefundOne()!=null){			
			return true;
		}
		
		return false;
	}
	public void setCanRefund(Boolean canRefund) {
		this.canRefund = canRefund;
	}

	public String getManageTypeStr() {
		return OdOrderEnumUtils.ManagerTypeEnum.getTextByValue(getManageType());
	}

	public OdOrderRefundDTO getRefundOne() {
		return refundOne;
	}

	public void setRefundOne(OdOrderRefundDTO refundOne) {
		this.refundOne = refundOne;
	}

	public List<OdOrderRefundDTO> getRefundli() {
		return refundli;
	}

	public void setRefundli(List<OdOrderRefundDTO> refundli) {
		this.refundli = refundli;
	}
/*
	public String getOrderPublicAdminName() {
		return orderPublicAdminName;
	}
	
	public void setOrderPublicAdminName(String orderPublicAdminName) {
		this.orderPublicAdminName = orderPublicAdminName;
	}
*/
	public String getOrderStatusStr() {
		if( getOrderStatus()==OrderStatusEnum.paid.getValue() && getRefundOne()!=null){ //如果有退款记录
			switch (OrderRefundStatusEnum.getByValue(getRefundOne().getRefundStatusId())) {
				case disagree:
				case cancel:				
				case overTimeClose:				
					//如果无效退款则忽略
					break;
	
				default:
					return OrderStatusEnum.refunding.getText(); //默认显示退款中
					//break;
			}
			
		}
		return OdOrderEnumUtils.OrderStatusEnum.getTextByValue(getOrderStatus());
	}

	public String getInvoiceConfigStr() {
		return OdOrderEnumUtils.InvoiceConfigEnum.getTextByValue(getInvoiceConfigId());
	}

	public String getInvoiceStatusStr() {		
		return OdOrderEnumUtils.InvoiceStatusEnum.getTextByValue(getInvoiceConfigId());
	}

	public String getPayPlatformStr() {
		return OdOrderEnumUtils.PayPlatformEnum.getTextByValue(getPayPlatformId());
	}

	public List<OdInvoiceDTO> getInvoiceDTOs() {
		return invoiceDTOs;
	}

	public void setInvoiceDTOs(List<OdInvoiceDTO> invoices) {
		this.invoiceDTOs = invoices;
	}
	public void setInvoices(List<OdInvoice> invoices) {
		if(invoices==null){
			return;
		}
		List<OdInvoiceDTO> invs=new ArrayList<OdInvoiceDTO>();
		for (OdInvoice inv : invoices) {
			invs.add(new OdInvoiceDTO(inv));
		}
		this.invoiceDTOs =invs;
	}

	
	
	/**
	 * 智能拆分.
	 * 该方法会修改invoices,慎用
	 * @return
	 */
	public List<OdInvoiceDTO> autoSplitInvoice(){
		if(invoiceDTO==null || invoiceDTO.getAutoSplit()==null || !invoiceDTO.getAutoSplit()){
			return null; //没必要拆分
		}
		if(CollectionUtils.isEmpty(orderGroupDetails)) {
			return null; //没分组信息还拆分啥
		}
		if(orderGroupDetails.size()==1){
			//只有一个分组信息还拆分啥
			this.invoiceDTOs=Arrays.asList( new OdInvoiceDTO[]{invoiceDTO});
			return this.invoiceDTOs;
		}
		//看一下是不是所有单价都一样,一样的话没必要拆分
		boolean isAllTheSame=true; //假设单价都一样
		BigDecimal price=orderGroupDetails.get(0).getUnitPrice(); //单价
		for (OdOrderGroupDetailDTO gd : orderGroupDetails) {
			if(gd.getUnitPrice().compareTo(price)!=0){
				isAllTheSame=false;
				break;
			}
		}
		
		if(isAllTheSame){ //都一样就没必要拆分了
			this.invoiceDTOs=Arrays.asList( new OdInvoiceDTO[]{invoiceDTO});
			return this.invoiceDTOs;
		}
		
		//不一样的 ,就按商品拆分吧,即使同价格也不合并
		final List<OdInvoiceDTO> invs=new ArrayList<OdInvoiceDTO>();
		for (OdOrderGroupDetailDTO gd : orderGroupDetails) {
			OdInvoiceDTO iv=new OdInvoiceDTO(this.invoiceDTO);
			iv.setGoodsCount(gd.getCount());
			iv.setPrice(gd.getUnitPrice());
			iv.setIsSplit(1); //拆分了
			iv.setSplitSort(invs.size()+1); //序号
			
			invs.add(iv);
		}
		this.invoiceDTOs=invs;
		return this.invoiceDTOs;
	}
	 
	public String getOrderPayTimeStr() {
		if(this.getOrderPayTime()==null) {
			return null;
		}
		return DateUtil.dateToDateString(this.getOrderPayTime());
	}
	public String getCreatedStr() {
		if(this.getCreated()==null) {
			return null;
		}
		return DateUtil.dateToDateString(this.getCreated());
	}
}

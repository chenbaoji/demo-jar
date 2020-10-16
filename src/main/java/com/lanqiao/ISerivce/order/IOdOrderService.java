package com.lanqiao.ISerivce.order;

import java.util.Date;
import java.util.List;

import com.lanqiao.common.Result;
import com.lanqiao.model.order.OdInvoice;
import com.lanqiao.model.order.OdOrder;
import com.lanqiao.model.order.dto.OdOrderDTO;
import com.lanqiao.model.order.dto.OdOrderGroupDetailDTO;
import com.lanqiao.model.order.dto.OdOrderReduceDTO;
import com.lanqiao.model.order.dto.OdOrderSearchDTO;

/**
 * 订单..
 * @author Acci(Chunsun Qin)
 * @date 2020年3月16日
 */
public interface IOdOrderService {
	/**
	 * 创建订单.
	 * @param order 订单内容
	 * @param groupDetailList 订单分组详情
	 * @param detailJson 订单详情(将以json形式存储)
	 * @param reducelist 订单减免内容
	 * @return 是否创建成功
	 * @throws Exception 创建异常
	 */
	Result createOrder(OdOrderDTO order, List<OdOrderGroupDetailDTO> groupDetailList,String detailJson, List<OdOrderReduceDTO> reducelist)
			throws Exception;
	/**
	 * 查询订单列表.
	 * @param search 查询条件
	 * @return
	 */
	Result findList(OdOrderSearchDTO search);
	/**
	 * 单条订单详情.
	 * @param orderId 订单号
	 * @return
	 */
	Result findDTOById(long orderId);
	/**
	 * 对公转账成功.
	 * @param orderId 订单号
	 * @param projectId 项目ID
	 * @param pubPayTime 支付时间
	 * @throws Exception 
	 */
	Result pubPaySuccess(long orderId, int projectId, Date pubPayTime, Long adminId,String adminName) throws Exception;
	/**
	 * 对公转账审核失败.
	 * @param orderId 订单编号 
	 * @param projectId 项目号
	 * @param adminId 管理员Id
	 * @return
	 */
	Result pubPayFail(long orderId, int projectId, Long adminId);
	/**
	 * 取消订单.
	 * @param orderId
	 * @param projectId
	 * @return
	 */
	Result cancelOrder(long orderId, int projectId);
	OdOrder findByIdWithoutBlob(long orderId);
	Result findDTOById(long orderId, Boolean checkCanPay);
	/**
	 * 业务修改商品可支付状态.
	 * @param project_id
	 * @param order_sub_type_id
	 * @param canPay
	 * @return
	 */
	Result changOrderSubTypeCanPay(int project_id, int order_sub_type_id,
			int canPay);
	/**
	 * 找到过期的订单
	 * @param projectId 项目ID
	 * @return
	 */
	//Result findOverEndPayTimeli(int projectId);
	/**
	 * 获取订单详情,包含退款列表.
	 * @param orderId
	 * @param checkCanPay
	 * @return
	 */
	Result findDTOWithRefundliById(long orderId, Boolean checkCanPay);

}

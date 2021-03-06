package com.lanqiao.model.order;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OdOrder implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.sso_user_type
     *
     * @mbg.generated
     */
    private Integer ssoUserType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.sso_user_id
     *
     * @mbg.generated
     */
    private Long ssoUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.lanqiao_project_id
     *
     * @mbg.generated
     */
    private Integer lanqiaoProjectId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_sub_type_id
     *
     * @mbg.generated
     */
    private Integer orderSubTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.manage_type
     *
     * @mbg.generated
     */
    private Integer manageType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_status
     *
     * @mbg.generated
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_pay_name
     *
     * @mbg.generated
     */
    private String orderPayName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_content
     *
     * @mbg.generated
     */
    private String orderContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_remark
     *
     * @mbg.generated
     */
    private String orderRemark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_total_amount
     *
     * @mbg.generated
     */
    private BigDecimal orderTotalAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_pre_amount
     *
     * @mbg.generated
     */
    private BigDecimal orderPreAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_reduce_amount
     *
     * @mbg.generated
     */
    private BigDecimal orderReduceAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_unit_price
     *
     * @mbg.generated
     */
    private BigDecimal orderUnitPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_later_pay
     *
     * @mbg.generated
     */
    private Integer orderLaterPay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_delete_status
     *
     * @mbg.generated
     */
    private Integer orderDeleteStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.pay_platform_id
     *
     * @mbg.generated
     */
    private Integer payPlatformId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.pay_platform_trade_number
     *
     * @mbg.generated
     */
    private String payPlatformTradeNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_trade_sign_path
     *
     * @mbg.generated
     */
    private String orderTradeSignPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_pay_time
     *
     * @mbg.generated
     */
    private Date orderPayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_pub_pay_time
     *
     * @mbg.generated
     */
    private Date orderPubPayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_public_admin_id
     *
     * @mbg.generated
     */
    private Long orderPublicAdminId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_public_admin_name
     *
     * @mbg.generated
     */
    private String orderPublicAdminName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_public_admin_time
     *
     * @mbg.generated
     */
    private Date orderPublicAdminTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_finish_time
     *
     * @mbg.generated
     */
    private Date orderFinishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_close_time
     *
     * @mbg.generated
     */
    private Date orderCloseTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.end_pay_time
     *
     * @mbg.generated
     */
    private Date endPayTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.province_cities_code
     *
     * @mbg.generated
     */
    private Long provinceCitiesCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.cities_city_code
     *
     * @mbg.generated
     */
    private Long citiesCityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.address_id
     *
     * @mbg.generated
     */
    private Long addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.address_data_version
     *
     * @mbg.generated
     */
    private Integer addressDataVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.invoice_config_id
     *
     * @mbg.generated
     */
    private Integer invoiceConfigId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.invoice_status
     *
     * @mbg.generated
     */
    private Integer invoiceStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_change_send_url
     *
     * @mbg.generated
     */
    private String orderChangeSendUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_data_id
     *
     * @mbg.generated
     */
    private String orderDataId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.order_other_data
     *
     * @mbg.generated
     */
    private String orderOtherData;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.org_id
     *
     * @mbg.generated
     */
    private Long orgId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.exception_status
     *
     * @mbg.generated
     */
    private Integer exceptionStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_order.exception_msg
     *
     * @mbg.generated
     */
    private String exceptionMsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table od_order
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_id
     *
     * @return the value of od_order.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_id
     *
     * @param orderId the value for od_order.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.sso_user_type
     *
     * @return the value of od_order.sso_user_type
     *
     * @mbg.generated
     */
    public Integer getSsoUserType() {
        return ssoUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.sso_user_type
     *
     * @param ssoUserType the value for od_order.sso_user_type
     *
     * @mbg.generated
     */
    public void setSsoUserType(Integer ssoUserType) {
        this.ssoUserType = ssoUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.sso_user_id
     *
     * @return the value of od_order.sso_user_id
     *
     * @mbg.generated
     */
    public Long getSsoUserId() {
        return ssoUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.sso_user_id
     *
     * @param ssoUserId the value for od_order.sso_user_id
     *
     * @mbg.generated
     */
    public void setSsoUserId(Long ssoUserId) {
        this.ssoUserId = ssoUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.lanqiao_project_id
     *
     * @return the value of od_order.lanqiao_project_id
     *
     * @mbg.generated
     */
    public Integer getLanqiaoProjectId() {
        return lanqiaoProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.lanqiao_project_id
     *
     * @param lanqiaoProjectId the value for od_order.lanqiao_project_id
     *
     * @mbg.generated
     */
    public void setLanqiaoProjectId(Integer lanqiaoProjectId) {
        this.lanqiaoProjectId = lanqiaoProjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_sub_type_id
     *
     * @return the value of od_order.order_sub_type_id
     *
     * @mbg.generated
     */
    public Integer getOrderSubTypeId() {
        return orderSubTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_sub_type_id
     *
     * @param orderSubTypeId the value for od_order.order_sub_type_id
     *
     * @mbg.generated
     */
    public void setOrderSubTypeId(Integer orderSubTypeId) {
        this.orderSubTypeId = orderSubTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.manage_type
     *
     * @return the value of od_order.manage_type
     *
     * @mbg.generated
     */
    public Integer getManageType() {
        return manageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.manage_type
     *
     * @param manageType the value for od_order.manage_type
     *
     * @mbg.generated
     */
    public void setManageType(Integer manageType) {
        this.manageType = manageType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_status
     *
     * @return the value of od_order.order_status
     *
     * @mbg.generated
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_status
     *
     * @param orderStatus the value for od_order.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_pay_name
     *
     * @return the value of od_order.order_pay_name
     *
     * @mbg.generated
     */
    public String getOrderPayName() {
        return orderPayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_pay_name
     *
     * @param orderPayName the value for od_order.order_pay_name
     *
     * @mbg.generated
     */
    public void setOrderPayName(String orderPayName) {
        this.orderPayName = orderPayName == null ? null : orderPayName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_content
     *
     * @return the value of od_order.order_content
     *
     * @mbg.generated
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_content
     *
     * @param orderContent the value for od_order.order_content
     *
     * @mbg.generated
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_remark
     *
     * @return the value of od_order.order_remark
     *
     * @mbg.generated
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_remark
     *
     * @param orderRemark the value for od_order.order_remark
     *
     * @mbg.generated
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_total_amount
     *
     * @return the value of od_order.order_total_amount
     *
     * @mbg.generated
     */
    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_total_amount
     *
     * @param orderTotalAmount the value for od_order.order_total_amount
     *
     * @mbg.generated
     */
    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_pre_amount
     *
     * @return the value of od_order.order_pre_amount
     *
     * @mbg.generated
     */
    public BigDecimal getOrderPreAmount() {
        return orderPreAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_pre_amount
     *
     * @param orderPreAmount the value for od_order.order_pre_amount
     *
     * @mbg.generated
     */
    public void setOrderPreAmount(BigDecimal orderPreAmount) {
        this.orderPreAmount = orderPreAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_reduce_amount
     *
     * @return the value of od_order.order_reduce_amount
     *
     * @mbg.generated
     */
    public BigDecimal getOrderReduceAmount() {
        return orderReduceAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_reduce_amount
     *
     * @param orderReduceAmount the value for od_order.order_reduce_amount
     *
     * @mbg.generated
     */
    public void setOrderReduceAmount(BigDecimal orderReduceAmount) {
        this.orderReduceAmount = orderReduceAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_unit_price
     *
     * @return the value of od_order.order_unit_price
     *
     * @mbg.generated
     */
    public BigDecimal getOrderUnitPrice() {
        return orderUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_unit_price
     *
     * @param orderUnitPrice the value for od_order.order_unit_price
     *
     * @mbg.generated
     */
    public void setOrderUnitPrice(BigDecimal orderUnitPrice) {
        this.orderUnitPrice = orderUnitPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_later_pay
     *
     * @return the value of od_order.order_later_pay
     *
     * @mbg.generated
     */
    public Integer getOrderLaterPay() {
        return orderLaterPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_later_pay
     *
     * @param orderLaterPay the value for od_order.order_later_pay
     *
     * @mbg.generated
     */
    public void setOrderLaterPay(Integer orderLaterPay) {
        this.orderLaterPay = orderLaterPay;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_delete_status
     *
     * @return the value of od_order.order_delete_status
     *
     * @mbg.generated
     */
    public Integer getOrderDeleteStatus() {
        return orderDeleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_delete_status
     *
     * @param orderDeleteStatus the value for od_order.order_delete_status
     *
     * @mbg.generated
     */
    public void setOrderDeleteStatus(Integer orderDeleteStatus) {
        this.orderDeleteStatus = orderDeleteStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.pay_platform_id
     *
     * @return the value of od_order.pay_platform_id
     *
     * @mbg.generated
     */
    public Integer getPayPlatformId() {
        return payPlatformId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.pay_platform_id
     *
     * @param payPlatformId the value for od_order.pay_platform_id
     *
     * @mbg.generated
     */
    public void setPayPlatformId(Integer payPlatformId) {
        this.payPlatformId = payPlatformId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.pay_platform_trade_number
     *
     * @return the value of od_order.pay_platform_trade_number
     *
     * @mbg.generated
     */
    public String getPayPlatformTradeNumber() {
        return payPlatformTradeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.pay_platform_trade_number
     *
     * @param payPlatformTradeNumber the value for od_order.pay_platform_trade_number
     *
     * @mbg.generated
     */
    public void setPayPlatformTradeNumber(String payPlatformTradeNumber) {
        this.payPlatformTradeNumber = payPlatformTradeNumber == null ? null : payPlatformTradeNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_trade_sign_path
     *
     * @return the value of od_order.order_trade_sign_path
     *
     * @mbg.generated
     */
    public String getOrderTradeSignPath() {
        return orderTradeSignPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_trade_sign_path
     *
     * @param orderTradeSignPath the value for od_order.order_trade_sign_path
     *
     * @mbg.generated
     */
    public void setOrderTradeSignPath(String orderTradeSignPath) {
        this.orderTradeSignPath = orderTradeSignPath == null ? null : orderTradeSignPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_pay_time
     *
     * @return the value of od_order.order_pay_time
     *
     * @mbg.generated
     */
    public Date getOrderPayTime() {
        return orderPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_pay_time
     *
     * @param orderPayTime the value for od_order.order_pay_time
     *
     * @mbg.generated
     */
    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_pub_pay_time
     *
     * @return the value of od_order.order_pub_pay_time
     *
     * @mbg.generated
     */
    public Date getOrderPubPayTime() {
        return orderPubPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_pub_pay_time
     *
     * @param orderPubPayTime the value for od_order.order_pub_pay_time
     *
     * @mbg.generated
     */
    public void setOrderPubPayTime(Date orderPubPayTime) {
        this.orderPubPayTime = orderPubPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_public_admin_id
     *
     * @return the value of od_order.order_public_admin_id
     *
     * @mbg.generated
     */
    public Long getOrderPublicAdminId() {
        return orderPublicAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_public_admin_id
     *
     * @param orderPublicAdminId the value for od_order.order_public_admin_id
     *
     * @mbg.generated
     */
    public void setOrderPublicAdminId(Long orderPublicAdminId) {
        this.orderPublicAdminId = orderPublicAdminId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_public_admin_name
     *
     * @return the value of od_order.order_public_admin_name
     *
     * @mbg.generated
     */
    public String getOrderPublicAdminName() {
        return orderPublicAdminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_public_admin_name
     *
     * @param orderPublicAdminName the value for od_order.order_public_admin_name
     *
     * @mbg.generated
     */
    public void setOrderPublicAdminName(String orderPublicAdminName) {
        this.orderPublicAdminName = orderPublicAdminName == null ? null : orderPublicAdminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_public_admin_time
     *
     * @return the value of od_order.order_public_admin_time
     *
     * @mbg.generated
     */
    public Date getOrderPublicAdminTime() {
        return orderPublicAdminTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_public_admin_time
     *
     * @param orderPublicAdminTime the value for od_order.order_public_admin_time
     *
     * @mbg.generated
     */
    public void setOrderPublicAdminTime(Date orderPublicAdminTime) {
        this.orderPublicAdminTime = orderPublicAdminTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_finish_time
     *
     * @return the value of od_order.order_finish_time
     *
     * @mbg.generated
     */
    public Date getOrderFinishTime() {
        return orderFinishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_finish_time
     *
     * @param orderFinishTime the value for od_order.order_finish_time
     *
     * @mbg.generated
     */
    public void setOrderFinishTime(Date orderFinishTime) {
        this.orderFinishTime = orderFinishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_close_time
     *
     * @return the value of od_order.order_close_time
     *
     * @mbg.generated
     */
    public Date getOrderCloseTime() {
        return orderCloseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_close_time
     *
     * @param orderCloseTime the value for od_order.order_close_time
     *
     * @mbg.generated
     */
    public void setOrderCloseTime(Date orderCloseTime) {
        this.orderCloseTime = orderCloseTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.end_pay_time
     *
     * @return the value of od_order.end_pay_time
     *
     * @mbg.generated
     */
    public Date getEndPayTime() {
        return endPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.end_pay_time
     *
     * @param endPayTime the value for od_order.end_pay_time
     *
     * @mbg.generated
     */
    public void setEndPayTime(Date endPayTime) {
        this.endPayTime = endPayTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.province_cities_code
     *
     * @return the value of od_order.province_cities_code
     *
     * @mbg.generated
     */
    public Long getProvinceCitiesCode() {
        return provinceCitiesCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.province_cities_code
     *
     * @param provinceCitiesCode the value for od_order.province_cities_code
     *
     * @mbg.generated
     */
    public void setProvinceCitiesCode(Long provinceCitiesCode) {
        this.provinceCitiesCode = provinceCitiesCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.cities_city_code
     *
     * @return the value of od_order.cities_city_code
     *
     * @mbg.generated
     */
    public Long getCitiesCityCode() {
        return citiesCityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.cities_city_code
     *
     * @param citiesCityCode the value for od_order.cities_city_code
     *
     * @mbg.generated
     */
    public void setCitiesCityCode(Long citiesCityCode) {
        this.citiesCityCode = citiesCityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.address_id
     *
     * @return the value of od_order.address_id
     *
     * @mbg.generated
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.address_id
     *
     * @param addressId the value for od_order.address_id
     *
     * @mbg.generated
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.address_data_version
     *
     * @return the value of od_order.address_data_version
     *
     * @mbg.generated
     */
    public Integer getAddressDataVersion() {
        return addressDataVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.address_data_version
     *
     * @param addressDataVersion the value for od_order.address_data_version
     *
     * @mbg.generated
     */
    public void setAddressDataVersion(Integer addressDataVersion) {
        this.addressDataVersion = addressDataVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.invoice_config_id
     *
     * @return the value of od_order.invoice_config_id
     *
     * @mbg.generated
     */
    public Integer getInvoiceConfigId() {
        return invoiceConfigId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.invoice_config_id
     *
     * @param invoiceConfigId the value for od_order.invoice_config_id
     *
     * @mbg.generated
     */
    public void setInvoiceConfigId(Integer invoiceConfigId) {
        this.invoiceConfigId = invoiceConfigId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.invoice_status
     *
     * @return the value of od_order.invoice_status
     *
     * @mbg.generated
     */
    public Integer getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.invoice_status
     *
     * @param invoiceStatus the value for od_order.invoice_status
     *
     * @mbg.generated
     */
    public void setInvoiceStatus(Integer invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_change_send_url
     *
     * @return the value of od_order.order_change_send_url
     *
     * @mbg.generated
     */
    public String getOrderChangeSendUrl() {
        return orderChangeSendUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_change_send_url
     *
     * @param orderChangeSendUrl the value for od_order.order_change_send_url
     *
     * @mbg.generated
     */
    public void setOrderChangeSendUrl(String orderChangeSendUrl) {
        this.orderChangeSendUrl = orderChangeSendUrl == null ? null : orderChangeSendUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_data_id
     *
     * @return the value of od_order.order_data_id
     *
     * @mbg.generated
     */
    public String getOrderDataId() {
        return orderDataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_data_id
     *
     * @param orderDataId the value for od_order.order_data_id
     *
     * @mbg.generated
     */
    public void setOrderDataId(String orderDataId) {
        this.orderDataId = orderDataId == null ? null : orderDataId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.order_other_data
     *
     * @return the value of od_order.order_other_data
     *
     * @mbg.generated
     */
    public String getOrderOtherData() {
        return orderOtherData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.order_other_data
     *
     * @param orderOtherData the value for od_order.order_other_data
     *
     * @mbg.generated
     */
    public void setOrderOtherData(String orderOtherData) {
        this.orderOtherData = orderOtherData == null ? null : orderOtherData.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.updated
     *
     * @return the value of od_order.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.updated
     *
     * @param updated the value for od_order.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.created
     *
     * @return the value of od_order.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.created
     *
     * @param created the value for od_order.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.org_id
     *
     * @return the value of od_order.org_id
     *
     * @mbg.generated
     */
    public Long getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.org_id
     *
     * @param orgId the value for od_order.org_id
     *
     * @mbg.generated
     */
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.exception_status
     *
     * @return the value of od_order.exception_status
     *
     * @mbg.generated
     */
    public Integer getExceptionStatus() {
        return exceptionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.exception_status
     *
     * @param exceptionStatus the value for od_order.exception_status
     *
     * @mbg.generated
     */
    public void setExceptionStatus(Integer exceptionStatus) {
        this.exceptionStatus = exceptionStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_order.exception_msg
     *
     * @return the value of od_order.exception_msg
     *
     * @mbg.generated
     */
    public String getExceptionMsg() {
        return exceptionMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_order.exception_msg
     *
     * @param exceptionMsg the value for od_order.exception_msg
     *
     * @mbg.generated
     */
    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg == null ? null : exceptionMsg.trim();
    }
}
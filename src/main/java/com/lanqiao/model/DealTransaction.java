package com.lanqiao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DealTransaction implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.transid
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private Long transid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.user_id
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.datavalue
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private BigDecimal datavalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.datatype
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private Integer datatype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.create_time
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.desc_text
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private String descText;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.dealtype
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private Integer dealtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_deal_transaction.status
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lq_deal_transaction
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.transid
     *
     * @return the value of lq_deal_transaction.transid
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public Long getTransid() {
        return transid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.transid
     *
     * @param transid the value for lq_deal_transaction.transid
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setTransid(Long transid) {
        this.transid = transid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.user_id
     *
     * @return the value of lq_deal_transaction.user_id
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.user_id
     *
     * @param userId the value for lq_deal_transaction.user_id
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.datavalue
     *
     * @return the value of lq_deal_transaction.datavalue
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public BigDecimal getDatavalue() {
        return datavalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.datavalue
     *
     * @param datavalue the value for lq_deal_transaction.datavalue
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setDatavalue(BigDecimal datavalue) {
        this.datavalue = datavalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.datatype
     *
     * @return the value of lq_deal_transaction.datatype
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public Integer getDatatype() {
        return datatype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.datatype
     *
     * @param datatype the value for lq_deal_transaction.datatype
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setDatatype(Integer datatype) {
        this.datatype = datatype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.create_time
     *
     * @return the value of lq_deal_transaction.create_time
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.create_time
     *
     * @param createTime the value for lq_deal_transaction.create_time
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.desc_text
     *
     * @return the value of lq_deal_transaction.desc_text
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public String getDescText() {
        return descText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.desc_text
     *
     * @param descText the value for lq_deal_transaction.desc_text
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setDescText(String descText) {
        this.descText = descText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.dealtype
     *
     * @return the value of lq_deal_transaction.dealtype
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public Integer getDealtype() {
        return dealtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.dealtype
     *
     * @param dealtype the value for lq_deal_transaction.dealtype
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setDealtype(Integer dealtype) {
        this.dealtype = dealtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_deal_transaction.status
     *
     * @return the value of lq_deal_transaction.status
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_deal_transaction.status
     *
     * @param status the value for lq_deal_transaction.status
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lq_deal_transaction
     *
     * @mbg.generated Mon Apr 15 15:57:22 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transid=").append(transid);
        sb.append(", userId=").append(userId);
        sb.append(", datavalue=").append(datavalue);
        sb.append(", datatype=").append(datatype);
        sb.append(", createTime=").append(createTime);
        sb.append(", descText=").append(descText);
        sb.append(", dealtype=").append(dealtype);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.lanqiao.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class UserPoint implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_user_point.user_id
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lq_user_point.user_point
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    private BigDecimal userPoint;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lq_user_point
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_user_point.user_id
     *
     * @return the value of lq_user_point.user_id
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_user_point.user_id
     *
     * @param userId the value for lq_user_point.user_id
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lq_user_point.user_point
     *
     * @return the value of lq_user_point.user_point
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    public BigDecimal getUserPoint() {
        return userPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lq_user_point.user_point
     *
     * @param userPoint the value for lq_user_point.user_point
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    public void setUserPoint(BigDecimal userPoint) {
        this.userPoint = userPoint;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lq_user_point
     *
     * @mbg.generated Mon Apr 15 14:22:39 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userPoint=").append(userPoint);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
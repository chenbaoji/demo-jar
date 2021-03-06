package com.lanqiao.model.zhaopin;

import java.io.Serializable;

public class UserSearch implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_user_search.wrapper_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long wrapperId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_user_search.wrapper_name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String wrapperName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_user_search.cm_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long cmUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_user_search.field_value
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String fieldValue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xz_user_search
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_user_search.wrapper_id
     *
     * @return the value of xz_user_search.wrapper_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getWrapperId() {
        return wrapperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_user_search.wrapper_id
     *
     * @param wrapperId the value for xz_user_search.wrapper_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setWrapperId(Long wrapperId) {
        this.wrapperId = wrapperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_user_search.wrapper_name
     *
     * @return the value of xz_user_search.wrapper_name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getWrapperName() {
        return wrapperName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_user_search.wrapper_name
     *
     * @param wrapperName the value for xz_user_search.wrapper_name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setWrapperName(String wrapperName) {
        this.wrapperName = wrapperName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_user_search.cm_userid
     *
     * @return the value of xz_user_search.cm_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getCmUserid() {
        return cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_user_search.cm_userid
     *
     * @param cmUserid the value for xz_user_search.cm_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCmUserid(Long cmUserid) {
        this.cmUserid = cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_user_search.field_value
     *
     * @return the value of xz_user_search.field_value
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_user_search.field_value
     *
     * @param fieldValue the value for xz_user_search.field_value
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xz_user_search
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wrapperId=").append(wrapperId);
        sb.append(", wrapperName=").append(wrapperName);
        sb.append(", cmUserid=").append(cmUserid);
        sb.append(", fieldValue=").append(fieldValue);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
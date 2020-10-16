package com.lanqiao.model;

import java.io.Serializable;
import java.util.Date;

public class CompanyUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.user_id
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.user_loginid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String userLoginid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.user_email
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.user_phone
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.openid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.linkman
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String linkman;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.company_name
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String companyName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.face_url
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String faceUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.channelid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String channelid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.create_time
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.user_status
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private Integer userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.userpass
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String userpass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.password_type
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private Integer passwordType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column gl_company_user.salt
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table gl_company_user
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.user_id
     *
     * @return the value of gl_company_user.user_id
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.user_id
     *
     * @param userId the value for gl_company_user.user_id
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.user_loginid
     *
     * @return the value of gl_company_user.user_loginid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getUserLoginid() {
        return userLoginid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.user_loginid
     *
     * @param userLoginid the value for gl_company_user.user_loginid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setUserLoginid(String userLoginid) {
        this.userLoginid = userLoginid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.user_email
     *
     * @return the value of gl_company_user.user_email
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.user_email
     *
     * @param userEmail the value for gl_company_user.user_email
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.user_phone
     *
     * @return the value of gl_company_user.user_phone
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.user_phone
     *
     * @param userPhone the value for gl_company_user.user_phone
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.openid
     *
     * @return the value of gl_company_user.openid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.openid
     *
     * @param openid the value for gl_company_user.openid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.linkman
     *
     * @return the value of gl_company_user.linkman
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getLinkman() {
        return linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.linkman
     *
     * @param linkman the value for gl_company_user.linkman
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.company_name
     *
     * @return the value of gl_company_user.company_name
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.company_name
     *
     * @param companyName the value for gl_company_user.company_name
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.face_url
     *
     * @return the value of gl_company_user.face_url
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getFaceUrl() {
        return faceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.face_url
     *
     * @param faceUrl the value for gl_company_user.face_url
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.channelid
     *
     * @return the value of gl_company_user.channelid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getChannelid() {
        return channelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.channelid
     *
     * @param channelid the value for gl_company_user.channelid
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.create_time
     *
     * @return the value of gl_company_user.create_time
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.create_time
     *
     * @param createTime the value for gl_company_user.create_time
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.user_status
     *
     * @return the value of gl_company_user.user_status
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.user_status
     *
     * @param userStatus the value for gl_company_user.user_status
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.userpass
     *
     * @return the value of gl_company_user.userpass
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getUserpass() {
        return userpass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.userpass
     *
     * @param userpass the value for gl_company_user.userpass
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setUserpass(String userpass) {
        this.userpass = userpass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.password_type
     *
     * @return the value of gl_company_user.password_type
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public Integer getPasswordType() {
        return passwordType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.password_type
     *
     * @param passwordType the value for gl_company_user.password_type
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setPasswordType(Integer passwordType) {
        this.passwordType = passwordType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column gl_company_user.salt
     *
     * @return the value of gl_company_user.salt
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column gl_company_user.salt
     *
     * @param salt the value for gl_company_user.salt
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gl_company_user
     *
     * @mbg.generated Thu Dec 26 15:12:55 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userLoginid=").append(userLoginid);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", openid=").append(openid);
        sb.append(", linkman=").append(linkman);
        sb.append(", companyName=").append(companyName);
        sb.append(", faceUrl=").append(faceUrl);
        sb.append(", channelid=").append(channelid);
        sb.append(", createTime=").append(createTime);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", userpass=").append(userpass);
        sb.append(", passwordType=").append(passwordType);
        sb.append(", salt=").append(salt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
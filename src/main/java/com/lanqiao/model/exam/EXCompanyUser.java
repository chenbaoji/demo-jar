package com.lanqiao.model.exam;

import java.io.Serializable;

public class EXCompanyUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.cm_userid
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private Long cmUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.comp_id
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private Long compId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.role_ids
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private String roleIds;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.user_realname
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private String userRealname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.sso_userid
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private Long ssoUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.sso_usertype
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private Integer ssoUsertype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.valid_status
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private Integer validStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.user_phone
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.user_email
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_user.org_id
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private Integer orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_company_user
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.cm_userid
     *
     * @return the value of ex_company_user.cm_userid
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public Long getCmUserid() {
        return cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.cm_userid
     *
     * @param cmUserid the value for ex_company_user.cm_userid
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setCmUserid(Long cmUserid) {
        this.cmUserid = cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.comp_id
     *
     * @return the value of ex_company_user.comp_id
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public Long getCompId() {
        return compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.comp_id
     *
     * @param compId the value for ex_company_user.comp_id
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setCompId(Long compId) {
        this.compId = compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.role_ids
     *
     * @return the value of ex_company_user.role_ids
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public String getRoleIds() {
        return roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.role_ids
     *
     * @param roleIds the value for ex_company_user.role_ids
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.user_realname
     *
     * @return the value of ex_company_user.user_realname
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public String getUserRealname() {
        return userRealname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.user_realname
     *
     * @param userRealname the value for ex_company_user.user_realname
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setUserRealname(String userRealname) {
        this.userRealname = userRealname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.sso_userid
     *
     * @return the value of ex_company_user.sso_userid
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public Long getSsoUserid() {
        return ssoUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.sso_userid
     *
     * @param ssoUserid the value for ex_company_user.sso_userid
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setSsoUserid(Long ssoUserid) {
        this.ssoUserid = ssoUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.sso_usertype
     *
     * @return the value of ex_company_user.sso_usertype
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public Integer getSsoUsertype() {
        return ssoUsertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.sso_usertype
     *
     * @param ssoUsertype the value for ex_company_user.sso_usertype
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setSsoUsertype(Integer ssoUsertype) {
        this.ssoUsertype = ssoUsertype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.valid_status
     *
     * @return the value of ex_company_user.valid_status
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public Integer getValidStatus() {
        return validStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.valid_status
     *
     * @param validStatus the value for ex_company_user.valid_status
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setValidStatus(Integer validStatus) {
        this.validStatus = validStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.user_phone
     *
     * @return the value of ex_company_user.user_phone
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.user_phone
     *
     * @param userPhone the value for ex_company_user.user_phone
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.user_email
     *
     * @return the value of ex_company_user.user_email
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.user_email
     *
     * @param userEmail the value for ex_company_user.user_email
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_user.org_id
     *
     * @return the value of ex_company_user.org_id
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_user.org_id
     *
     * @param orgId the value for ex_company_user.org_id
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_company_user
     *
     * @mbg.generated Fri May 22 15:14:00 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cmUserid=").append(cmUserid);
        sb.append(", compId=").append(compId);
        sb.append(", roleIds=").append(roleIds);
        sb.append(", userRealname=").append(userRealname);
        sb.append(", ssoUserid=").append(ssoUserid);
        sb.append(", ssoUsertype=").append(ssoUsertype);
        sb.append(", validStatus=").append(validStatus);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", orgId=").append(orgId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.lanqiao.model.exam;

import java.io.Serializable;

public class EXCompanyOrg implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_org.org_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_org.comp_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long compId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_org.org_name
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String orgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_org.org_pid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer orgPid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_company_org.org_desc
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String orgDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_company_org
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_org.org_id
     *
     * @return the value of ex_company_org.org_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_org.org_id
     *
     * @param orgId the value for ex_company_org.org_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_org.comp_id
     *
     * @return the value of ex_company_org.comp_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getCompId() {
        return compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_org.comp_id
     *
     * @param compId the value for ex_company_org.comp_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setCompId(Long compId) {
        this.compId = compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_org.org_name
     *
     * @return the value of ex_company_org.org_name
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_org.org_name
     *
     * @param orgName the value for ex_company_org.org_name
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_org.org_pid
     *
     * @return the value of ex_company_org.org_pid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getOrgPid() {
        return orgPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_org.org_pid
     *
     * @param orgPid the value for ex_company_org.org_pid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setOrgPid(Integer orgPid) {
        this.orgPid = orgPid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_company_org.org_desc
     *
     * @return the value of ex_company_org.org_desc
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getOrgDesc() {
        return orgDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_company_org.org_desc
     *
     * @param orgDesc the value for ex_company_org.org_desc
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_company_org
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgId=").append(orgId);
        sb.append(", compId=").append(compId);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgPid=").append(orgPid);
        sb.append(", orgDesc=").append(orgDesc);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
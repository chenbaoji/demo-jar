package com.lanqiao.model.zhaopin;

import java.io.Serializable;
import java.util.Date;

public class CJResumeCertificate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.resume_certid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long resumeCertid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.resume_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long resumeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long stuUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.cert_name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String certName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.cert_date
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Date certDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.cert_desc
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String certDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_resume_certificate.cert_url
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String certUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cj_resume_certificate
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.resume_certid
     *
     * @return the value of cj_resume_certificate.resume_certid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getResumeCertid() {
        return resumeCertid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.resume_certid
     *
     * @param resumeCertid the value for cj_resume_certificate.resume_certid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setResumeCertid(Long resumeCertid) {
        this.resumeCertid = resumeCertid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.resume_id
     *
     * @return the value of cj_resume_certificate.resume_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getResumeId() {
        return resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.resume_id
     *
     * @param resumeId the value for cj_resume_certificate.resume_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.stu_userid
     *
     * @return the value of cj_resume_certificate.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getStuUserid() {
        return stuUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.stu_userid
     *
     * @param stuUserid the value for cj_resume_certificate.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setStuUserid(Long stuUserid) {
        this.stuUserid = stuUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.cert_name
     *
     * @return the value of cj_resume_certificate.cert_name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getCertName() {
        return certName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.cert_name
     *
     * @param certName the value for cj_resume_certificate.cert_name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCertName(String certName) {
        this.certName = certName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.cert_date
     *
     * @return the value of cj_resume_certificate.cert_date
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Date getCertDate() {
        return certDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.cert_date
     *
     * @param certDate the value for cj_resume_certificate.cert_date
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCertDate(Date certDate) {
        this.certDate = certDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.cert_desc
     *
     * @return the value of cj_resume_certificate.cert_desc
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getCertDesc() {
        return certDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.cert_desc
     *
     * @param certDesc the value for cj_resume_certificate.cert_desc
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCertDesc(String certDesc) {
        this.certDesc = certDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_resume_certificate.cert_url
     *
     * @return the value of cj_resume_certificate.cert_url
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getCertUrl() {
        return certUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_resume_certificate.cert_url
     *
     * @param certUrl the value for cj_resume_certificate.cert_url
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCertUrl(String certUrl) {
        this.certUrl = certUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cj_resume_certificate
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resumeCertid=").append(resumeCertid);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", stuUserid=").append(stuUserid);
        sb.append(", certName=").append(certName);
        sb.append(", certDate=").append(certDate);
        sb.append(", certDesc=").append(certDesc);
        sb.append(", certUrl=").append(certUrl);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.lanqiao.model.zhaopin;

import java.io.Serializable;
import java.util.Date;

public class WriteexamUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_writeexam_user.nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long nnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_writeexam_user.resume_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long resumeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_writeexam_user.wsite_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long wsiteId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_writeexam_user.create_time
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_writeexam_user.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long stuUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xz_writeexam_user
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_writeexam_user.nnid
     *
     * @return the value of xz_writeexam_user.nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getNnid() {
        return nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_writeexam_user.nnid
     *
     * @param nnid the value for xz_writeexam_user.nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setNnid(Long nnid) {
        this.nnid = nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_writeexam_user.resume_id
     *
     * @return the value of xz_writeexam_user.resume_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getResumeId() {
        return resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_writeexam_user.resume_id
     *
     * @param resumeId the value for xz_writeexam_user.resume_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setResumeId(Long resumeId) {
        this.resumeId = resumeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_writeexam_user.wsite_id
     *
     * @return the value of xz_writeexam_user.wsite_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getWsiteId() {
        return wsiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_writeexam_user.wsite_id
     *
     * @param wsiteId the value for xz_writeexam_user.wsite_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setWsiteId(Long wsiteId) {
        this.wsiteId = wsiteId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_writeexam_user.create_time
     *
     * @return the value of xz_writeexam_user.create_time
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_writeexam_user.create_time
     *
     * @param createTime the value for xz_writeexam_user.create_time
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_writeexam_user.stu_userid
     *
     * @return the value of xz_writeexam_user.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getStuUserid() {
        return stuUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_writeexam_user.stu_userid
     *
     * @param stuUserid the value for xz_writeexam_user.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setStuUserid(Long stuUserid) {
        this.stuUserid = stuUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xz_writeexam_user
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nnid=").append(nnid);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", wsiteId=").append(wsiteId);
        sb.append(", createTime=").append(createTime);
        sb.append(", stuUserid=").append(stuUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
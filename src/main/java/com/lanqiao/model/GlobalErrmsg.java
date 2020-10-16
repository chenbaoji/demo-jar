package com.lanqiao.model;

import java.io.Serializable;
import java.util.Date;

public class GlobalErrmsg implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ct_globalerrmsg.nnid
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    private Long nnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ct_globalerrmsg.create_time
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ct_globalerrmsg.serviceid
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    private String serviceid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ct_globalerrmsg.classname
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    private String classname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ct_globalerrmsg.errmsg
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    private String errmsg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ct_globalerrmsg
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ct_globalerrmsg.nnid
     *
     * @return the value of ct_globalerrmsg.nnid
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public Long getNnid() {
        return nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ct_globalerrmsg.nnid
     *
     * @param nnid the value for ct_globalerrmsg.nnid
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public void setNnid(Long nnid) {
        this.nnid = nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ct_globalerrmsg.create_time
     *
     * @return the value of ct_globalerrmsg.create_time
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ct_globalerrmsg.create_time
     *
     * @param createTime the value for ct_globalerrmsg.create_time
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ct_globalerrmsg.serviceid
     *
     * @return the value of ct_globalerrmsg.serviceid
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public String getServiceid() {
        return serviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ct_globalerrmsg.serviceid
     *
     * @param serviceid the value for ct_globalerrmsg.serviceid
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ct_globalerrmsg.classname
     *
     * @return the value of ct_globalerrmsg.classname
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public String getClassname() {
        return classname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ct_globalerrmsg.classname
     *
     * @param classname the value for ct_globalerrmsg.classname
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ct_globalerrmsg.errmsg
     *
     * @return the value of ct_globalerrmsg.errmsg
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public String getErrmsg() {
        return errmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ct_globalerrmsg.errmsg
     *
     * @param errmsg the value for ct_globalerrmsg.errmsg
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ct_globalerrmsg
     *
     * @mbg.generated Wed Apr 03 14:12:31 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nnid=").append(nnid);
        sb.append(", createTime=").append(createTime);
        sb.append(", serviceid=").append(serviceid);
        sb.append(", classname=").append(classname);
        sb.append(", errmsg=").append(errmsg);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
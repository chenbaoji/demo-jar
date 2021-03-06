package com.lanqiao.model.zhaopin;

import java.io.Serializable;
import java.util.Date;

public class CJMyCollection implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_my_collection.nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long nnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_my_collection.data_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long dataId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_my_collection.data_type
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Integer dataType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_my_collection.create_time
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cj_my_collection.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long stuUserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cj_my_collection
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_my_collection.nnid
     *
     * @return the value of cj_my_collection.nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getNnid() {
        return nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_my_collection.nnid
     *
     * @param nnid the value for cj_my_collection.nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setNnid(Long nnid) {
        this.nnid = nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_my_collection.data_id
     *
     * @return the value of cj_my_collection.data_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getDataId() {
        return dataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_my_collection.data_id
     *
     * @param dataId the value for cj_my_collection.data_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_my_collection.data_type
     *
     * @return the value of cj_my_collection.data_type
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Integer getDataType() {
        return dataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_my_collection.data_type
     *
     * @param dataType the value for cj_my_collection.data_type
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_my_collection.create_time
     *
     * @return the value of cj_my_collection.create_time
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_my_collection.create_time
     *
     * @param createTime the value for cj_my_collection.create_time
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cj_my_collection.stu_userid
     *
     * @return the value of cj_my_collection.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getStuUserid() {
        return stuUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cj_my_collection.stu_userid
     *
     * @param stuUserid the value for cj_my_collection.stu_userid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setStuUserid(Long stuUserid) {
        this.stuUserid = stuUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cj_my_collection
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
        sb.append(", dataId=").append(dataId);
        sb.append(", dataType=").append(dataType);
        sb.append(", createTime=").append(createTime);
        sb.append(", stuUserid=").append(stuUserid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
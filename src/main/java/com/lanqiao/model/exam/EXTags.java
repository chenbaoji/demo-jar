package com.lanqiao.model.exam;

import java.io.Serializable;
import java.util.Date;

public class EXTags implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_tags.tagid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer tagid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_tags.tagdata
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String tagdata;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_tags.tagtype
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer tagtype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_tags.tag_char
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String tagChar;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_tags.comp_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long compId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_tags.creat_time
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Date creatTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_tags
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_tags.tagid
     *
     * @return the value of ex_tags.tagid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_tags.tagid
     *
     * @param tagid the value for ex_tags.tagid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_tags.tagdata
     *
     * @return the value of ex_tags.tagdata
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getTagdata() {
        return tagdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_tags.tagdata
     *
     * @param tagdata the value for ex_tags.tagdata
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setTagdata(String tagdata) {
        this.tagdata = tagdata;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_tags.tagtype
     *
     * @return the value of ex_tags.tagtype
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getTagtype() {
        return tagtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_tags.tagtype
     *
     * @param tagtype the value for ex_tags.tagtype
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setTagtype(Integer tagtype) {
        this.tagtype = tagtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_tags.tag_char
     *
     * @return the value of ex_tags.tag_char
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getTagChar() {
        return tagChar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_tags.tag_char
     *
     * @param tagChar the value for ex_tags.tag_char
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setTagChar(String tagChar) {
        this.tagChar = tagChar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_tags.comp_id
     *
     * @return the value of ex_tags.comp_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getCompId() {
        return compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_tags.comp_id
     *
     * @param compId the value for ex_tags.comp_id
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setCompId(Long compId) {
        this.compId = compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_tags.creat_time
     *
     * @return the value of ex_tags.creat_time
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Date getCreatTime() {
        return creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_tags.creat_time
     *
     * @param creatTime the value for ex_tags.creat_time
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_tags
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tagid=").append(tagid);
        sb.append(", tagdata=").append(tagdata);
        sb.append(", tagtype=").append(tagtype);
        sb.append(", tagChar=").append(tagChar);
        sb.append(", compId=").append(compId);
        sb.append(", creatTime=").append(creatTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
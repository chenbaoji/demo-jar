package com.lanqiao.model.exam;

import java.io.Serializable;

public class EXPaperTag implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_tag.nnid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long nnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_tag.paperid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long paperid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_tag.tagid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer tagid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_paper_tag
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_tag.nnid
     *
     * @return the value of ex_paper_tag.nnid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getNnid() {
        return nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_tag.nnid
     *
     * @param nnid the value for ex_paper_tag.nnid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setNnid(Long nnid) {
        this.nnid = nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_tag.paperid
     *
     * @return the value of ex_paper_tag.paperid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getPaperid() {
        return paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_tag.paperid
     *
     * @param paperid the value for ex_paper_tag.paperid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setPaperid(Long paperid) {
        this.paperid = paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_tag.tagid
     *
     * @return the value of ex_paper_tag.tagid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getTagid() {
        return tagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_tag.tagid
     *
     * @param tagid the value for ex_paper_tag.tagid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_paper_tag
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", nnid=").append(nnid);
        sb.append(", paperid=").append(paperid);
        sb.append(", tagid=").append(tagid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
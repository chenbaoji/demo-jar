package com.lanqiao.model.exam;

import java.io.Serializable;

public class EXPaperQuestions implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.nnid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long nnid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.paperid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long paperid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.quesid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Long quesid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.sort
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.score
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Float score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.q_title
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String qTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.q_typeid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer qTypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_paper_questions.q_type_sort
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer qTypeSort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_paper_questions
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.nnid
     *
     * @return the value of ex_paper_questions.nnid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getNnid() {
        return nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.nnid
     *
     * @param nnid the value for ex_paper_questions.nnid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setNnid(Long nnid) {
        this.nnid = nnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.paperid
     *
     * @return the value of ex_paper_questions.paperid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getPaperid() {
        return paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.paperid
     *
     * @param paperid the value for ex_paper_questions.paperid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setPaperid(Long paperid) {
        this.paperid = paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.quesid
     *
     * @return the value of ex_paper_questions.quesid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Long getQuesid() {
        return quesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.quesid
     *
     * @param quesid the value for ex_paper_questions.quesid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setQuesid(Long quesid) {
        this.quesid = quesid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.sort
     *
     * @return the value of ex_paper_questions.sort
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.sort
     *
     * @param sort the value for ex_paper_questions.sort
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.score
     *
     * @return the value of ex_paper_questions.score
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Float getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.score
     *
     * @param score the value for ex_paper_questions.score
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setScore(Float score) {
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.q_title
     *
     * @return the value of ex_paper_questions.q_title
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getqTitle() {
        return qTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.q_title
     *
     * @param qTitle the value for ex_paper_questions.q_title
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqTitle(String qTitle) {
        this.qTitle = qTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.q_typeid
     *
     * @return the value of ex_paper_questions.q_typeid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getqTypeid() {
        return qTypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.q_typeid
     *
     * @param qTypeid the value for ex_paper_questions.q_typeid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqTypeid(Integer qTypeid) {
        this.qTypeid = qTypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_paper_questions.q_type_sort
     *
     * @return the value of ex_paper_questions.q_type_sort
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getqTypeSort() {
        return qTypeSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_paper_questions.q_type_sort
     *
     * @param qTypeSort the value for ex_paper_questions.q_type_sort
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqTypeSort(Integer qTypeSort) {
        this.qTypeSort = qTypeSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_paper_questions
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
        sb.append(", quesid=").append(quesid);
        sb.append(", sort=").append(sort);
        sb.append(", score=").append(score);
        sb.append(", qTitle=").append(qTitle);
        sb.append(", qTypeid=").append(qTypeid);
        sb.append(", qTypeSort=").append(qTypeSort);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
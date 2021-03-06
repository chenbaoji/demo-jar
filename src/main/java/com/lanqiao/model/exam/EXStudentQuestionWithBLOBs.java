package com.lanqiao.model.exam;

import java.io.Serializable;

public class EXStudentQuestionWithBLOBs extends EXStudentQuestion implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_student_question.q_title
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String qTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_student_question.q_detail
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String qDetail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_student_question.q_analysis
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String qAnalysis;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_student_question.q_correct
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String qCorrect;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_student_question.stu_answer
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String stuAnswer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_student_question
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_student_question.q_title
     *
     * @return the value of ex_student_question.q_title
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getqTitle() {
        return qTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_student_question.q_title
     *
     * @param qTitle the value for ex_student_question.q_title
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqTitle(String qTitle) {
        this.qTitle = qTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_student_question.q_detail
     *
     * @return the value of ex_student_question.q_detail
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getqDetail() {
        return qDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_student_question.q_detail
     *
     * @param qDetail the value for ex_student_question.q_detail
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqDetail(String qDetail) {
        this.qDetail = qDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_student_question.q_analysis
     *
     * @return the value of ex_student_question.q_analysis
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getqAnalysis() {
        return qAnalysis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_student_question.q_analysis
     *
     * @param qAnalysis the value for ex_student_question.q_analysis
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqAnalysis(String qAnalysis) {
        this.qAnalysis = qAnalysis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_student_question.q_correct
     *
     * @return the value of ex_student_question.q_correct
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getqCorrect() {
        return qCorrect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_student_question.q_correct
     *
     * @param qCorrect the value for ex_student_question.q_correct
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setqCorrect(String qCorrect) {
        this.qCorrect = qCorrect;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_student_question.stu_answer
     *
     * @return the value of ex_student_question.stu_answer
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getStuAnswer() {
        return stuAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_student_question.stu_answer
     *
     * @param stuAnswer the value for ex_student_question.stu_answer
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setStuAnswer(String stuAnswer) {
        this.stuAnswer = stuAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_student_question
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", qTitle=").append(qTitle);
        sb.append(", qDetail=").append(qDetail);
        sb.append(", qAnalysis=").append(qAnalysis);
        sb.append(", qCorrect=").append(qCorrect);
        sb.append(", stuAnswer=").append(stuAnswer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
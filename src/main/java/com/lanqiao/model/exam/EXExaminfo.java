package com.lanqiao.model.exam;

import java.io.Serializable;
import java.util.Date;

public class EXExaminfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.exam_id
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Long examId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.paperid
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Long paperid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.exam_name
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private String examName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.passscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Float passscore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.totalscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Float totalscore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.showscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer showscore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.create_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.papertime_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer papertimeMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.begin_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Date beginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.end_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Date endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.time_minute
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer timeMinute;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.ranktitle_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer ranktitleMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.rankoption_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer rankoptionMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.login_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer loginMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.explain_answer
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer explainAnswer;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.comp_id
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Long compId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.cm_userid
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Long cmUserid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.nstatus
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer nstatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.score_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer scoreMode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.exam_endmsg
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private String examEndmsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.submit_exam_num
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer submitExamNum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.is_review
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private Integer isReview;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.program_language
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private String programLanguage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.cheatsetting
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private String cheatsetting;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_examinfo.login_data_json
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private String loginDataJson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_examinfo
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.exam_id
     *
     * @return the value of ex_examinfo.exam_id
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Long getExamId() {
        return examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.exam_id
     *
     * @param examId the value for ex_examinfo.exam_id
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setExamId(Long examId) {
        this.examId = examId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.paperid
     *
     * @return the value of ex_examinfo.paperid
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Long getPaperid() {
        return paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.paperid
     *
     * @param paperid the value for ex_examinfo.paperid
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setPaperid(Long paperid) {
        this.paperid = paperid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.exam_name
     *
     * @return the value of ex_examinfo.exam_name
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public String getExamName() {
        return examName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.exam_name
     *
     * @param examName the value for ex_examinfo.exam_name
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setExamName(String examName) {
        this.examName = examName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.passscore
     *
     * @return the value of ex_examinfo.passscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Float getPassscore() {
        return passscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.passscore
     *
     * @param passscore the value for ex_examinfo.passscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setPassscore(Float passscore) {
        this.passscore = passscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.totalscore
     *
     * @return the value of ex_examinfo.totalscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Float getTotalscore() {
        return totalscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.totalscore
     *
     * @param totalscore the value for ex_examinfo.totalscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setTotalscore(Float totalscore) {
        this.totalscore = totalscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.showscore
     *
     * @return the value of ex_examinfo.showscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getShowscore() {
        return showscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.showscore
     *
     * @param showscore the value for ex_examinfo.showscore
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setShowscore(Integer showscore) {
        this.showscore = showscore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.create_time
     *
     * @return the value of ex_examinfo.create_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.create_time
     *
     * @param createTime the value for ex_examinfo.create_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.papertime_mode
     *
     * @return the value of ex_examinfo.papertime_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getPapertimeMode() {
        return papertimeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.papertime_mode
     *
     * @param papertimeMode the value for ex_examinfo.papertime_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setPapertimeMode(Integer papertimeMode) {
        this.papertimeMode = papertimeMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.begin_time
     *
     * @return the value of ex_examinfo.begin_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.begin_time
     *
     * @param beginTime the value for ex_examinfo.begin_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.end_time
     *
     * @return the value of ex_examinfo.end_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.end_time
     *
     * @param endTime the value for ex_examinfo.end_time
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.time_minute
     *
     * @return the value of ex_examinfo.time_minute
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getTimeMinute() {
        return timeMinute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.time_minute
     *
     * @param timeMinute the value for ex_examinfo.time_minute
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setTimeMinute(Integer timeMinute) {
        this.timeMinute = timeMinute;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.ranktitle_mode
     *
     * @return the value of ex_examinfo.ranktitle_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getRanktitleMode() {
        return ranktitleMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.ranktitle_mode
     *
     * @param ranktitleMode the value for ex_examinfo.ranktitle_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setRanktitleMode(Integer ranktitleMode) {
        this.ranktitleMode = ranktitleMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.rankoption_mode
     *
     * @return the value of ex_examinfo.rankoption_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getRankoptionMode() {
        return rankoptionMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.rankoption_mode
     *
     * @param rankoptionMode the value for ex_examinfo.rankoption_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setRankoptionMode(Integer rankoptionMode) {
        this.rankoptionMode = rankoptionMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.login_mode
     *
     * @return the value of ex_examinfo.login_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getLoginMode() {
        return loginMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.login_mode
     *
     * @param loginMode the value for ex_examinfo.login_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setLoginMode(Integer loginMode) {
        this.loginMode = loginMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.explain_answer
     *
     * @return the value of ex_examinfo.explain_answer
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getExplainAnswer() {
        return explainAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.explain_answer
     *
     * @param explainAnswer the value for ex_examinfo.explain_answer
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setExplainAnswer(Integer explainAnswer) {
        this.explainAnswer = explainAnswer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.comp_id
     *
     * @return the value of ex_examinfo.comp_id
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Long getCompId() {
        return compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.comp_id
     *
     * @param compId the value for ex_examinfo.comp_id
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setCompId(Long compId) {
        this.compId = compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.cm_userid
     *
     * @return the value of ex_examinfo.cm_userid
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Long getCmUserid() {
        return cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.cm_userid
     *
     * @param cmUserid the value for ex_examinfo.cm_userid
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setCmUserid(Long cmUserid) {
        this.cmUserid = cmUserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.nstatus
     *
     * @return the value of ex_examinfo.nstatus
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getNstatus() {
        return nstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.nstatus
     *
     * @param nstatus the value for ex_examinfo.nstatus
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setNstatus(Integer nstatus) {
        this.nstatus = nstatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.score_mode
     *
     * @return the value of ex_examinfo.score_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getScoreMode() {
        return scoreMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.score_mode
     *
     * @param scoreMode the value for ex_examinfo.score_mode
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setScoreMode(Integer scoreMode) {
        this.scoreMode = scoreMode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.exam_endmsg
     *
     * @return the value of ex_examinfo.exam_endmsg
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public String getExamEndmsg() {
        return examEndmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.exam_endmsg
     *
     * @param examEndmsg the value for ex_examinfo.exam_endmsg
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setExamEndmsg(String examEndmsg) {
        this.examEndmsg = examEndmsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.submit_exam_num
     *
     * @return the value of ex_examinfo.submit_exam_num
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getSubmitExamNum() {
        return submitExamNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.submit_exam_num
     *
     * @param submitExamNum the value for ex_examinfo.submit_exam_num
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setSubmitExamNum(Integer submitExamNum) {
        this.submitExamNum = submitExamNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.is_review
     *
     * @return the value of ex_examinfo.is_review
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public Integer getIsReview() {
        return isReview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.is_review
     *
     * @param isReview the value for ex_examinfo.is_review
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setIsReview(Integer isReview) {
        this.isReview = isReview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.program_language
     *
     * @return the value of ex_examinfo.program_language
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public String getProgramLanguage() {
        return programLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.program_language
     *
     * @param programLanguage the value for ex_examinfo.program_language
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setProgramLanguage(String programLanguage) {
        this.programLanguage = programLanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.cheatsetting
     *
     * @return the value of ex_examinfo.cheatsetting
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public String getCheatsetting() {
        return cheatsetting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.cheatsetting
     *
     * @param cheatsetting the value for ex_examinfo.cheatsetting
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setCheatsetting(String cheatsetting) {
        this.cheatsetting = cheatsetting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_examinfo.login_data_json
     *
     * @return the value of ex_examinfo.login_data_json
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public String getLoginDataJson() {
        return loginDataJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_examinfo.login_data_json
     *
     * @param loginDataJson the value for ex_examinfo.login_data_json
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    public void setLoginDataJson(String loginDataJson) {
        this.loginDataJson = loginDataJson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_examinfo
     *
     * @mbg.generated Tue Jun 02 11:26:13 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", examId=").append(examId);
        sb.append(", paperid=").append(paperid);
        sb.append(", examName=").append(examName);
        sb.append(", passscore=").append(passscore);
        sb.append(", totalscore=").append(totalscore);
        sb.append(", showscore=").append(showscore);
        sb.append(", createTime=").append(createTime);
        sb.append(", papertimeMode=").append(papertimeMode);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", timeMinute=").append(timeMinute);
        sb.append(", ranktitleMode=").append(ranktitleMode);
        sb.append(", rankoptionMode=").append(rankoptionMode);
        sb.append(", loginMode=").append(loginMode);
        sb.append(", explainAnswer=").append(explainAnswer);
        sb.append(", compId=").append(compId);
        sb.append(", cmUserid=").append(cmUserid);
        sb.append(", nstatus=").append(nstatus);
        sb.append(", scoreMode=").append(scoreMode);
        sb.append(", examEndmsg=").append(examEndmsg);
        sb.append(", submitExamNum=").append(submitExamNum);
        sb.append(", isReview=").append(isReview);
        sb.append(", programLanguage=").append(programLanguage);
        sb.append(", cheatsetting=").append(cheatsetting);
        sb.append(", loginDataJson=").append(loginDataJson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
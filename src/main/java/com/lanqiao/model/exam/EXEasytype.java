package com.lanqiao.model.exam;

import java.io.Serializable;

public class EXEasytype implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_easytype.easyid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private Integer easyid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ex_easytype.easy_typename
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private String easyTypename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ex_easytype
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_easytype.easyid
     *
     * @return the value of ex_easytype.easyid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public Integer getEasyid() {
        return easyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_easytype.easyid
     *
     * @param easyid the value for ex_easytype.easyid
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setEasyid(Integer easyid) {
        this.easyid = easyid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ex_easytype.easy_typename
     *
     * @return the value of ex_easytype.easy_typename
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public String getEasyTypename() {
        return easyTypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ex_easytype.easy_typename
     *
     * @param easyTypename the value for ex_easytype.easy_typename
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    public void setEasyTypename(String easyTypename) {
        this.easyTypename = easyTypename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ex_easytype
     *
     * @mbggenerated Tue Dec 24 15:00:51 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", easyid=").append(easyid);
        sb.append(", easyTypename=").append(easyTypename);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
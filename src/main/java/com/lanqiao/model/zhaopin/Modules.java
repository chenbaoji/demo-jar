package com.lanqiao.model.zhaopin;

import java.io.Serializable;

public class Modules implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_modules.moduleid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Integer moduleid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_modules.name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_modules.url
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_modules.parentid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Integer parentid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_modules.display_order
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Integer displayOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_modules.ismenu
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Integer ismenu;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xz_modules
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_modules.moduleid
     *
     * @return the value of xz_modules.moduleid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Integer getModuleid() {
        return moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_modules.moduleid
     *
     * @param moduleid the value for xz_modules.moduleid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_modules.name
     *
     * @return the value of xz_modules.name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_modules.name
     *
     * @param name the value for xz_modules.name
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_modules.url
     *
     * @return the value of xz_modules.url
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_modules.url
     *
     * @param url the value for xz_modules.url
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_modules.parentid
     *
     * @return the value of xz_modules.parentid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_modules.parentid
     *
     * @param parentid the value for xz_modules.parentid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_modules.display_order
     *
     * @return the value of xz_modules.display_order
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_modules.display_order
     *
     * @param displayOrder the value for xz_modules.display_order
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_modules.ismenu
     *
     * @return the value of xz_modules.ismenu
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Integer getIsmenu() {
        return ismenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_modules.ismenu
     *
     * @param ismenu the value for xz_modules.ismenu
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xz_modules
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", moduleid=").append(moduleid);
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", parentid=").append(parentid);
        sb.append(", displayOrder=").append(displayOrder);
        sb.append(", ismenu=").append(ismenu);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
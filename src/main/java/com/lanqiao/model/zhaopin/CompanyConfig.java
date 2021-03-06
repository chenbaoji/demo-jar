package com.lanqiao.model.zhaopin;

import java.io.Serializable;

public class CompanyConfig implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company_config.config_item_nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long configItemNnid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company_config.config_item_key
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String configItemKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company_config.comp_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private Long compId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company_config.config_item_data
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String configItemData;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xz_company_config
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company_config.config_item_nnid
     *
     * @return the value of xz_company_config.config_item_nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getConfigItemNnid() {
        return configItemNnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company_config.config_item_nnid
     *
     * @param configItemNnid the value for xz_company_config.config_item_nnid
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setConfigItemNnid(Long configItemNnid) {
        this.configItemNnid = configItemNnid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company_config.config_item_key
     *
     * @return the value of xz_company_config.config_item_key
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getConfigItemKey() {
        return configItemKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company_config.config_item_key
     *
     * @param configItemKey the value for xz_company_config.config_item_key
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setConfigItemKey(String configItemKey) {
        this.configItemKey = configItemKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company_config.comp_id
     *
     * @return the value of xz_company_config.comp_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public Long getCompId() {
        return compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company_config.comp_id
     *
     * @param compId the value for xz_company_config.comp_id
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setCompId(Long compId) {
        this.compId = compId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company_config.config_item_data
     *
     * @return the value of xz_company_config.config_item_data
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getConfigItemData() {
        return configItemData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company_config.config_item_data
     *
     * @param configItemData the value for xz_company_config.config_item_data
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setConfigItemData(String configItemData) {
        this.configItemData = configItemData;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xz_company_config
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", configItemNnid=").append(configItemNnid);
        sb.append(", configItemKey=").append(configItemKey);
        sb.append(", compId=").append(compId);
        sb.append(", configItemData=").append(configItemData);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
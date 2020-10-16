package com.lanqiao.model.order;

import java.io.Serializable;
import java.util.Date;

public class OdAddress implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_id
     *
     * @mbg.generated
     */
    private Long addressId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.sso_user_type
     *
     * @mbg.generated
     */
    private Integer ssoUserType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.sso_user_id
     *
     * @mbg.generated
     */
    private Long ssoUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.province_cities_code
     *
     * @mbg.generated
     */
    private Long provinceCitiesCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.cities_city_code
     *
     * @mbg.generated
     */
    private Long citiesCityCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_detail
     *
     * @mbg.generated
     */
    private String addressDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_realname
     *
     * @mbg.generated
     */
    private String addressRealname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_phone
     *
     * @mbg.generated
     */
    private String addressPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_telphone
     *
     * @mbg.generated
     */
    private String addressTelphone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_postcode
     *
     * @mbg.generated
     */
    private String addressPostcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.address_default
     *
     * @mbg.generated
     */
    private Boolean addressDefault;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.data_version
     *
     * @mbg.generated
     */
    private Integer dataVersion;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.updated
     *
     * @mbg.generated
     */
    private Date updated;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column od_address.created
     *
     * @mbg.generated
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table od_address
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_id
     *
     * @return the value of od_address.address_id
     *
     * @mbg.generated
     */
    public Long getAddressId() {
        return addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_id
     *
     * @param addressId the value for od_address.address_id
     *
     * @mbg.generated
     */
    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.sso_user_type
     *
     * @return the value of od_address.sso_user_type
     *
     * @mbg.generated
     */
    public Integer getSsoUserType() {
        return ssoUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.sso_user_type
     *
     * @param ssoUserType the value for od_address.sso_user_type
     *
     * @mbg.generated
     */
    public void setSsoUserType(Integer ssoUserType) {
        this.ssoUserType = ssoUserType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.sso_user_id
     *
     * @return the value of od_address.sso_user_id
     *
     * @mbg.generated
     */
    public Long getSsoUserId() {
        return ssoUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.sso_user_id
     *
     * @param ssoUserId the value for od_address.sso_user_id
     *
     * @mbg.generated
     */
    public void setSsoUserId(Long ssoUserId) {
        this.ssoUserId = ssoUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.province_cities_code
     *
     * @return the value of od_address.province_cities_code
     *
     * @mbg.generated
     */
    public Long getProvinceCitiesCode() {
        return provinceCitiesCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.province_cities_code
     *
     * @param provinceCitiesCode the value for od_address.province_cities_code
     *
     * @mbg.generated
     */
    public void setProvinceCitiesCode(Long provinceCitiesCode) {
        this.provinceCitiesCode = provinceCitiesCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.cities_city_code
     *
     * @return the value of od_address.cities_city_code
     *
     * @mbg.generated
     */
    public Long getCitiesCityCode() {
        return citiesCityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.cities_city_code
     *
     * @param citiesCityCode the value for od_address.cities_city_code
     *
     * @mbg.generated
     */
    public void setCitiesCityCode(Long citiesCityCode) {
        this.citiesCityCode = citiesCityCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_detail
     *
     * @return the value of od_address.address_detail
     *
     * @mbg.generated
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_detail
     *
     * @param addressDetail the value for od_address.address_detail
     *
     * @mbg.generated
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_realname
     *
     * @return the value of od_address.address_realname
     *
     * @mbg.generated
     */
    public String getAddressRealname() {
        return addressRealname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_realname
     *
     * @param addressRealname the value for od_address.address_realname
     *
     * @mbg.generated
     */
    public void setAddressRealname(String addressRealname) {
        this.addressRealname = addressRealname == null ? null : addressRealname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_phone
     *
     * @return the value of od_address.address_phone
     *
     * @mbg.generated
     */
    public String getAddressPhone() {
        return addressPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_phone
     *
     * @param addressPhone the value for od_address.address_phone
     *
     * @mbg.generated
     */
    public void setAddressPhone(String addressPhone) {
        this.addressPhone = addressPhone == null ? null : addressPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_telphone
     *
     * @return the value of od_address.address_telphone
     *
     * @mbg.generated
     */
    public String getAddressTelphone() {
        return addressTelphone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_telphone
     *
     * @param addressTelphone the value for od_address.address_telphone
     *
     * @mbg.generated
     */
    public void setAddressTelphone(String addressTelphone) {
        this.addressTelphone = addressTelphone == null ? null : addressTelphone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_postcode
     *
     * @return the value of od_address.address_postcode
     *
     * @mbg.generated
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_postcode
     *
     * @param addressPostcode the value for od_address.address_postcode
     *
     * @mbg.generated
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode == null ? null : addressPostcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.address_default
     *
     * @return the value of od_address.address_default
     *
     * @mbg.generated
     */
    public Boolean getAddressDefault() {
        return addressDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.address_default
     *
     * @param addressDefault the value for od_address.address_default
     *
     * @mbg.generated
     */
    public void setAddressDefault(Boolean addressDefault) {
        this.addressDefault = addressDefault;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.data_version
     *
     * @return the value of od_address.data_version
     *
     * @mbg.generated
     */
    public Integer getDataVersion() {
        return dataVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.data_version
     *
     * @param dataVersion the value for od_address.data_version
     *
     * @mbg.generated
     */
    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.updated
     *
     * @return the value of od_address.updated
     *
     * @mbg.generated
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.updated
     *
     * @param updated the value for od_address.updated
     *
     * @mbg.generated
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column od_address.created
     *
     * @return the value of od_address.created
     *
     * @mbg.generated
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column od_address.created
     *
     * @param created the value for od_address.created
     *
     * @mbg.generated
     */
    public void setCreated(Date created) {
        this.created = created;
    }
}
package com.lanqiao.model.zhaopin;

import java.io.Serializable;

public class CompanyWithBLOBs extends Company implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company.address
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company.welfare
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String welfare;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company.introduce
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String introduce;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company.leaders
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String leaders;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company.products
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String products;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column xz_company.environment
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private String environment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table xz_company
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company.address
     *
     * @return the value of xz_company.address
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company.address
     *
     * @param address the value for xz_company.address
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company.welfare
     *
     * @return the value of xz_company.welfare
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getWelfare() {
        return welfare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company.welfare
     *
     * @param welfare the value for xz_company.welfare
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setWelfare(String welfare) {
        this.welfare = welfare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company.introduce
     *
     * @return the value of xz_company.introduce
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getIntroduce() {
        return introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company.introduce
     *
     * @param introduce the value for xz_company.introduce
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company.leaders
     *
     * @return the value of xz_company.leaders
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getLeaders() {
        return leaders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company.leaders
     *
     * @param leaders the value for xz_company.leaders
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setLeaders(String leaders) {
        this.leaders = leaders;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company.products
     *
     * @return the value of xz_company.products
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getProducts() {
        return products;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company.products
     *
     * @param products the value for xz_company.products
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setProducts(String products) {
        this.products = products;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column xz_company.environment
     *
     * @return the value of xz_company.environment
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column xz_company.environment
     *
     * @param environment the value for xz_company.environment
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table xz_company
     *
     * @mbg.generated Tue Aug 27 14:36:34 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", address=").append(address);
        sb.append(", welfare=").append(welfare);
        sb.append(", introduce=").append(introduce);
        sb.append(", leaders=").append(leaders);
        sb.append(", products=").append(products);
        sb.append(", environment=").append(environment);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package com.lee.collection.entities;

public class CusProvince {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_province.prv_id
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    private Long prvId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_province.prv_area_id
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    private Long prvAreaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_province.prv_name
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    private String prvName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_province.prv_isenabled
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    private String prvIsenabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_province.prv_id
     *
     * @return the value of cus_province.prv_id
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public Long getPrvId() {
        return prvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_province.prv_id
     *
     * @param prvId the value for cus_province.prv_id
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public void setPrvId(Long prvId) {
        this.prvId = prvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_province.prv_area_id
     *
     * @return the value of cus_province.prv_area_id
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public Long getPrvAreaId() {
        return prvAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_province.prv_area_id
     *
     * @param prvAreaId the value for cus_province.prv_area_id
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public void setPrvAreaId(Long prvAreaId) {
        this.prvAreaId = prvAreaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_province.prv_name
     *
     * @return the value of cus_province.prv_name
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public String getPrvName() {
        return prvName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_province.prv_name
     *
     * @param prvName the value for cus_province.prv_name
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public void setPrvName(String prvName) {
        this.prvName = prvName == null ? null : prvName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_province.prv_isenabled
     *
     * @return the value of cus_province.prv_isenabled
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public String getPrvIsenabled() {
        return prvIsenabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_province.prv_isenabled
     *
     * @param prvIsenabled the value for cus_province.prv_isenabled
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    public void setPrvIsenabled(String prvIsenabled) {
        this.prvIsenabled = prvIsenabled == null ? null : prvIsenabled.trim();
    }
}
package com.lee.collection.entities;

public class EntrustCopyWithBLOBs extends EntrustCopy {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_copy.case_type_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String caseTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column entrust_copy.product_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String productName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_copy.case_type_id
     *
     * @return the value of entrust_copy.case_type_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCaseTypeId() {
        return caseTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_copy.case_type_id
     *
     * @param caseTypeId the value for entrust_copy.case_type_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCaseTypeId(String caseTypeId) {
        this.caseTypeId = caseTypeId == null ? null : caseTypeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column entrust_copy.product_name
     *
     * @return the value of entrust_copy.product_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column entrust_copy.product_name
     *
     * @param productName the value for entrust_copy.product_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }
}
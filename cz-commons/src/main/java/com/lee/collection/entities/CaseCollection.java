package com.lee.collection.entities;

public class CaseCollection {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_collection.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_collection.batch_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String batchId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_collection.card_num
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String cardNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_collection.case_ids
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String caseIds;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_collection.id
     *
     * @return the value of case_collection.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_collection.id
     *
     * @param id the value for case_collection.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_collection.batch_id
     *
     * @return the value of case_collection.batch_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_collection.batch_id
     *
     * @param batchId the value for case_collection.batch_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setBatchId(String batchId) {
        this.batchId = batchId == null ? null : batchId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_collection.card_num
     *
     * @return the value of case_collection.card_num
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCardNum() {
        return cardNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_collection.card_num
     *
     * @param cardNum the value for case_collection.card_num
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCardNum(String cardNum) {
        this.cardNum = cardNum == null ? null : cardNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_collection.case_ids
     *
     * @return the value of case_collection.case_ids
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCaseIds() {
        return caseIds;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_collection.case_ids
     *
     * @param caseIds the value for case_collection.case_ids
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCaseIds(String caseIds) {
        this.caseIds = caseIds == null ? null : caseIds.trim();
    }
}
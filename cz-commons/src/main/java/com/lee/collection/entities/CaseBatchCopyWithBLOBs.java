package com.lee.collection.entities;

public class CaseBatchCopyWithBLOBs extends CaseBatchCopy {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch_copy.remark
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column case_batch_copy.batch_log
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String batchLog;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch_copy.remark
     *
     * @return the value of case_batch_copy.remark
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch_copy.remark
     *
     * @param remark the value for case_batch_copy.remark
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column case_batch_copy.batch_log
     *
     * @return the value of case_batch_copy.batch_log
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getBatchLog() {
        return batchLog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column case_batch_copy.batch_log
     *
     * @param batchLog the value for case_batch_copy.batch_log
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setBatchLog(String batchLog) {
        this.batchLog = batchLog == null ? null : batchLog.trim();
    }
}
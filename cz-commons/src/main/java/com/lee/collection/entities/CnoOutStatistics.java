package com.lee.collection.entities;

import java.util.Date;

public class CnoOutStatistics {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.cno
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String cno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.emp_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String empId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.emp_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String empName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.org_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String orgId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.bridgeDurationTotal
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String bridgedurationtotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.callOutCount
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Integer calloutcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.callOutConnectCount
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Integer calloutconnectcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.callOutConnectDuration
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String calloutconnectduration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.callOutConnectDurationAvg
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String calloutconnectdurationavg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.callOutConnectRate
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String calloutconnectrate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.bridgeDurationDayAvg
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String bridgedurationdayavg;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cno_out_statistics.createTime
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Date createtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.id
     *
     * @return the value of cno_out_statistics.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.id
     *
     * @param id the value for cno_out_statistics.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.cno
     *
     * @return the value of cno_out_statistics.cno
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCno() {
        return cno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.cno
     *
     * @param cno the value for cno_out_statistics.cno
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCno(String cno) {
        this.cno = cno == null ? null : cno.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.emp_id
     *
     * @return the value of cno_out_statistics.emp_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.emp_id
     *
     * @param empId the value for cno_out_statistics.emp_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.emp_name
     *
     * @return the value of cno_out_statistics.emp_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.emp_name
     *
     * @param empName the value for cno_out_statistics.emp_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.org_id
     *
     * @return the value of cno_out_statistics.org_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.org_id
     *
     * @param orgId the value for cno_out_statistics.org_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.bridgeDurationTotal
     *
     * @return the value of cno_out_statistics.bridgeDurationTotal
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getBridgedurationtotal() {
        return bridgedurationtotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.bridgeDurationTotal
     *
     * @param bridgedurationtotal the value for cno_out_statistics.bridgeDurationTotal
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setBridgedurationtotal(String bridgedurationtotal) {
        this.bridgedurationtotal = bridgedurationtotal == null ? null : bridgedurationtotal.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.callOutCount
     *
     * @return the value of cno_out_statistics.callOutCount
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Integer getCalloutcount() {
        return calloutcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.callOutCount
     *
     * @param calloutcount the value for cno_out_statistics.callOutCount
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCalloutcount(Integer calloutcount) {
        this.calloutcount = calloutcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.callOutConnectCount
     *
     * @return the value of cno_out_statistics.callOutConnectCount
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Integer getCalloutconnectcount() {
        return calloutconnectcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.callOutConnectCount
     *
     * @param calloutconnectcount the value for cno_out_statistics.callOutConnectCount
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCalloutconnectcount(Integer calloutconnectcount) {
        this.calloutconnectcount = calloutconnectcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.callOutConnectDuration
     *
     * @return the value of cno_out_statistics.callOutConnectDuration
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCalloutconnectduration() {
        return calloutconnectduration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.callOutConnectDuration
     *
     * @param calloutconnectduration the value for cno_out_statistics.callOutConnectDuration
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCalloutconnectduration(String calloutconnectduration) {
        this.calloutconnectduration = calloutconnectduration == null ? null : calloutconnectduration.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.callOutConnectDurationAvg
     *
     * @return the value of cno_out_statistics.callOutConnectDurationAvg
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCalloutconnectdurationavg() {
        return calloutconnectdurationavg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.callOutConnectDurationAvg
     *
     * @param calloutconnectdurationavg the value for cno_out_statistics.callOutConnectDurationAvg
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCalloutconnectdurationavg(String calloutconnectdurationavg) {
        this.calloutconnectdurationavg = calloutconnectdurationavg == null ? null : calloutconnectdurationavg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.callOutConnectRate
     *
     * @return the value of cno_out_statistics.callOutConnectRate
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getCalloutconnectrate() {
        return calloutconnectrate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.callOutConnectRate
     *
     * @param calloutconnectrate the value for cno_out_statistics.callOutConnectRate
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCalloutconnectrate(String calloutconnectrate) {
        this.calloutconnectrate = calloutconnectrate == null ? null : calloutconnectrate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.bridgeDurationDayAvg
     *
     * @return the value of cno_out_statistics.bridgeDurationDayAvg
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getBridgedurationdayavg() {
        return bridgedurationdayavg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.bridgeDurationDayAvg
     *
     * @param bridgedurationdayavg the value for cno_out_statistics.bridgeDurationDayAvg
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setBridgedurationdayavg(String bridgedurationdayavg) {
        this.bridgedurationdayavg = bridgedurationdayavg == null ? null : bridgedurationdayavg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cno_out_statistics.createTime
     *
     * @return the value of cno_out_statistics.createTime
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cno_out_statistics.createTime
     *
     * @param createtime the value for cno_out_statistics.createTime
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
package com.lee.collection.entities;

import java.util.Date;

public class SysLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.title
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.state
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Boolean state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.time_consuming
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Integer timeConsuming;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.server_host_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String serverHostName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.server_host_addr
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String serverHostAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.create_time
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.start_time
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Date startTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.remote_addr
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String remoteAddr;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.request_url
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String requestUrl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.user_agent
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userAgent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.user_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.login_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String loginName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.user_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.http_method
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String httpMethod;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.method_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String methodName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.id
     *
     * @return the value of sys_log.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.id
     *
     * @param id the value for sys_log.id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.title
     *
     * @return the value of sys_log.title
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.title
     *
     * @param title the value for sys_log.title
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.state
     *
     * @return the value of sys_log.state
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Boolean getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.state
     *
     * @param state the value for sys_log.state
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setState(Boolean state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.time_consuming
     *
     * @return the value of sys_log.time_consuming
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Integer getTimeConsuming() {
        return timeConsuming;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.time_consuming
     *
     * @param timeConsuming the value for sys_log.time_consuming
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setTimeConsuming(Integer timeConsuming) {
        this.timeConsuming = timeConsuming;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.server_host_name
     *
     * @return the value of sys_log.server_host_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getServerHostName() {
        return serverHostName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.server_host_name
     *
     * @param serverHostName the value for sys_log.server_host_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setServerHostName(String serverHostName) {
        this.serverHostName = serverHostName == null ? null : serverHostName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.server_host_addr
     *
     * @return the value of sys_log.server_host_addr
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getServerHostAddr() {
        return serverHostAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.server_host_addr
     *
     * @param serverHostAddr the value for sys_log.server_host_addr
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setServerHostAddr(String serverHostAddr) {
        this.serverHostAddr = serverHostAddr == null ? null : serverHostAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.create_time
     *
     * @return the value of sys_log.create_time
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.create_time
     *
     * @param createTime the value for sys_log.create_time
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.start_time
     *
     * @return the value of sys_log.start_time
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.start_time
     *
     * @param startTime the value for sys_log.start_time
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.remote_addr
     *
     * @return the value of sys_log.remote_addr
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getRemoteAddr() {
        return remoteAddr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.remote_addr
     *
     * @param remoteAddr the value for sys_log.remote_addr
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr == null ? null : remoteAddr.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.request_url
     *
     * @return the value of sys_log.request_url
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.request_url
     *
     * @param requestUrl the value for sys_log.request_url
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl == null ? null : requestUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.user_agent
     *
     * @return the value of sys_log.user_agent
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserAgent() {
        return userAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.user_agent
     *
     * @param userAgent the value for sys_log.user_agent
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent == null ? null : userAgent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.user_id
     *
     * @return the value of sys_log.user_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.user_id
     *
     * @param userId the value for sys_log.user_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.login_name
     *
     * @return the value of sys_log.login_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.login_name
     *
     * @param loginName the value for sys_log.login_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.user_name
     *
     * @return the value of sys_log.user_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.user_name
     *
     * @param userName the value for sys_log.user_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.http_method
     *
     * @return the value of sys_log.http_method
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getHttpMethod() {
        return httpMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.http_method
     *
     * @param httpMethod the value for sys_log.http_method
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod == null ? null : httpMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.method_name
     *
     * @return the value of sys_log.method_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getMethodName() {
        return methodName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.method_name
     *
     * @param methodName the value for sys_log.method_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setMethodName(String methodName) {
        this.methodName = methodName == null ? null : methodName.trim();
    }
}
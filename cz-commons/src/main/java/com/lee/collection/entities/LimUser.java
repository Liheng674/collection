package com.lee.collection.entities;

import java.util.Date;

public class LimUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_loginName
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userLoginname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_pwd
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_up_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userUpCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_lev
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userLev;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_so_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userSoCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_se_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Long userSeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_se_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userSeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_isenabled
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userIsenabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_num
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_role_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Long userRoleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_islogin
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userIslogin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_ip
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userIp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_fail
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Integer userFail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_pwd_upd_date
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Date userPwdUpdDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_cti_login
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userCtiLogin;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_cti_pwd
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userCtiPwd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_cti_server
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userCtiServer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_cti_phone
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userCtiPhone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_grp_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private Long userGrpId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lim_user.user_desc
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    private String userDesc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_code
     *
     * @return the value of lim_user.user_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_code
     *
     * @param userCode the value for lim_user.user_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_loginName
     *
     * @return the value of lim_user.user_loginName
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserLoginname() {
        return userLoginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_loginName
     *
     * @param userLoginname the value for lim_user.user_loginName
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserLoginname(String userLoginname) {
        this.userLoginname = userLoginname == null ? null : userLoginname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_pwd
     *
     * @return the value of lim_user.user_pwd
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserPwd() {
        return userPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_pwd
     *
     * @param userPwd the value for lim_user.user_pwd
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_up_code
     *
     * @return the value of lim_user.user_up_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserUpCode() {
        return userUpCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_up_code
     *
     * @param userUpCode the value for lim_user.user_up_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserUpCode(String userUpCode) {
        this.userUpCode = userUpCode == null ? null : userUpCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_lev
     *
     * @return the value of lim_user.user_lev
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserLev() {
        return userLev;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_lev
     *
     * @param userLev the value for lim_user.user_lev
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserLev(String userLev) {
        this.userLev = userLev == null ? null : userLev.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_so_code
     *
     * @return the value of lim_user.user_so_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserSoCode() {
        return userSoCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_so_code
     *
     * @param userSoCode the value for lim_user.user_so_code
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserSoCode(String userSoCode) {
        this.userSoCode = userSoCode == null ? null : userSoCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_se_id
     *
     * @return the value of lim_user.user_se_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Long getUserSeId() {
        return userSeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_se_id
     *
     * @param userSeId the value for lim_user.user_se_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserSeId(Long userSeId) {
        this.userSeId = userSeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_se_name
     *
     * @return the value of lim_user.user_se_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserSeName() {
        return userSeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_se_name
     *
     * @param userSeName the value for lim_user.user_se_name
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserSeName(String userSeName) {
        this.userSeName = userSeName == null ? null : userSeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_isenabled
     *
     * @return the value of lim_user.user_isenabled
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserIsenabled() {
        return userIsenabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_isenabled
     *
     * @param userIsenabled the value for lim_user.user_isenabled
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserIsenabled(String userIsenabled) {
        this.userIsenabled = userIsenabled == null ? null : userIsenabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_num
     *
     * @return the value of lim_user.user_num
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_num
     *
     * @param userNum the value for lim_user.user_num
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserNum(String userNum) {
        this.userNum = userNum == null ? null : userNum.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_role_id
     *
     * @return the value of lim_user.user_role_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Long getUserRoleId() {
        return userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_role_id
     *
     * @param userRoleId the value for lim_user.user_role_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserRoleId(Long userRoleId) {
        this.userRoleId = userRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_islogin
     *
     * @return the value of lim_user.user_islogin
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserIslogin() {
        return userIslogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_islogin
     *
     * @param userIslogin the value for lim_user.user_islogin
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserIslogin(String userIslogin) {
        this.userIslogin = userIslogin == null ? null : userIslogin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_ip
     *
     * @return the value of lim_user.user_ip
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_ip
     *
     * @param userIp the value for lim_user.user_ip
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserIp(String userIp) {
        this.userIp = userIp == null ? null : userIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_fail
     *
     * @return the value of lim_user.user_fail
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Integer getUserFail() {
        return userFail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_fail
     *
     * @param userFail the value for lim_user.user_fail
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserFail(Integer userFail) {
        this.userFail = userFail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_pwd_upd_date
     *
     * @return the value of lim_user.user_pwd_upd_date
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Date getUserPwdUpdDate() {
        return userPwdUpdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_pwd_upd_date
     *
     * @param userPwdUpdDate the value for lim_user.user_pwd_upd_date
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserPwdUpdDate(Date userPwdUpdDate) {
        this.userPwdUpdDate = userPwdUpdDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_cti_login
     *
     * @return the value of lim_user.user_cti_login
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserCtiLogin() {
        return userCtiLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_cti_login
     *
     * @param userCtiLogin the value for lim_user.user_cti_login
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserCtiLogin(String userCtiLogin) {
        this.userCtiLogin = userCtiLogin == null ? null : userCtiLogin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_cti_pwd
     *
     * @return the value of lim_user.user_cti_pwd
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserCtiPwd() {
        return userCtiPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_cti_pwd
     *
     * @param userCtiPwd the value for lim_user.user_cti_pwd
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserCtiPwd(String userCtiPwd) {
        this.userCtiPwd = userCtiPwd == null ? null : userCtiPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_cti_server
     *
     * @return the value of lim_user.user_cti_server
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserCtiServer() {
        return userCtiServer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_cti_server
     *
     * @param userCtiServer the value for lim_user.user_cti_server
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserCtiServer(String userCtiServer) {
        this.userCtiServer = userCtiServer == null ? null : userCtiServer.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_cti_phone
     *
     * @return the value of lim_user.user_cti_phone
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserCtiPhone() {
        return userCtiPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_cti_phone
     *
     * @param userCtiPhone the value for lim_user.user_cti_phone
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserCtiPhone(String userCtiPhone) {
        this.userCtiPhone = userCtiPhone == null ? null : userCtiPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_grp_id
     *
     * @return the value of lim_user.user_grp_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public Long getUserGrpId() {
        return userGrpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_grp_id
     *
     * @param userGrpId the value for lim_user.user_grp_id
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserGrpId(Long userGrpId) {
        this.userGrpId = userGrpId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lim_user.user_desc
     *
     * @return the value of lim_user.user_desc
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lim_user.user_desc
     *
     * @param userDesc the value for lim_user.user_desc
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }
}
package com.lee.collection.mapper;

import com.lee.collection.entities.SalEmp;
import com.lee.collection.entities.SalEmpWithBLOBs;

public interface SalEmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(Long seNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(SalEmpWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(SalEmpWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    SalEmpWithBLOBs selectByPrimaryKey(Long seNo);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(SalEmpWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SalEmpWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_emp
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(SalEmp record);
}
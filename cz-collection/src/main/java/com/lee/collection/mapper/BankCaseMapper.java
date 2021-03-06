package com.lee.collection.mapper;

import com.lee.collection.entities.BankCase;
import com.lee.collection.entities.BankCaseWithBLOBs;

public interface BankCaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int deleteByPrimaryKey(Long casId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int insert(BankCaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int insertSelective(BankCaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    BankCaseWithBLOBs selectByPrimaryKey(Long casId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKeySelective(BankCaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BankCaseWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bank_case
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKey(BankCase record);
}
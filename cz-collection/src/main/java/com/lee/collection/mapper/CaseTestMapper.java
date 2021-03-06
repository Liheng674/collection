package com.lee.collection.mapper;

import com.lee.collection.entities.CaseTest;
import com.lee.collection.entities.CaseTestWithBLOBs;

public interface CaseTestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int insert(CaseTestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int insertSelective(CaseTestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    CaseTestWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKeySelective(CaseTestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseTestWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_test
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKey(CaseTest record);
}
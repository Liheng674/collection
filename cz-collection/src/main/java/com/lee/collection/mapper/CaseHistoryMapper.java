package com.lee.collection.mapper;

import com.lee.collection.entities.CaseHistory;
import com.lee.collection.entities.CaseHistoryWithBLOBs;

public interface CaseHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int insert(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int insertSelective(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    CaseHistoryWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKeySelective(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseHistoryWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_history
     *
     * @mbggenerated Sat Apr 21 19:12:58 CST 2018
     */
    int updateByPrimaryKey(CaseHistory record);
}
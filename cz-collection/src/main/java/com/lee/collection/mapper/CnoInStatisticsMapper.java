package com.lee.collection.mapper;

import com.lee.collection.entities.CnoInStatistics;

public interface CnoInStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cno_in_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cno_in_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(CnoInStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cno_in_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(CnoInStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cno_in_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    CnoInStatistics selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cno_in_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(CnoInStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cno_in_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(CnoInStatistics record);
}
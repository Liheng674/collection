package com.lee.collection.mapper;

import com.lee.collection.entities.TimeOutStatistics;

public interface TimeOutStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(TimeOutStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(TimeOutStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    TimeOutStatistics selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TimeOutStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table time_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(TimeOutStatistics record);
}
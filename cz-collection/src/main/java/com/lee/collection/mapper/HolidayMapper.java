package com.lee.collection.mapper;

import com.lee.collection.entities.Holiday;

public interface HolidayMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(Holiday record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(Holiday record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    Holiday selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(Holiday record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table holiday
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(Holiday record);
}
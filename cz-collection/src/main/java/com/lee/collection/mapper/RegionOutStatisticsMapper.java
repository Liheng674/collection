package com.lee.collection.mapper;

import com.lee.collection.entities.RegionOutStatistics;

public interface RegionOutStatisticsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(RegionOutStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(RegionOutStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    RegionOutStatistics selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(RegionOutStatistics record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table region_out_statistics
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(RegionOutStatistics record);
}
package com.lee.collection.mapper;

import com.lee.collection.entities.Address;

public interface AddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    Address selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Address record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(Address record);
}
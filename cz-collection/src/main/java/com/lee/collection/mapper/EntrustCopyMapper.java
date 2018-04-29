package com.lee.collection.mapper;

import com.lee.collection.entities.EntrustCopy;
import com.lee.collection.entities.EntrustCopyWithBLOBs;

public interface EntrustCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(EntrustCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(EntrustCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    EntrustCopyWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(EntrustCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(EntrustCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table entrust_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(EntrustCopy record);
}
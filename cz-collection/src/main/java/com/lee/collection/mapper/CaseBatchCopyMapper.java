package com.lee.collection.mapper;

import com.lee.collection.entities.CaseBatchCopy;
import com.lee.collection.entities.CaseBatchCopyWithBLOBs;

public interface CaseBatchCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(CaseBatchCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(CaseBatchCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    CaseBatchCopyWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(CaseBatchCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseBatchCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_batch_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(CaseBatchCopy record);
}
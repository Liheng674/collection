package com.lee.collection.mapper;

import com.lee.collection.entities.CaseInfoCopy;
import com.lee.collection.entities.CaseInfoCopyWithBLOBs;

public interface CaseInfoCopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(CaseInfoCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(CaseInfoCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    CaseInfoCopyWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(CaseInfoCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CaseInfoCopyWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table case_info_copy
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(CaseInfoCopy record);
}
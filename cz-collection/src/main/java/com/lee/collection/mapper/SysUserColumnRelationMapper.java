package com.lee.collection.mapper;

import com.lee.collection.entities.SysUserColumnRelationKey;

public interface SysUserColumnRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_column_relation
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(SysUserColumnRelationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_column_relation
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(SysUserColumnRelationKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_column_relation
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(SysUserColumnRelationKey record);
}
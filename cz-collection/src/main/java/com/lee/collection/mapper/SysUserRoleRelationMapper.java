package com.lee.collection.mapper;

import com.lee.collection.entities.SysUserRoleRelationKey;

public interface SysUserRoleRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role_relation
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(SysUserRoleRelationKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role_relation
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(SysUserRoleRelationKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_role_relation
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(SysUserRoleRelationKey record);
}
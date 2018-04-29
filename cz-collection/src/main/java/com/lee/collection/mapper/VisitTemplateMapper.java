package com.lee.collection.mapper;

import com.lee.collection.entities.VisitTemplate;

public interface VisitTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insert(VisitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int insertSelective(VisitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    VisitTemplate selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(VisitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(VisitTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table visit_template
     *
     * @mbggenerated Sat Apr 21 19:12:59 CST 2018
     */
    int updateByPrimaryKey(VisitTemplate record);
}
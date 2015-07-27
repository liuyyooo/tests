package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.SpecialSubjectItem;
import com.daniu.mybatis.model.SpecialSubjectItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialSubjectItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int countByExample(SpecialSubjectItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int deleteByExample(SpecialSubjectItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int insert(SpecialSubjectItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int insertSelective(SpecialSubjectItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    List<SpecialSubjectItem> selectByExample(SpecialSubjectItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    SpecialSubjectItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SpecialSubjectItem record, @Param("example") SpecialSubjectItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SpecialSubjectItem record, @Param("example") SpecialSubjectItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SpecialSubjectItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SpecialSubjectItem record);
}
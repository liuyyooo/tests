package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.SpecialSubjectStyle;
import com.daniu.mybatis.model.SpecialSubjectStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecialSubjectStyleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int countByExample(SpecialSubjectStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int deleteByExample(SpecialSubjectStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int insert(SpecialSubjectStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int insertSelective(SpecialSubjectStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    List<SpecialSubjectStyle> selectByExample(SpecialSubjectStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    SpecialSubjectStyle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SpecialSubjectStyle record, @Param("example") SpecialSubjectStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SpecialSubjectStyle record, @Param("example") SpecialSubjectStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SpecialSubjectStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SpecialSubjectStyle record);
}
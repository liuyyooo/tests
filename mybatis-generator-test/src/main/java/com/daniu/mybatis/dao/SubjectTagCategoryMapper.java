package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.SubjectTagCategory;
import com.daniu.mybatis.model.SubjectTagCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectTagCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int countByExample(SubjectTagCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int deleteByExample(SubjectTagCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int insert(SubjectTagCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int insertSelective(SubjectTagCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    List<SubjectTagCategory> selectByExample(SubjectTagCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    SubjectTagCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SubjectTagCategory record, @Param("example") SubjectTagCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SubjectTagCategory record, @Param("example") SubjectTagCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SubjectTagCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SubjectTagCategory record);
}
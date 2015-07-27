package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.SubjectTagCategoryItem;
import com.daniu.mybatis.model.SubjectTagCategoryItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubjectTagCategoryItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int countByExample(SubjectTagCategoryItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int deleteByExample(SubjectTagCategoryItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int insert(SubjectTagCategoryItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int insertSelective(SubjectTagCategoryItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    List<SubjectTagCategoryItem> selectByExample(SubjectTagCategoryItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    SubjectTagCategoryItem selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") SubjectTagCategoryItem record, @Param("example") SubjectTagCategoryItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") SubjectTagCategoryItem record, @Param("example") SubjectTagCategoryItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SubjectTagCategoryItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subject_tag_category_item
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SubjectTagCategoryItem record);
}
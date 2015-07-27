package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.BookGroupTag;
import com.daniu.mybatis.model.BookGroupTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookGroupTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int countByExample(BookGroupTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int deleteByExample(BookGroupTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int insert(BookGroupTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int insertSelective(BookGroupTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    List<BookGroupTag> selectByExample(BookGroupTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    BookGroupTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookGroupTag record, @Param("example") BookGroupTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookGroupTag record, @Param("example") BookGroupTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookGroupTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_group_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookGroupTag record);
}
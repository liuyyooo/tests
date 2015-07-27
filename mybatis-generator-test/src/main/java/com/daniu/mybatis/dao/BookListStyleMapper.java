package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.BookListStyle;
import com.daniu.mybatis.model.BookListStyleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookListStyleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int countByExample(BookListStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int deleteByExample(BookListStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int insert(BookListStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int insertSelective(BookListStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    List<BookListStyle> selectByExample(BookListStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    BookListStyle selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") BookListStyle record, @Param("example") BookListStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") BookListStyle record, @Param("example") BookListStyleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BookListStyle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_list_style
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BookListStyle record);
}
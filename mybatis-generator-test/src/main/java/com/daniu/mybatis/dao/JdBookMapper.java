package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.JdBook;
import com.daniu.mybatis.model.JdBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JdBookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int countByExample(JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int deleteByExample(JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int insert(JdBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int insertSelective(JdBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    List<JdBook> selectByExampleWithBLOBs(JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    List<JdBook> selectByExample(JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    JdBook selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") JdBook record, @Param("example") JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") JdBook record, @Param("example") JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") JdBook record, @Param("example") JdBookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(JdBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(JdBook record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jd_book
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(JdBook record);
}
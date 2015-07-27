package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.Keywords;
import com.daniu.mybatis.model.KeywordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KeywordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int countByExample(KeywordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int deleteByExample(KeywordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int insert(Keywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int insertSelective(Keywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    List<Keywords> selectByExample(KeywordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    Keywords selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Keywords record, @Param("example") KeywordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Keywords record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table keywords
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Keywords record);
}
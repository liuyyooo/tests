package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.LinkTag;
import com.daniu.mybatis.model.LinkTagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkTagMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int countByExample(LinkTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int deleteByExample(LinkTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int insert(LinkTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int insertSelective(LinkTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    List<LinkTag> selectByExample(LinkTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    LinkTag selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") LinkTag record, @Param("example") LinkTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") LinkTag record, @Param("example") LinkTagExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LinkTag record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table link_tag
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LinkTag record);
}
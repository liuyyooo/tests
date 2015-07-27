package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.OpenapiAccount;
import com.daniu.mybatis.model.OpenapiAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpenapiAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int countByExample(OpenapiAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int deleteByExample(OpenapiAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int insert(OpenapiAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int insertSelective(OpenapiAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    List<OpenapiAccount> selectByExample(OpenapiAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    OpenapiAccount selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") OpenapiAccount record, @Param("example") OpenapiAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") OpenapiAccount record, @Param("example") OpenapiAccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OpenapiAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table openapi_account
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OpenapiAccount record);
}
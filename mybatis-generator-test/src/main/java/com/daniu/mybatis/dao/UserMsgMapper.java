package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.UserMsg;
import com.daniu.mybatis.model.UserMsgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMsgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int countByExample(UserMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int deleteByExample(UserMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int insert(UserMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int insertSelective(UserMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    List<UserMsg> selectByExample(UserMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    UserMsg selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserMsg record, @Param("example") UserMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserMsg record, @Param("example") UserMsgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserMsg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_msg
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserMsg record);
}
package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.UserPointRedeemLog;
import com.daniu.mybatis.model.UserPointRedeemLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPointRedeemLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    int countByExample(UserPointRedeemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    int deleteByExample(UserPointRedeemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    int insert(UserPointRedeemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    int insertSelective(UserPointRedeemLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    List<UserPointRedeemLog> selectByExample(UserPointRedeemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserPointRedeemLog record, @Param("example") UserPointRedeemLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_point_redeem_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserPointRedeemLog record, @Param("example") UserPointRedeemLogExample example);
}
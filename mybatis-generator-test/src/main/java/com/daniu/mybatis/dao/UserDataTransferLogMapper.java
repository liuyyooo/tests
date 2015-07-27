package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.UserDataTransferLog;
import com.daniu.mybatis.model.UserDataTransferLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDataTransferLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int countByExample(UserDataTransferLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int deleteByExample(UserDataTransferLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int insert(UserDataTransferLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int insertSelective(UserDataTransferLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    List<UserDataTransferLog> selectByExample(UserDataTransferLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    UserDataTransferLog selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserDataTransferLog record, @Param("example") UserDataTransferLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserDataTransferLog record, @Param("example") UserDataTransferLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserDataTransferLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_data_transfer_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserDataTransferLog record);
}
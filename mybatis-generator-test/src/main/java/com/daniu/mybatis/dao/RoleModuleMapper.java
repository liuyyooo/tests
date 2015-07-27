package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.RoleModule;
import com.daniu.mybatis.model.RoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int countByExample(RoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int deleteByExample(RoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("moduleid") Long moduleid, @Param("roleid") Long roleid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int insert(RoleModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int insertSelective(RoleModule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    List<RoleModule> selectByExample(RoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_module
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);
}
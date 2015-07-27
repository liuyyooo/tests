package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.ChartStandard;
import com.daniu.mybatis.model.ChartStandardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChartStandardMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int countByExample(ChartStandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int deleteByExample(ChartStandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int insert(ChartStandard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int insertSelective(ChartStandard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    List<ChartStandard> selectByExample(ChartStandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    ChartStandard selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ChartStandard record, @Param("example") ChartStandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ChartStandard record, @Param("example") ChartStandardExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChartStandard record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chart_standard
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChartStandard record);
}
package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.RechargeCoupon;
import com.daniu.mybatis.model.RechargeCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RechargeCouponMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int countByExample(RechargeCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int deleteByExample(RechargeCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int insert(RechargeCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int insertSelective(RechargeCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    List<RechargeCoupon> selectByExample(RechargeCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    RechargeCoupon selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") RechargeCoupon record, @Param("example") RechargeCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") RechargeCoupon record, @Param("example") RechargeCouponExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(RechargeCoupon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table recharge_coupon
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(RechargeCoupon record);
}
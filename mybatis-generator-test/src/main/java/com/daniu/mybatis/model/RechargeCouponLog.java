package com.daniu.mybatis.model;

public class RechargeCouponLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_coupon_log.coupon_id
     *
     * @mbggenerated
     */
    private Long couponId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_coupon_log.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column recharge_coupon_log.times
     *
     * @mbggenerated
     */
    private Integer times;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_coupon_log.coupon_id
     *
     * @return the value of recharge_coupon_log.coupon_id
     *
     * @mbggenerated
     */
    public Long getCouponId() {
        return couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_coupon_log.coupon_id
     *
     * @param couponId the value for recharge_coupon_log.coupon_id
     *
     * @mbggenerated
     */
    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_coupon_log.user_id
     *
     * @return the value of recharge_coupon_log.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_coupon_log.user_id
     *
     * @param userId the value for recharge_coupon_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column recharge_coupon_log.times
     *
     * @return the value of recharge_coupon_log.times
     *
     * @mbggenerated
     */
    public Integer getTimes() {
        return times;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column recharge_coupon_log.times
     *
     * @param times the value for recharge_coupon_log.times
     *
     * @mbggenerated
     */
    public void setTimes(Integer times) {
        this.times = times;
    }
}
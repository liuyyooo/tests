package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.ChannelBanner;
import com.daniu.mybatis.model.ChannelBannerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChannelBannerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int countByExample(ChannelBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int deleteByExample(ChannelBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int insert(ChannelBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int insertSelective(ChannelBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    List<ChannelBanner> selectByExample(ChannelBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    ChannelBanner selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ChannelBanner record, @Param("example") ChannelBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ChannelBanner record, @Param("example") ChannelBannerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ChannelBanner record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table channel_banner
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ChannelBanner record);
}
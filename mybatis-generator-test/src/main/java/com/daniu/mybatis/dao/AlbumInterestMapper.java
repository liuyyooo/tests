package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.AlbumInterest;
import com.daniu.mybatis.model.AlbumInterestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlbumInterestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int countByExample(AlbumInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int deleteByExample(AlbumInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("albumId") Long albumId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int insert(AlbumInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int insertSelective(AlbumInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    List<AlbumInterest> selectByExample(AlbumInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    AlbumInterest selectByPrimaryKey(@Param("albumId") Long albumId, @Param("userId") Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") AlbumInterest record, @Param("example") AlbumInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") AlbumInterest record, @Param("example") AlbumInterestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(AlbumInterest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table album_interest
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(AlbumInterest record);
}
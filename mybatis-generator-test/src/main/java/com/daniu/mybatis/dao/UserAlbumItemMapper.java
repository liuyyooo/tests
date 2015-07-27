package com.daniu.mybatis.dao;

import com.daniu.mybatis.model.UserAlbumItem;
import com.daniu.mybatis.model.UserAlbumItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAlbumItemMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int countByExample(UserAlbumItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int deleteByExample(UserAlbumItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(@Param("albumId") Long albumId, @Param("bookId") Long bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int insert(UserAlbumItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int insertSelective(UserAlbumItem record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    List<UserAlbumItem> selectByExample(UserAlbumItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") UserAlbumItem record, @Param("example") UserAlbumItemExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_album_item
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") UserAlbumItem record, @Param("example") UserAlbumItemExample example);
}
package com.daniu.mybatis.model;

public class UserDataTransferLog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_data_transfer_log.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_data_transfer_log.book_group_tag
     *
     * @mbggenerated
     */
    private Integer bookGroupTag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_data_transfer_log.user_id
     *
     * @return the value of user_data_transfer_log.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_data_transfer_log.user_id
     *
     * @param userId the value for user_data_transfer_log.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_data_transfer_log.book_group_tag
     *
     * @return the value of user_data_transfer_log.book_group_tag
     *
     * @mbggenerated
     */
    public Integer getBookGroupTag() {
        return bookGroupTag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_data_transfer_log.book_group_tag
     *
     * @param bookGroupTag the value for user_data_transfer_log.book_group_tag
     *
     * @mbggenerated
     */
    public void setBookGroupTag(Integer bookGroupTag) {
        this.bookGroupTag = bookGroupTag;
    }
}
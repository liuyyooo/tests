package com.daniu.mybatis.model;

import java.util.Date;

public class UserVoteInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vote_info.bookId
     *
     * @mbggenerated
     */
    private Long bookid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vote_info.userId
     *
     * @mbggenerated
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_vote_info.voteDate
     *
     * @mbggenerated
     */
    private Date votedate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vote_info.bookId
     *
     * @return the value of user_vote_info.bookId
     *
     * @mbggenerated
     */
    public Long getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vote_info.bookId
     *
     * @param bookid the value for user_vote_info.bookId
     *
     * @mbggenerated
     */
    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vote_info.userId
     *
     * @return the value of user_vote_info.userId
     *
     * @mbggenerated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vote_info.userId
     *
     * @param userid the value for user_vote_info.userId
     *
     * @mbggenerated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_vote_info.voteDate
     *
     * @return the value of user_vote_info.voteDate
     *
     * @mbggenerated
     */
    public Date getVotedate() {
        return votedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_vote_info.voteDate
     *
     * @param votedate the value for user_vote_info.voteDate
     *
     * @mbggenerated
     */
    public void setVotedate(Date votedate) {
        this.votedate = votedate;
    }
}
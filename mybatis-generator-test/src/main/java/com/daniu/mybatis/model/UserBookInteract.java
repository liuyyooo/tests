package com.daniu.mybatis.model;

public class UserBookInteract {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book_interact.book_id
     *
     * @mbggenerated
     */
    private Long bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book_interact.user_id
     *
     * @mbggenerated
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_book_interact.score
     *
     * @mbggenerated
     */
    private Short score;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book_interact.book_id
     *
     * @return the value of user_book_interact.book_id
     *
     * @mbggenerated
     */
    public Long getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book_interact.book_id
     *
     * @param bookId the value for user_book_interact.book_id
     *
     * @mbggenerated
     */
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book_interact.user_id
     *
     * @return the value of user_book_interact.user_id
     *
     * @mbggenerated
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book_interact.user_id
     *
     * @param userId the value for user_book_interact.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_book_interact.score
     *
     * @return the value of user_book_interact.score
     *
     * @mbggenerated
     */
    public Short getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_book_interact.score
     *
     * @param score the value for user_book_interact.score
     *
     * @mbggenerated
     */
    public void setScore(Short score) {
        this.score = score;
    }
}
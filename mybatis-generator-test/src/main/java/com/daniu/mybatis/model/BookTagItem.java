package com.daniu.mybatis.model;

public class BookTagItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_tag_item.bid
     *
     * @mbggenerated
     */
    private Long bid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_tag_item.bookstore
     *
     * @mbggenerated
     */
    private Byte bookstore;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_tag_item.tag_id
     *
     * @mbggenerated
     */
    private Long tagId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_tag_item.bid
     *
     * @return the value of book_tag_item.bid
     *
     * @mbggenerated
     */
    public Long getBid() {
        return bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_tag_item.bid
     *
     * @param bid the value for book_tag_item.bid
     *
     * @mbggenerated
     */
    public void setBid(Long bid) {
        this.bid = bid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_tag_item.bookstore
     *
     * @return the value of book_tag_item.bookstore
     *
     * @mbggenerated
     */
    public Byte getBookstore() {
        return bookstore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_tag_item.bookstore
     *
     * @param bookstore the value for book_tag_item.bookstore
     *
     * @mbggenerated
     */
    public void setBookstore(Byte bookstore) {
        this.bookstore = bookstore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_tag_item.tag_id
     *
     * @return the value of book_tag_item.tag_id
     *
     * @mbggenerated
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_tag_item.tag_id
     *
     * @param tagId the value for book_tag_item.tag_id
     *
     * @mbggenerated
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
package com.daniu.mybatis.model;

import java.util.Date;

public class BookAttach {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_attach.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_attach.gmtCreate
     *
     * @mbggenerated
     */
    private Date gmtcreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_attach.gmtModify
     *
     * @mbggenerated
     */
    private Date gmtmodify;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_attach.bookId
     *
     * @mbggenerated
     */
    private Long bookid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_attach.attachTypeId
     *
     * @mbggenerated
     */
    private Long attachtypeid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_attach.attachUrl
     *
     * @mbggenerated
     */
    private String attachurl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_attach.id
     *
     * @return the value of book_attach.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_attach.id
     *
     * @param id the value for book_attach.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_attach.gmtCreate
     *
     * @return the value of book_attach.gmtCreate
     *
     * @mbggenerated
     */
    public Date getGmtcreate() {
        return gmtcreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_attach.gmtCreate
     *
     * @param gmtcreate the value for book_attach.gmtCreate
     *
     * @mbggenerated
     */
    public void setGmtcreate(Date gmtcreate) {
        this.gmtcreate = gmtcreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_attach.gmtModify
     *
     * @return the value of book_attach.gmtModify
     *
     * @mbggenerated
     */
    public Date getGmtmodify() {
        return gmtmodify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_attach.gmtModify
     *
     * @param gmtmodify the value for book_attach.gmtModify
     *
     * @mbggenerated
     */
    public void setGmtmodify(Date gmtmodify) {
        this.gmtmodify = gmtmodify;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_attach.bookId
     *
     * @return the value of book_attach.bookId
     *
     * @mbggenerated
     */
    public Long getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_attach.bookId
     *
     * @param bookid the value for book_attach.bookId
     *
     * @mbggenerated
     */
    public void setBookid(Long bookid) {
        this.bookid = bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_attach.attachTypeId
     *
     * @return the value of book_attach.attachTypeId
     *
     * @mbggenerated
     */
    public Long getAttachtypeid() {
        return attachtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_attach.attachTypeId
     *
     * @param attachtypeid the value for book_attach.attachTypeId
     *
     * @mbggenerated
     */
    public void setAttachtypeid(Long attachtypeid) {
        this.attachtypeid = attachtypeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_attach.attachUrl
     *
     * @return the value of book_attach.attachUrl
     *
     * @mbggenerated
     */
    public String getAttachurl() {
        return attachurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_attach.attachUrl
     *
     * @param attachurl the value for book_attach.attachUrl
     *
     * @mbggenerated
     */
    public void setAttachurl(String attachurl) {
        this.attachurl = attachurl;
    }
}
package com.daniu.mybatis.model;

public class ItemParent {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_parent.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_parent.type
     *
     * @mbggenerated
     */
    private Short type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column item_parent.item
     *
     * @mbggenerated
     */
    private Long item;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_parent.id
     *
     * @return the value of item_parent.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_parent.id
     *
     * @param id the value for item_parent.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_parent.type
     *
     * @return the value of item_parent.type
     *
     * @mbggenerated
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_parent.type
     *
     * @param type the value for item_parent.type
     *
     * @mbggenerated
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column item_parent.item
     *
     * @return the value of item_parent.item
     *
     * @mbggenerated
     */
    public Long getItem() {
        return item;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column item_parent.item
     *
     * @param item the value for item_parent.item
     *
     * @mbggenerated
     */
    public void setItem(Long item) {
        this.item = item;
    }
}
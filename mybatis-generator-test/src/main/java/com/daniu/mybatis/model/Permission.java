package com.daniu.mybatis.model;

public class Permission {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.actions
     *
     * @mbggenerated
     */
    private String actions;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.domain
     *
     * @mbggenerated
     */
    private String domain;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.targets
     *
     * @mbggenerated
     */
    private String targets;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.description
     *
     * @mbggenerated
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column permission.type
     *
     * @mbggenerated
     */
    private Byte type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.actions
     *
     * @return the value of permission.actions
     *
     * @mbggenerated
     */
    public String getActions() {
        return actions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.actions
     *
     * @param actions the value for permission.actions
     *
     * @mbggenerated
     */
    public void setActions(String actions) {
        this.actions = actions;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.domain
     *
     * @return the value of permission.domain
     *
     * @mbggenerated
     */
    public String getDomain() {
        return domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.domain
     *
     * @param domain the value for permission.domain
     *
     * @mbggenerated
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.targets
     *
     * @return the value of permission.targets
     *
     * @mbggenerated
     */
    public String getTargets() {
        return targets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.targets
     *
     * @param targets the value for permission.targets
     *
     * @mbggenerated
     */
    public void setTargets(String targets) {
        this.targets = targets;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.description
     *
     * @return the value of permission.description
     *
     * @mbggenerated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.description
     *
     * @param description the value for permission.description
     *
     * @mbggenerated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column permission.type
     *
     * @return the value of permission.type
     *
     * @mbggenerated
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column permission.type
     *
     * @param type the value for permission.type
     *
     * @mbggenerated
     */
    public void setType(Byte type) {
        this.type = type;
    }
}
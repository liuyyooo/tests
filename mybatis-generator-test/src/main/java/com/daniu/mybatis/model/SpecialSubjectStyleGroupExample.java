package com.daniu.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class SpecialSubjectStyleGroupExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public SpecialSubjectStyleGroupExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNull() {
            addCriterion("query_count is null");
            return (Criteria) this;
        }

        public Criteria andQueryCountIsNotNull() {
            addCriterion("query_count is not null");
            return (Criteria) this;
        }

        public Criteria andQueryCountEqualTo(Integer value) {
            addCriterion("query_count =", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotEqualTo(Integer value) {
            addCriterion("query_count <>", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThan(Integer value) {
            addCriterion("query_count >", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("query_count >=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThan(Integer value) {
            addCriterion("query_count <", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountLessThanOrEqualTo(Integer value) {
            addCriterion("query_count <=", value, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountIn(List<Integer> values) {
            addCriterion("query_count in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotIn(List<Integer> values) {
            addCriterion("query_count not in", values, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountBetween(Integer value1, Integer value2) {
            addCriterion("query_count between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andQueryCountNotBetween(Integer value1, Integer value2) {
            addCriterion("query_count not between", value1, value2, "queryCount");
            return (Criteria) this;
        }

        public Criteria andRandIsNull() {
            addCriterion("rand is null");
            return (Criteria) this;
        }

        public Criteria andRandIsNotNull() {
            addCriterion("rand is not null");
            return (Criteria) this;
        }

        public Criteria andRandEqualTo(Integer value) {
            addCriterion("rand =", value, "rand");
            return (Criteria) this;
        }

        public Criteria andRandNotEqualTo(Integer value) {
            addCriterion("rand <>", value, "rand");
            return (Criteria) this;
        }

        public Criteria andRandGreaterThan(Integer value) {
            addCriterion("rand >", value, "rand");
            return (Criteria) this;
        }

        public Criteria andRandGreaterThanOrEqualTo(Integer value) {
            addCriterion("rand >=", value, "rand");
            return (Criteria) this;
        }

        public Criteria andRandLessThan(Integer value) {
            addCriterion("rand <", value, "rand");
            return (Criteria) this;
        }

        public Criteria andRandLessThanOrEqualTo(Integer value) {
            addCriterion("rand <=", value, "rand");
            return (Criteria) this;
        }

        public Criteria andRandIn(List<Integer> values) {
            addCriterion("rand in", values, "rand");
            return (Criteria) this;
        }

        public Criteria andRandNotIn(List<Integer> values) {
            addCriterion("rand not in", values, "rand");
            return (Criteria) this;
        }

        public Criteria andRandBetween(Integer value1, Integer value2) {
            addCriterion("rand between", value1, value2, "rand");
            return (Criteria) this;
        }

        public Criteria andRandNotBetween(Integer value1, Integer value2) {
            addCriterion("rand not between", value1, value2, "rand");
            return (Criteria) this;
        }

        public Criteria andItemStylesIsNull() {
            addCriterion("item_styles is null");
            return (Criteria) this;
        }

        public Criteria andItemStylesIsNotNull() {
            addCriterion("item_styles is not null");
            return (Criteria) this;
        }

        public Criteria andItemStylesEqualTo(String value) {
            addCriterion("item_styles =", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesNotEqualTo(String value) {
            addCriterion("item_styles <>", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesGreaterThan(String value) {
            addCriterion("item_styles >", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesGreaterThanOrEqualTo(String value) {
            addCriterion("item_styles >=", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesLessThan(String value) {
            addCriterion("item_styles <", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesLessThanOrEqualTo(String value) {
            addCriterion("item_styles <=", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesLike(String value) {
            addCriterion("item_styles like", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesNotLike(String value) {
            addCriterion("item_styles not like", value, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesIn(List<String> values) {
            addCriterion("item_styles in", values, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesNotIn(List<String> values) {
            addCriterion("item_styles not in", values, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesBetween(String value1, String value2) {
            addCriterion("item_styles between", value1, value2, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemStylesNotBetween(String value1, String value2) {
            addCriterion("item_styles not between", value1, value2, "itemStyles");
            return (Criteria) this;
        }

        public Criteria andItemTypesIsNull() {
            addCriterion("item_types is null");
            return (Criteria) this;
        }

        public Criteria andItemTypesIsNotNull() {
            addCriterion("item_types is not null");
            return (Criteria) this;
        }

        public Criteria andItemTypesEqualTo(String value) {
            addCriterion("item_types =", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesNotEqualTo(String value) {
            addCriterion("item_types <>", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesGreaterThan(String value) {
            addCriterion("item_types >", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesGreaterThanOrEqualTo(String value) {
            addCriterion("item_types >=", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesLessThan(String value) {
            addCriterion("item_types <", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesLessThanOrEqualTo(String value) {
            addCriterion("item_types <=", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesLike(String value) {
            addCriterion("item_types like", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesNotLike(String value) {
            addCriterion("item_types not like", value, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesIn(List<String> values) {
            addCriterion("item_types in", values, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesNotIn(List<String> values) {
            addCriterion("item_types not in", values, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesBetween(String value1, String value2) {
            addCriterion("item_types between", value1, value2, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemTypesNotBetween(String value1, String value2) {
            addCriterion("item_types not between", value1, value2, "itemTypes");
            return (Criteria) this;
        }

        public Criteria andItemCountsIsNull() {
            addCriterion("item_counts is null");
            return (Criteria) this;
        }

        public Criteria andItemCountsIsNotNull() {
            addCriterion("item_counts is not null");
            return (Criteria) this;
        }

        public Criteria andItemCountsEqualTo(String value) {
            addCriterion("item_counts =", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsNotEqualTo(String value) {
            addCriterion("item_counts <>", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsGreaterThan(String value) {
            addCriterion("item_counts >", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsGreaterThanOrEqualTo(String value) {
            addCriterion("item_counts >=", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsLessThan(String value) {
            addCriterion("item_counts <", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsLessThanOrEqualTo(String value) {
            addCriterion("item_counts <=", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsLike(String value) {
            addCriterion("item_counts like", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsNotLike(String value) {
            addCriterion("item_counts not like", value, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsIn(List<String> values) {
            addCriterion("item_counts in", values, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsNotIn(List<String> values) {
            addCriterion("item_counts not in", values, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsBetween(String value1, String value2) {
            addCriterion("item_counts between", value1, value2, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemCountsNotBetween(String value1, String value2) {
            addCriterion("item_counts not between", value1, value2, "itemCounts");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsIsNull() {
            addCriterion("item_dynamic_fields is null");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsIsNotNull() {
            addCriterion("item_dynamic_fields is not null");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsEqualTo(String value) {
            addCriterion("item_dynamic_fields =", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsNotEqualTo(String value) {
            addCriterion("item_dynamic_fields <>", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsGreaterThan(String value) {
            addCriterion("item_dynamic_fields >", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsGreaterThanOrEqualTo(String value) {
            addCriterion("item_dynamic_fields >=", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsLessThan(String value) {
            addCriterion("item_dynamic_fields <", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsLessThanOrEqualTo(String value) {
            addCriterion("item_dynamic_fields <=", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsLike(String value) {
            addCriterion("item_dynamic_fields like", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsNotLike(String value) {
            addCriterion("item_dynamic_fields not like", value, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsIn(List<String> values) {
            addCriterion("item_dynamic_fields in", values, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsNotIn(List<String> values) {
            addCriterion("item_dynamic_fields not in", values, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsBetween(String value1, String value2) {
            addCriterion("item_dynamic_fields between", value1, value2, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDynamicFieldsNotBetween(String value1, String value2) {
            addCriterion("item_dynamic_fields not between", value1, value2, "itemDynamicFields");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersIsNull() {
            addCriterion("item_delimiters is null");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersIsNotNull() {
            addCriterion("item_delimiters is not null");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersEqualTo(String value) {
            addCriterion("item_delimiters =", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersNotEqualTo(String value) {
            addCriterion("item_delimiters <>", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersGreaterThan(String value) {
            addCriterion("item_delimiters >", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersGreaterThanOrEqualTo(String value) {
            addCriterion("item_delimiters >=", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersLessThan(String value) {
            addCriterion("item_delimiters <", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersLessThanOrEqualTo(String value) {
            addCriterion("item_delimiters <=", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersLike(String value) {
            addCriterion("item_delimiters like", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersNotLike(String value) {
            addCriterion("item_delimiters not like", value, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersIn(List<String> values) {
            addCriterion("item_delimiters in", values, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersNotIn(List<String> values) {
            addCriterion("item_delimiters not in", values, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersBetween(String value1, String value2) {
            addCriterion("item_delimiters between", value1, value2, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andItemDelimitersNotBetween(String value1, String value2) {
            addCriterion("item_delimiters not between", value1, value2, "itemDelimiters");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table special_subject_style_group
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table special_subject_style_group
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
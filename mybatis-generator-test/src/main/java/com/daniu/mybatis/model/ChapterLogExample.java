package com.daniu.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ChapterLogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public ChapterLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
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
     * This method corresponds to the database table chapter_log
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
     * This method corresponds to the database table chapter_log
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table chapter_log
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
     * This class corresponds to the database table chapter_log
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

        public Criteria andChapteridIsNull() {
            addCriterion("chapterId is null");
            return (Criteria) this;
        }

        public Criteria andChapteridIsNotNull() {
            addCriterion("chapterId is not null");
            return (Criteria) this;
        }

        public Criteria andChapteridEqualTo(Long value) {
            addCriterion("chapterId =", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotEqualTo(Long value) {
            addCriterion("chapterId <>", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThan(Long value) {
            addCriterion("chapterId >", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridGreaterThanOrEqualTo(Long value) {
            addCriterion("chapterId >=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThan(Long value) {
            addCriterion("chapterId <", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridLessThanOrEqualTo(Long value) {
            addCriterion("chapterId <=", value, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridIn(List<Long> values) {
            addCriterion("chapterId in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotIn(List<Long> values) {
            addCriterion("chapterId not in", values, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridBetween(Long value1, Long value2) {
            addCriterion("chapterId between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andChapteridNotBetween(Long value1, Long value2) {
            addCriterion("chapterId not between", value1, value2, "chapterid");
            return (Criteria) this;
        }

        public Criteria andClickdownloadIsNull() {
            addCriterion("clickDownload is null");
            return (Criteria) this;
        }

        public Criteria andClickdownloadIsNotNull() {
            addCriterion("clickDownload is not null");
            return (Criteria) this;
        }

        public Criteria andClickdownloadEqualTo(Integer value) {
            addCriterion("clickDownload =", value, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadNotEqualTo(Integer value) {
            addCriterion("clickDownload <>", value, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadGreaterThan(Integer value) {
            addCriterion("clickDownload >", value, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadGreaterThanOrEqualTo(Integer value) {
            addCriterion("clickDownload >=", value, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadLessThan(Integer value) {
            addCriterion("clickDownload <", value, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadLessThanOrEqualTo(Integer value) {
            addCriterion("clickDownload <=", value, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadIn(List<Integer> values) {
            addCriterion("clickDownload in", values, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadNotIn(List<Integer> values) {
            addCriterion("clickDownload not in", values, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadBetween(Integer value1, Integer value2) {
            addCriterion("clickDownload between", value1, value2, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andClickdownloadNotBetween(Integer value1, Integer value2) {
            addCriterion("clickDownload not between", value1, value2, "clickdownload");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeIsNull() {
            addCriterion("last_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeIsNotNull() {
            addCriterion("last_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeEqualTo(Date value) {
            addCriterion("last_updatetime =", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeNotEqualTo(Date value) {
            addCriterion("last_updatetime <>", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeGreaterThan(Date value) {
            addCriterion("last_updatetime >", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_updatetime >=", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeLessThan(Date value) {
            addCriterion("last_updatetime <", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("last_updatetime <=", value, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeIn(List<Date> values) {
            addCriterion("last_updatetime in", values, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeNotIn(List<Date> values) {
            addCriterion("last_updatetime not in", values, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("last_updatetime between", value1, value2, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andLastUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("last_updatetime not between", value1, value2, "lastUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(String value) {
            addCriterion("bookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(String value) {
            addCriterion("bookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(String value) {
            addCriterion("bookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(String value) {
            addCriterion("bookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(String value) {
            addCriterion("bookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(String value) {
            addCriterion("bookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLike(String value) {
            addCriterion("bookId like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotLike(String value) {
            addCriterion("bookId not like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<String> values) {
            addCriterion("bookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<String> values) {
            addCriterion("bookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(String value1, String value2) {
            addCriterion("bookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(String value1, String value2) {
            addCriterion("bookId not between", value1, value2, "bookid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table chapter_log
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
     * This class corresponds to the database table chapter_log
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
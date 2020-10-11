package com.movie.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MovieInfoDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieInfoDOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNull() {
            addCriterion("mtitle is null");
            return (Criteria) this;
        }

        public Criteria andMtitleIsNotNull() {
            addCriterion("mtitle is not null");
            return (Criteria) this;
        }

        public Criteria andMtitleEqualTo(String value) {
            addCriterion("mtitle =", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotEqualTo(String value) {
            addCriterion("mtitle <>", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThan(String value) {
            addCriterion("mtitle >", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleGreaterThanOrEqualTo(String value) {
            addCriterion("mtitle >=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThan(String value) {
            addCriterion("mtitle <", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLessThanOrEqualTo(String value) {
            addCriterion("mtitle <=", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleLike(String value) {
            addCriterion("mtitle like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotLike(String value) {
            addCriterion("mtitle not like", value, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleIn(List<String> values) {
            addCriterion("mtitle in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotIn(List<String> values) {
            addCriterion("mtitle not in", values, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleBetween(String value1, String value2) {
            addCriterion("mtitle between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMtitleNotBetween(String value1, String value2) {
            addCriterion("mtitle not between", value1, value2, "mtitle");
            return (Criteria) this;
        }

        public Criteria andMplaceIsNull() {
            addCriterion("mplace is null");
            return (Criteria) this;
        }

        public Criteria andMplaceIsNotNull() {
            addCriterion("mplace is not null");
            return (Criteria) this;
        }

        public Criteria andMplaceEqualTo(String value) {
            addCriterion("mplace =", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotEqualTo(String value) {
            addCriterion("mplace <>", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceGreaterThan(String value) {
            addCriterion("mplace >", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceGreaterThanOrEqualTo(String value) {
            addCriterion("mplace >=", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceLessThan(String value) {
            addCriterion("mplace <", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceLessThanOrEqualTo(String value) {
            addCriterion("mplace <=", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceLike(String value) {
            addCriterion("mplace like", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotLike(String value) {
            addCriterion("mplace not like", value, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceIn(List<String> values) {
            addCriterion("mplace in", values, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotIn(List<String> values) {
            addCriterion("mplace not in", values, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceBetween(String value1, String value2) {
            addCriterion("mplace between", value1, value2, "mplace");
            return (Criteria) this;
        }

        public Criteria andMplaceNotBetween(String value1, String value2) {
            addCriterion("mplace not between", value1, value2, "mplace");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNull() {
            addCriterion("mtype is null");
            return (Criteria) this;
        }

        public Criteria andMtypeIsNotNull() {
            addCriterion("mtype is not null");
            return (Criteria) this;
        }

        public Criteria andMtypeEqualTo(String value) {
            addCriterion("mtype =", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotEqualTo(String value) {
            addCriterion("mtype <>", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThan(String value) {
            addCriterion("mtype >", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeGreaterThanOrEqualTo(String value) {
            addCriterion("mtype >=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThan(String value) {
            addCriterion("mtype <", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLessThanOrEqualTo(String value) {
            addCriterion("mtype <=", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeLike(String value) {
            addCriterion("mtype like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotLike(String value) {
            addCriterion("mtype not like", value, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeIn(List<String> values) {
            addCriterion("mtype in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotIn(List<String> values) {
            addCriterion("mtype not in", values, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeBetween(String value1, String value2) {
            addCriterion("mtype between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMtypeNotBetween(String value1, String value2) {
            addCriterion("mtype not between", value1, value2, "mtype");
            return (Criteria) this;
        }

        public Criteria andMpublishedIsNull() {
            addCriterion("mpublished is null");
            return (Criteria) this;
        }

        public Criteria andMpublishedIsNotNull() {
            addCriterion("mpublished is not null");
            return (Criteria) this;
        }

        public Criteria andMpublishedEqualTo(String value) {
            addCriterion("mpublished =", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedNotEqualTo(String value) {
            addCriterion("mpublished <>", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedGreaterThan(String value) {
            addCriterion("mpublished >", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedGreaterThanOrEqualTo(String value) {
            addCriterion("mpublished >=", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedLessThan(String value) {
            addCriterion("mpublished <", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedLessThanOrEqualTo(String value) {
            addCriterion("mpublished <=", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedLike(String value) {
            addCriterion("mpublished like", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedNotLike(String value) {
            addCriterion("mpublished not like", value, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedIn(List<String> values) {
            addCriterion("mpublished in", values, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedNotIn(List<String> values) {
            addCriterion("mpublished not in", values, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedBetween(String value1, String value2) {
            addCriterion("mpublished between", value1, value2, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMpublishedNotBetween(String value1, String value2) {
            addCriterion("mpublished not between", value1, value2, "mpublished");
            return (Criteria) this;
        }

        public Criteria andMdirectorIsNull() {
            addCriterion("mdirector is null");
            return (Criteria) this;
        }

        public Criteria andMdirectorIsNotNull() {
            addCriterion("mdirector is not null");
            return (Criteria) this;
        }

        public Criteria andMdirectorEqualTo(String value) {
            addCriterion("mdirector =", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotEqualTo(String value) {
            addCriterion("mdirector <>", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorGreaterThan(String value) {
            addCriterion("mdirector >", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorGreaterThanOrEqualTo(String value) {
            addCriterion("mdirector >=", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorLessThan(String value) {
            addCriterion("mdirector <", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorLessThanOrEqualTo(String value) {
            addCriterion("mdirector <=", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorLike(String value) {
            addCriterion("mdirector like", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotLike(String value) {
            addCriterion("mdirector not like", value, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorIn(List<String> values) {
            addCriterion("mdirector in", values, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotIn(List<String> values) {
            addCriterion("mdirector not in", values, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorBetween(String value1, String value2) {
            addCriterion("mdirector between", value1, value2, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMdirectorNotBetween(String value1, String value2) {
            addCriterion("mdirector not between", value1, value2, "mdirector");
            return (Criteria) this;
        }

        public Criteria andMscoreIsNull() {
            addCriterion("mscore is null");
            return (Criteria) this;
        }

        public Criteria andMscoreIsNotNull() {
            addCriterion("mscore is not null");
            return (Criteria) this;
        }

        public Criteria andMscoreEqualTo(BigDecimal value) {
            addCriterion("mscore =", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotEqualTo(BigDecimal value) {
            addCriterion("mscore <>", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreGreaterThan(BigDecimal value) {
            addCriterion("mscore >", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("mscore >=", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLessThan(BigDecimal value) {
            addCriterion("mscore <", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("mscore <=", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreIn(List<BigDecimal> values) {
            addCriterion("mscore in", values, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotIn(List<BigDecimal> values) {
            addCriterion("mscore not in", values, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mscore between", value1, value2, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("mscore not between", value1, value2, "mscore");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
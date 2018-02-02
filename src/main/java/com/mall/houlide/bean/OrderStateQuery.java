package com.mall.houlide.bean;

import java.util.ArrayList;
import java.util.List;

public class OrderStateQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public OrderStateQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
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

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        this.startRow = (pageNo - 1) * this.pageSize;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        this.startRow = (pageNo - 1) * this.pageSize;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
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

        public Criteria andStateIdIsNull() {
            addCriterion("state_id is null");
            return (Criteria) this;
        }

        public Criteria andStateIdIsNotNull() {
            addCriterion("state_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateIdEqualTo(String value) {
            addCriterion("state_id =", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotEqualTo(String value) {
            addCriterion("state_id <>", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThan(String value) {
            addCriterion("state_id >", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("state_id >=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThan(String value) {
            addCriterion("state_id <", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLessThanOrEqualTo(String value) {
            addCriterion("state_id <=", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdLike(String value) {
            addCriterion("state_id like", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotLike(String value) {
            addCriterion("state_id not like", value, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdIn(List<String> values) {
            addCriterion("state_id in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotIn(List<String> values) {
            addCriterion("state_id not in", values, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdBetween(String value1, String value2) {
            addCriterion("state_id between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateIdNotBetween(String value1, String value2) {
            addCriterion("state_id not between", value1, value2, "stateId");
            return (Criteria) this;
        }

        public Criteria andStateNameIsNull() {
            addCriterion("state_name is null");
            return (Criteria) this;
        }

        public Criteria andStateNameIsNotNull() {
            addCriterion("state_name is not null");
            return (Criteria) this;
        }

        public Criteria andStateNameEqualTo(String value) {
            addCriterion("state_name =", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotEqualTo(String value) {
            addCriterion("state_name <>", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameGreaterThan(String value) {
            addCriterion("state_name >", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("state_name >=", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLessThan(String value) {
            addCriterion("state_name <", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLessThanOrEqualTo(String value) {
            addCriterion("state_name <=", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameLike(String value) {
            addCriterion("state_name like", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotLike(String value) {
            addCriterion("state_name not like", value, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameIn(List<String> values) {
            addCriterion("state_name in", values, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotIn(List<String> values) {
            addCriterion("state_name not in", values, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameBetween(String value1, String value2) {
            addCriterion("state_name between", value1, value2, "stateName");
            return (Criteria) this;
        }

        public Criteria andStateNameNotBetween(String value1, String value2) {
            addCriterion("state_name not between", value1, value2, "stateName");
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
    }
}
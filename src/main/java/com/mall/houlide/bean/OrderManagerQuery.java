package com.mall.houlide.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderManagerQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public OrderManagerQuery() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNull() {
            addCriterion("order_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderNameIsNotNull() {
            addCriterion("order_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNameEqualTo(String value) {
            addCriterion("order_name =", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotEqualTo(String value) {
            addCriterion("order_name <>", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThan(String value) {
            addCriterion("order_name >", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_name >=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThan(String value) {
            addCriterion("order_name <", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLessThanOrEqualTo(String value) {
            addCriterion("order_name <=", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameLike(String value) {
            addCriterion("order_name like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotLike(String value) {
            addCriterion("order_name not like", value, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameIn(List<String> values) {
            addCriterion("order_name in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotIn(List<String> values) {
            addCriterion("order_name not in", values, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameBetween(String value1, String value2) {
            addCriterion("order_name between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderNameNotBetween(String value1, String value2) {
            addCriterion("order_name not between", value1, value2, "orderName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameIsNull() {
            addCriterion("order_buy_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameIsNotNull() {
            addCriterion("order_buy_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameEqualTo(String value) {
            addCriterion("order_buy_name =", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameNotEqualTo(String value) {
            addCriterion("order_buy_name <>", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameGreaterThan(String value) {
            addCriterion("order_buy_name >", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_buy_name >=", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameLessThan(String value) {
            addCriterion("order_buy_name <", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameLessThanOrEqualTo(String value) {
            addCriterion("order_buy_name <=", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameLike(String value) {
            addCriterion("order_buy_name like", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameNotLike(String value) {
            addCriterion("order_buy_name not like", value, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameIn(List<String> values) {
            addCriterion("order_buy_name in", values, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameNotIn(List<String> values) {
            addCriterion("order_buy_name not in", values, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameBetween(String value1, String value2) {
            addCriterion("order_buy_name between", value1, value2, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderBuyNameNotBetween(String value1, String value2) {
            addCriterion("order_buy_name not between", value1, value2, "orderBuyName");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateIsNull() {
            addCriterion("order_xs_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateIsNotNull() {
            addCriterion("order_xs_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateEqualTo(Boolean value) {
            addCriterion("order_xs_state =", value, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateNotEqualTo(Boolean value) {
            addCriterion("order_xs_state <>", value, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateGreaterThan(Boolean value) {
            addCriterion("order_xs_state >", value, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_xs_state >=", value, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateLessThan(Boolean value) {
            addCriterion("order_xs_state <", value, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateLessThanOrEqualTo(Boolean value) {
            addCriterion("order_xs_state <=", value, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateIn(List<Boolean> values) {
            addCriterion("order_xs_state in", values, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateNotIn(List<Boolean> values) {
            addCriterion("order_xs_state not in", values, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateBetween(Boolean value1, Boolean value2) {
            addCriterion("order_xs_state between", value1, value2, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderXsStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_xs_state not between", value1, value2, "orderXsState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateIsNull() {
            addCriterion("order_cg_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateIsNotNull() {
            addCriterion("order_cg_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateEqualTo(Boolean value) {
            addCriterion("order_cg_state =", value, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateNotEqualTo(Boolean value) {
            addCriterion("order_cg_state <>", value, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateGreaterThan(Boolean value) {
            addCriterion("order_cg_state >", value, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_cg_state >=", value, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateLessThan(Boolean value) {
            addCriterion("order_cg_state <", value, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateLessThanOrEqualTo(Boolean value) {
            addCriterion("order_cg_state <=", value, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateIn(List<Boolean> values) {
            addCriterion("order_cg_state in", values, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateNotIn(List<Boolean> values) {
            addCriterion("order_cg_state not in", values, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateBetween(Boolean value1, Boolean value2) {
            addCriterion("order_cg_state between", value1, value2, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderCgStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_cg_state not between", value1, value2, "orderCgState");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameIsNull() {
            addCriterion("order_dept_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameIsNotNull() {
            addCriterion("order_dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameEqualTo(String value) {
            addCriterion("order_dept_name =", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameNotEqualTo(String value) {
            addCriterion("order_dept_name <>", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameGreaterThan(String value) {
            addCriterion("order_dept_name >", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_dept_name >=", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameLessThan(String value) {
            addCriterion("order_dept_name <", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameLessThanOrEqualTo(String value) {
            addCriterion("order_dept_name <=", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameLike(String value) {
            addCriterion("order_dept_name like", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameNotLike(String value) {
            addCriterion("order_dept_name not like", value, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameIn(List<String> values) {
            addCriterion("order_dept_name in", values, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameNotIn(List<String> values) {
            addCriterion("order_dept_name not in", values, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameBetween(String value1, String value2) {
            addCriterion("order_dept_name between", value1, value2, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderDeptNameNotBetween(String value1, String value2) {
            addCriterion("order_dept_name not between", value1, value2, "orderDeptName");
            return (Criteria) this;
        }

        public Criteria andOrderZbjIsNull() {
            addCriterion("order_zbj is null");
            return (Criteria) this;
        }

        public Criteria andOrderZbjIsNotNull() {
            addCriterion("order_zbj is not null");
            return (Criteria) this;
        }

        public Criteria andOrderZbjEqualTo(String value) {
            addCriterion("order_zbj =", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjNotEqualTo(String value) {
            addCriterion("order_zbj <>", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjGreaterThan(String value) {
            addCriterion("order_zbj >", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjGreaterThanOrEqualTo(String value) {
            addCriterion("order_zbj >=", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjLessThan(String value) {
            addCriterion("order_zbj <", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjLessThanOrEqualTo(String value) {
            addCriterion("order_zbj <=", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjLike(String value) {
            addCriterion("order_zbj like", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjNotLike(String value) {
            addCriterion("order_zbj not like", value, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjIn(List<String> values) {
            addCriterion("order_zbj in", values, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjNotIn(List<String> values) {
            addCriterion("order_zbj not in", values, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjBetween(String value1, String value2) {
            addCriterion("order_zbj between", value1, value2, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjNotBetween(String value1, String value2) {
            addCriterion("order_zbj not between", value1, value2, "orderZbj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjIsNull() {
            addCriterion("order_zbjdqsj is null");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjIsNotNull() {
            addCriterion("order_zbjdqsj is not null");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjEqualTo(Date value) {
            addCriterionForJDBCDate("order_zbjdqsj =", value, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_zbjdqsj <>", value, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjGreaterThan(Date value) {
            addCriterionForJDBCDate("order_zbjdqsj >", value, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_zbjdqsj >=", value, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjLessThan(Date value) {
            addCriterionForJDBCDate("order_zbjdqsj <", value, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_zbjdqsj <=", value, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjIn(List<Date> values) {
            addCriterionForJDBCDate("order_zbjdqsj in", values, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_zbjdqsj not in", values, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_zbjdqsj between", value1, value2, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderZbjdqsjNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_zbjdqsj not between", value1, value2, "orderZbjdqsj");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqIsNull() {
            addCriterion("order_qdrq is null");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqIsNotNull() {
            addCriterion("order_qdrq is not null");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqEqualTo(Date value) {
            addCriterion("order_qdrq =", value, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqNotEqualTo(Date value) {
            addCriterion("order_qdrq <>", value, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqGreaterThan(Date value) {
            addCriterion("order_qdrq >", value, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqGreaterThanOrEqualTo(Date value) {
            addCriterion("order_qdrq >=", value, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqLessThan(Date value) {
            addCriterion("order_qdrq <", value, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqLessThanOrEqualTo(Date value) {
            addCriterion("order_qdrq <=", value, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqIn(List<Date> values) {
            addCriterion("order_qdrq in", values, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqNotIn(List<Date> values) {
            addCriterion("order_qdrq not in", values, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqBetween(Date value1, Date value2) {
            addCriterion("order_qdrq between", value1, value2, "orderQdrq");
            return (Criteria) this;
        }

        public Criteria andOrderQdrqNotBetween(Date value1, Date value2) {
            addCriterion("order_qdrq not between", value1, value2, "orderQdrq");
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

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
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
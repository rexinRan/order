package com.mall.houlide.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SaleOrderQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public SaleOrderQuery() {
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

        public Criteria andSaleorderIdIsNull() {
            addCriterion("SaleOrder_ID is null");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdIsNotNull() {
            addCriterion("SaleOrder_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdEqualTo(Integer value) {
            addCriterion("SaleOrder_ID =", value, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdNotEqualTo(Integer value) {
            addCriterion("SaleOrder_ID <>", value, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdGreaterThan(Integer value) {
            addCriterion("SaleOrder_ID >", value, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaleOrder_ID >=", value, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdLessThan(Integer value) {
            addCriterion("SaleOrder_ID <", value, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdLessThanOrEqualTo(Integer value) {
            addCriterion("SaleOrder_ID <=", value, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdIn(List<Integer> values) {
            addCriterion("SaleOrder_ID in", values, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdNotIn(List<Integer> values) {
            addCriterion("SaleOrder_ID not in", values, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdBetween(Integer value1, Integer value2) {
            addCriterion("SaleOrder_ID between", value1, value2, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andSaleorderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SaleOrder_ID not between", value1, value2, "saleorderId");
            return (Criteria) this;
        }

        public Criteria andWritedateIsNull() {
            addCriterion("WriteDate is null");
            return (Criteria) this;
        }

        public Criteria andWritedateIsNotNull() {
            addCriterion("WriteDate is not null");
            return (Criteria) this;
        }

        public Criteria andWritedateEqualTo(Date value) {
            addCriterion("WriteDate =", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateNotEqualTo(Date value) {
            addCriterion("WriteDate <>", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateGreaterThan(Date value) {
            addCriterion("WriteDate >", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateGreaterThanOrEqualTo(Date value) {
            addCriterion("WriteDate >=", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateLessThan(Date value) {
            addCriterion("WriteDate <", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateLessThanOrEqualTo(Date value) {
            addCriterion("WriteDate <=", value, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateIn(List<Date> values) {
            addCriterion("WriteDate in", values, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateNotIn(List<Date> values) {
            addCriterion("WriteDate not in", values, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateBetween(Date value1, Date value2) {
            addCriterion("WriteDate between", value1, value2, "writedate");
            return (Criteria) this;
        }

        public Criteria andWritedateNotBetween(Date value1, Date value2) {
            addCriterion("WriteDate not between", value1, value2, "writedate");
            return (Criteria) this;
        }

        public Criteria andInsuredateIsNull() {
            addCriterion("InsureDate is null");
            return (Criteria) this;
        }

        public Criteria andInsuredateIsNotNull() {
            addCriterion("InsureDate is not null");
            return (Criteria) this;
        }

        public Criteria andInsuredateEqualTo(Date value) {
            addCriterion("InsureDate =", value, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateNotEqualTo(Date value) {
            addCriterion("InsureDate <>", value, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateGreaterThan(Date value) {
            addCriterion("InsureDate >", value, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateGreaterThanOrEqualTo(Date value) {
            addCriterion("InsureDate >=", value, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateLessThan(Date value) {
            addCriterion("InsureDate <", value, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateLessThanOrEqualTo(Date value) {
            addCriterion("InsureDate <=", value, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateIn(List<Date> values) {
            addCriterion("InsureDate in", values, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateNotIn(List<Date> values) {
            addCriterion("InsureDate not in", values, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateBetween(Date value1, Date value2) {
            addCriterion("InsureDate between", value1, value2, "insuredate");
            return (Criteria) this;
        }

        public Criteria andInsuredateNotBetween(Date value1, Date value2) {
            addCriterion("InsureDate not between", value1, value2, "insuredate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("Dept_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("Dept_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Integer value) {
            addCriterion("Dept_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Integer value) {
            addCriterion("Dept_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Integer value) {
            addCriterion("Dept_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Dept_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Integer value) {
            addCriterion("Dept_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Integer value) {
            addCriterion("Dept_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Integer> values) {
            addCriterion("Dept_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Integer> values) {
            addCriterion("Dept_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Integer value1, Integer value2) {
            addCriterion("Dept_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Dept_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("Customer_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("Customer_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("Customer_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("Customer_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("Customer_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("Customer_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("Customer_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("Customer_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("Customer_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("Employee_ID is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("Employee_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("Employee_ID =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("Employee_ID <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("Employee_ID >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Employee_ID >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("Employee_ID <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Employee_ID <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("Employee_ID in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("Employee_ID not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("Employee_ID between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Employee_ID not between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateIsNull() {
            addCriterion("sale_order_state is null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateIsNotNull() {
            addCriterion("sale_order_state is not null");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateEqualTo(String value) {
            addCriterion("sale_order_state =", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateNotEqualTo(String value) {
            addCriterion("sale_order_state <>", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateGreaterThan(String value) {
            addCriterion("sale_order_state >", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateGreaterThanOrEqualTo(String value) {
            addCriterion("sale_order_state >=", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateLessThan(String value) {
            addCriterion("sale_order_state <", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateLessThanOrEqualTo(String value) {
            addCriterion("sale_order_state <=", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateLike(String value) {
            addCriterion("sale_order_state like", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateNotLike(String value) {
            addCriterion("sale_order_state not like", value, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateIn(List<String> values) {
            addCriterion("sale_order_state in", values, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateNotIn(List<String> values) {
            addCriterion("sale_order_state not in", values, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateBetween(String value1, String value2) {
            addCriterion("sale_order_state between", value1, value2, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andSaleOrderStateNotBetween(String value1, String value2) {
            addCriterion("sale_order_state not between", value1, value2, "saleOrderState");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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
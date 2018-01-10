package com.mall.houlide.bean;

import java.util.ArrayList;
import java.util.List;

public class EnterStockDetailQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public EnterStockDetailQuery() {
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

        public Criteria andEnterstockIdIsNull() {
            addCriterion("EnterStock_ID is null");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdIsNotNull() {
            addCriterion("EnterStock_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdEqualTo(Integer value) {
            addCriterion("EnterStock_ID =", value, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdNotEqualTo(Integer value) {
            addCriterion("EnterStock_ID <>", value, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdGreaterThan(Integer value) {
            addCriterion("EnterStock_ID >", value, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EnterStock_ID >=", value, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdLessThan(Integer value) {
            addCriterion("EnterStock_ID <", value, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("EnterStock_ID <=", value, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdIn(List<Integer> values) {
            addCriterion("EnterStock_ID in", values, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdNotIn(List<Integer> values) {
            addCriterion("EnterStock_ID not in", values, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdBetween(Integer value1, Integer value2) {
            addCriterion("EnterStock_ID between", value1, value2, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andEnterstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EnterStock_ID not between", value1, value2, "enterstockId");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("Product_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("Product_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("Product_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("Product_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("Product_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Product_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("Product_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("Product_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("Product_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("Product_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("Product_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Product_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceIsNull() {
            addCriterion("HaveInvoice is null");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceIsNotNull() {
            addCriterion("HaveInvoice is not null");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceEqualTo(Boolean value) {
            addCriterion("HaveInvoice =", value, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceNotEqualTo(Boolean value) {
            addCriterion("HaveInvoice <>", value, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceGreaterThan(Boolean value) {
            addCriterion("HaveInvoice >", value, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceGreaterThanOrEqualTo(Boolean value) {
            addCriterion("HaveInvoice >=", value, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceLessThan(Boolean value) {
            addCriterion("HaveInvoice <", value, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceLessThanOrEqualTo(Boolean value) {
            addCriterion("HaveInvoice <=", value, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceIn(List<Boolean> values) {
            addCriterion("HaveInvoice in", values, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceNotIn(List<Boolean> values) {
            addCriterion("HaveInvoice not in", values, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceBetween(Boolean value1, Boolean value2) {
            addCriterion("HaveInvoice between", value1, value2, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andHaveinvoiceNotBetween(Boolean value1, Boolean value2) {
            addCriterion("HaveInvoice not between", value1, value2, "haveinvoice");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNull() {
            addCriterion("InvoiceNum is null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIsNotNull() {
            addCriterion("InvoiceNum is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicenumEqualTo(String value) {
            addCriterion("InvoiceNum =", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotEqualTo(String value) {
            addCriterion("InvoiceNum <>", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThan(String value) {
            addCriterion("InvoiceNum >", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumGreaterThanOrEqualTo(String value) {
            addCriterion("InvoiceNum >=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThan(String value) {
            addCriterion("InvoiceNum <", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLessThanOrEqualTo(String value) {
            addCriterion("InvoiceNum <=", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumLike(String value) {
            addCriterion("InvoiceNum like", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotLike(String value) {
            addCriterion("InvoiceNum not like", value, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumIn(List<String> values) {
            addCriterion("InvoiceNum in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotIn(List<String> values) {
            addCriterion("InvoiceNum not in", values, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumBetween(String value1, String value2) {
            addCriterion("InvoiceNum between", value1, value2, "invoicenum");
            return (Criteria) this;
        }

        public Criteria andInvoicenumNotBetween(String value1, String value2) {
            addCriterion("InvoiceNum not between", value1, value2, "invoicenum");
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
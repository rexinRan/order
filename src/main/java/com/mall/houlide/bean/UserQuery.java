package com.mall.houlide.bean;

import java.util.ArrayList;
import java.util.List;

public class UserQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public UserQuery() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("User_Id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("User_Id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNull() {
            addCriterion("User_Pwd is null");
            return (Criteria) this;
        }

        public Criteria andUserPwdIsNotNull() {
            addCriterion("User_Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andUserPwdEqualTo(String value) {
            addCriterion("User_Pwd =", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotEqualTo(String value) {
            addCriterion("User_Pwd <>", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThan(String value) {
            addCriterion("User_Pwd >", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdGreaterThanOrEqualTo(String value) {
            addCriterion("User_Pwd >=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThan(String value) {
            addCriterion("User_Pwd <", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLessThanOrEqualTo(String value) {
            addCriterion("User_Pwd <=", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdLike(String value) {
            addCriterion("User_Pwd like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotLike(String value) {
            addCriterion("User_Pwd not like", value, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdIn(List<String> values) {
            addCriterion("User_Pwd in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotIn(List<String> values) {
            addCriterion("User_Pwd not in", values, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdBetween(String value1, String value2) {
            addCriterion("User_Pwd between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andUserPwdNotBetween(String value1, String value2) {
            addCriterion("User_Pwd not between", value1, value2, "userPwd");
            return (Criteria) this;
        }

        public Criteria andBelGroupIsNull() {
            addCriterion("Bel_Group is null");
            return (Criteria) this;
        }

        public Criteria andBelGroupIsNotNull() {
            addCriterion("Bel_Group is not null");
            return (Criteria) this;
        }

        public Criteria andBelGroupEqualTo(String value) {
            addCriterion("Bel_Group =", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupNotEqualTo(String value) {
            addCriterion("Bel_Group <>", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupGreaterThan(String value) {
            addCriterion("Bel_Group >", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupGreaterThanOrEqualTo(String value) {
            addCriterion("Bel_Group >=", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupLessThan(String value) {
            addCriterion("Bel_Group <", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupLessThanOrEqualTo(String value) {
            addCriterion("Bel_Group <=", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupLike(String value) {
            addCriterion("Bel_Group like", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupNotLike(String value) {
            addCriterion("Bel_Group not like", value, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupIn(List<String> values) {
            addCriterion("Bel_Group in", values, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupNotIn(List<String> values) {
            addCriterion("Bel_Group not in", values, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupBetween(String value1, String value2) {
            addCriterion("Bel_Group between", value1, value2, "belGroup");
            return (Criteria) this;
        }

        public Criteria andBelGroupNotBetween(String value1, String value2) {
            addCriterion("Bel_Group not between", value1, value2, "belGroup");
            return (Criteria) this;
        }

        public Criteria andDivTypeIsNull() {
            addCriterion("Div_Type is null");
            return (Criteria) this;
        }

        public Criteria andDivTypeIsNotNull() {
            addCriterion("Div_Type is not null");
            return (Criteria) this;
        }

        public Criteria andDivTypeEqualTo(String value) {
            addCriterion("Div_Type =", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeNotEqualTo(String value) {
            addCriterion("Div_Type <>", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeGreaterThan(String value) {
            addCriterion("Div_Type >", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Div_Type >=", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeLessThan(String value) {
            addCriterion("Div_Type <", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeLessThanOrEqualTo(String value) {
            addCriterion("Div_Type <=", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeLike(String value) {
            addCriterion("Div_Type like", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeNotLike(String value) {
            addCriterion("Div_Type not like", value, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeIn(List<String> values) {
            addCriterion("Div_Type in", values, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeNotIn(List<String> values) {
            addCriterion("Div_Type not in", values, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeBetween(String value1, String value2) {
            addCriterion("Div_Type between", value1, value2, "divType");
            return (Criteria) this;
        }

        public Criteria andDivTypeNotBetween(String value1, String value2) {
            addCriterion("Div_Type not between", value1, value2, "divType");
            return (Criteria) this;
        }

        public Criteria andUserAuthIsNull() {
            addCriterion("User_Auth is null");
            return (Criteria) this;
        }

        public Criteria andUserAuthIsNotNull() {
            addCriterion("User_Auth is not null");
            return (Criteria) this;
        }

        public Criteria andUserAuthEqualTo(String value) {
            addCriterion("User_Auth =", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotEqualTo(String value) {
            addCriterion("User_Auth <>", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthGreaterThan(String value) {
            addCriterion("User_Auth >", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthGreaterThanOrEqualTo(String value) {
            addCriterion("User_Auth >=", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLessThan(String value) {
            addCriterion("User_Auth <", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLessThanOrEqualTo(String value) {
            addCriterion("User_Auth <=", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthLike(String value) {
            addCriterion("User_Auth like", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotLike(String value) {
            addCriterion("User_Auth not like", value, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthIn(List<String> values) {
            addCriterion("User_Auth in", values, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotIn(List<String> values) {
            addCriterion("User_Auth not in", values, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthBetween(String value1, String value2) {
            addCriterion("User_Auth between", value1, value2, "userAuth");
            return (Criteria) this;
        }

        public Criteria andUserAuthNotBetween(String value1, String value2) {
            addCriterion("User_Auth not between", value1, value2, "userAuth");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNull() {
            addCriterion("Auth_Type is null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIsNotNull() {
            addCriterion("Auth_Type is not null");
            return (Criteria) this;
        }

        public Criteria andAuthTypeEqualTo(String value) {
            addCriterion("Auth_Type =", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotEqualTo(String value) {
            addCriterion("Auth_Type <>", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThan(String value) {
            addCriterion("Auth_Type >", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Auth_Type >=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThan(String value) {
            addCriterion("Auth_Type <", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLessThanOrEqualTo(String value) {
            addCriterion("Auth_Type <=", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeLike(String value) {
            addCriterion("Auth_Type like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotLike(String value) {
            addCriterion("Auth_Type not like", value, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeIn(List<String> values) {
            addCriterion("Auth_Type in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotIn(List<String> values) {
            addCriterion("Auth_Type not in", values, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeBetween(String value1, String value2) {
            addCriterion("Auth_Type between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andAuthTypeNotBetween(String value1, String value2) {
            addCriterion("Auth_Type not between", value1, value2, "authType");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("User_Status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("User_Status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(String value) {
            addCriterion("User_Status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(String value) {
            addCriterion("User_Status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(String value) {
            addCriterion("User_Status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(String value) {
            addCriterion("User_Status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(String value) {
            addCriterion("User_Status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(String value) {
            addCriterion("User_Status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLike(String value) {
            addCriterion("User_Status like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotLike(String value) {
            addCriterion("User_Status not like", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<String> values) {
            addCriterion("User_Status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<String> values) {
            addCriterion("User_Status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(String value1, String value2) {
            addCriterion("User_Status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(String value1, String value2) {
            addCriterion("User_Status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("Create_User is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("Create_User is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("Create_User =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("Create_User <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("Create_User >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("Create_User >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("Create_User <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("Create_User <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("Create_User like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("Create_User not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("Create_User in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("Create_User not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("Create_User between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("Create_User not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("Create_Date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("Create_Date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("Create_Date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("Create_Date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("Create_Date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("Create_Date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("Create_Date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("Create_Date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("Create_Date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("Create_Date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("Create_Date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("Create_Date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("Create_Date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("Create_Date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("Create_Time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("Create_Time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andApprUserIsNull() {
            addCriterion("Appr_User is null");
            return (Criteria) this;
        }

        public Criteria andApprUserIsNotNull() {
            addCriterion("Appr_User is not null");
            return (Criteria) this;
        }

        public Criteria andApprUserEqualTo(String value) {
            addCriterion("Appr_User =", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserNotEqualTo(String value) {
            addCriterion("Appr_User <>", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserGreaterThan(String value) {
            addCriterion("Appr_User >", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserGreaterThanOrEqualTo(String value) {
            addCriterion("Appr_User >=", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserLessThan(String value) {
            addCriterion("Appr_User <", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserLessThanOrEqualTo(String value) {
            addCriterion("Appr_User <=", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserLike(String value) {
            addCriterion("Appr_User like", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserNotLike(String value) {
            addCriterion("Appr_User not like", value, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserIn(List<String> values) {
            addCriterion("Appr_User in", values, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserNotIn(List<String> values) {
            addCriterion("Appr_User not in", values, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserBetween(String value1, String value2) {
            addCriterion("Appr_User between", value1, value2, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprUserNotBetween(String value1, String value2) {
            addCriterion("Appr_User not between", value1, value2, "apprUser");
            return (Criteria) this;
        }

        public Criteria andApprDateIsNull() {
            addCriterion("Appr_Date is null");
            return (Criteria) this;
        }

        public Criteria andApprDateIsNotNull() {
            addCriterion("Appr_Date is not null");
            return (Criteria) this;
        }

        public Criteria andApprDateEqualTo(String value) {
            addCriterion("Appr_Date =", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateNotEqualTo(String value) {
            addCriterion("Appr_Date <>", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateGreaterThan(String value) {
            addCriterion("Appr_Date >", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateGreaterThanOrEqualTo(String value) {
            addCriterion("Appr_Date >=", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateLessThan(String value) {
            addCriterion("Appr_Date <", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateLessThanOrEqualTo(String value) {
            addCriterion("Appr_Date <=", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateLike(String value) {
            addCriterion("Appr_Date like", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateNotLike(String value) {
            addCriterion("Appr_Date not like", value, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateIn(List<String> values) {
            addCriterion("Appr_Date in", values, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateNotIn(List<String> values) {
            addCriterion("Appr_Date not in", values, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateBetween(String value1, String value2) {
            addCriterion("Appr_Date between", value1, value2, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprDateNotBetween(String value1, String value2) {
            addCriterion("Appr_Date not between", value1, value2, "apprDate");
            return (Criteria) this;
        }

        public Criteria andApprTimeIsNull() {
            addCriterion("Appr_Time is null");
            return (Criteria) this;
        }

        public Criteria andApprTimeIsNotNull() {
            addCriterion("Appr_Time is not null");
            return (Criteria) this;
        }

        public Criteria andApprTimeEqualTo(String value) {
            addCriterion("Appr_Time =", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotEqualTo(String value) {
            addCriterion("Appr_Time <>", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeGreaterThan(String value) {
            addCriterion("Appr_Time >", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeGreaterThanOrEqualTo(String value) {
            addCriterion("Appr_Time >=", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeLessThan(String value) {
            addCriterion("Appr_Time <", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeLessThanOrEqualTo(String value) {
            addCriterion("Appr_Time <=", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeLike(String value) {
            addCriterion("Appr_Time like", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotLike(String value) {
            addCriterion("Appr_Time not like", value, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeIn(List<String> values) {
            addCriterion("Appr_Time in", values, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotIn(List<String> values) {
            addCriterion("Appr_Time not in", values, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeBetween(String value1, String value2) {
            addCriterion("Appr_Time between", value1, value2, "apprTime");
            return (Criteria) this;
        }

        public Criteria andApprTimeNotBetween(String value1, String value2) {
            addCriterion("Appr_Time not between", value1, value2, "apprTime");
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
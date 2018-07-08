package com.xianxian.power.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ButieTongjiYuebao_Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ButieTongjiYuebao_Example() {
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

        public Criteria andIndexidIsNull() {
            addCriterion("indexId is null");
            return (Criteria) this;
        }

        public Criteria andIndexidIsNotNull() {
            addCriterion("indexId is not null");
            return (Criteria) this;
        }

        public Criteria andIndexidEqualTo(Integer value) {
            addCriterion("indexId =", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotEqualTo(Integer value) {
            addCriterion("indexId <>", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidGreaterThan(Integer value) {
            addCriterion("indexId >", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidGreaterThanOrEqualTo(Integer value) {
            addCriterion("indexId >=", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLessThan(Integer value) {
            addCriterion("indexId <", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidLessThanOrEqualTo(Integer value) {
            addCriterion("indexId <=", value, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidIn(List<Integer> values) {
            addCriterion("indexId in", values, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotIn(List<Integer> values) {
            addCriterion("indexId not in", values, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidBetween(Integer value1, Integer value2) {
            addCriterion("indexId between", value1, value2, "indexid");
            return (Criteria) this;
        }

        public Criteria andIndexidNotBetween(Integer value1, Integer value2) {
            addCriterion("indexId not between", value1, value2, "indexid");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("CUSTOMER_ID like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("CUSTOMER_ID not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andDatePeriodIsNull() {
            addCriterion("DATE_PERIOD is null");
            return (Criteria) this;
        }

        public Criteria andDatePeriodIsNotNull() {
            addCriterion("DATE_PERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andDatePeriodEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_PERIOD =", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodNotEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_PERIOD <>", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodGreaterThan(Date value) {
            addCriterionForJDBCDate("DATE_PERIOD >", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_PERIOD >=", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodLessThan(Date value) {
            addCriterionForJDBCDate("DATE_PERIOD <", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DATE_PERIOD <=", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_PERIOD in", values, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodNotIn(List<Date> values) {
            addCriterionForJDBCDate("DATE_PERIOD not in", values, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_PERIOD between", value1, value2, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DATE_PERIOD not between", value1, value2, "datePeriod");
            return (Criteria) this;
        }
        

        public Criteria andDanweiIsNull() {
            addCriterion("DANWEI is null");
            return (Criteria) this;
        }

        public Criteria andDanweiIsNotNull() {
            addCriterion("DANWEI is not null");
            return (Criteria) this;
        }

        public Criteria andDanweiEqualTo(String value) {
            addCriterion("DANWEI =", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotEqualTo(String value) {
            addCriterion("DANWEI <>", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThan(String value) {
            addCriterion("DANWEI >", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiGreaterThanOrEqualTo(String value) {
            addCriterion("DANWEI >=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThan(String value) {
            addCriterion("DANWEI <", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLessThanOrEqualTo(String value) {
            addCriterion("DANWEI <=", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiLike(String value) {
            addCriterion("DANWEI like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotLike(String value) {
            addCriterion("DANWEI not like", value, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiIn(List<String> values) {
            addCriterion("DANWEI in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotIn(List<String> values) {
            addCriterion("DANWEI not in", values, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiBetween(String value1, String value2) {
            addCriterion("DANWEI between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andDanweiNotBetween(String value1, String value2) {
            addCriterion("DANWEI not between", value1, value2, "danwei");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiIsNull() {
            addCriterion("XIAONA_FANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiIsNotNull() {
            addCriterion("XIAONA_FANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiEqualTo(String value) {
            addCriterion("XIAONA_FANGSHI =", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiNotEqualTo(String value) {
            addCriterion("XIAONA_FANGSHI <>", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiGreaterThan(String value) {
            addCriterion("XIAONA_FANGSHI >", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiGreaterThanOrEqualTo(String value) {
            addCriterion("XIAONA_FANGSHI >=", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiLessThan(String value) {
            addCriterion("XIAONA_FANGSHI <", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiLessThanOrEqualTo(String value) {
            addCriterion("XIAONA_FANGSHI <=", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiLike(String value) {
            addCriterion("XIAONA_FANGSHI like", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiNotLike(String value) {
            addCriterion("XIAONA_FANGSHI not like", value, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiIn(List<String> values) {
            addCriterion("XIAONA_FANGSHI in", values, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiNotIn(List<String> values) {
            addCriterion("XIAONA_FANGSHI not in", values, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiBetween(String value1, String value2) {
            addCriterion("XIAONA_FANGSHI between", value1, value2, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andXiaonaFangshiNotBetween(String value1, String value2) {
            addCriterion("XIAONA_FANGSHI not between", value1, value2, "xiaonaFangshi");
            return (Criteria) this;
        }

        public Criteria andFaDianliangIsNull() {
            addCriterion("FA_DIANLIANG is null");
            return (Criteria) this;
        }

        public Criteria andFaDianliangIsNotNull() {
            addCriterion("FA_DIANLIANG is not null");
            return (Criteria) this;
        }

        public Criteria andFaDianliangEqualTo(Float value) {
            addCriterion("FA_DIANLIANG =", value, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangNotEqualTo(Float value) {
            addCriterion("FA_DIANLIANG <>", value, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangGreaterThan(Float value) {
            addCriterion("FA_DIANLIANG >", value, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangGreaterThanOrEqualTo(Float value) {
            addCriterion("FA_DIANLIANG >=", value, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangLessThan(Float value) {
            addCriterion("FA_DIANLIANG <", value, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangLessThanOrEqualTo(Float value) {
            addCriterion("FA_DIANLIANG <=", value, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangIn(List<Float> values) {
            addCriterion("FA_DIANLIANG in", values, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangNotIn(List<Float> values) {
            addCriterion("FA_DIANLIANG not in", values, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangBetween(Float value1, Float value2) {
            addCriterion("FA_DIANLIANG between", value1, value2, "faDianliang");
            return (Criteria) this;
        }

        public Criteria andFaDianliangNotBetween(Float value1, Float value2) {
            addCriterion("FA_DIANLIANG not between", value1, value2, "faDianliang");
            return (Criteria) this;
        }

      

        public Criteria andYingfuDianfeiIsNull() {
            addCriterion("YINGFU_DIANFEI is null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiIsNotNull() {
            addCriterion("YINGFU_DIANFEI is not null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI =", value, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiNotEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI <>", value, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiGreaterThan(Float value) {
            addCriterion("YINGFU_DIANFEI >", value, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiGreaterThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI >=", value, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiLessThan(Float value) {
            addCriterion("YINGFU_DIANFEI <", value, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiLessThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI <=", value, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI in", values, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiNotIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI not in", values, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI between", value1, value2, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiNotBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI not between", value1, value2, "yingfuDianfei");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("CUSTOMER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("CUSTOMER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("CUSTOMER_ADDRESS >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("CUSTOMER_ADDRESS <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_ADDRESS <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("CUSTOMER_ADDRESS like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("CUSTOMER_ADDRESS not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("CUSTOMER_ADDRESS not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_ADDRESS not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andContactCapacityIsNull() {
            addCriterion("CONTACT_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andContactCapacityIsNotNull() {
            addCriterion("CONTACT_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andContactCapacityEqualTo(Float value) {
            addCriterion("CONTACT_CAPACITY =", value, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityNotEqualTo(Float value) {
            addCriterion("CONTACT_CAPACITY <>", value, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityGreaterThan(Float value) {
            addCriterion("CONTACT_CAPACITY >", value, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityGreaterThanOrEqualTo(Float value) {
            addCriterion("CONTACT_CAPACITY >=", value, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityLessThan(Float value) {
            addCriterion("CONTACT_CAPACITY <", value, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityLessThanOrEqualTo(Float value) {
            addCriterion("CONTACT_CAPACITY <=", value, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityIn(List<Float> values) {
            addCriterion("CONTACT_CAPACITY in", values, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityNotIn(List<Float> values) {
            addCriterion("CONTACT_CAPACITY not in", values, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityBetween(Float value1, Float value2) {
            addCriterion("CONTACT_CAPACITY between", value1, value2, "contactCapacity");
            return (Criteria) this;
        }

        public Criteria andContactCapacityNotBetween(Float value1, Float value2) {
            addCriterion("CONTACT_CAPACITY not between", value1, value2, "contactCapacity");
            return (Criteria) this;
        }
        public Criteria andIdentifyNumberIsNull() {
            addCriterion("IDENTIFY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIsNotNull() {
            addCriterion("IDENTIFY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberEqualTo(String value) {
            addCriterion("IDENTIFY_NUMBER =", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotEqualTo(String value) {
            addCriterion("IDENTIFY_NUMBER <>", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberGreaterThan(String value) {
            addCriterion("IDENTIFY_NUMBER >", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_NUMBER >=", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLessThan(String value) {
            addCriterion("IDENTIFY_NUMBER <", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_NUMBER <=", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberLike(String value) {
            addCriterion("IDENTIFY_NUMBER like", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotLike(String value) {
            addCriterion("IDENTIFY_NUMBER not like", value, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberIn(List<String> values) {
            addCriterion("IDENTIFY_NUMBER in", values, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotIn(List<String> values) {
            addCriterion("IDENTIFY_NUMBER not in", values, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberBetween(String value1, String value2) {
            addCriterion("IDENTIFY_NUMBER between", value1, value2, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyNumberNotBetween(String value1, String value2) {
            addCriterion("IDENTIFY_NUMBER not between", value1, value2, "identifyNumber");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("BANK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("BANK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("BANK_NAME =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("BANK_NAME <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("BANK_NAME >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NAME >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("BANK_NAME <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("BANK_NAME <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("BANK_NAME like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("BANK_NAME not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("BANK_NAME in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("BANK_NAME not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("BANK_NAME between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("BANK_NAME not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("BANK_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("BANK_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("BANK_ACCOUNT =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("BANK_ACCOUNT >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("BANK_ACCOUNT <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("BANK_ACCOUNT <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("BANK_ACCOUNT like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("BANK_ACCOUNT not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("BANK_ACCOUNT in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("BANK_ACCOUNT not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("BANK_ACCOUNT not between", value1, value2, "bankAccount");
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
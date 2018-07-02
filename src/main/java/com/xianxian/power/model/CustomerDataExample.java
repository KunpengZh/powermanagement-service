package com.xianxian.power.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerDataExample() {
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

        public Criteria andCusomerNameIsNull() {
            addCriterion("CUSOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCusomerNameIsNotNull() {
            addCriterion("CUSOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCusomerNameEqualTo(String value) {
            addCriterion("CUSOMER_NAME =", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameNotEqualTo(String value) {
            addCriterion("CUSOMER_NAME <>", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameGreaterThan(String value) {
            addCriterion("CUSOMER_NAME >", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSOMER_NAME >=", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameLessThan(String value) {
            addCriterion("CUSOMER_NAME <", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSOMER_NAME <=", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameLike(String value) {
            addCriterion("CUSOMER_NAME like", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameNotLike(String value) {
            addCriterion("CUSOMER_NAME not like", value, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameIn(List<String> values) {
            addCriterion("CUSOMER_NAME in", values, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameNotIn(List<String> values) {
            addCriterion("CUSOMER_NAME not in", values, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameBetween(String value1, String value2) {
            addCriterion("CUSOMER_NAME between", value1, value2, "cusomerName");
            return (Criteria) this;
        }

        public Criteria andCusomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSOMER_NAME not between", value1, value2, "cusomerName");
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
            addCriterion("DATE_PERIOD =", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodNotEqualTo(Date value) {
            addCriterion("DATE_PERIOD <>", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodGreaterThan(Date value) {
            addCriterion("DATE_PERIOD >", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodGreaterThanOrEqualTo(Date value) {
            addCriterion("DATE_PERIOD >=", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodLessThan(Date value) {
            addCriterion("DATE_PERIOD <", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodLessThanOrEqualTo(Date value) {
            addCriterion("DATE_PERIOD <=", value, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodIn(List<Date> values) {
            addCriterion("DATE_PERIOD in", values, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodNotIn(List<Date> values) {
            addCriterion("DATE_PERIOD not in", values, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodBetween(Date value1, Date value2) {
            addCriterion("DATE_PERIOD between", value1, value2, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andDatePeriodNotBetween(Date value1, Date value2) {
            addCriterion("DATE_PERIOD not between", value1, value2, "datePeriod");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryIsNull() {
            addCriterion("SALE_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryIsNotNull() {
            addCriterion("SALE_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryEqualTo(String value) {
            addCriterion("SALE_CATEGORY =", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryNotEqualTo(String value) {
            addCriterion("SALE_CATEGORY <>", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryGreaterThan(String value) {
            addCriterion("SALE_CATEGORY >", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("SALE_CATEGORY >=", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryLessThan(String value) {
            addCriterion("SALE_CATEGORY <", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryLessThanOrEqualTo(String value) {
            addCriterion("SALE_CATEGORY <=", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryLike(String value) {
            addCriterion("SALE_CATEGORY like", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryNotLike(String value) {
            addCriterion("SALE_CATEGORY not like", value, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryIn(List<String> values) {
            addCriterion("SALE_CATEGORY in", values, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryNotIn(List<String> values) {
            addCriterion("SALE_CATEGORY not in", values, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryBetween(String value1, String value2) {
            addCriterion("SALE_CATEGORY between", value1, value2, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andSaleCategoryNotBetween(String value1, String value2) {
            addCriterion("SALE_CATEGORY not between", value1, value2, "saleCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNull() {
            addCriterion("CUSTOMER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIsNotNull() {
            addCriterion("CUSTOMER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS =", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS <>", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThan(String value) {
            addCriterion("CUSTOMER_STATUS >", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS >=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThan(String value) {
            addCriterion("CUSTOMER_STATUS <", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_STATUS <=", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusLike(String value) {
            addCriterion("CUSTOMER_STATUS like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotLike(String value) {
            addCriterion("CUSTOMER_STATUS not like", value, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIn(List<String> values) {
            addCriterion("CUSTOMER_STATUS in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotIn(List<String> values) {
            addCriterion("CUSTOMER_STATUS not in", values, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATUS between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_STATUS not between", value1, value2, "customerStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryIsNull() {
            addCriterion("CUSTOMER_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryIsNotNull() {
            addCriterion("CUSTOMER_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryEqualTo(String value) {
            addCriterion("CUSTOMER_CATEGORY =", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryNotEqualTo(String value) {
            addCriterion("CUSTOMER_CATEGORY <>", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryGreaterThan(String value) {
            addCriterion("CUSTOMER_CATEGORY >", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CATEGORY >=", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryLessThan(String value) {
            addCriterion("CUSTOMER_CATEGORY <", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_CATEGORY <=", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryLike(String value) {
            addCriterion("CUSTOMER_CATEGORY like", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryNotLike(String value) {
            addCriterion("CUSTOMER_CATEGORY not like", value, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryIn(List<String> values) {
            addCriterion("CUSTOMER_CATEGORY in", values, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryNotIn(List<String> values) {
            addCriterion("CUSTOMER_CATEGORY not in", values, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CATEGORY between", value1, value2, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andCustomerCategoryNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_CATEGORY not between", value1, value2, "customerCategory");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelIsNull() {
            addCriterion("ZHONGYANG_BUZHU_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelIsNotNull() {
            addCriterion("ZHONGYANG_BUZHU_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelEqualTo(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL =", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelNotEqualTo(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL <>", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelGreaterThan(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL >", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelGreaterThanOrEqualTo(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL >=", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelLessThan(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL <", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelLessThanOrEqualTo(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL <=", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelLike(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL like", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelNotLike(String value) {
            addCriterion("ZHONGYANG_BUZHU_MODEL not like", value, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelIn(List<String> values) {
            addCriterion("ZHONGYANG_BUZHU_MODEL in", values, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelNotIn(List<String> values) {
            addCriterion("ZHONGYANG_BUZHU_MODEL not in", values, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelBetween(String value1, String value2) {
            addCriterion("ZHONGYANG_BUZHU_MODEL between", value1, value2, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuModelNotBetween(String value1, String value2) {
            addCriterion("ZHONGYANG_BUZHU_MODEL not between", value1, value2, "zhongyangBuzhuModel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("INVOICE_TYPE like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("INVOICE_TYPE not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvIsNull() {
            addCriterion("CUSTOMER_SHUILV is null");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvIsNotNull() {
            addCriterion("CUSTOMER_SHUILV is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvEqualTo(Float value) {
            addCriterion("CUSTOMER_SHUILV =", value, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvNotEqualTo(Float value) {
            addCriterion("CUSTOMER_SHUILV <>", value, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvGreaterThan(Float value) {
            addCriterion("CUSTOMER_SHUILV >", value, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvGreaterThanOrEqualTo(Float value) {
            addCriterion("CUSTOMER_SHUILV >=", value, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvLessThan(Float value) {
            addCriterion("CUSTOMER_SHUILV <", value, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvLessThanOrEqualTo(Float value) {
            addCriterion("CUSTOMER_SHUILV <=", value, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvIn(List<Float> values) {
            addCriterion("CUSTOMER_SHUILV in", values, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvNotIn(List<Float> values) {
            addCriterion("CUSTOMER_SHUILV not in", values, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvBetween(Float value1, Float value2) {
            addCriterion("CUSTOMER_SHUILV between", value1, value2, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andCustomerShuilvNotBetween(Float value1, Float value2) {
            addCriterion("CUSTOMER_SHUILV not between", value1, value2, "customerShuilv");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataIsNull() {
            addCriterion("SHANGWANG_POWER_DATA is null");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataIsNotNull() {
            addCriterion("SHANGWANG_POWER_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataEqualTo(Float value) {
            addCriterion("SHANGWANG_POWER_DATA =", value, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataNotEqualTo(Float value) {
            addCriterion("SHANGWANG_POWER_DATA <>", value, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataGreaterThan(Float value) {
            addCriterion("SHANGWANG_POWER_DATA >", value, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataGreaterThanOrEqualTo(Float value) {
            addCriterion("SHANGWANG_POWER_DATA >=", value, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataLessThan(Float value) {
            addCriterion("SHANGWANG_POWER_DATA <", value, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataLessThanOrEqualTo(Float value) {
            addCriterion("SHANGWANG_POWER_DATA <=", value, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataIn(List<Float> values) {
            addCriterion("SHANGWANG_POWER_DATA in", values, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataNotIn(List<Float> values) {
            addCriterion("SHANGWANG_POWER_DATA not in", values, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataBetween(Float value1, Float value2) {
            addCriterion("SHANGWANG_POWER_DATA between", value1, value2, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPowerDataNotBetween(Float value1, Float value2) {
            addCriterion("SHANGWANG_POWER_DATA not between", value1, value2, "shangwangPowerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataIsNull() {
            addCriterion("POWER_DATA is null");
            return (Criteria) this;
        }

        public Criteria andPowerDataIsNotNull() {
            addCriterion("POWER_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andPowerDataEqualTo(Float value) {
            addCriterion("POWER_DATA =", value, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataNotEqualTo(Float value) {
            addCriterion("POWER_DATA <>", value, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataGreaterThan(Float value) {
            addCriterion("POWER_DATA >", value, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataGreaterThanOrEqualTo(Float value) {
            addCriterion("POWER_DATA >=", value, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataLessThan(Float value) {
            addCriterion("POWER_DATA <", value, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataLessThanOrEqualTo(Float value) {
            addCriterion("POWER_DATA <=", value, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataIn(List<Float> values) {
            addCriterion("POWER_DATA in", values, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataNotIn(List<Float> values) {
            addCriterion("POWER_DATA not in", values, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataBetween(Float value1, Float value2) {
            addCriterion("POWER_DATA between", value1, value2, "powerData");
            return (Criteria) this;
        }

        public Criteria andPowerDataNotBetween(Float value1, Float value2) {
            addCriterion("POWER_DATA not between", value1, value2, "powerData");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceIsNull() {
            addCriterion("SHANGWANG_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceIsNotNull() {
            addCriterion("SHANGWANG_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceEqualTo(Float value) {
            addCriterion("SHANGWANG_PRICE =", value, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceNotEqualTo(Float value) {
            addCriterion("SHANGWANG_PRICE <>", value, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceGreaterThan(Float value) {
            addCriterion("SHANGWANG_PRICE >", value, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("SHANGWANG_PRICE >=", value, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceLessThan(Float value) {
            addCriterion("SHANGWANG_PRICE <", value, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceLessThanOrEqualTo(Float value) {
            addCriterion("SHANGWANG_PRICE <=", value, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceIn(List<Float> values) {
            addCriterion("SHANGWANG_PRICE in", values, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceNotIn(List<Float> values) {
            addCriterion("SHANGWANG_PRICE not in", values, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceBetween(Float value1, Float value2) {
            addCriterion("SHANGWANG_PRICE between", value1, value2, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andShangwangPriceNotBetween(Float value1, Float value2) {
            addCriterion("SHANGWANG_PRICE not between", value1, value2, "shangwangPrice");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoIsNull() {
            addCriterion("YINGFU_DIANFEI_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoIsNotNull() {
            addCriterion("YINGFU_DIANFEI_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO =", value, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoNotEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO <>", value, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoGreaterThan(Float value) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO >", value, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO >=", value, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoLessThan(Float value) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO <", value, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO <=", value, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO in", values, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoNotIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO not in", values, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO between", value1, value2, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_YINGXIAO not between", value1, value2, "yingfuDianfeiYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuIsNull() {
            addCriterion("YINGFU_DIANFEI_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuIsNotNull() {
            addCriterion("YINGFU_DIANFEI_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_CAIWU =", value, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuNotEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_CAIWU <>", value, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuGreaterThan(Float value) {
            addCriterion("YINGFU_DIANFEI_CAIWU >", value, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_CAIWU >=", value, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuLessThan(Float value) {
            addCriterion("YINGFU_DIANFEI_CAIWU <", value, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_CAIWU <=", value, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_CAIWU in", values, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuNotIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_CAIWU not in", values, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_CAIWU between", value1, value2, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_CAIWU not between", value1, value2, "yingfuDianfeiCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoIsNull() {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoIsNotNull() {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO =", value, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoNotEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO <>", value, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoGreaterThan(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO >", value, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO >=", value, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoLessThan(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO <", value, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO <=", value, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO in", values, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoNotIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO not in", values, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO between", value1, value2, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_TAX_YINGXIAO not between", value1, value2, "yingfuDianfeiTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuIsNull() {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuIsNotNull() {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU =", value, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuNotEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU <>", value, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuGreaterThan(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU >", value, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU >=", value, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuLessThan(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU <", value, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU <=", value, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU in", values, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuNotIn(List<Float> values) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU not in", values, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU between", value1, value2, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andYingfuDianfeiTaxCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("YINGFU_DIANFEI_TAX_CAIWU not between", value1, value2, "yingfuDianfeiTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunIsNull() {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunIsNotNull() {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN =", value, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunNotEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN <>", value, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunGreaterThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN >", value, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunGreaterThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN >=", value, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunLessThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN <", value, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunLessThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN <=", value, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN in", values, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunNotIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN not in", values, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN between", value1, value2, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuBiaozhunNotBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_BIAOZHUN not between", value1, value2, "zhongyangBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoIsNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoIsNotNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO =", value, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoNotEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO <>", value, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoGreaterThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO >", value, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO >=", value, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoLessThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO <", value, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO <=", value, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO in", values, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoNotIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO not in", values, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO between", value1, value2, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_YINGXIAO not between", value1, value2, "zhongyangBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuIsNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuIsNotNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU =", value, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuNotEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU <>", value, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuGreaterThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU >", value, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU >=", value, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuLessThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU <", value, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU <=", value, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU in", values, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuNotIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU not in", values, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU between", value1, value2, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_CAIWU not between", value1, value2, "zhongyangBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoIsNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoIsNotNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO =", value, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoNotEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO <>", value, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoGreaterThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO >", value, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO >=", value, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoLessThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO <", value, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO <=", value, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO in", values, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoNotIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO not in", values, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO between", value1, value2, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_YINGXIAO not between", value1, value2, "zhongyangBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuIsNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuIsNotNull() {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU =", value, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuNotEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU <>", value, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuGreaterThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU >", value, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU >=", value, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuLessThan(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU <", value, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU <=", value, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU in", values, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuNotIn(List<Float> values) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU not in", values, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU between", value1, value2, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andZhongyangBuzhuZijinTaxCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("ZHONGYANG_BUZHU_ZIJIN_TAX_CAIWU not between", value1, value2, "zhongyangBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunIsNull() {
            addCriterion("SHENG_BUZHU_BIAOZHUN is null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunIsNotNull() {
            addCriterion("SHENG_BUZHU_BIAOZHUN is not null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_BIAOZHUN =", value, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunNotEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_BIAOZHUN <>", value, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunGreaterThan(Float value) {
            addCriterion("SHENG_BUZHU_BIAOZHUN >", value, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunGreaterThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_BIAOZHUN >=", value, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunLessThan(Float value) {
            addCriterion("SHENG_BUZHU_BIAOZHUN <", value, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunLessThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_BIAOZHUN <=", value, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_BIAOZHUN in", values, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunNotIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_BIAOZHUN not in", values, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_BIAOZHUN between", value1, value2, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuBiaozhunNotBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_BIAOZHUN not between", value1, value2, "shengBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoIsNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoIsNotNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO =", value, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoNotEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO <>", value, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoGreaterThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO >", value, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO >=", value, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoLessThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO <", value, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO <=", value, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO in", values, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoNotIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO not in", values, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO between", value1, value2, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_YINGXIAO not between", value1, value2, "shengBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuIsNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuIsNotNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU =", value, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuNotEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU <>", value, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuGreaterThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU >", value, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU >=", value, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuLessThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU <", value, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU <=", value, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU in", values, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuNotIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU not in", values, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU between", value1, value2, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_CAIWU not between", value1, value2, "shengBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoIsNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoIsNotNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO =", value, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoNotEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO <>", value, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoGreaterThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO >", value, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO >=", value, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoLessThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO <", value, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO <=", value, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO in", values, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoNotIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO not in", values, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO between", value1, value2, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_YINGXIAO not between", value1, value2, "shengBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuIsNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuIsNotNull() {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU =", value, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuNotEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU <>", value, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuGreaterThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU >", value, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU >=", value, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuLessThan(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU <", value, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU <=", value, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU in", values, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuNotIn(List<Float> values) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU not in", values, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU between", value1, value2, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShengBuzhuZijinTaxCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("SHENG_BUZHU_ZIJIN_TAX_CAIWU not between", value1, value2, "shengBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunIsNull() {
            addCriterion("SHI_BUZHU_BIAOZHUN is null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunIsNotNull() {
            addCriterion("SHI_BUZHU_BIAOZHUN is not null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunEqualTo(Float value) {
            addCriterion("SHI_BUZHU_BIAOZHUN =", value, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunNotEqualTo(Float value) {
            addCriterion("SHI_BUZHU_BIAOZHUN <>", value, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunGreaterThan(Float value) {
            addCriterion("SHI_BUZHU_BIAOZHUN >", value, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunGreaterThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_BIAOZHUN >=", value, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunLessThan(Float value) {
            addCriterion("SHI_BUZHU_BIAOZHUN <", value, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunLessThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_BIAOZHUN <=", value, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunIn(List<Float> values) {
            addCriterion("SHI_BUZHU_BIAOZHUN in", values, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunNotIn(List<Float> values) {
            addCriterion("SHI_BUZHU_BIAOZHUN not in", values, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_BIAOZHUN between", value1, value2, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuBiaozhunNotBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_BIAOZHUN not between", value1, value2, "shiBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoIsNull() {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoIsNotNull() {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO =", value, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoNotEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO <>", value, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoGreaterThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO >", value, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO >=", value, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoLessThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO <", value, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO <=", value, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO in", values, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoNotIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO not in", values, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO between", value1, value2, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_YINGXIAO not between", value1, value2, "shiBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuIsNull() {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuIsNotNull() {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU =", value, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuNotEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU <>", value, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuGreaterThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU >", value, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU >=", value, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuLessThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU <", value, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU <=", value, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU in", values, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuNotIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU not in", values, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU between", value1, value2, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_CAIWU not between", value1, value2, "shiBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoIsNull() {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoIsNotNull() {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO =", value, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoNotEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO <>", value, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoGreaterThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO >", value, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO >=", value, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoLessThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO <", value, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO <=", value, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO in", values, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoNotIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO not in", values, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO between", value1, value2, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_YINGXIAO not between", value1, value2, "shiBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuIsNull() {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuIsNotNull() {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU =", value, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuNotEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU <>", value, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuGreaterThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU >", value, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU >=", value, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuLessThan(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU <", value, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU <=", value, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU in", values, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuNotIn(List<Float> values) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU not in", values, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU between", value1, value2, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andShiBuzhuZijinTaxCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("SHI_BUZHU_ZIJIN_TAX_CAIWU not between", value1, value2, "shiBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunIsNull() {
            addCriterion("XIAN_BUZHU_BIAOZHUN is null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunIsNotNull() {
            addCriterion("XIAN_BUZHU_BIAOZHUN is not null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_BIAOZHUN =", value, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunNotEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_BIAOZHUN <>", value, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunGreaterThan(Float value) {
            addCriterion("XIAN_BUZHU_BIAOZHUN >", value, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunGreaterThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_BIAOZHUN >=", value, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunLessThan(Float value) {
            addCriterion("XIAN_BUZHU_BIAOZHUN <", value, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunLessThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_BIAOZHUN <=", value, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_BIAOZHUN in", values, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunNotIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_BIAOZHUN not in", values, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_BIAOZHUN between", value1, value2, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuBiaozhunNotBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_BIAOZHUN not between", value1, value2, "xianBuzhuBiaozhun");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoIsNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoIsNotNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO =", value, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoNotEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO <>", value, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoGreaterThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO >", value, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO >=", value, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoLessThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO <", value, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO <=", value, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO in", values, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoNotIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO not in", values, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO between", value1, value2, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_YINGXIAO not between", value1, value2, "xianBuzhuZijinYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuIsNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuIsNotNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU =", value, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuNotEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU <>", value, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuGreaterThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU >", value, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU >=", value, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuLessThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU <", value, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU <=", value, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU in", values, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuNotIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU not in", values, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU between", value1, value2, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_CAIWU not between", value1, value2, "xianBuzhuZijinCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoIsNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO is null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoIsNotNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO is not null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO =", value, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoNotEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO <>", value, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoGreaterThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO >", value, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoGreaterThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO >=", value, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoLessThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO <", value, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoLessThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO <=", value, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO in", values, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoNotIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO not in", values, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO between", value1, value2, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxYingxiaoNotBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_YINGXIAO not between", value1, value2, "xianBuzhuZijinTaxYingxiao");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuIsNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU is null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuIsNotNull() {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU is not null");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU =", value, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuNotEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU <>", value, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuGreaterThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU >", value, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuGreaterThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU >=", value, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuLessThan(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU <", value, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuLessThanOrEqualTo(Float value) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU <=", value, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU in", values, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuNotIn(List<Float> values) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU not in", values, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU between", value1, value2, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andXianBuzhuZijinTaxCaiwuNotBetween(Float value1, Float value2) {
            addCriterion("XIAN_BUZHU_ZIJIN_TAX_CAIWU not between", value1, value2, "xianBuzhuZijinTaxCaiwu");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andAccountSumIsNull() {
            addCriterion("ACCOUNT_SUM is null");
            return (Criteria) this;
        }

        public Criteria andAccountSumIsNotNull() {
            addCriterion("ACCOUNT_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSumEqualTo(Float value) {
            addCriterion("ACCOUNT_SUM =", value, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumNotEqualTo(Float value) {
            addCriterion("ACCOUNT_SUM <>", value, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumGreaterThan(Float value) {
            addCriterion("ACCOUNT_SUM >", value, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumGreaterThanOrEqualTo(Float value) {
            addCriterion("ACCOUNT_SUM >=", value, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumLessThan(Float value) {
            addCriterion("ACCOUNT_SUM <", value, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumLessThanOrEqualTo(Float value) {
            addCriterion("ACCOUNT_SUM <=", value, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumIn(List<Float> values) {
            addCriterion("ACCOUNT_SUM in", values, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumNotIn(List<Float> values) {
            addCriterion("ACCOUNT_SUM not in", values, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumBetween(Float value1, Float value2) {
            addCriterion("ACCOUNT_SUM between", value1, value2, "accountSum");
            return (Criteria) this;
        }

        public Criteria andAccountSumNotBetween(Float value1, Float value2) {
            addCriterion("ACCOUNT_SUM not between", value1, value2, "accountSum");
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
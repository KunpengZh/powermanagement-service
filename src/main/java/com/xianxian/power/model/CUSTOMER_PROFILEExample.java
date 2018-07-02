package com.xianxian.power.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CUSTOMER_PROFILEExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CUSTOMER_PROFILEExample() {
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

        public Criteria andCusomerAddressIsNull() {
            addCriterion("CUSOMER_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressIsNotNull() {
            addCriterion("CUSOMER_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressEqualTo(String value) {
            addCriterion("CUSOMER_ADDRESS =", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressNotEqualTo(String value) {
            addCriterion("CUSOMER_ADDRESS <>", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressGreaterThan(String value) {
            addCriterion("CUSOMER_ADDRESS >", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CUSOMER_ADDRESS >=", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressLessThan(String value) {
            addCriterion("CUSOMER_ADDRESS <", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressLessThanOrEqualTo(String value) {
            addCriterion("CUSOMER_ADDRESS <=", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressLike(String value) {
            addCriterion("CUSOMER_ADDRESS like", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressNotLike(String value) {
            addCriterion("CUSOMER_ADDRESS not like", value, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressIn(List<String> values) {
            addCriterion("CUSOMER_ADDRESS in", values, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressNotIn(List<String> values) {
            addCriterion("CUSOMER_ADDRESS not in", values, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressBetween(String value1, String value2) {
            addCriterion("CUSOMER_ADDRESS between", value1, value2, "cusomerAddress");
            return (Criteria) this;
        }

        public Criteria andCusomerAddressNotBetween(String value1, String value2) {
            addCriterion("CUSOMER_ADDRESS not between", value1, value2, "cusomerAddress");
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

        public Criteria andCustomerFadianFangshiIsNull() {
            addCriterion("CUSTOMER_FADIAN_FANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiIsNotNull() {
            addCriterion("CUSTOMER_FADIAN_FANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiEqualTo(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI =", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiNotEqualTo(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI <>", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiGreaterThan(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI >", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI >=", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiLessThan(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI <", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI <=", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiLike(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI like", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiNotLike(String value) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI not like", value, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiIn(List<String> values) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI in", values, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiNotIn(List<String> values) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI not in", values, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI between", value1, value2, "customerFadianFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerFadianFangshiNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_FADIAN_FANGSHI not between", value1, value2, "customerFadianFangshi");
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

        public Criteria andCustomerJieruFangshiIsNull() {
            addCriterion("CUSTOMER_JIERU_FANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiIsNotNull() {
            addCriterion("CUSTOMER_JIERU_FANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiEqualTo(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI =", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiNotEqualTo(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI <>", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiGreaterThan(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI >", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI >=", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiLessThan(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI <", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI <=", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiLike(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI like", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiNotLike(String value) {
            addCriterion("CUSTOMER_JIERU_FANGSHI not like", value, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiIn(List<String> values) {
            addCriterion("CUSTOMER_JIERU_FANGSHI in", values, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiNotIn(List<String> values) {
            addCriterion("CUSTOMER_JIERU_FANGSHI not in", values, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiBetween(String value1, String value2) {
            addCriterion("CUSTOMER_JIERU_FANGSHI between", value1, value2, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andCustomerJieruFangshiNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_JIERU_FANGSHI not between", value1, value2, "customerJieruFangshi");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameIsNull() {
            addCriterion("SHI_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameIsNotNull() {
            addCriterion("SHI_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameEqualTo(String value) {
            addCriterion("SHI_COMPANY_NAME =", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameNotEqualTo(String value) {
            addCriterion("SHI_COMPANY_NAME <>", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameGreaterThan(String value) {
            addCriterion("SHI_COMPANY_NAME >", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("SHI_COMPANY_NAME >=", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameLessThan(String value) {
            addCriterion("SHI_COMPANY_NAME <", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("SHI_COMPANY_NAME <=", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameLike(String value) {
            addCriterion("SHI_COMPANY_NAME like", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameNotLike(String value) {
            addCriterion("SHI_COMPANY_NAME not like", value, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameIn(List<String> values) {
            addCriterion("SHI_COMPANY_NAME in", values, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameNotIn(List<String> values) {
            addCriterion("SHI_COMPANY_NAME not in", values, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameBetween(String value1, String value2) {
            addCriterion("SHI_COMPANY_NAME between", value1, value2, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andShiCompanyNameNotBetween(String value1, String value2) {
            addCriterion("SHI_COMPANY_NAME not between", value1, value2, "shiCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameIsNull() {
            addCriterion("XIAN_COMPANY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameIsNotNull() {
            addCriterion("XIAN_COMPANY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameEqualTo(String value) {
            addCriterion("XIAN_COMPANY_NAME =", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameNotEqualTo(String value) {
            addCriterion("XIAN_COMPANY_NAME <>", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameGreaterThan(String value) {
            addCriterion("XIAN_COMPANY_NAME >", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("XIAN_COMPANY_NAME >=", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameLessThan(String value) {
            addCriterion("XIAN_COMPANY_NAME <", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("XIAN_COMPANY_NAME <=", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameLike(String value) {
            addCriterion("XIAN_COMPANY_NAME like", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameNotLike(String value) {
            addCriterion("XIAN_COMPANY_NAME not like", value, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameIn(List<String> values) {
            addCriterion("XIAN_COMPANY_NAME in", values, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameNotIn(List<String> values) {
            addCriterion("XIAN_COMPANY_NAME not in", values, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameBetween(String value1, String value2) {
            addCriterion("XIAN_COMPANY_NAME between", value1, value2, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andXianCompanyNameNotBetween(String value1, String value2) {
            addCriterion("XIAN_COMPANY_NAME not between", value1, value2, "xianCompanyName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameIsNull() {
            addCriterion("GONGDIAN_DANWEI_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameIsNotNull() {
            addCriterion("GONGDIAN_DANWEI_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameEqualTo(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME =", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameNotEqualTo(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME <>", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameGreaterThan(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME >", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameGreaterThanOrEqualTo(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME >=", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameLessThan(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME <", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameLessThanOrEqualTo(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME <=", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameLike(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME like", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameNotLike(String value) {
            addCriterion("GONGDIAN_DANWEI_NAME not like", value, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameIn(List<String> values) {
            addCriterion("GONGDIAN_DANWEI_NAME in", values, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameNotIn(List<String> values) {
            addCriterion("GONGDIAN_DANWEI_NAME not in", values, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameBetween(String value1, String value2) {
            addCriterion("GONGDIAN_DANWEI_NAME between", value1, value2, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andGongdianDanweiNameNotBetween(String value1, String value2) {
            addCriterion("GONGDIAN_DANWEI_NAME not between", value1, value2, "gongdianDanweiName");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("ORG_NO =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("ORG_NO <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("ORG_NO >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NO >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("ORG_NO <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("ORG_NO <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("ORG_NO like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("ORG_NO not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("ORG_NO in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("ORG_NO not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("ORG_NO between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("ORG_NO not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdIsNull() {
            addCriterion("REQUEST_FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdIsNotNull() {
            addCriterion("REQUEST_FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdEqualTo(String value) {
            addCriterion("REQUEST_FORM_ID =", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdNotEqualTo(String value) {
            addCriterion("REQUEST_FORM_ID <>", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdGreaterThan(String value) {
            addCriterion("REQUEST_FORM_ID >", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_FORM_ID >=", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdLessThan(String value) {
            addCriterion("REQUEST_FORM_ID <", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_FORM_ID <=", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdLike(String value) {
            addCriterion("REQUEST_FORM_ID like", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdNotLike(String value) {
            addCriterion("REQUEST_FORM_ID not like", value, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdIn(List<String> values) {
            addCriterion("REQUEST_FORM_ID in", values, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdNotIn(List<String> values) {
            addCriterion("REQUEST_FORM_ID not in", values, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdBetween(String value1, String value2) {
            addCriterion("REQUEST_FORM_ID between", value1, value2, "requestFormId");
            return (Criteria) this;
        }

        public Criteria andRequestFormIdNotBetween(String value1, String value2) {
            addCriterion("REQUEST_FORM_ID not between", value1, value2, "requestFormId");
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

        public Criteria andBingwangTimeIsNull() {
            addCriterion("BINGWANG_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeIsNotNull() {
            addCriterion("BINGWANG_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeEqualTo(Date value) {
            addCriterion("BINGWANG_TIME =", value, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeNotEqualTo(Date value) {
            addCriterion("BINGWANG_TIME <>", value, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeGreaterThan(Date value) {
            addCriterion("BINGWANG_TIME >", value, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BINGWANG_TIME >=", value, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeLessThan(Date value) {
            addCriterion("BINGWANG_TIME <", value, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeLessThanOrEqualTo(Date value) {
            addCriterion("BINGWANG_TIME <=", value, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeIn(List<Date> values) {
            addCriterion("BINGWANG_TIME in", values, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeNotIn(List<Date> values) {
            addCriterion("BINGWANG_TIME not in", values, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeBetween(Date value1, Date value2) {
            addCriterion("BINGWANG_TIME between", value1, value2, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangTimeNotBetween(Date value1, Date value2) {
            addCriterion("BINGWANG_TIME not between", value1, value2, "bingwangTime");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaIsNull() {
            addCriterion("BINGWANG_DIANYA is null");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaIsNotNull() {
            addCriterion("BINGWANG_DIANYA is not null");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaEqualTo(String value) {
            addCriterion("BINGWANG_DIANYA =", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaNotEqualTo(String value) {
            addCriterion("BINGWANG_DIANYA <>", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaGreaterThan(String value) {
            addCriterion("BINGWANG_DIANYA >", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaGreaterThanOrEqualTo(String value) {
            addCriterion("BINGWANG_DIANYA >=", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaLessThan(String value) {
            addCriterion("BINGWANG_DIANYA <", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaLessThanOrEqualTo(String value) {
            addCriterion("BINGWANG_DIANYA <=", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaLike(String value) {
            addCriterion("BINGWANG_DIANYA like", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaNotLike(String value) {
            addCriterion("BINGWANG_DIANYA not like", value, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaIn(List<String> values) {
            addCriterion("BINGWANG_DIANYA in", values, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaNotIn(List<String> values) {
            addCriterion("BINGWANG_DIANYA not in", values, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaBetween(String value1, String value2) {
            addCriterion("BINGWANG_DIANYA between", value1, value2, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangDianyaNotBetween(String value1, String value2) {
            addCriterion("BINGWANG_DIANYA not between", value1, value2, "bingwangDianya");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiIsNull() {
            addCriterion("BINGWANG_FANGSHI is null");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiIsNotNull() {
            addCriterion("BINGWANG_FANGSHI is not null");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiEqualTo(String value) {
            addCriterion("BINGWANG_FANGSHI =", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiNotEqualTo(String value) {
            addCriterion("BINGWANG_FANGSHI <>", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiGreaterThan(String value) {
            addCriterion("BINGWANG_FANGSHI >", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiGreaterThanOrEqualTo(String value) {
            addCriterion("BINGWANG_FANGSHI >=", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiLessThan(String value) {
            addCriterion("BINGWANG_FANGSHI <", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiLessThanOrEqualTo(String value) {
            addCriterion("BINGWANG_FANGSHI <=", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiLike(String value) {
            addCriterion("BINGWANG_FANGSHI like", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiNotLike(String value) {
            addCriterion("BINGWANG_FANGSHI not like", value, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiIn(List<String> values) {
            addCriterion("BINGWANG_FANGSHI in", values, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiNotIn(List<String> values) {
            addCriterion("BINGWANG_FANGSHI not in", values, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiBetween(String value1, String value2) {
            addCriterion("BINGWANG_FANGSHI between", value1, value2, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBingwangFangshiNotBetween(String value1, String value2) {
            addCriterion("BINGWANG_FANGSHI not between", value1, value2, "bingwangFangshi");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelIsNull() {
            addCriterion("BUZHU_MODEL is null");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelIsNotNull() {
            addCriterion("BUZHU_MODEL is not null");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelEqualTo(String value) {
            addCriterion("BUZHU_MODEL =", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelNotEqualTo(String value) {
            addCriterion("BUZHU_MODEL <>", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelGreaterThan(String value) {
            addCriterion("BUZHU_MODEL >", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelGreaterThanOrEqualTo(String value) {
            addCriterion("BUZHU_MODEL >=", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelLessThan(String value) {
            addCriterion("BUZHU_MODEL <", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelLessThanOrEqualTo(String value) {
            addCriterion("BUZHU_MODEL <=", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelLike(String value) {
            addCriterion("BUZHU_MODEL like", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelNotLike(String value) {
            addCriterion("BUZHU_MODEL not like", value, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelIn(List<String> values) {
            addCriterion("BUZHU_MODEL in", values, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelNotIn(List<String> values) {
            addCriterion("BUZHU_MODEL not in", values, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelBetween(String value1, String value2) {
            addCriterion("BUZHU_MODEL between", value1, value2, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andBuzhuModelNotBetween(String value1, String value2) {
            addCriterion("BUZHU_MODEL not between", value1, value2, "buzhuModel");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNull() {
            addCriterion("CUSTOMER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIsNotNull() {
            addCriterion("CUSTOMER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE =", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <>", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThan(String value) {
            addCriterion("CUSTOMER_TYPE >", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE >=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThan(String value) {
            addCriterion("CUSTOMER_TYPE <", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_TYPE <=", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeLike(String value) {
            addCriterion("CUSTOMER_TYPE like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotLike(String value) {
            addCriterion("CUSTOMER_TYPE not like", value, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotIn(List<String> values) {
            addCriterion("CUSTOMER_TYPE not in", values, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andCustomerTypeNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_TYPE not between", value1, value2, "customerType");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvIsNull() {
            addCriterion("DANGAN_SHUILV is null");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvIsNotNull() {
            addCriterion("DANGAN_SHUILV is not null");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvEqualTo(Float value) {
            addCriterion("DANGAN_SHUILV =", value, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvNotEqualTo(Float value) {
            addCriterion("DANGAN_SHUILV <>", value, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvGreaterThan(Float value) {
            addCriterion("DANGAN_SHUILV >", value, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvGreaterThanOrEqualTo(Float value) {
            addCriterion("DANGAN_SHUILV >=", value, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvLessThan(Float value) {
            addCriterion("DANGAN_SHUILV <", value, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvLessThanOrEqualTo(Float value) {
            addCriterion("DANGAN_SHUILV <=", value, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvIn(List<Float> values) {
            addCriterion("DANGAN_SHUILV in", values, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvNotIn(List<Float> values) {
            addCriterion("DANGAN_SHUILV not in", values, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvBetween(Float value1, Float value2) {
            addCriterion("DANGAN_SHUILV between", value1, value2, "danganShuilv");
            return (Criteria) this;
        }

        public Criteria andDanganShuilvNotBetween(Float value1, Float value2) {
            addCriterion("DANGAN_SHUILV not between", value1, value2, "danganShuilv");
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
package com.xianxian.power.model;

import java.io.Serializable;
import java.util.Date;

public class CustomerProfile implements Serializable {
    private String customerId;

    private String cusomerName;

    private String cusomerAddress;

    private Float contactCapacity;

    private String customerCategory;

    private String customerFadianFangshi;

    private String saleCategory;

    private String customerJieruFangshi;

    private String shiCompanyName;

    private String xianCompanyName;

    private String gongdianDanweiName;

    private String orgNo;

    private String requestFormId;

    private String identifyNumber;

    private String bankName;

    private String bankAccount;

    private Date bingwangTime;

    private String bingwangDianya;

    private String bingwangFangshi;

    private String buzhuModel;

    private String customerType;

    private Float danganShuilv;

    private static final long serialVersionUID = 1L;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCusomerName() {
        return cusomerName;
    }

    public void setCusomerName(String cusomerName) {
        this.cusomerName = cusomerName == null ? null : cusomerName.trim();
    }

    public String getCusomerAddress() {
        return cusomerAddress;
    }

    public void setCusomerAddress(String cusomerAddress) {
        this.cusomerAddress = cusomerAddress == null ? null : cusomerAddress.trim();
    }

    public Float getContactCapacity() {
        return contactCapacity;
    }

    public void setContactCapacity(Float contactCapacity) {
        this.contactCapacity = contactCapacity;
    }

    public String getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory == null ? null : customerCategory.trim();
    }

    public String getCustomerFadianFangshi() {
        return customerFadianFangshi;
    }

    public void setCustomerFadianFangshi(String customerFadianFangshi) {
        this.customerFadianFangshi = customerFadianFangshi == null ? null : customerFadianFangshi.trim();
    }

    public String getSaleCategory() {
        return saleCategory;
    }

    public void setSaleCategory(String saleCategory) {
        this.saleCategory = saleCategory == null ? null : saleCategory.trim();
    }

    public String getCustomerJieruFangshi() {
        return customerJieruFangshi;
    }

    public void setCustomerJieruFangshi(String customerJieruFangshi) {
        this.customerJieruFangshi = customerJieruFangshi == null ? null : customerJieruFangshi.trim();
    }

    public String getShiCompanyName() {
        return shiCompanyName;
    }

    public void setShiCompanyName(String shiCompanyName) {
        this.shiCompanyName = shiCompanyName == null ? null : shiCompanyName.trim();
    }

    public String getXianCompanyName() {
        return xianCompanyName;
    }

    public void setXianCompanyName(String xianCompanyName) {
        this.xianCompanyName = xianCompanyName == null ? null : xianCompanyName.trim();
    }

    public String getGongdianDanweiName() {
        return gongdianDanweiName;
    }

    public void setGongdianDanweiName(String gongdianDanweiName) {
        this.gongdianDanweiName = gongdianDanweiName == null ? null : gongdianDanweiName.trim();
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo == null ? null : orgNo.trim();
    }

    public String getRequestFormId() {
        return requestFormId;
    }

    public void setRequestFormId(String requestFormId) {
        this.requestFormId = requestFormId == null ? null : requestFormId.trim();
    }

    public String getIdentifyNumber() {
        return identifyNumber;
    }

    public void setIdentifyNumber(String identifyNumber) {
        this.identifyNumber = identifyNumber == null ? null : identifyNumber.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public Date getBingwangTime() {
        return bingwangTime;
    }

    public void setBingwangTime(Date bingwangTime) {
        this.bingwangTime = bingwangTime;
    }

    public String getBingwangDianya() {
        return bingwangDianya;
    }

    public void setBingwangDianya(String bingwangDianya) {
        this.bingwangDianya = bingwangDianya == null ? null : bingwangDianya.trim();
    }

    public String getBingwangFangshi() {
        return bingwangFangshi;
    }

    public void setBingwangFangshi(String bingwangFangshi) {
        this.bingwangFangshi = bingwangFangshi == null ? null : bingwangFangshi.trim();
    }

    public String getBuzhuModel() {
        return buzhuModel;
    }

    public void setBuzhuModel(String buzhuModel) {
        this.buzhuModel = buzhuModel == null ? null : buzhuModel.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public Float getDanganShuilv() {
        return danganShuilv;
    }

    public void setDanganShuilv(Float danganShuilv) {
        this.danganShuilv = danganShuilv;
    }
}
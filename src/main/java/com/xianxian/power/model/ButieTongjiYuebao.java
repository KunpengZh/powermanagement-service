package com.xianxian.power.model;

import java.util.Date;

public class ButieTongjiYuebao {
    private Integer indexid;

    private String customerId;

    private String customerName;

    private Date datePeriod;

    private String danwei;
    private Float yingfuDianfei;
    private Float zhongyangBuzhuZijinYingxiao;
    private Float shengBuzhuZijinYingxiao;
    private Float shiBuzhuZijinYingxiao;
    private Float xianBuzhuZijinYingxiao;
    private String customerAddress;

    private Float contactCapacity;
    private float butieheji;

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Float getContactCapacity() {
        return contactCapacity;
    }

    public void setContactCapacity(Float contactCapacity) {
        this.contactCapacity = contactCapacity;
    }

    public Integer getIndexid() {
        return indexid;
    }

    public void setIndexid(Integer indexid) {
        this.indexid = indexid;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getDatePeriod() {
        return datePeriod;
    }

    public void setDatePeriod(Date datePeriod) {
        this.datePeriod = datePeriod;
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei;
    }

    public Float getYingfuDianfei() {
        return yingfuDianfei;
    }

    public void setYingfuDianfei(Float yingfuDianfei) {
        this.yingfuDianfei = yingfuDianfei;
    }

    public Float getZhongyangBuzhuZijinYingxiao() {
        return zhongyangBuzhuZijinYingxiao;
    }

    public void setZhongyangBuzhuZijinYingxiao(Float zhongyangBuzhuZijinYingxiao) {
        this.zhongyangBuzhuZijinYingxiao = zhongyangBuzhuZijinYingxiao;
    }

    public Float getShengBuzhuZijinYingxiao() {
        return shengBuzhuZijinYingxiao;
    }

    public void setShengBuzhuZijinYingxiao(Float shengBuzhuZijinYingxiao) {
        this.shengBuzhuZijinYingxiao = shengBuzhuZijinYingxiao;
    }

    public Float getShiBuzhuZijinYingxiao() {
        return shiBuzhuZijinYingxiao;
    }

    public void setShiBuzhuZijinYingxiao(Float shiBuzhuZijinYingxiao) {
        this.shiBuzhuZijinYingxiao = shiBuzhuZijinYingxiao;
    }

    public Float getXianBuzhuZijinYingxiao() {
        return xianBuzhuZijinYingxiao;
    }

    public void setXianBuzhuZijinYingxiao(Float xianBuzhuZijinYingxiao) {
        this.xianBuzhuZijinYingxiao = xianBuzhuZijinYingxiao;
    }

    public float getButieheji() {
        return butieheji;
    }

    public void setButieheji(float butieheji) {
        this.butieheji = butieheji;
    }
}

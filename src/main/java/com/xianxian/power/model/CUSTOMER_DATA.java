package com.xianxian.power.model;

import java.io.Serializable;
import java.util.Date;

public class CUSTOMER_DATA implements Serializable {
    private Integer indexid;

    private String customerId;

    private String cusomerName;

    private Date datePeriod;

    private String picihao;

    private String danwei;

    private Date caijiDate;

    private Date dateConfirmed;

    private String jichengpici;

    private String danjubianhao;

    private String dataStatus;

    private String xianmuLeixing;

    private String xiaonaFangshi;

    private String zhongyangBuzhuModel;

    private Float zhuangjiRongliang;

    private String invoiceType;

    private Float customerShuilv;

    private Float shangwangDianliang;

    private Float faDianliang;

    private Float shangwangDianjia;

    private Float yingfuDianfei;

    private Float yingfuDianfeiCaiwu;

    private Float yingfuDianfeiShuiSale;

    private Float yingfuDianfeiShuiCaiwu;

    private Float zhongyangBuzhuBiaozhun;

    private Float zhongyangBuzhuZijinYingxiao;

    private Float zhongyangBuzhuZijinCaiwu;

    private Float zhongyangBuzhuZijinTaxYingxiao;

    private Float zhongyangBuzhuZijinTaxCaiwu;

    private Float shengBuzhuBiaozhun;

    private Float shengBuzhuZijinYingxiao;

    private Float shengBuzhuZijinCaiwu;

    private Float shengBuzhuZijinTaxYingxiao;

    private Float shengBuzhuZijinTaxCaiwu;

    private Float shiBuzhuBiaozhun;

    private Float shiBuzhuZijinYingxiao;

    private Float shiBuzhuZijinCaiwu;

    private Float shiBuzhuZijinTaxYingxiao;

    private Float shiBuzhuZijinTaxCaiwu;

    private Float xianBuzhuBiaozhun;

    private Float xianBuzhuZijinYingxiao;

    private Float xianBuzhuZijinCaiwu;

    private Float xianBuzhuZijinTaxYingxiao;

    private Float xianBuzhuZijinTaxCaiwu;

    private String comments;

    private String customerStatus;

    private String customerCategory;

    private Float accountSum;

    private static final long serialVersionUID = 1L;

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
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCusomerName() {
        return cusomerName;
    }

    public void setCusomerName(String cusomerName) {
        this.cusomerName = cusomerName == null ? null : cusomerName.trim();
    }

    public Date getDatePeriod() {
        return datePeriod;
    }

    public void setDatePeriod(Date datePeriod) {
        this.datePeriod = datePeriod;
    }

    public String getPicihao() {
        return picihao;
    }

    public void setPicihao(String picihao) {
        this.picihao = picihao == null ? null : picihao.trim();
    }

    public String getDanwei() {
        return danwei;
    }

    public void setDanwei(String danwei) {
        this.danwei = danwei == null ? null : danwei.trim();
    }

    public Date getCaijiDate() {
        return caijiDate;
    }

    public void setCaijiDate(Date caijiDate) {
        this.caijiDate = caijiDate;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public String getJichengpici() {
        return jichengpici;
    }

    public void setJichengpici(String jichengpici) {
        this.jichengpici = jichengpici == null ? null : jichengpici.trim();
    }

    public String getDanjubianhao() {
        return danjubianhao;
    }

    public void setDanjubianhao(String danjubianhao) {
        this.danjubianhao = danjubianhao == null ? null : danjubianhao.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getXianmuLeixing() {
        return xianmuLeixing;
    }

    public void setXianmuLeixing(String xianmuLeixing) {
        this.xianmuLeixing = xianmuLeixing == null ? null : xianmuLeixing.trim();
    }

    public String getXiaonaFangshi() {
        return xiaonaFangshi;
    }

    public void setXiaonaFangshi(String xiaonaFangshi) {
        this.xiaonaFangshi = xiaonaFangshi == null ? null : xiaonaFangshi.trim();
    }

    public String getZhongyangBuzhuModel() {
        return zhongyangBuzhuModel;
    }

    public void setZhongyangBuzhuModel(String zhongyangBuzhuModel) {
        this.zhongyangBuzhuModel = zhongyangBuzhuModel == null ? null : zhongyangBuzhuModel.trim();
    }

    public Float getZhuangjiRongliang() {
        return zhuangjiRongliang;
    }

    public void setZhuangjiRongliang(Float zhuangjiRongliang) {
        this.zhuangjiRongliang = zhuangjiRongliang;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public Float getCustomerShuilv() {
        return customerShuilv;
    }

    public void setCustomerShuilv(Float customerShuilv) {
        this.customerShuilv = customerShuilv;
    }

    public Float getShangwangDianliang() {
        return shangwangDianliang;
    }

    public void setShangwangDianliang(Float shangwangDianliang) {
        this.shangwangDianliang = shangwangDianliang;
    }

    public Float getFaDianliang() {
        return faDianliang;
    }

    public void setFaDianliang(Float faDianliang) {
        this.faDianliang = faDianliang;
    }

    public Float getShangwangDianjia() {
        return shangwangDianjia;
    }

    public void setShangwangDianjia(Float shangwangDianjia) {
        this.shangwangDianjia = shangwangDianjia;
    }

    public Float getYingfuDianfei() {
        return yingfuDianfei;
    }

    public void setYingfuDianfei(Float yingfuDianfei) {
        this.yingfuDianfei = yingfuDianfei;
    }

    public Float getYingfuDianfeiCaiwu() {
        return yingfuDianfeiCaiwu;
    }

    public void setYingfuDianfeiCaiwu(Float yingfuDianfeiCaiwu) {
        this.yingfuDianfeiCaiwu = yingfuDianfeiCaiwu;
    }

    public Float getYingfuDianfeiShuiSale() {
        return yingfuDianfeiShuiSale;
    }

    public void setYingfuDianfeiShuiSale(Float yingfuDianfeiShuiSale) {
        this.yingfuDianfeiShuiSale = yingfuDianfeiShuiSale;
    }

    public Float getYingfuDianfeiShuiCaiwu() {
        return yingfuDianfeiShuiCaiwu;
    }

    public void setYingfuDianfeiShuiCaiwu(Float yingfuDianfeiShuiCaiwu) {
        this.yingfuDianfeiShuiCaiwu = yingfuDianfeiShuiCaiwu;
    }

    public Float getZhongyangBuzhuBiaozhun() {
        return zhongyangBuzhuBiaozhun;
    }

    public void setZhongyangBuzhuBiaozhun(Float zhongyangBuzhuBiaozhun) {
        this.zhongyangBuzhuBiaozhun = zhongyangBuzhuBiaozhun;
    }

    public Float getZhongyangBuzhuZijinYingxiao() {
        return zhongyangBuzhuZijinYingxiao;
    }

    public void setZhongyangBuzhuZijinYingxiao(Float zhongyangBuzhuZijinYingxiao) {
        this.zhongyangBuzhuZijinYingxiao = zhongyangBuzhuZijinYingxiao;
    }

    public Float getZhongyangBuzhuZijinCaiwu() {
        return zhongyangBuzhuZijinCaiwu;
    }

    public void setZhongyangBuzhuZijinCaiwu(Float zhongyangBuzhuZijinCaiwu) {
        this.zhongyangBuzhuZijinCaiwu = zhongyangBuzhuZijinCaiwu;
    }

    public Float getZhongyangBuzhuZijinTaxYingxiao() {
        return zhongyangBuzhuZijinTaxYingxiao;
    }

    public void setZhongyangBuzhuZijinTaxYingxiao(Float zhongyangBuzhuZijinTaxYingxiao) {
        this.zhongyangBuzhuZijinTaxYingxiao = zhongyangBuzhuZijinTaxYingxiao;
    }

    public Float getZhongyangBuzhuZijinTaxCaiwu() {
        return zhongyangBuzhuZijinTaxCaiwu;
    }

    public void setZhongyangBuzhuZijinTaxCaiwu(Float zhongyangBuzhuZijinTaxCaiwu) {
        this.zhongyangBuzhuZijinTaxCaiwu = zhongyangBuzhuZijinTaxCaiwu;
    }

    public Float getShengBuzhuBiaozhun() {
        return shengBuzhuBiaozhun;
    }

    public void setShengBuzhuBiaozhun(Float shengBuzhuBiaozhun) {
        this.shengBuzhuBiaozhun = shengBuzhuBiaozhun;
    }

    public Float getShengBuzhuZijinYingxiao() {
        return shengBuzhuZijinYingxiao;
    }

    public void setShengBuzhuZijinYingxiao(Float shengBuzhuZijinYingxiao) {
        this.shengBuzhuZijinYingxiao = shengBuzhuZijinYingxiao;
    }

    public Float getShengBuzhuZijinCaiwu() {
        return shengBuzhuZijinCaiwu;
    }

    public void setShengBuzhuZijinCaiwu(Float shengBuzhuZijinCaiwu) {
        this.shengBuzhuZijinCaiwu = shengBuzhuZijinCaiwu;
    }

    public Float getShengBuzhuZijinTaxYingxiao() {
        return shengBuzhuZijinTaxYingxiao;
    }

    public void setShengBuzhuZijinTaxYingxiao(Float shengBuzhuZijinTaxYingxiao) {
        this.shengBuzhuZijinTaxYingxiao = shengBuzhuZijinTaxYingxiao;
    }

    public Float getShengBuzhuZijinTaxCaiwu() {
        return shengBuzhuZijinTaxCaiwu;
    }

    public void setShengBuzhuZijinTaxCaiwu(Float shengBuzhuZijinTaxCaiwu) {
        this.shengBuzhuZijinTaxCaiwu = shengBuzhuZijinTaxCaiwu;
    }

    public Float getShiBuzhuBiaozhun() {
        return shiBuzhuBiaozhun;
    }

    public void setShiBuzhuBiaozhun(Float shiBuzhuBiaozhun) {
        this.shiBuzhuBiaozhun = shiBuzhuBiaozhun;
    }

    public Float getShiBuzhuZijinYingxiao() {
        return shiBuzhuZijinYingxiao;
    }

    public void setShiBuzhuZijinYingxiao(Float shiBuzhuZijinYingxiao) {
        this.shiBuzhuZijinYingxiao = shiBuzhuZijinYingxiao;
    }

    public Float getShiBuzhuZijinCaiwu() {
        return shiBuzhuZijinCaiwu;
    }

    public void setShiBuzhuZijinCaiwu(Float shiBuzhuZijinCaiwu) {
        this.shiBuzhuZijinCaiwu = shiBuzhuZijinCaiwu;
    }

    public Float getShiBuzhuZijinTaxYingxiao() {
        return shiBuzhuZijinTaxYingxiao;
    }

    public void setShiBuzhuZijinTaxYingxiao(Float shiBuzhuZijinTaxYingxiao) {
        this.shiBuzhuZijinTaxYingxiao = shiBuzhuZijinTaxYingxiao;
    }

    public Float getShiBuzhuZijinTaxCaiwu() {
        return shiBuzhuZijinTaxCaiwu;
    }

    public void setShiBuzhuZijinTaxCaiwu(Float shiBuzhuZijinTaxCaiwu) {
        this.shiBuzhuZijinTaxCaiwu = shiBuzhuZijinTaxCaiwu;
    }

    public Float getXianBuzhuBiaozhun() {
        return xianBuzhuBiaozhun;
    }

    public void setXianBuzhuBiaozhun(Float xianBuzhuBiaozhun) {
        this.xianBuzhuBiaozhun = xianBuzhuBiaozhun;
    }

    public Float getXianBuzhuZijinYingxiao() {
        return xianBuzhuZijinYingxiao;
    }

    public void setXianBuzhuZijinYingxiao(Float xianBuzhuZijinYingxiao) {
        this.xianBuzhuZijinYingxiao = xianBuzhuZijinYingxiao;
    }

    public Float getXianBuzhuZijinCaiwu() {
        return xianBuzhuZijinCaiwu;
    }

    public void setXianBuzhuZijinCaiwu(Float xianBuzhuZijinCaiwu) {
        this.xianBuzhuZijinCaiwu = xianBuzhuZijinCaiwu;
    }

    public Float getXianBuzhuZijinTaxYingxiao() {
        return xianBuzhuZijinTaxYingxiao;
    }

    public void setXianBuzhuZijinTaxYingxiao(Float xianBuzhuZijinTaxYingxiao) {
        this.xianBuzhuZijinTaxYingxiao = xianBuzhuZijinTaxYingxiao;
    }

    public Float getXianBuzhuZijinTaxCaiwu() {
        return xianBuzhuZijinTaxCaiwu;
    }

    public void setXianBuzhuZijinTaxCaiwu(Float xianBuzhuZijinTaxCaiwu) {
        this.xianBuzhuZijinTaxCaiwu = xianBuzhuZijinTaxCaiwu;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus == null ? null : customerStatus.trim();
    }

    public String getCustomerCategory() {
        return customerCategory;
    }

    public void setCustomerCategory(String customerCategory) {
        this.customerCategory = customerCategory == null ? null : customerCategory.trim();
    }

    public Float getAccountSum() {
        return accountSum;
    }

    public void setAccountSum(Float accountSum) {
        this.accountSum = accountSum;
    }
}
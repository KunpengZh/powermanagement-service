package com.xianxian.power.service;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.mapper.CUSTOMER_DATAMapper;
import com.xianxian.power.mapper.CUSTOMER_DATA_NEWMapper;
import com.xianxian.power.mapper.CustomerDataMapper;
import com.xianxian.power.model.*;
import com.xianxian.power.repository.CustomerProfileRepository;
import com.xianxian.power.utils.POWERUTILS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class CustomerDataService {

    DecimalFormat format2 = new DecimalFormat("0.00 ");
    CUSTOMER_DATAMapper customerDataMapper;
    CUSTOMER_DATA_NEWMapper customerDataNewMapper;
    private CustomerDataMapper myDataMapper;
    private CustomerProfileRepository customerProfileRepository;


    @Autowired
    public void setMyDataMapper(CustomerDataMapper myDataMapper) {
        this.myDataMapper = myDataMapper;
    }


    @Autowired
    public void setCustomerDataMapper(CUSTOMER_DATAMapper customerDataMapper, CUSTOMER_DATA_NEWMapper customerDataNewMapper, CustomerProfileRepository customerProfileRepository) {
        this.customerDataMapper = customerDataMapper;
        this.customerDataNewMapper = customerDataNewMapper;
        this.customerProfileRepository = customerProfileRepository;
    }

    public List<CUSTOMER_DATA> queryCustomerData(JSONObject jsonQuery) {
        CUSTOMER_DATAExample customerDataExample = new CUSTOMER_DATAExample();

        CUSTOMER_DATAExample.Criteria criteria = customerDataExample.createCriteria();

        if (jsonQuery.containsKey("startPeriod") && !jsonQuery.getString("startPeriod").equals("") && jsonQuery.containsKey("endPeriod") && !jsonQuery.getString("endPeriod").equals("")) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date startPeriod = sdf.parse(jsonQuery.getString("startPeriod"));
                Date endPeriod = sdf.parse(jsonQuery.getString("endPeriod"));
                criteria.andDatePeriodBetween(startPeriod, endPeriod);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (jsonQuery.containsKey("customerId") && !jsonQuery.getString("customerId").equals("")) {
            criteria.andCustomerIdEqualTo(jsonQuery.getString("customerId"));
        }

        if (jsonQuery.containsKey("customerName") && !jsonQuery.getString("customerName").equals("")) {
            criteria.andCustomerNameEqualTo("customerName");
        }

        if (jsonQuery.containsKey("danwei") && !jsonQuery.getString("danwei").equals("")) {
            criteria.andDanweiEqualTo(jsonQuery.getString("danwei"));
        }

        //customerDataExample.or(criteria);

        return customerDataMapper.selectByExample(customerDataExample);

    }

    public void updateCustomerProfile(List<CUSTOMER_DATA> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerDataMapper.updateByPrimaryKeySelective(updatedRows.get(i));
        }
    }

    public void deleteCustomerProfile(List<CUSTOMER_DATA> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerDataMapper.deleteByPrimaryKey(updatedRows.get(i).getIndexid());
        }
    }

    public void createCustomerProfile(CUSTOMER_DATA customerProfile) {
        customerDataMapper.insertSelective(customerProfile);
    }

    public void updateCustomerProfileNew(List<CUSTOMER_DATA_NEW> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerDataNewMapper.updateByPrimaryKeySelective(updatedRows.get(i));
        }
    }

    public void deleteCustomerProfileNew(List<CUSTOMER_DATA_NEW> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerDataNewMapper.deleteByPrimaryKey(updatedRows.get(i).getIndexid());
        }
    }

    public List<CUSTOMER_DATA_NEW> getAllCustomerDataNew() {
        CUSTOMER_DATA_NEWExample customerDataNewExample = new CUSTOMER_DATA_NEWExample();
        return customerDataNewMapper.selectByExample(customerDataNewExample);

    }

    public int moveCustomerData(List<CUSTOMER_DATA_NEW> customerDataNews) {
        int count = 0;
        try {
            for (CUSTOMER_DATA_NEW customerDataNew : customerDataNews) {
                if (null != customerDataNew.getCustomerId() && !customerDataNew.getCustomerId().trim().equalsIgnoreCase("")) {
                    if (customerProfileRepository.countByCustomerId(customerDataNew.getCustomerId()) > 0) {
                        CUSTOMER_DATA customerData = POWERUTILS.convertBean(customerDataNew, CUSTOMER_DATA.class);
                        customerData.setIndexid(null);
                        if (customerDataMapper.insertSelective(customerData) > 0) {
                            customerDataNewMapper.deleteByPrimaryKey(customerDataNew.getIndexid());
                            count++;
                        }
                    }
                }
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return count;
        }
    }

    public List<String> getAllDanwei() {
        return myDataMapper.getAllDanwei();
    }

    public List<String> getAllBankName() {
        return myDataMapper.getAllBank();
    }

    public List<String> getAllXiaonaFangshi() {
        return myDataMapper.getAllXiaonaFangshi();
    }

    public List<ButieTongjiYuebao> getButieTongjiYueBao(JSONObject jsonQuery) {
        CUSTOMER_DATAExample customerDataExample = new CUSTOMER_DATAExample();
        CUSTOMER_DATAExample.Criteria criteria = customerDataExample.createCriteria();
        try {
            if (jsonQuery.containsKey("startPeriod") && !jsonQuery.getString("startPeriod").equals("") && jsonQuery.containsKey("endPeriod") && !jsonQuery.getString("endPeriod").equals("")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date startPeriod = sdf.parse(jsonQuery.getString("startPeriod"));
                Date endPeriod = sdf.parse(jsonQuery.getString("endPeriod"));
                criteria.andDatePeriodBetween(startPeriod, endPeriod);
            }
            if (jsonQuery.containsKey("danwei") && !jsonQuery.getString("danwei").equals("")) {
                criteria.andDanweiEqualTo(jsonQuery.getString("danwei"));
            }
            //customerDataExample.or(criteria);
        } catch (Exception e) {
            e.printStackTrace();
        }


        List<ButieTongjiYuebao> result = myDataMapper.ButieTongjiYuebao(customerDataExample);
        result.add(SumButieTongji(result));
        return result;
    }

    public List<ButieTongjiYuebao> ButieTongjiByBackendAccount(JSONObject jsonQuery) {
        CUSTOMER_DATAExample customerDataExample = new CUSTOMER_DATAExample();
        CUSTOMER_DATAExample.Criteria criteria = customerDataExample.createCriteria();
        try {
            if (jsonQuery.containsKey("startPeriod") && !jsonQuery.getString("startPeriod").equals("") && jsonQuery.containsKey("endPeriod") && !jsonQuery.getString("endPeriod").equals("")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date startPeriod = sdf.parse(jsonQuery.getString("startPeriod"));
                Date endPeriod = sdf.parse(jsonQuery.getString("endPeriod"));
                criteria.andDatePeriodBetween(startPeriod, endPeriod);
            }
            //customerDataExample.or(criteria);
        } catch (Exception e) {
            e.printStackTrace();
        }


        List<ButieTongjiYuebao> result =myDataMapper.ButieTongjiByBackendAccount(customerDataExample);
        result.add(SumButieTongji(result));
        return result;
    }

    public List<ButieTongjiYuebao> FadianYichang(JSONObject jsonQuery) {
        CUSTOMER_DATAExample customerDataExample = new CUSTOMER_DATAExample();
        CUSTOMER_DATAExample.Criteria criteria = customerDataExample.createCriteria();
        try {
            if (jsonQuery.containsKey("startPeriod") && !jsonQuery.getString("startPeriod").equals("") && jsonQuery.containsKey("endPeriod") && !jsonQuery.getString("endPeriod").equals("")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date startPeriod = sdf.parse(jsonQuery.getString("startPeriod"));
                Date endPeriod = sdf.parse(jsonQuery.getString("endPeriod"));
                criteria.andDatePeriodBetween(startPeriod, endPeriod);
            }
            //customerDataExample.or(criteria);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return myDataMapper.fadianyichang(customerDataExample);
    }

    public List<ButieTongjiYuebao> queryGroupByCustomerID(JSONObject jsonQuery) {
        ButieTongjiYuebao_Example butieTongjiYuebaoExample = new ButieTongjiYuebao_Example();
        ButieTongjiYuebao_Example.Criteria criteria = butieTongjiYuebaoExample.createCriteria();
        try {
            if (jsonQuery.containsKey("startPeriod") && !jsonQuery.getString("startPeriod").equals("") && jsonQuery.containsKey("endPeriod") && !jsonQuery.getString("endPeriod").equals("")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date startPeriod = sdf.parse(jsonQuery.getString("startPeriod"));
                Date endPeriod = sdf.parse(jsonQuery.getString("endPeriod"));
                criteria.andDatePeriodBetween(startPeriod, endPeriod);
            }
            if (jsonQuery.containsKey("danwei")) {
                List<String> danwei = (List<String>) jsonQuery.get("danwei");
                if (danwei.size() > 0) {
                    criteria.andDanweiIn(danwei);
                }
            }
            if (jsonQuery.containsKey("bankNames")) {
                List<String> bankNames = (List<String>) jsonQuery.get("bankNames");
                if (bankNames.size() > 0) {
                    criteria.andBankNameIn(bankNames);
                }
            }
            if (jsonQuery.containsKey("xiaonaFangshi")) {
                List<String> xiaonaFangshi = (List<String>) jsonQuery.get("xiaonaFangshi");
                if (xiaonaFangshi.size() > 0) {
                    criteria.andXiaonaFangshiIn(xiaonaFangshi);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        List<ButieTongjiYuebao> result = myDataMapper.SumByCustomerId(butieTongjiYuebaoExample);
        result.add(SumButieTongji(result));
        return result;
    }

    public ButieTongjiYuebao SumButieTongji(List<ButieTongjiYuebao> butieTongjiYuebaoList) {
        ButieTongjiYuebao butieTongjiYuebao = new ButieTongjiYuebao();
        butieTongjiYuebao.setButieheji((float) 0);
        butieTongjiYuebao.setFaDianliang((float) 0);
        butieTongjiYuebao.setYingfuDianfei((float) 0);
        butieTongjiYuebao.setZhongyangBuzhuZijinYingxiao((float) 0);
        butieTongjiYuebao.setShengBuzhuZijinYingxiao((float) 0);
        butieTongjiYuebao.setShiBuzhuZijinYingxiao((float) 0);
        butieTongjiYuebao.setXianBuzhuZijinYingxiao((float) 0);
        butieTongjiYuebao.setContactCapacity((float) 0);


        for (ButieTongjiYuebao item : butieTongjiYuebaoList) {
            butieTongjiYuebao.setButieheji(butieTongjiYuebao.getButieheji() + (item.getButieheji() == null ? 0 : item.getButieheji()));
            butieTongjiYuebao.setFaDianliang(butieTongjiYuebao.getFaDianliang() + (item.getFaDianliang() == null ? 0 : item.getFaDianliang()));
            butieTongjiYuebao.setYingfuDianfei(butieTongjiYuebao.getYingfuDianfei() + (item.getYingfuDianfei() == null ? 0 : item.getYingfuDianfei()));
            butieTongjiYuebao.setZhongyangBuzhuZijinYingxiao(butieTongjiYuebao.getZhongyangBuzhuZijinYingxiao() + (item.getZhongyangBuzhuZijinYingxiao() == null ? 0 : item.getZhongyangBuzhuZijinYingxiao()));
            butieTongjiYuebao.setShengBuzhuZijinYingxiao(butieTongjiYuebao.getShengBuzhuZijinYingxiao() + (item.getShengBuzhuZijinYingxiao() == null ? 0 : item.getShengBuzhuZijinYingxiao()));
            butieTongjiYuebao.setShiBuzhuZijinYingxiao(butieTongjiYuebao.getShiBuzhuZijinYingxiao() + (item.getShiBuzhuZijinYingxiao() == null ? 0 : item.getShiBuzhuZijinYingxiao()));
            butieTongjiYuebao.setXianBuzhuZijinYingxiao(butieTongjiYuebao.getXianBuzhuZijinYingxiao() + (item.getXianBuzhuZijinYingxiao() == null ? 0 : item.getXianBuzhuZijinYingxiao()));
            butieTongjiYuebao.setContactCapacity(butieTongjiYuebao.getContactCapacity() + (item.getContactCapacity() == null ? 0 : item.getContactCapacity()));
        }

        butieTongjiYuebao.setButieheji(Float.parseFloat(format2.format(butieTongjiYuebao.getButieheji())));
        butieTongjiYuebao.setFaDianliang(Float.parseFloat(format2.format(butieTongjiYuebao.getFaDianliang())));
        butieTongjiYuebao.setYingfuDianfei(Float.parseFloat(format2.format(butieTongjiYuebao.getYingfuDianfei())));
        butieTongjiYuebao.setZhongyangBuzhuZijinYingxiao(Float.parseFloat(format2.format(butieTongjiYuebao.getZhongyangBuzhuZijinYingxiao())));
        butieTongjiYuebao.setShengBuzhuZijinYingxiao(Float.parseFloat(format2.format(butieTongjiYuebao.getShengBuzhuZijinYingxiao())));
        butieTongjiYuebao.setShiBuzhuZijinYingxiao(Float.parseFloat(format2.format(butieTongjiYuebao.getShiBuzhuZijinYingxiao())));
        butieTongjiYuebao.setXianBuzhuZijinYingxiao(Float.parseFloat(format2.format(butieTongjiYuebao.getXianBuzhuZijinYingxiao())));
        butieTongjiYuebao.setContactCapacity(Float.parseFloat(format2.format(butieTongjiYuebao.getContactCapacity())));


        return butieTongjiYuebao;
    }
}

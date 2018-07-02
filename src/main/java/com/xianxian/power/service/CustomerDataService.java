package com.xianxian.power.service;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.mapper.CUSTOMER_DATAMapper;
import com.xianxian.power.mapper.CUSTOMER_DATA_NEWMapper;
import com.xianxian.power.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDataService {

    CUSTOMER_DATAMapper customerDataMapper;
    CUSTOMER_DATA_NEWMapper customerDataNewMapper;

    @Autowired
    public void setCustomerDataMapper(CUSTOMER_DATAMapper customerDataMapper,CUSTOMER_DATA_NEWMapper customerDataNewMapper) {
        this.customerDataMapper = customerDataMapper;
        this.customerDataNewMapper=customerDataNewMapper;
    }

    public List<CUSTOMER_DATA> queryCustomerData(JSONObject jsonQuery) {
        CUSTOMER_DATAExample customerDataExample = new CUSTOMER_DATAExample();

        CUSTOMER_DATAExample.Criteria criteria = customerDataExample.createCriteria();

        if (jsonQuery.containsKey("startPeriod") && jsonQuery.containsKey("endPeriod")) {
            criteria.andDatePeriodBetween(jsonQuery.getDate("startPeriod"), jsonQuery.getDate("endPeriod"));
        }
        if (jsonQuery.containsKey("customerId")) {
            criteria.andCustomerIdEqualTo(jsonQuery.getString("customerId"));
        }

        if (jsonQuery.containsKey("customerName")) {
            criteria.andCusomerNameEqualTo("customerName");
        }

        customerDataExample.or(criteria);

        return customerDataMapper.selectByExample(customerDataExample);

    }

    public List<CUSTOMER_DATA_NEW> queryCustomerDataNew(JSONObject jsonQuery) {
        CUSTOMER_DATA_NEWExample customerDataNewExample = new CUSTOMER_DATA_NEWExample();

        CUSTOMER_DATA_NEWExample.Criteria criteria = customerDataNewExample.createCriteria();

        if (jsonQuery.containsKey("startPeriod") && jsonQuery.containsKey("endPeriod")) {
            criteria.andDatePeriodBetween(jsonQuery.getDate("startPeriod"), jsonQuery.getDate("endPeriod"));
        }
        if (jsonQuery.containsKey("customerId")) {
            criteria.andCustomerIdEqualTo(jsonQuery.getString("customerId"));
        }

        if (jsonQuery.containsKey("customerName")) {
            criteria.andCusomerNameEqualTo("customerName");
        }

        customerDataNewExample.or(criteria);

        return customerDataNewMapper.selectByExample(customerDataNewExample);

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
}

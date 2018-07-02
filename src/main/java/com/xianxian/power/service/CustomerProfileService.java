package com.xianxian.power.service;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.mapper.CUSTOMER_PROFILEMapper;
import com.xianxian.power.mapper.CUSTOMER_PROFILE_NEWMapper;
import com.xianxian.power.model.CUSTOMER_PROFILE;
import com.xianxian.power.model.CUSTOMER_PROFILEExample;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEW;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEWExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerProfileService {
    CUSTOMER_PROFILEMapper customerProfileMapper;
    CUSTOMER_PROFILE_NEWMapper customerProfileNewMapper;

    @Autowired
    public void setCustomerDataMapper(CUSTOMER_PROFILEMapper customerProfileMapper, CUSTOMER_PROFILE_NEWMapper customerProfileNewMapper) {
        this.customerProfileMapper = customerProfileMapper;
        this.customerProfileNewMapper = customerProfileNewMapper;
    }

    public List<CUSTOMER_PROFILE> queryCustomerProfile(JSONObject jsonQuery) {
        CUSTOMER_PROFILEExample customerProfileExample = new CUSTOMER_PROFILEExample();

        CUSTOMER_PROFILEExample.Criteria criteria = customerProfileExample.createCriteria();

        if (jsonQuery.containsKey("customerId")) {
            criteria.andCustomerIdEqualTo(jsonQuery.getString("customerId"));
        }

        if (jsonQuery.containsKey("customerName")) {
            criteria.andCusomerNameEqualTo("customerName");
        }

        customerProfileExample.or(criteria);

        return customerProfileMapper.selectByExample(customerProfileExample);

    }

    public List<CUSTOMER_PROFILE_NEW> queryCustomerDataNew(JSONObject jsonQuery) {
        CUSTOMER_PROFILE_NEWExample customerProfileNewExample = new CUSTOMER_PROFILE_NEWExample();

        CUSTOMER_PROFILE_NEWExample.Criteria criteria = customerProfileNewExample.createCriteria();

        if (jsonQuery.containsKey("customerId")) {
            criteria.andCustomerIdEqualTo(jsonQuery.getString("customerId"));
        }

        if (jsonQuery.containsKey("customerName")) {
            criteria.andCusomerNameEqualTo("customerName");
        }

        customerProfileNewExample.or(criteria);

        return customerProfileNewMapper.selectByExample(customerProfileNewExample);

    }

    public void updateCustomerProfile(List<CUSTOMER_PROFILE> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerProfileMapper.updateByPrimaryKeySelective(updatedRows.get(i));
        }
    }

    public void deleteCustomerProfile(List<CUSTOMER_PROFILE> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerProfileMapper.deleteByPrimaryKey(updatedRows.get(i).getCustomerId());
        }
    }

    public void createCustomerProfile(CUSTOMER_PROFILE customerProfile) {
        customerProfileMapper.insertSelective(customerProfile);
    }

}

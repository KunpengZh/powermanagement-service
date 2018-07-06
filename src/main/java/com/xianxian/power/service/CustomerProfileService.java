package com.xianxian.power.service;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.mapper.CUSTOMER_PROFILEMapper;
import com.xianxian.power.mapper.CUSTOMER_PROFILE_NEWMapper;
import com.xianxian.power.model.CUSTOMER_PROFILE;
import com.xianxian.power.model.CUSTOMER_PROFILEExample;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEW;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEWExample;
import com.xianxian.power.utils.POWERUTILS;
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
            criteria.andCustomerNameEqualTo("customerName");
        }

        customerProfileExample.or(criteria);

        return customerProfileMapper.selectByExample(customerProfileExample);

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

    public void updateCustomerProfileNew(List<CUSTOMER_PROFILE_NEW> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerProfileNewMapper.updateByPrimaryKeySelective(updatedRows.get(i));
        }
    }

    public void deleteCustomerProfileNew(List<CUSTOMER_PROFILE_NEW> updatedRows) {

        for (int i = 0; i < updatedRows.size(); i++) {
            customerProfileNewMapper.deleteByPrimaryKey(updatedRows.get(i).getIndexid());
        }
    }

    public List<CUSTOMER_PROFILE_NEW> getAllCustomerProfileNew() {
        CUSTOMER_PROFILE_NEWExample customerProfileNewExample = new CUSTOMER_PROFILE_NEWExample();
        return customerProfileNewMapper.selectByExample(customerProfileNewExample);
    }

    public int moveCustomerProfile(List<CUSTOMER_PROFILE_NEW> customerProfileNews) {
        int count = 0;
        try {
            for (CUSTOMER_PROFILE_NEW customerProfileNew : customerProfileNews) {
                if (null != customerProfileNew.getCustomerId() && !customerProfileNew.getCustomerId().trim().equalsIgnoreCase("")) {
                    CUSTOMER_PROFILE customerProfile = POWERUTILS.convertBean(customerProfileNew, CUSTOMER_PROFILE.class);
                    if (customerProfileMapper.insertSelective(customerProfile) > 0) {
                        customerProfileNewMapper.deleteByPrimaryKey(customerProfileNew.getIndexid());
                        count++;
                    }
                }
            }
            return count;
        } catch (Exception e) {
            e.printStackTrace();
            return count;
        }
    }

}

package com.xianxian.power.repository;

import com.xianxian.power.mapper.CUSTOMER_PROFILEMapper;
import com.xianxian.power.model.CUSTOMER_PROFILE;
import com.xianxian.power.model.CUSTOMER_PROFILEExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerProfileRepository {

    private CUSTOMER_PROFILEMapper customerProfileMapper;

    @Autowired
    public void setCustomerProfileMapper(CUSTOMER_PROFILEMapper customerProfileMapper) {
        this.customerProfileMapper = customerProfileMapper;
    }

    public int insertCustomerProfile(CUSTOMER_PROFILE customerProfile) {
        return customerProfileMapper.insertSelective(customerProfile);
    }

    public int countByCustomerId(String customerId) {
        CUSTOMER_PROFILEExample customerProfileExample = new CUSTOMER_PROFILEExample();
        customerProfileExample.createCriteria().andCustomerIdEqualTo(customerId);
        return customerProfileMapper.countByExample(customerProfileExample);
    }

    public int updateCustomerProfile(CUSTOMER_PROFILE customerProfile) {
        return customerProfileMapper.updateByPrimaryKeySelective(customerProfile);
    }

    public CUSTOMER_PROFILE selectByCustomerId(String customerId) {
        return customerProfileMapper.selectByPrimaryKey(customerId);
    }

    public int deleteByCustomerId(String customerId) {
        return customerProfileMapper.deleteByPrimaryKey(customerId);
    }

    public List<CUSTOMER_PROFILE> getAllCustomerProfile() {
        CUSTOMER_PROFILEExample customerProfileExample = new CUSTOMER_PROFILEExample();
        return customerProfileMapper.selectByExample(customerProfileExample);
    }
}

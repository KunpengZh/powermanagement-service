package com.xianxian.power.repository;

import com.xianxian.power.mapper.CustomerProfileMapper;
import com.xianxian.power.model.CustomerProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerProfileRepository {

    private CustomerProfileMapper customerProfileMapper;

    @Autowired
    public void setCustomerProfileMapper(CustomerProfileMapper customerProfileMapper) {
        this.customerProfileMapper = customerProfileMapper;
    }

    public int insertCustomerProfile(CustomerProfile customerProfile) {
        return customerProfileMapper.insertSelective(customerProfile);
    }

    public int countByCustomerId(String customerId) {
        return customerProfileMapper.countByCustomerId(customerId);
    }

    public int updateCustomerProfile(CustomerProfile customerProfile){
        return customerProfileMapper.updateSelectiveByPrimaryKey(customerProfile);
    }

    public CustomerProfile selectByCustomerId(String customerId){
        return customerProfileMapper.selectByPrimaryKey(customerId);
    }

    public int deleteByCustomerId(String customerId){
        return customerProfileMapper.deleteByPrimaryKey(customerId);
    }

    public List<CustomerProfile> getAllCustomerProfile(){
        return customerProfileMapper.getAllCustomerProfile();
    }
}

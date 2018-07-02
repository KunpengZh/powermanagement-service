package com.xianxian.power.mapper;

import com.xianxian.power.model.CustomerProfile;

import java.util.List;

public interface CustomerProfileMapper {

    int deleteByPrimaryKey(String customerId);
    int insertSelective(CustomerProfile record);
    CustomerProfile selectByPrimaryKey(String customerId);
    int countByCustomerId(String customerId);
    int updateSelectiveByPrimaryKey(CustomerProfile record);
    List<CustomerProfile> getAllCustomerProfile();

}
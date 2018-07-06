package com.xianxian.power.repository;

import com.xianxian.power.mapper.CUSTOMER_PROFILE_NEWMapper;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEW;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEWExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerProfileNewRepository {

    private CUSTOMER_PROFILE_NEWMapper customerProfileNewMapper;

    @Autowired
    public void setCustomerProfileNewMapper(CUSTOMER_PROFILE_NEWMapper customerProfileNewMapper) {
        this.customerProfileNewMapper = customerProfileNewMapper;
    }

    public int InsertCustomerProfileNew(CUSTOMER_PROFILE_NEW customer_profile_new) {
        return customerProfileNewMapper.insertSelective(customer_profile_new);
    }

    public int updateCustomerProfileNew(CUSTOMER_PROFILE_NEW customerProfileNew) {
        return customerProfileNewMapper.updateByPrimaryKeySelective(customerProfileNew);
    }

    public int deleteCustomerProfileNew(int key) {
        return customerProfileNewMapper.deleteByPrimaryKey(key);
    }

    public List<CUSTOMER_PROFILE_NEW> getAllCustomerProfileNew() {
        CUSTOMER_PROFILE_NEWExample customerProfileNewExample = new CUSTOMER_PROFILE_NEWExample();
        return customerProfileNewMapper.selectByExample(customerProfileNewExample);
    }
}

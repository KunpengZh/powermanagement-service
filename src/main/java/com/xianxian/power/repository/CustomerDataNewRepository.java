package com.xianxian.power.repository;

import com.xianxian.power.mapper.CUSTOMER_DATA_NEWMapper;
import com.xianxian.power.model.CUSTOMER_DATA_NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDataNewRepository {

    CUSTOMER_DATA_NEWMapper customerDataNewMapper;

    @Autowired
    public void setCustomerDataNewMapper(CUSTOMER_DATA_NEWMapper customerDataNewMapper) {
        this.customerDataNewMapper = customerDataNewMapper;
    }

    public int insertCustomerDataNew(CUSTOMER_DATA_NEW customerDataNew){
       return  customerDataNewMapper.insertSelective(customerDataNew);
    }

    public int deleteCustomerDataNew(int indexId){
        return customerDataNewMapper.deleteByPrimaryKey( indexId);
    }

}

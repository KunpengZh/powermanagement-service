package com.xianxian.power.repository;

import com.xianxian.power.mapper.CUSTOMER_DATAMapper;
import com.xianxian.power.mapper.CustomerDataMapper;
import com.xianxian.power.model.CUSTOMER_DATA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerDataRepository {

    private CUSTOMER_DATAMapper customerDataMapper;
    private CustomerDataMapper myDataMapper;

    @Autowired
    public void setCustomerDataMapper(CUSTOMER_DATAMapper customerDataMapper) {
        this.customerDataMapper = customerDataMapper;
    }



    public int insertCustomerData(CUSTOMER_DATA customerData) {
        return customerDataMapper.insertSelective(customerData);
    }

    public List<String> getAllDanwei() {
        return myDataMapper.getAllDanwei();
    }
}

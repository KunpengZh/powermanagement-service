package com.xianxian.power.repository;

import com.xianxian.power.mapper.CUSTOMER_DATA_NEWMapper;
import com.xianxian.power.model.CUSTOMER_DATA_NEW;
import com.xianxian.power.model.CUSTOMER_DATA_NEWExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDataNewRepository {

    CUSTOMER_DATA_NEWMapper customerDataNewMapper;

    @Autowired
    public void setCustomerDataNewMapper(CUSTOMER_DATA_NEWMapper customerDataNewMapper) {
        this.customerDataNewMapper = customerDataNewMapper;
    }

    public int insertCustomerDataNew(CUSTOMER_DATA_NEW customerDataNew) {
        return customerDataNewMapper.insertSelective(customerDataNew);
    }

    public int deleteCustomerDataNew(int indexId) {
        return customerDataNewMapper.deleteByPrimaryKey(indexId);
    }


    public int updateCustomerDataNew(CUSTOMER_DATA_NEW customerDataNew) {
        return customerDataNewMapper.updateByPrimaryKeySelective(customerDataNew);
    }

    public List<CUSTOMER_DATA_NEW> getAllCustomerDataNew() {
        CUSTOMER_DATA_NEWExample customerDataNewExample = new CUSTOMER_DATA_NEWExample();
        return customerDataNewMapper.selectByExample(customerDataNewExample);
    }

}

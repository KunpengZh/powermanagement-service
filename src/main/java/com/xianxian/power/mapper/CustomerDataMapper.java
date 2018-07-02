package com.xianxian.power.mapper;

import com.xianxian.power.model.CustomerData;
import com.xianxian.power.model.CustomerProfile;

public interface CustomerDataMapper {
    int deleteByPrimaryKey(String indexId);
    int insertSelective(CustomerData record);
    CustomerData selectByPrimaryKey(String indexId);
    int updateSelectiveByPrimaryKey(CustomerProfile record);
}

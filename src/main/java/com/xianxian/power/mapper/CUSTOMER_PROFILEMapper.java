package com.xianxian.power.mapper;

import com.xianxian.power.model.CUSTOMER_PROFILE;
import com.xianxian.power.model.CUSTOMER_PROFILEExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUSTOMER_PROFILEMapper {
    int countByExample(CUSTOMER_PROFILEExample example);

    int deleteByExample(CUSTOMER_PROFILEExample example);

    int deleteByPrimaryKey(String customerId);

    int insert(CUSTOMER_PROFILE record);

    int insertSelective(CUSTOMER_PROFILE record);

    List<CUSTOMER_PROFILE> selectByExample(CUSTOMER_PROFILEExample example);

    CUSTOMER_PROFILE selectByPrimaryKey(String customerId);

    int updateByExampleSelective(@Param("record") CUSTOMER_PROFILE record, @Param("example") CUSTOMER_PROFILEExample example);

    int updateByExample(@Param("record") CUSTOMER_PROFILE record, @Param("example") CUSTOMER_PROFILEExample example);

    int updateByPrimaryKeySelective(CUSTOMER_PROFILE record);

    int updateByPrimaryKey(CUSTOMER_PROFILE record);
}
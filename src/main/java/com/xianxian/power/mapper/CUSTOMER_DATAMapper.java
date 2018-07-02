package com.xianxian.power.mapper;

import com.xianxian.power.model.CUSTOMER_DATA;
import com.xianxian.power.model.CUSTOMER_DATAExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUSTOMER_DATAMapper {
    int countByExample(CUSTOMER_DATAExample example);

    int deleteByExample(CUSTOMER_DATAExample example);

    int deleteByPrimaryKey(Integer indexid);

    int insert(CUSTOMER_DATA record);

    int insertSelective(CUSTOMER_DATA record);

    List<CUSTOMER_DATA> selectByExample(CUSTOMER_DATAExample example);

    CUSTOMER_DATA selectByPrimaryKey(Integer indexid);

    int updateByExampleSelective(@Param("record") CUSTOMER_DATA record, @Param("example") CUSTOMER_DATAExample example);

    int updateByExample(@Param("record") CUSTOMER_DATA record, @Param("example") CUSTOMER_DATAExample example);

    int updateByPrimaryKeySelective(CUSTOMER_DATA record);

    int updateByPrimaryKey(CUSTOMER_DATA record);
}
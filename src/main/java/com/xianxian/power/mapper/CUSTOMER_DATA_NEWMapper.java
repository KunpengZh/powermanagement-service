package com.xianxian.power.mapper;

import com.xianxian.power.model.CUSTOMER_DATA_NEW;
import com.xianxian.power.model.CUSTOMER_DATA_NEWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUSTOMER_DATA_NEWMapper {
    int countByExample(CUSTOMER_DATA_NEWExample example);

    int deleteByExample(CUSTOMER_DATA_NEWExample example);

    int deleteByPrimaryKey(Integer indexid);

    int insert(CUSTOMER_DATA_NEW record);

    int insertSelective(CUSTOMER_DATA_NEW record);

    List<CUSTOMER_DATA_NEW> selectByExample(CUSTOMER_DATA_NEWExample example);

    CUSTOMER_DATA_NEW selectByPrimaryKey(Integer indexid);

    int updateByExampleSelective(@Param("record") CUSTOMER_DATA_NEW record, @Param("example") CUSTOMER_DATA_NEWExample example);

    int updateByExample(@Param("record") CUSTOMER_DATA_NEW record, @Param("example") CUSTOMER_DATA_NEWExample example);

    int updateByPrimaryKeySelective(CUSTOMER_DATA_NEW record);

    int updateByPrimaryKey(CUSTOMER_DATA_NEW record);
}
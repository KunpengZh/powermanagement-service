package com.xianxian.power.mapper;

import com.xianxian.power.model.CUSTOMER_PROFILE_NEW;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEWExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CUSTOMER_PROFILE_NEWMapper {
    int countByExample(CUSTOMER_PROFILE_NEWExample example);

    int deleteByExample(CUSTOMER_PROFILE_NEWExample example);

    int deleteByPrimaryKey(Integer indexid);

    int insert(CUSTOMER_PROFILE_NEW record);

    int insertSelective(CUSTOMER_PROFILE_NEW record);

    List<CUSTOMER_PROFILE_NEW> selectByExample(CUSTOMER_PROFILE_NEWExample example);

    CUSTOMER_PROFILE_NEW selectByPrimaryKey(Integer indexid);

    int updateByExampleSelective(@Param("record") CUSTOMER_PROFILE_NEW record, @Param("example") CUSTOMER_PROFILE_NEWExample example);

    int updateByExample(@Param("record") CUSTOMER_PROFILE_NEW record, @Param("example") CUSTOMER_PROFILE_NEWExample example);

    int updateByPrimaryKeySelective(CUSTOMER_PROFILE_NEW record);

    int updateByPrimaryKey(CUSTOMER_PROFILE_NEW record);
}
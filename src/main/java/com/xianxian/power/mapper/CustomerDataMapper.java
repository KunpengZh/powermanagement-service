package com.xianxian.power.mapper;

import com.xianxian.power.model.ButieTongjiYuebao;
import com.xianxian.power.model.CUSTOMER_DATAExample;

import java.util.List;

public interface CustomerDataMapper {

    List<String> getAllDanwei();

    List<ButieTongjiYuebao> ButieTongjiYuebao(CUSTOMER_DATAExample example);
}

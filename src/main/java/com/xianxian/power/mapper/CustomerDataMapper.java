package com.xianxian.power.mapper;

import com.xianxian.power.model.ButieTongjiYuebao;
import com.xianxian.power.model.ButieTongjiYuebao_Example;
import com.xianxian.power.model.CUSTOMER_DATAExample;

import java.util.List;

public interface CustomerDataMapper {

    List<String> getAllDanwei();
    List<String> getAllBank();
    List<String> getAllXiaonaFangshi();

    List<ButieTongjiYuebao> SumByCustomerId(ButieTongjiYuebao_Example example);
    List<ButieTongjiYuebao> ButieTongjiByBackendAccount(CUSTOMER_DATAExample example);
    List<ButieTongjiYuebao> fadianyichang(CUSTOMER_DATAExample example);
    List<ButieTongjiYuebao> ButieTongjiYuebao(CUSTOMER_DATAExample example);
}

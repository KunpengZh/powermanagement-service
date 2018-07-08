package com.xianxian.power.controller;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.model.ButieTongjiYuebao;
import com.xianxian.power.model.CUSTOMER_DATA;
import com.xianxian.power.model.CUSTOMER_DATA_NEW;
import com.xianxian.power.service.CustomerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/customerdata")
public class CustomerDataController {

    @Autowired
    CustomerDataService customerDataService;

    @RequestMapping(value = "/getCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> getCustomerData(@RequestBody JSONObject jsonQuery) {
        List<CUSTOMER_DATA> result = customerDataService.queryCustomerData(jsonQuery);
        return result;
    }

    @RequestMapping(value = "updateCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> updateCustomerData(@RequestBody List<CUSTOMER_DATA> updatedRows) {
        customerDataService.updateCustomerProfile(updatedRows);
        return customerDataService.queryCustomerData(new JSONObject());
    }

    @RequestMapping(value = "/deleteCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> deleteCustomerData(@RequestBody List<CUSTOMER_DATA> updatedRows) {
        customerDataService.deleteCustomerProfile(updatedRows);
        return customerDataService.queryCustomerData(new JSONObject());
    }

    @RequestMapping(value = "/createCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> createCustomerData(@RequestBody CUSTOMER_DATA customerProfile) {
        if (customerProfile.getCustomerId() != null && !customerProfile.getCustomerId().equalsIgnoreCase("")) {
            customerDataService.createCustomerProfile(customerProfile);
        }
        return customerDataService.queryCustomerData(new JSONObject());
    }

    @RequestMapping(value = "/getAllCustomerDataNew", method = RequestMethod.GET)
    public List<CUSTOMER_DATA_NEW> getAllCustomerDataNew() {
        return customerDataService.getAllCustomerDataNew();
    }

    @RequestMapping(value = "updateCustomerDataNew", method = RequestMethod.POST)
    public List<CUSTOMER_DATA_NEW> updateCustomerDataNew(@RequestBody List<CUSTOMER_DATA_NEW> updatedRows) {
        customerDataService.updateCustomerProfileNew(updatedRows);
        return customerDataService.getAllCustomerDataNew();
    }

    @RequestMapping(value = "/deleteCustomerDataNew", method = RequestMethod.POST)
    public List<CUSTOMER_DATA_NEW> deleteCustomerDataNew(@RequestBody List<CUSTOMER_DATA_NEW> updatedRows) {
        customerDataService.deleteCustomerProfileNew(updatedRows);
        return customerDataService.getAllCustomerDataNew();
    }

    @RequestMapping(value = "/moveCustomerData", method = RequestMethod.POST)
    public JSONObject moveCustomerData(@RequestBody List<CUSTOMER_DATA_NEW> customers) {
        JSONObject res = new JSONObject();
        int count = customerDataService.moveCustomerData(customers);
        res.put("count", count);
        res.put("message", "Updated successfully");
        List<CUSTOMER_DATA_NEW> customerDataNewList = customerDataService.getAllCustomerDataNew();
        res.put("customerDataNewList", customerDataNewList);
        return res;
    }

    @RequestMapping(value = "/getAllDanwei", method = RequestMethod.GET)
    public List<String> getAllDanwei() {
        return customerDataService.getAllDanwei();
    }

    @RequestMapping(value = "/getAllBankName", method = RequestMethod.GET)
    public List<String> getAllBankName() {
        return customerDataService.getAllBankName();
    }

    @RequestMapping(value = "/getAllXiaonaFangshi", method = RequestMethod.GET)
    public List<String> getAllXiaonaFangshi() {
        return customerDataService.getAllXiaonaFangshi();
    }

    @RequestMapping(value = "/queryButtieTongjiYuebao", method = RequestMethod.POST)
    public List<ButieTongjiYuebao> queryButtieTongjiYuebao(@RequestBody JSONObject jsonQuery) {
        if (!jsonQuery.containsKey("startPeriod") || jsonQuery.getString("startPeriod").equals("")
                || !jsonQuery.containsKey("endPeriod") || jsonQuery.getString("endPeriod").equals("")
                || !jsonQuery.containsKey("danwei") || jsonQuery.getString("danwei").equals("")) {
            return new ArrayList<>();
        }
        return customerDataService.getButieTongjiYueBao(jsonQuery);
    }

    @RequestMapping(value = "/ButieTongjiByBackendAccount", method = RequestMethod.POST)
    public List<ButieTongjiYuebao> ButieTongjiByBackendAccount(@RequestBody JSONObject jsonQuery) {
        if (!jsonQuery.containsKey("startPeriod") || jsonQuery.getString("startPeriod").equals("")
                || !jsonQuery.containsKey("endPeriod") || jsonQuery.getString("endPeriod").equals("")) {
            return new ArrayList<>();
        }
        return customerDataService.ButieTongjiByBackendAccount(jsonQuery);
    }

    @RequestMapping(value = "/Fadianyichang", method = RequestMethod.POST)
    public List<ButieTongjiYuebao> Fadianyichang(@RequestBody JSONObject jsonQuery) {
        if (!jsonQuery.containsKey("startPeriod") || jsonQuery.getString("startPeriod").equals("")
                || !jsonQuery.containsKey("endPeriod") || jsonQuery.getString("endPeriod").equals("")) {
            return new ArrayList<>();
        }
        return customerDataService.FadianYichang(jsonQuery);
    }

    @RequestMapping(value = "/queryGroupByCustomerId", method = RequestMethod.POST)
    public List<ButieTongjiYuebao> queryGroupByCustomerId(@RequestBody JSONObject jsonQuery) {
        return customerDataService.queryGroupByCustomerID(jsonQuery);
    }
}

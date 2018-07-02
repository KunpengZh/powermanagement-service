package com.xianxian.power.controller;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.model.CUSTOMER_DATA;
import com.xianxian.power.service.CustomerDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customerdata")
public class CustomerDataController {

    @Autowired
    CustomerDataService customerDataService;

    @RequestMapping(value = "/getCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> getCustomerData(@RequestBody JSONObject jsonQuery) {
        return customerDataService.queryCustomerData(jsonQuery);
    }

    @RequestMapping(value = "updateCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> updateCustomerProfile(@RequestBody List<CUSTOMER_DATA> updatedRows) {
        customerDataService.updateCustomerProfile(updatedRows);
        return customerDataService.queryCustomerData(new JSONObject());
    }

    @RequestMapping(value = "/deleteCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> deleteCustomerProfile(@RequestBody List<CUSTOMER_DATA> updatedRows) {
        customerDataService.deleteCustomerProfile(updatedRows);
        return customerDataService.queryCustomerData(new JSONObject());
    }

    @RequestMapping(value = "/createCustomerData", method = RequestMethod.POST)
    public List<CUSTOMER_DATA> createCustomerProfile(@RequestBody CUSTOMER_DATA customerProfile) {
        if (customerProfile.getCustomerId() != null && !customerProfile.getCustomerId().equalsIgnoreCase("")) {
            customerDataService.createCustomerProfile(customerProfile);
        }
        return customerDataService.queryCustomerData(new JSONObject());
    }
}

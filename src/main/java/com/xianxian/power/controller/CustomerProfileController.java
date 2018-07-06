package com.xianxian.power.controller;


import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.model.CUSTOMER_PROFILE;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEW;
import com.xianxian.power.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customerprofile")
public class CustomerProfileController {

    @Autowired
    CustomerProfileService customerProfileService;


    @RequestMapping(value = "getCustomerProfile", method = RequestMethod.POST)
    public List<CUSTOMER_PROFILE> getCustomerProfile(@RequestBody JSONObject jsonQuery) {
        return customerProfileService.queryCustomerProfile(jsonQuery);
    }

    @RequestMapping(value = "updateCustomerProfile", method = RequestMethod.POST)
    public List<CUSTOMER_PROFILE> updateCustomerProfile(@RequestBody List<CUSTOMER_PROFILE> updatedRows) {
        customerProfileService.updateCustomerProfile(updatedRows);
        return customerProfileService.queryCustomerProfile(new JSONObject());
    }

    @RequestMapping(value = "/deleteCustomerProfile", method = RequestMethod.POST)
    public List<CUSTOMER_PROFILE> deleteCustomerProfile(@RequestBody List<CUSTOMER_PROFILE> updatedRows) {
        customerProfileService.deleteCustomerProfile(updatedRows);
        return customerProfileService.queryCustomerProfile(new JSONObject());
    }

    @RequestMapping(value = "/createCustomerProfile", method = RequestMethod.POST)
    public List<CUSTOMER_PROFILE> createCustomerProfile(@RequestBody CUSTOMER_PROFILE customerProfile) {
        if (customerProfile.getCustomerId() != null && !customerProfile.getCustomerId().equalsIgnoreCase("")) {
            customerProfileService.createCustomerProfile(customerProfile);
        }
        return customerProfileService.queryCustomerProfile(new JSONObject());
    }

    @RequestMapping(value = "updateCustomerProfileNew", method = RequestMethod.POST)
    public List<CUSTOMER_PROFILE_NEW> updateCustomerProfileNew(@RequestBody List<CUSTOMER_PROFILE_NEW> updatedRows) {
        customerProfileService.updateCustomerProfileNew(updatedRows);
        return customerProfileService.getAllCustomerProfileNew();
    }

    @RequestMapping(value = "/deleteCustomerProfileNew", method = RequestMethod.POST)
    public List<CUSTOMER_PROFILE_NEW> deleteCustomerProfileNew(@RequestBody List<CUSTOMER_PROFILE_NEW> updatedRows) {
        customerProfileService.deleteCustomerProfileNew(updatedRows);
        return customerProfileService.getAllCustomerProfileNew();
    }

    @RequestMapping(value = "getAllCustomerProfileNew")
    public List<CUSTOMER_PROFILE_NEW> getAllCustomerProfileNew() {
        return customerProfileService.getAllCustomerProfileNew();
    }

    @RequestMapping(value = "moveCustomerProfile", method = RequestMethod.POST)
    public JSONObject moveCustomerProfile(@RequestBody List<CUSTOMER_PROFILE_NEW> customers) {
        JSONObject res = new JSONObject();
        int count = customerProfileService.moveCustomerProfile(customers);
        res.put("count", count);
        res.put("message", "Updated successfully");
        List<CUSTOMER_PROFILE_NEW> customerProfileNewList=customerProfileService.getAllCustomerProfileNew();
        res.put("customerProfileNewList", customerProfileNewList);
        return res;
    }
}

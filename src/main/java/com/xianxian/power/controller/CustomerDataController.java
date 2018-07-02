package com.xianxian.power.controller;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.service.CustomerDataService;
import com.xianxian.power.utils.ExcelImportUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@RestController
public class CustomerDataController {
    private CustomerDataService customerDataService;

    @Autowired
    public void setCustomerProfileService(CustomerDataService customerDataService) {
        this.customerDataService = customerDataService;
    }


    @RequestMapping(value = "/dataupdate", method = RequestMethod.POST)
    public JSONObject fileUpload(@RequestParam("file") MultipartFile uploadedFile, HttpServletRequest request) throws IOException {
        JSONObject res = new JSONObject();
        if (null == uploadedFile) {
            res.put("status", 500);
            res.put("message", "文件不能为空");
            return res;
        }

        String contentType = uploadedFile.getContentType();
        String fileName = uploadedFile.getOriginalFilename();
        fileName = fileName.replaceAll(" ", "");

        if (!ExcelImportUtils.validateExcel(fileName)) {
            res.put("status", 500);
            res.put("message", "文件必须是excel格式！");
            return res;
        }

        long size = uploadedFile.getSize();
        if (StringUtils.isEmpty(fileName) || size == 0) {
            res.put("status", 500);
            res.put("message", "文件不能为空！！");
            return res;
        }

        String filePath = request.getSession().getServletContext().getRealPath("imgupload/");
        res = customerDataService.importCustomerData(fileName, uploadedFile, filePath);
        return res;
    }


}

package com.xianxian.power.service;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.model.CustomerProfile;
import com.xianxian.power.repository.CustomerProfileRepository;
import com.xianxian.power.utils.ExcelImportUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerProfileService {

    private CustomerProfileRepository customerProfileRepository;

    @Autowired
    public void setCustomerProfileRepository(CustomerProfileRepository customerProfileRepository) {
        this.customerProfileRepository = customerProfileRepository;
    }

    public List<CustomerProfile> getAllCustomerProfile(){
        return customerProfileRepository.getAllCustomerProfile();
    }

    public JSONObject batchImport(String fileName, MultipartFile mfile, String filePath) {

        JSONObject res = new JSONObject();
        File uploadDir = new File(filePath);
        if (!uploadDir.exists()) uploadDir.mkdirs();

        File tempFile = new File(filePath + fileName);

        InputStream is = null;
        try {
            mfile.transferTo(tempFile);
            is = new FileInputStream(tempFile);
            Workbook wb = null;
            if(ExcelImportUtils.isExcel2007(fileName)){
                wb = new XSSFWorkbook(is);
            }else{
                wb = new HSSFWorkbook(is);
            }
            if(readExcelValue(wb, tempFile)) {
                res.put("status", 200);
                res.put("message", "Upload success");
                return res;
            }else{
                res.put("status", 500);
                res.put("message", "数据文件格式不对，请核查");
                return res;
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.put("status", 500);
            res.put("message", "导入出错！请检查数据格式！");
            return res;
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    is = null;
                    e.printStackTrace();
                }
            }
        }
    }

    private List<CustomerProfile> transferExcelTable1(Sheet sheet) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        CustomerProfile customerProfile;
        List<CustomerProfile> customerProfileList = new ArrayList<CustomerProfile>();
        int totalRows = sheet.getPhysicalNumberOfRows();
        for (int r = 2; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null || row.getCell(0) == null) {
                continue;
            }
            customerProfile = new CustomerProfile();
            customerProfile.setShiCompanyName(row.getCell(0).getStringCellValue());
            customerProfile.setXianCompanyName(row.getCell(1).getStringCellValue());
            customerProfile.setGongdianDanweiName(row.getCell(2).getStringCellValue());
            customerProfile.setCusomerName(row.getCell(3).getStringCellValue());
            customerProfile.setCustomerId(row.getCell(4).getStringCellValue());
            customerProfile.setOrgNo(row.getCell(5).getStringCellValue());
            customerProfile.setRequestFormId(row.getCell(6).getStringCellValue());
            customerProfile.setIdentifyNumber(row.getCell(7).getStringCellValue());
            customerProfile.setBankName(row.getCell(8).getStringCellValue());
            customerProfile.setBankAccount(row.getCell(9).getStringCellValue());
            String strDate = row.getCell(10).getStringCellValue();

            try {
                customerProfile.setBingwangTime(sdf.parse(strDate));
            } catch (Exception e) {

            }
            customerProfile.setBuzhuModel(row.getCell(11).getStringCellValue());
            customerProfile.setCustomerCategory(row.getCell(12).getStringCellValue());
            customerProfile.setDanganShuilv((float) row.getCell(13).getNumericCellValue());
            customerProfile.setBingwangFangshi(row.getCell(14).getStringCellValue());

            customerProfileList.add(customerProfile);
        }
        return customerProfileList;

    }

    private List<CustomerProfile> transferExcelTable3(Sheet sheet) {
        CustomerProfile customerProfile;
        List<CustomerProfile> customerProfileList = new ArrayList<CustomerProfile>();
        int totalRows = sheet.getPhysicalNumberOfRows();
        for (int r = 1; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null || row.getCell(0) == null) {
                continue;
            }
            customerProfile = new CustomerProfile();
            customerProfile.setCustomerId(row.getCell(0).getStringCellValue());
            customerProfile.setCusomerName(row.getCell(1).getStringCellValue());
            customerProfile.setCusomerAddress(row.getCell(2).getStringCellValue());
            customerProfile.setContactCapacity((float) row.getCell(3).getNumericCellValue());
            customerProfile.setBingwangDianya(row.getCell(4).getStringCellValue());
            customerProfile.setCustomerType(row.getCell(5).getStringCellValue());
            customerProfile.setCustomerFadianFangshi(row.getCell(6).getStringCellValue());
            customerProfile.setSaleCategory(row.getCell(7).getStringCellValue());
            customerProfile.setCustomerJieruFangshi(row.getCell(8).getStringCellValue());
            customerProfileList.add(customerProfile);
        }
        return customerProfileList;
    }

    private Boolean readExcelValue(Workbook wb, File tempFile) {
        Sheet sheet = wb.getSheetAt(0);
        List<CustomerProfile> customerProfileList = new ArrayList<CustomerProfile>();
        boolean isProcessed=false;

        if (sheet.getRow(1) != null && sheet.getRow(1).getCell(0) != null && sheet.getRow(1).getCell(0).getStringCellValue().trim().equalsIgnoreCase("市公司名称")) {
            //table1
            customerProfileList = transferExcelTable1(sheet);
            isProcessed=true;
        } else if (sheet.getRow(0) != null && sheet.getRow(0).getCell(0) != null && sheet.getRow(0).getCell(0).getStringCellValue().trim().equalsIgnoreCase("发电客户编号")) {
            //table3
            customerProfileList = transferExcelTable3(sheet);
            isProcessed=true;
        }else{
            return isProcessed;
        }

        if (tempFile.exists()) {
            tempFile.delete();
        }
        int count;
        for (CustomerProfile customerProfile : customerProfileList) {
            count = customerProfileRepository.updateCustomerProfile(customerProfile);
            if (count <= 0) {
                customerProfileRepository.insertCustomerProfile(customerProfile);
            }
        }

        return isProcessed;
    }

}

package com.xianxian.power.service;

import com.alibaba.fastjson.JSONObject;
import com.xianxian.power.model.CUSTOMER_DATA;
import com.xianxian.power.model.CUSTOMER_DATA_NEW;
import com.xianxian.power.model.CUSTOMER_PROFILE;
import com.xianxian.power.model.CUSTOMER_PROFILE_NEW;
import com.xianxian.power.repository.CustomerDataNewRepository;
import com.xianxian.power.repository.CustomerDataRepository;
import com.xianxian.power.repository.CustomerProfileNewRepository;
import com.xianxian.power.repository.CustomerProfileRepository;
import com.xianxian.power.utils.ExcelImportUtils;
import com.xianxian.power.utils.POWERUTILS;
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
public class DataUploaderService {

    private CustomerProfileRepository customerProfileRepository;
    private CustomerDataRepository customerDataRepository;
    private CustomerDataNewRepository customerDataNewRepository;
    private CustomerProfileNewRepository customerProfileNewRepository;

    @Autowired
    public void setCustomerProfileNewRepository(CustomerProfileNewRepository customerProfileNewRepository) {
        this.customerProfileNewRepository = customerProfileNewRepository;
    }

    @Autowired
    public void setCustomerDataRepository(CustomerDataRepository customerDataRepository) {
        this.customerDataRepository = customerDataRepository;
    }

    @Autowired
    public void setCustomerDataNewRepository(CustomerDataNewRepository customerDataNewRepository) {
        this.customerDataNewRepository = customerDataNewRepository;
    }

    @Autowired
    public void setCustomerProfileRepository(CustomerProfileRepository customerProfileRepository) {
        this.customerProfileRepository = customerProfileRepository;
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
            if (ExcelImportUtils.isExcel2007(fileName)) {
                wb = new XSSFWorkbook(is);
            } else {
                wb = new HSSFWorkbook(is);
            }
            if (readExcelValue(wb, tempFile)) {
                res.put("status", 200);
                res.put("message", "Upload success");
                return res;
            } else {
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

    private List<CUSTOMER_PROFILE> transferExcelTable1(Sheet sheet) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        CUSTOMER_PROFILE customerProfile;
        List<CUSTOMER_PROFILE> customerProfileList = new ArrayList<CUSTOMER_PROFILE>();
        int totalRows = sheet.getPhysicalNumberOfRows();
        for (int r = 2; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null || row.getCell(0) == null) {
                continue;
            }
            customerProfile = new CUSTOMER_PROFILE();
            customerProfile.setShiCompanyName(row.getCell(0).getStringCellValue());
            customerProfile.setXianCompanyName(row.getCell(1).getStringCellValue());
            customerProfile.setGongdianDanweiName(row.getCell(2).getStringCellValue());
            customerProfile.setCustomerName(row.getCell(3).getStringCellValue());
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

    private List<CUSTOMER_PROFILE> transferExcelTable3(Sheet sheet) {
        CUSTOMER_PROFILE customerProfile;
        List<CUSTOMER_PROFILE> customerProfileList = new ArrayList<CUSTOMER_PROFILE>();
        int totalRows = sheet.getPhysicalNumberOfRows();
        for (int r = 1; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            if (row == null || row.getCell(0) == null) {
                continue;
            }
            customerProfile = new CUSTOMER_PROFILE();
            customerProfile.setCustomerId(row.getCell(0).getStringCellValue());
            customerProfile.setCustomerName(row.getCell(1).getStringCellValue());
            customerProfile.setCustomerAddress(row.getCell(2).getStringCellValue());
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


    private List<CUSTOMER_DATA> transferCustomerData(Sheet sheet) {
        CUSTOMER_DATA customerData;
        List<CUSTOMER_DATA> customerDataList = new ArrayList<>();
        int totalRows = sheet.getPhysicalNumberOfRows();
        for (int r = 2; r < totalRows; r++) {
            Row row = sheet.getRow(r);
            customerData = new CUSTOMER_DATA();
            customerData.setCustomerName(row.getCell(0).getStringCellValue());
            customerData.setDatePeriod(POWERUTILS.string2Date(row.getCell(1).getStringCellValue()));
            customerData.setDanwei(row.getCell(2).getStringCellValue());
            customerData.setPicihao(row.getCell(3).getStringCellValue());
            customerData.setCaijiDate(POWERUTILS.string2Date(row.getCell(4).getStringCellValue()));
            customerData.setDateConfirmed(POWERUTILS.string2Date(row.getCell(5).getStringCellValue()));
            customerData.setJichengpici(row.getCell(6).getStringCellValue());
            customerData.setDanjubianhao(row.getCell(7).getStringCellValue());
            customerData.setCustomerStatus(row.getCell(8).getStringCellValue());
            customerData.setCustomerId(row.getCell(9).getStringCellValue());
            customerData.setXianmuLeixing(row.getCell(10).getStringCellValue());
            customerData.setXiaonaFangshi(row.getCell(11).getStringCellValue());
            customerData.setZhongyangBuzhuModel(row.getCell(12).getStringCellValue());
            customerData.setZhuangjiRongliang(strtoFloat(row.getCell(13).getStringCellValue()));


            customerData.setInvoiceType(row.getCell(14).getStringCellValue());
            customerData.setCustomerShuilv(strtoFloat(row.getCell(15).getStringCellValue().replace("%", "")) / 100);
            customerData.setShangwangDianliang(strtoFloat(row.getCell(16).getStringCellValue()));
            customerData.setFaDianliang(strtoFloat(row.getCell(17).getStringCellValue()));
            customerData.setShangwangDianjia(strtoFloat(row.getCell(18).getStringCellValue()));
            customerData.setYingfuDianfei(strtoFloat(row.getCell(19).getStringCellValue()));
            customerData.setYingfuDianfeiCaiwu(strtoFloat(row.getCell(20).getStringCellValue()));
            customerData.setYingfuDianfeiShuiSale(strtoFloat(row.getCell(21).getStringCellValue()));
            customerData.setYingfuDianfeiShuiCaiwu(strtoFloat(row.getCell(22).getStringCellValue()));
            customerData.setZhongyangBuzhuBiaozhun(strtoFloat(row.getCell(23).getStringCellValue()));
            customerData.setZhongyangBuzhuZijinYingxiao(strtoFloat(row.getCell(24).getStringCellValue()));
            customerData.setZhongyangBuzhuZijinCaiwu(strtoFloat(row.getCell(25).getStringCellValue()));
            customerData.setZhongyangBuzhuZijinTaxYingxiao(strtoFloat(row.getCell(26).getStringCellValue()));
            customerData.setZhongyangBuzhuZijinTaxCaiwu(strtoFloat(row.getCell(27).getStringCellValue()));

            customerData.setShengBuzhuBiaozhun(strtoFloat(row.getCell(28).getStringCellValue()));
            customerData.setShengBuzhuZijinYingxiao(strtoFloat(row.getCell(29).getStringCellValue()));
            customerData.setShengBuzhuZijinCaiwu(strtoFloat(row.getCell(30).getStringCellValue()));
            customerData.setShengBuzhuZijinTaxYingxiao(strtoFloat(row.getCell(31).getStringCellValue()));
            customerData.setShengBuzhuZijinTaxCaiwu(strtoFloat(row.getCell(32).getStringCellValue()));

            customerData.setShiBuzhuBiaozhun(strtoFloat(row.getCell(33).getStringCellValue()));
            customerData.setShiBuzhuZijinYingxiao(strtoFloat(row.getCell(34).getStringCellValue()));
            customerData.setShiBuzhuZijinCaiwu(strtoFloat(row.getCell(35).getStringCellValue()));
            customerData.setShiBuzhuZijinTaxYingxiao(strtoFloat(row.getCell(36).getStringCellValue()));
            customerData.setShiBuzhuZijinTaxCaiwu(strtoFloat(row.getCell(37).getStringCellValue()));

            customerData.setXianBuzhuBiaozhun(strtoFloat(row.getCell(38).getStringCellValue()));
            customerData.setXianBuzhuZijinYingxiao(strtoFloat(row.getCell(39).getStringCellValue()));
            customerData.setXianBuzhuZijinCaiwu(strtoFloat(row.getCell(40).getStringCellValue()));
            customerData.setXianBuzhuZijinTaxYingxiao(strtoFloat(row.getCell(41).getStringCellValue()));
            customerData.setXianBuzhuZijinTaxCaiwu(strtoFloat(row.getCell(42).getStringCellValue()));

            customerData.setComments(row.getCell(43).getStringCellValue());

            customerDataList.add(customerData);
        }
        return customerDataList;
    }

    private float strtoFloat(String str) {
        str = str.replace(",", "").trim();
        return str == "" ? 0 : Float.parseFloat(str);
    }

    private Boolean readExcelValue(Workbook wb, File tempFile) {
        Sheet sheet = wb.getSheetAt(0);
        List<CUSTOMER_PROFILE> customerProfileList = new ArrayList<CUSTOMER_PROFILE>();
        List<CUSTOMER_DATA> customerDataList = new ArrayList<>();
        boolean isProcessed = false;

        if (sheet.getRow(1) != null && sheet.getRow(1).getCell(0) != null && sheet.getRow(1).getCell(0).getStringCellValue().trim().equalsIgnoreCase("市公司名称")) {
            //table1
            updateCustomerProfile(transferExcelTable1(sheet));
            isProcessed = true;
        } else if (sheet.getRow(0) != null && sheet.getRow(0).getCell(0) != null && sheet.getRow(0).getCell(0).getStringCellValue().trim().equalsIgnoreCase("发电客户编号")) {
            //table3
            updateCustomerProfile(transferExcelTable3(sheet));
            isProcessed = true;
        } else if (sheet.getRow(0) != null && sheet.getRow(0).getCell(0) != null && sheet.getRow(0).getCell(0).getStringCellValue().trim().equalsIgnoreCase("项目名称")) {
            //table2 customer data
            insertCustomerData(transferCustomerData(sheet));
        } else {
            return isProcessed;
        }

        if (tempFile.exists()) {
            tempFile.delete();
        }


        return isProcessed;
    }

    private void insertCustomerData(List<CUSTOMER_DATA> customerDataList) {
        int count;
        for (CUSTOMER_DATA customerData : customerDataList) {
            if (customerProfileRepository.countByCustomerId(customerData.getCustomerId()) <= 0) {
                customerDataNewRepository.insertCustomerDataNew(POWERUTILS.convertBean(customerData, CUSTOMER_DATA_NEW.class));
                CUSTOMER_PROFILE_NEW customerProfileNew = new CUSTOMER_PROFILE_NEW();
                customerProfileNew.setCustomerName(customerData.getCustomerName());
                customerProfileNew.setGongdianDanweiName(customerData.getDanwei());
                customerProfileNew.setCustomerFadianFangshi(customerData.getXianmuLeixing());
                customerProfileNewRepository.InsertCustomerProfileNew(customerProfileNew);
            } else {
                customerDataRepository.insertCustomerData(customerData);
            }
        }
    }

    private void updateCustomerProfile(List<CUSTOMER_PROFILE> customerProfileList) {
        int count;
        for (CUSTOMER_PROFILE customerProfile : customerProfileList) {
            count = customerProfileRepository.updateCustomerProfile(customerProfile);
            if (count <= 0) {
                customerProfileRepository.insertCustomerProfile(customerProfile);
            }
        }
    }
}

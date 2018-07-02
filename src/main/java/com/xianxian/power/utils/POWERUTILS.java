package com.xianxian.power.utils;


import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class POWERUTILS {

    public static boolean isNumeric(Character c) {
        if (Character.isDigit(c)) {
            return true;
        }
        return false;
    }

    public static Date string2Date(String dateStr) {

        if (dateStr == null || dateStr.equalsIgnoreCase("")) return null;

        // 最终的char数组
        char[] dateChar = new char[1024];
        // 临时存放数字
        char[] temp = new char[5];
        // 存放时间格式对应字母
        char[] typeChar = {'y', 'M', 'd', 'H', 'm', 's'};

        int t = 0;
        int tc = -1;
        int dc = 0;
        //判断是否进入下个类型
        boolean typeChange = true;

        // 遍历目标string
        for (int i = 0; i < dateStr.length(); i++) {
            char letter = dateStr.charAt(i);
            // 如果字母是数字
            if (isNumeric(letter)) {
                temp[t] = letter;
                //是否进入下个数字
                if (typeChange) {
                    tc++;
                    typeChange = false;
                }
                t++;
            }
            if (!isNumeric(letter) || i == (dateStr.length() - 1)) {
                for (int k = 0; k < temp.length; k++) {
                    // 如果为空
                    if ('\0' == temp[k]) {
                        break;
                    }

                    dateChar[dc] = typeChar[tc];
                    dc++;
                }

                if (!isNumeric(letter)) {
                    dateChar[dc] = letter;
                    dc++;
                    if (!typeChange) {
                        typeChange = true;
                    }
                }
                temp = new char[5];
                t = 0;
            }

        }

        String dateType = new String(dateChar);
        dateType = dateType.substring(0, dateType.indexOf("\0"));
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat(dateType.trim());
        try {
            date = format.parse(dateStr);
            return date;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将一个对象转换为另一个对象
     * @param <T1> 要转换的对象
     * @param <T2> 转换后的类
     * @param orimodel 要转换的对象
     * @param castClass 转换后的类
     * @return 转换后的对象
     */
    public static  <T1,T2> T2 convertBean(T1 orimodel, Class<T2> castClass) {
        T2 returnModel = null;
        try {
            returnModel = castClass.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("创建"+castClass.getName()+"对象失败");
        }
        List<Field> fieldlist = new ArrayList<Field>(); //要转换的字段集合
        while (castClass != null && //循环获取要转换的字段,包括父类的字段
                !castClass.getName().toLowerCase().equals("java.lang.object")) {
            fieldlist.addAll(Arrays.asList(castClass.getDeclaredFields()));
            castClass = (Class<T2>) castClass.getSuperclass(); //得到父类,然后赋给自己
        }
        for (Field field : fieldlist) {
            PropertyDescriptor getpd = null;
            PropertyDescriptor setpd = null;
            try {
                getpd= new PropertyDescriptor(field.getName(), orimodel.getClass());
                setpd=new PropertyDescriptor(field.getName(), returnModel.getClass());
            } catch (Exception e) {
                continue;
            }
            try {
                Method getMethod = getpd.getReadMethod();
                Object transValue = getMethod.invoke(orimodel);
                Method setMethod = setpd.getWriteMethod();
                setMethod.invoke(returnModel, transValue);
            } catch (Exception e) {
                throw  new RuntimeException("cast "+orimodel.getClass().getName()+"to "
                        +castClass.getName()+" failed");
            }
        }
        return returnModel;
    }

}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
    public static void main(String[] args) throws ParseException {
        String startTime = "2020年11月11日 0:00:00";
        String endTime = "2020年11月11日 0:10:00";
        String employee1Time = "2020年11月11日 0:03:47";
        String employee2Time = "2020年11月11日 0:10:11";

        // 1. 格式化日期对象，pattern一定要和给定的字符串格式对应，一点也不能出错，要不然调用解析函数会报错
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 H:mm:ss");

        // 2. 利用parse解析方法进行解析， 把时间转化毫秒进行比较
        Date date1 = sdf.parse(startTime);
        Date date2 = sdf.parse(endTime);
        Date date3 = sdf.parse(employee1Time);
        Date date4 = sdf.parse(employee2Time);

        if(date3.before(date1) && date3.after(date2)){
            System.out.println("顾客1秒杀成功~~~");
        }else {
            System.out.println("顾客1秒杀失败~~~");
        }

        if(date4.before(date1) && date4.after(date2)){
            System.out.println("顾客2秒杀成功~~~");
        }else {
            System.out.println("顾客2秒杀失败~~~");
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        // 1. 日期对象
        Date date = new Date();
        System.out.println(date);   // 时间毫秒值

        // 2.格式化这个日期对象(在有参构造函数中指定最终的格式化形式)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");

        // 3.开始格式化日期对象称为在有参构造中设置的形式
        String rs = sdf.format(date);
        System.out.println(rs);

        System.out.println("----------------------------");
        // 4. 格式化毫秒值
        long time = System.currentTimeMillis();
        String rs1 = sdf.format(time);
        System.out.println(rs1);
    }
}

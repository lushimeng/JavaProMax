/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {
        // 1. 本地此刻 日期时间  对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 2. 解析、格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        // 3.1 正向格式化
        System.out.println(dtf.format(ldt));

        // 3.2 逆向格式化
        System.out.println(ldt.format(dtf));

        // 4. 解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 = LocalDateTime.parse("2019-11-11 11:11:11", dtf1);
        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfYear());
    }
}

























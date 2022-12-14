/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo01 {
    public static void main(String[] args) {
        // 1, 获取本地日期对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天的日期：" + nowDate);

        int year = nowDate.getYear();
        System.out.println("year: " + year);

        int month = nowDate.getMonthValue();
        System.out.println("month: " + month);

        int day = nowDate.getDayOfMonth();
        System.out.println("day:  " + day);

        // 当年的第几天
        int dayOfYear = nowDate.getDayOfYear();
        System.out.println("dayOfYear:  " + dayOfYear);

        // 星期
        System.out.println(nowDate.getDayOfWeek().getValue());
        System.out.println(nowDate.getDayOfMonth());
        System.out.println(nowDate.getDayOfWeek().getValue());

        // 月份
        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getMonth().getValue());

        System.out.println("---------------------");
        LocalDate bt = LocalDate.of(2000, 5, 23);
        System.out.println(bt);  // 直接传入对应的年月日
        System.out.println(LocalDate.of(1999, Month.JULY, 20));  // 相对上面知识把月换成了枚举
    }
}























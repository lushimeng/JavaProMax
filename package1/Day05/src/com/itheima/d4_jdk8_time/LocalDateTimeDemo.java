/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        // 1. 日期，时间
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天是：" + nowDateTime);
        System.out.println(nowDateTime.getYear());  // 年
        System.out.println(nowDateTime.getMonthValue());  // 月
        System.out.println(nowDateTime.getDayOfMonth());  // 日
        System.out.println(nowDateTime.getHour());  // 时
        System.out.println(nowDateTime.getMinute());  // 分
        System.out.println(nowDateTime.getSecond());  // 秒
        System.out.println(nowDateTime.getNano());  // 纳秒
        // 日： 当前的第几天
        System.out.println("dayOfYear: " + nowDateTime.getDayOfYear());  // dayOfYear: 78
        // 星期
        System.out.println(nowDateTime.getDayOfWeek());  // SATURDAY
        System.out.println(nowDateTime.getDayOfWeek().getValue());  // 6
        // 月份
        System.out.println(nowDateTime.getMonth());  // MARCH
        System.out.println(nowDateTime.getMonthValue());  // 3

        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);  // 2022-03-19
        System.out.println(ld.getYear());  // 2022
        System.out.println(ld.getMonth());  // MARCH
        System.out.println(ld.getMonth().getValue());  // 3
        System.out.println(ld.getDayOfWeek());  // SATURDAY
        System.out.println(ld.getDayOfMonth());  // 19
        System.out.println(ld.getDayOfYear());  // 78

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt);  // 16:17:34.874
    }
}


















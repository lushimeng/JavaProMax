/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalTimeDemo {
    public static void main(String[] args) {
        // 1. 获取本地时间对象
        LocalTime nowTime = LocalTime.now();
        System.out.println("今天的时间：" + nowTime);

        int hour = nowTime.getHour();  // 小时
        System.out.println("hour: " + hour);

        int minute = nowTime.getMinute();  // 分钟
        System.out.println("minute: " + minute);

        int second = nowTime.getSecond();  // 秒
        System.out.println("second: " + second);

        int nano = nowTime.getNano();  // 纳秒
        System.out.println("nano: " + nano);

        System.out.println("------------------------------");
        // 输入的月份，天，小时，分钟，毫秒都需要在一个范围内，不能超出某一个范围
        System.out.println(LocalDateTime.of(1991, 11, 11, 8, 20));
        System.out.println(LocalDateTime.of(1991, Month.JULY, 11, 8, 20));
        System.out.println(LocalDateTime.of(1991, 11, 11, 8, 20, 30));
        System.out.println(LocalDateTime.of(1991, Month.JULY, 11, 8, 20, 30));
        System.out.println(LocalDateTime.of(1991, 11, 11, 8, 20, 20, 300));
        System.out.println(LocalDateTime.of(1991, Month.JULY, 11, 8, 20, 20, 300));
    }
}





























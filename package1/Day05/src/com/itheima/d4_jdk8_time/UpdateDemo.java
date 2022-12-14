/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

public class UpdateDemo {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        System.out.println(nowTime.minusHours(1));    // 一小时前
        System.out.println(nowTime.minusMinutes(1));  // 一分钟前
        System.out.println(nowTime.minusSeconds(1));  // 一秒前
        System.out.println(nowTime.minusNanos(1));    // 一纳秒前
        System.out.println("-----------------");
        System.out.println(nowTime.plusHours(1));    // 一小时后
        System.out.println(nowTime.plusMinutes(1));  // 一分钟后
        System.out.println(nowTime.plusSeconds(1));  // 一秒后
        System.out.println(nowTime.plusNanos(1));    // 一纳秒后
        System.out.println("-----------------");
        // 不可变对象，每次修改产生新的对象！
        System.out.println(nowTime);
        System.out.println("-----------------");
        LocalDate myDate = LocalDate.of(2022, 3, 19);
        LocalDate nowDate = LocalDate.now();
        System.out.println("今天是2022-3-19号吗？" + myDate.equals(nowDate));  // true
        System.out.println(myDate.isAfter(nowDate));
        System.out.println(myDate.isBefore(nowDate));
        System.out.println("-----------------");
        // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2000, 4, 17);
        LocalDate nowDate1 = LocalDate.now();
        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());

        MonthDay nowMd = MonthDay.from(nowDate1);
        System.out.println("今天是你的生日吗？" + birMd.equals(nowMd));

    }
}
























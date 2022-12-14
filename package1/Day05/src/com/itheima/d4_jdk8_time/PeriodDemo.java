/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {
        // 当前本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        // 相遇日期
        LocalDate meetDate = LocalDate.of(2019, 2, 19);
        System.out.println(meetDate);

        Period period = Period.between(meetDate, today);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}



















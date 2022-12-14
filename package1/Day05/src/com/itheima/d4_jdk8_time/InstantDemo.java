/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class InstantDemo {
    public static void main(String[] args) {
        // 1. 得到一个Instant时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // 2. 系统此刻的时间戳
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        // 3. 如何去返回Date对象
        Date date = Date.from(instant);
        System.out.println(date);
    }
}












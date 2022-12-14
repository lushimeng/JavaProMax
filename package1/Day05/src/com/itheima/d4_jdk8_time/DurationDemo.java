/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        // 本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 出生的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2019, 2, 19, 01, 00, 00);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);

        System.out.println(duration.toDays());  // 两个时间相差天数
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());
    }
}















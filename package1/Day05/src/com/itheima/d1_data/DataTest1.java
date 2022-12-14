/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_data;

import java.util.Date;

public class DataTest1 {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time);  // 获取从起始时间:970年1月1日 00:00:00到现在的毫秒值

        // 1. 调用有参构造器实现毫秒值转化为日期
        Date date = new Date(time);
        System.out.println(date);  // 默认调用toString方法，如果不是打印的地址，说明重写了toString方法

        // 2. 调用无参构造函数
        Date date1 = new Date();
        date1.setTime(time);  // 调用setTime实现毫秒到日期的转换
        System.out.println(date1);
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_data;

import java.util.Date;

public class DataTest2 {
    public static void main(String[] args) {
        // 1. 实例化Date对象
        Date date = new Date();
        System.out.println("现在时间：" + date);
        // 获取毫秒值
        long time = date.getTime();  // getXXX/setXXX方法
        // 计算1小时21秒后的毫秒值， ls = 1000ms
        time += (1*60*60 + 21) * 1000;

        date.setTime(time);
        System.out.println("后来时间：" + date);
    }
}

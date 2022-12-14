/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_data;

import java.util.Date;

public class DataTest {
    public static void main(String[] args) {
        // 1. 创建一个data对象，调用无参构造
        Date data = new Date();
        System.out.println(data);  // 默认调用了toString()方法，如果打印的不是地址，那么久重写了toString方法
        System.out.println(data.getTime());  // 获取从起始时间： 1970年1月1日  00:00:00到现在的毫秒值
    }
}

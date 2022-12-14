/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d13_api_BigDecimalDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        // 包装浮点型数据成为大数据对象 BigDecimal
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);

        BigDecimal c1 = a1.add(b1);
        System.out.println(c1);

        // 目的：double
        double rs = c1.doubleValue();
        System.out.println(rs);

        // 注意事项：BigDecimal是一定要精度运算的
        BigDecimal a2 = BigDecimal.valueOf(10.0);
        BigDecimal b2 = BigDecimal.valueOf(3.0);
//        BigDecimal c2 = a2.divide(b2);
        BigDecimal c2 = a2.divide(b2, 2, RoundingMode.HALF_UP);
        System.out.println(c2);
    }
}

















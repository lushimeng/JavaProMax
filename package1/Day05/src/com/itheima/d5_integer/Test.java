/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_integer;

public class Test {
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a; // 自动装箱
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("----------------");
        Integer it = 100;
        int it1 = it; // 自动拆箱
        System.out.println(it1);
        System.out.println("----------------");

        double db = 99.5;
        Double db1 = db;  // 自动装箱
        double db2 = db1;
        System.out.println(db);
        System.out.println(db1);
        System.out.println(db2);
        System.out.println("----------------");

//        int age = null; // 报错了
        Integer ag1 = null;  // 包装类型即引用类型可以赋值为null
        Integer age2 = 0;
        System.out.println("----------------");

        // 1. 包装类可以把基本类型的数据转换为字符串
        Integer i3 = 2345;
        String rs = i3.toString();
        System.out.println(rs + 1); // 23451

        String rs1 = Integer.toString(i3);
        System.out.println(rs1 + 1);  // 23451

        System.out.println("----------------");
        String number = "2334";
        // 转换成整数
        int age = Integer.parseInt(number);
        System.out.println(age);

        int age4 = Integer.valueOf(number);
        System.out.println(age4);

        // 转换成小数
        String numberDouble = "99.99";
        double score = Double.parseDouble(numberDouble);
        System.out.println(score);

        double score1 = Double.valueOf(numberDouble);
        System.out.println(score);
    }
}

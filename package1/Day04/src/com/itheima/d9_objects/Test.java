/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_objects;

import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("heiMa");
        // String类型已经重写了equals方法， 比较的是内容，不是地址
        System.out.println(s2.equals(s1));   // false
        // System.out.println(s1.equals(s2));  // 由于s1 == null 所以程序会报错：java.lang.NullPointerException


        System.out.println(Objects.equals(s1, s2));  // 利用equals方法可以避免有null的错误

        // Objects中的静态方法isNull是否为空
        System.out.println(Objects.isNull(s1));  // true
        System.out.println(Objects.isNull(s2));  // false
    }
}

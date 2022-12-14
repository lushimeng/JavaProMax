/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_api_object;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Yang", 20, '男');
        Student s2 = new Student("Yang", 20, '男');
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);  // 比较地址
    }
}

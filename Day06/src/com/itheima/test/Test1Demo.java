/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.test;

public class Test1Demo {
    public static void main(String[] args) {
        Test1<String> t = new Test1<>();
        String str = "lushimeng";
        t.testMethod(str);

        System.out.println(t.testMethod1(new Integer(100)));
    }
}

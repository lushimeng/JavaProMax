/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.SingleInstance;

public class SingleTest {
    public static void main(String[] args) {
        Single single1 = Single.single;
        Single single2 = Single.single;
        Single single3 = Single.single;
        System.out.println(single1);
        System.out.println(single2);
        System.out.println(single3);
        System.out.println(single1 == single2);
    }
}

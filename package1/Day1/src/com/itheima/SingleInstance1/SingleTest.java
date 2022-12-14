/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.SingleInstance1;

public class SingleTest {
    public static void main(String[] args) {
        //System.out.println(Single.single);  // Single类中的静态变量single设置为私有，不能在其他类中进行访问。
        Single single1 = Single.getInstance();
        Single single2 = Single.getInstance();
        Single single3 = Single.getInstance();

        System.out.println(single1);
        System.out.println(single2);
        System.out.println(single3);
        System.out.println(single1 == single3);
    }
}

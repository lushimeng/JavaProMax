/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_recusion;

public class RecursionDemo1 {
    public static void main(String[] args) {
//        test();  // StackOverflowError
    }
    public static void test(){
        System.out.println("--------执行test------------");
        test();
    }
}

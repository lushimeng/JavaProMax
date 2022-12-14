/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.codeblock;

public class TestDemo1 {
    public static String schoolName;
    /**
     * 特点：与类一起加载，自动触发一次，优先执行
     * 作用：可以在程序加载时进行静态数据的初始化操作
     */
    static {
        System.out.println("==优先执行-->静态代码块被触发执行==");
        schoolName = "Southwest Petroleum University";
    }


    // 学习静态代码块的特点、基本使用
    public static void main(String[] args) {
        System.out.println("============main方法被执行输出===============");
        System.out.println(TestDemo1.schoolName);
    }

}

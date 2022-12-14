/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintDemo1 {
    public static void main(String[] args) throws FileNotFoundException {
        // 源码
        // 在System定义静态变量out: public final static PrintStream out = null;
        // 可以看到out是PrintStream打印流的实例化对象
        System.out.println("锦瑟无端五十弦");
        System.out.println("一弦一柱思华年");

        // 改变输出语句的位置（重定向）,这样可以把打印在控制台的内容打印到一个指定的文件中去。
        PrintStream ps = new PrintStream("Day11//src/log.txt");
        System.setOut(ps); // 把系统打印流改成我们自己的打印流

        System.out.println("庄生晓梦迷蝴蝶");
        System.out.println("望帝春心托杜鹃");
    }
}

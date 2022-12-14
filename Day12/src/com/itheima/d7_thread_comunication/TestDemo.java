/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_thread_comunication;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        // 重定向到文件中
//        PrintStream ps = new PrintStream("E:/log.log");
//        System.setOut(ps);

        Account account = new Account("ICBC-1111", 0);

        // 创建两个取钱线程: 小明 和 小红
        new DrawThread(account, "小明").start();
        new DrawThread(account, "小红").start();

        // 创建三个存钱线程: 干爹 亲爹 和 岳父
        new DepositThread(account, "干爹").start();
        new DepositThread(account, "亲爹").start();
        new DepositThread(account, "岳父").start();
    }
}

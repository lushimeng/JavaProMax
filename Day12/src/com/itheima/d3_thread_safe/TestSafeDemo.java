/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_thread_safe;

public class TestSafeDemo {
    public static void main(String[] args) {
        // 1、 创建一个共享的账户对象
        Account account = new Account("ICBC-111", 100000);

        // 2、创建2个线程对象，操作同一个账户对象
        new DrawThread("小明", account).start();
        new DrawThread("小李", account).start();
    }
}

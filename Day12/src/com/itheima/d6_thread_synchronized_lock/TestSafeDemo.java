/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */

package com.itheima.d6_thread_synchronized_lock;

public class TestSafeDemo {
    public static void main(String[] args) {
        // 1、 创建一个共享的账户对象

        Account account = new Account("ICBC-111", 100000);

        // 2、创建2个线程对象，操作同一个账户对象
        new DrawThread("小李", account).start();
        new DrawThread("小明", account).start();
//        new DrawThread("小1", account).start();
//        new DrawThread("小2", account).start();
//        new DrawThread("小3", account).start();
//        new DrawThread("小4", account).start();
//        new DrawThread("小5", account).start();
//        new DrawThread("小6", account).start();
    }
}

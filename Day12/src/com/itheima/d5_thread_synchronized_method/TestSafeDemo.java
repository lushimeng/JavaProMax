/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */

package com.itheima.d5_thread_synchronized_method;


import java.util.HashMap;
import java.util.Hashtable;

/**
 * 同步方法的原理：
 * 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
 * 如果方法是实例方法：同步方法默认用this作为的锁对象。但是代码要高度面向对象！
 * 如果方法是静态方法：同步方法默认用类名.class作为的锁对象。
 */

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

        new Hashtable<>();
    }
}

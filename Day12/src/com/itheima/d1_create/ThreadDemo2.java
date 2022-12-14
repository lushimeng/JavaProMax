/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_create;

/**
 * 创建线程的方式二；
 * 1、定义一个线程任务类MyRunnable实现Runnable接口，重写run()方法
 * 2、创建MyRunnable任务对象
 * 3、把MyRunnable任务对象交给Thread处理。
 * 4、调用线程对象的start()方法启动线程
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        // 3. 创建实现类对象
        Runnable myRunnable = new MyRunnable();  // 多态的写法
        // 4. 把MyRunnable任务对象交给Thread处理
        Thread thread = new Thread(myRunnable);
        thread.start(); // 启动线程

        for (int i = 0; i < 10; i++) {
            System.out.println("主线程正在执行~~~" + i);
        }
    }
}

// 1. 实现Runnable接口的类
class MyRunnable implements Runnable{
    // 2. 重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("子线程正在执行~~~" + i);
        }
    }
}
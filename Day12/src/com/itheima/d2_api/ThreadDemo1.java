/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_api;
/**
 * String getName()	获取当前线程的名称，默认线程名称是Thread-索引
 * void setName(String name)设置线程名称
 * public static Thread currentThread()：返回对当前正在执行的线程对象的引用----静态
 * public static void sleep(long time)让线程休眠指定的时间，单位为毫秒。 --- 静态
 * public void run()线程任务方法
 * public void start()线程启动方法
 *
 *           构造器	                      说明
 *
 * public Thread(String name)	    可以为当前线程指定名称
 * public Thread(Runnable target)	把Runnable对象交给线程对象
 * public Thread(Runnable target ，String name )	把Runnable对象交给线程对象，并指定线程名称
 *
 *
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread1 = new MyThread();  // 多态的写法，只能调用Thread和MyThread共有的方法
        thread1.setName("1号子线程");
        thread1.start();
//        System.out.println(thread1.getName());  // 如果没有setName默认为Thread-0

        Thread thread2 = new MyThread();
        thread2.start();
        thread2.setName("2号子线程");
//        System.out.println(thread2.getName());  // 如果没有setName默认为Thread-1

        // 哪个线程执行它，它就得到哪个线程对象（当前线程对象）
        // 主线程的名称就叫main
        Thread thread = Thread.currentThread();  // 获得当前正在运行的线程，一般为主线程
        thread.setName("最牛的主线程");
//        System.out.println(thread.getName());  // 如果没有setName默认为main

        for (int i = 0; i < 5; i++) {
            System.out.println(thread.getName() + "线程正在运行" + i);
        }
    }
}

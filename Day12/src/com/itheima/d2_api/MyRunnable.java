/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_api;
// 实现Runnable创建Thread对象
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
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + "线程正在运行" + i);
            if(i == 3){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

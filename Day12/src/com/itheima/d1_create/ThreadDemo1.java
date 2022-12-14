/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_create;

/**
 * 创建线程方式一：
 * 1、定义一个子类MyThread继承线程类java.lang.Thread，重写run()方法;
 * 2、创建MyThread类的对象;
 * 3、调用线程对象的start()方法启动线程（启动后还是执行run方法的）;
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread myThread = new MyThread();  // 多态的写法，只有继承和接口才可以使用多态
        /**
         * 注意事项：
         * 1、要通过调用start启动线程，本质上还是调用run方法，但是不能直接调用run方法，直接调用run方法会认为就是一个普通的类；
         * 2、子线程的start一定要放在主线程之前，要不然等到主线程内容执行完毕了再启动就达不到线程效果了。
         */
        myThread.start();

        for(int i = 1; i <= 5; i++){
            System.out.println(i+ "主线程正在运行~~~~");
        }

    }
}

// 创建子类MyThread继承Thread类并重写run方法
class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++){
            System.out.println(i+ "子线程正在运行~~~~");
        }
    }
}

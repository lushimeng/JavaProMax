/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_create;
/**
 * 目标：学会线程的创建方式二(匿名内部类方式实现，语法形式)
 */
public class ThreadDemo2Others {
    public static void main(String[] args) {
        Runnable myRunnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程1再运行" + i);
                }
            }
        };
        Thread thread = new Thread(myRunnable);
        thread.start();

        // 把new Runnable()对象直接放在Thread类里面创建线程
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程2再运行" + i);
                }
            }
        });
        thread1.start();

        /**
         * Runnable接口为函数式接口，可以进行Lambda表达式进行简化
         * @FunctionalInterface
         * public interface Runnable {
         *public abstract void run ();
         *}
         */
        new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("子线程3再运行" + i);
                }
            }
        ).start();


        for (int i = 0; i < 10; i++) {
            System.out.println("主线程再运行" + i);
        }
    }
}

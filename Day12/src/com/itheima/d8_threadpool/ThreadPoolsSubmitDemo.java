/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolsSubmitDemo {
    public static void main(String[] args) throws Exception{
        // 1、创建线程池对象
        /**
         * 核心线程个数：3
         * 线程池可支持的最大线程数：5(那么临时线程最多有 5 - 3 = 2个)
         * 临时线程的最大存活时间：6
         * 存活时间的单位：TimeUnit.SECONDS（表示秒）
         * 任务队列：new ArrayBlockingQueue<>(5) （表示任务队列中最多存储5个任务）
         * 指定用哪个线程工厂创建线程：Executors.defaultThreadFactory()（表示用默认的方式创建线程工厂）
         * 指定线程忙，任务满的时候，新任务来了怎么办：new ThreadPoolExecutor.AbortPolicy()（表示新任务来了丢弃任务并抛出RejectedExecutionException异常）
         */
        ExecutorService pool = new ThreadPoolExecutor(3, 5, 6,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // 2、给任务线程吃处理
        Future<String> f1 = pool.submit(new MyCallable(10));
        Future<String> f2 = pool.submit(new MyCallable(20));
        Future<String> f3 = pool.submit(new MyCallable(30));
        Future<String> f4 = pool.submit(new MyCallable(40));
        Future<String> f5 = pool.submit(new MyCallable(50));
        Future<String> f6 = pool.submit(new MyCallable(60));
        Future<String> f7 = pool.submit(new MyCallable(70));

        // String res = f1.get();
//        System.out.println();
        System.out.println(f1.get());  // 55
        System.out.println(f2.get());  // 210
        System.out.println(f3.get());  // 465
        System.out.println(f4.get());  // 820
        System.out.println(f5.get());  // 1275
        System.out.println(f6.get());  // 1830
        System.out.println(f7.get());  // 2485
    }
}























/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_threadpool;

import java.util.concurrent.*;

public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        // 1. 创建线程池对象
        /**
         * 对于参数，有时候太多记不住，可以查看源代码，只要知道参数代表的意义就可以了
         * public ThreadPoolExecutor(int corePoolSize,   线程池中核心线程数，不消失
         *                               int maximumPoolSize,   线程池中最大线程数，新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
         *                               long keepAliveTime,
         *                               TimeUnit unit,  // 单位，常用TimeUnit.SECONDS
         *                               BlockingQueue<Runnable> workQueue,  // 任务队列, 常用new ArrayBlockingQueue<Runnable>(5)
         *                               ThreadFactory threadFactory,  // 创建线程池方式，常用Executors.defaultThreadFactory()
         *                               RejectedExecutionHandler handler)  核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始任务拒绝。
         */
        /**
         * 核心线程个数：2
         * 线程池可支持的最大线程数：4(那么临时线程最多有 5 - 2 = 3个)
         * 临时线程的最大存活时间：6
         * 存活时间的单位：TimeUnit.SECONDS（表示秒）
         * 任务队列：new ArrayBlockingQueue<>(5) （表示任务队列中最多存储5个任务）
         * 指定用哪个线程工厂创建线程：Executors.defaultThreadFactory()（表示用默认的方式创建线程工厂）
         * 指定线程忙，任务满的时候，新任务来了怎么办：new ThreadPoolExecutor.AbortPolicy()（表示新任务来了丢弃任务并抛出RejectedExecutionException异常）
         */
        ExecutorService pool = new ThreadPoolExecutor(2, 4, 6,
                                                    TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
                                                    Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        // 2、给任务线程池处理
        Runnable target = new MyRunnable();
        pool.execute(target);
        pool.execute(target);  // 到这里核心线程都在运行

        pool.execute(target);  // 添加到任务队列中、
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);  // 五个线程都添加到任务队列当中

        // 新任务提交时发现核心线程都在忙，任务队列也满了，并且还可以创建临时线程，此时才会创建临时线程
        pool.execute(target);  // maximumPoolSize - corePoolSize = 4 - 2,则可以额外创建2个线程
        pool.execute(target);

        // 核心线程和临时线程都在忙，任务队列也满了，新的任务过来的时候才会开始任务拒绝
        pool.execute(target);  // 报错.RejectedExecutionException  pool size = 4, active threads = 4, queued tasks = 5, completed tasks = 0

        // 关闭线程池（开发中一般不会使用）。
        // pool.shutdownNow(); // 立即关闭，即使任务没有完成，会丢失任务的！
//        pool.shutdown(); // 会等待全部任务执行完毕之后再关闭（建议使用的）
    }
}

























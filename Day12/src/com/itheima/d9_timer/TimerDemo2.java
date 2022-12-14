/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * ScheduledExecutorService是 jdk1.5中引入了并发包，目的是为了弥补Timer的缺陷, ScheduledExecutorService内部为线程池。
 */
public class TimerDemo2 {
    public static void main(String[] args) {
        // 1. 创建线程池对象
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出AAA ==> " + new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
            }
        }, 3, 2, TimeUnit.SECONDS);


        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出BBB ==> " + new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
                System.out.println(10 / 0);
            }
        }, 3, 2, TimeUnit.SECONDS);


        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "执行输出CCC ==> " + new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
            }
        }, 3, 2, TimeUnit.SECONDS);

    }
}

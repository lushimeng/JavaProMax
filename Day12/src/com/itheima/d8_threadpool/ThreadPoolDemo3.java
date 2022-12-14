/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo3 {
    public static void main(String[] args) {
        // 1. 创建固定线程数据的线程池
        Executors.newFixedThreadPool(3);
        Executors.newSingleThreadExecutor();
        Executors.newCachedThreadPool();
        Executors.newScheduledThreadPool(3);


    }
}



















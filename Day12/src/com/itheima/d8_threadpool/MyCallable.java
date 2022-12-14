/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_threadpool;

import java.util.concurrent.Callable;

/**
 * 创建线程的方式3
 * 定义一个任务类，实现Callable接口，应该声明线程任务执行完毕后的结果数据类型
 */
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n){
        this.n = n;
    }

    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return Thread.currentThread().getName() + "执行从 1-" + n + "的和为：" + sum;
    }
}

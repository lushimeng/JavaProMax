/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_create;
/**
 目标：学会线程的创建方式三：实现Callable接口，结合FutureTask完成。
 */
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo3 {
    public static void main(String[] args) {
        // 3. 创建Callable任务对象
        Callable<String> myCallable = new MyCallable(100);
        // 4. 把Callable任务对象  交给  FutureTask对象（FutureTask间接上是Runnable的实现类）
        // public class FutureTask<V> implements RunnableFuture<V>
        // public interface RunnableFuture<V> extends Runnable, Future<V> {
        // FutureTask对象的作用：
        // 1、是Runnable的对象(实现了Runnable接口)，可以交给Thread了；
        // 2、可以在线程执行完毕之后通过调用其get方法得到线程执行完成的结果；
        FutureTask<String> futureTask1 = new FutureTask<>(myCallable);
        // 5、这里一定要注意Thread构造方法接收的数据类型有那些，不可以直接接收Callable对象，所以要转化为Runable对象进行接收
        Thread thread = new Thread(futureTask1);
        // 6、启动线程
        thread.start();

        Callable<String> myCallable2 = new MyCallable(200);
        FutureTask<String> futureTask2 = new FutureTask<>(myCallable2);
        Thread thread2 = new Thread(futureTask2);
        thread2.start();

        try {
            String s = futureTask1.get();
            System.out.println("线程1返回结果：" + s);
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            String s = futureTask2.get();
            System.out.println("线程2返回结果：" + s);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

/**
 * 1、定义一个任务类 实现Callable接口 应该声明线程任务执行完毕后的结果的数据类型，也就是泛型
 * 查看Callable源码：V为泛型
 * @FunctionalInterface
 * public interface Callable<V> {
 *      V call()throws Exception;
 * }
 */
class MyCallable implements Callable<String>{
    private int n;
    public MyCallable(int n){
        this.n = n;
    }

    /**
     * 2、重写call方法（任务方法）
     */
    @Override
    public String call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return String.valueOf(sum);
    }
}

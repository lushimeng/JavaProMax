/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_timer;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时器的特点和存在的问题
 * 1、Timer是单线程，处理多个任务按照顺序执行，存在延时与设置定时器的时间有出入。
 * 2、可能因为其中的某个任务的异常使Timer线程死掉，从而影响后续任务执行。
 */

public class TimerDemo1 {
    public static void main(String[] args) throws Exception {
        // 利用了输出重定向
//        PrintStream ps = new PrintStream("E:/timer.log");
//        System.setOut(ps);

        // 1. 创建Timer定时器对象
        Timer timer = new Timer();

        // 2. 调用共schedule方法
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
//                String threadName = Thread.currentThread().getName();  // 获取当前线程名字
//
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 时间格式化
//                Date date = new Date();
//                String strTime = sdf.format(date);
//                System.out.println(threadName + "执行AAA ====> " + strTime);
//                System.out.println(10 / 0);
                // 上面几行代码相当于下面一行代码
                System.out.println(Thread.currentThread().getName() + "执行输出AAA ==> " + new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date()));
            }
        }, 3000, 2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();  // 获取当前线程名字

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 时间格式化
                Date date = new Date();
                String strTime = sdf.format(date);
                System.out.println(threadName + "执行BBB ====> " + strTime);
            }
        }, 3000, 2000);
    }
}

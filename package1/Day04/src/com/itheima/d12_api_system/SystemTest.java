/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d12_api_system;

import java.util.Arrays;

public class SystemTest {
    public static void main(String[] args) {
        System.out.println("程序开始~~~~");

         // System.exit(0);  // JVM 终止,只运行上面的程序，下面的程序就不会再被运行，慎用
        // 2. 计算机认为时间有起源：返回1970-1-1 00:00:00走到此刻的总的毫秒值: 时间毫秒值
        long time = System.currentTimeMillis();
        System.out.println(time);  // 1647586861462
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            System.out.print("");
        }
        long endTime = System.currentTimeMillis();
        System.out.println("循环运行时间:" + (endTime - startTime) / 1000.0);  // 循环所用的秒数,循环运行时间:0.017

        /**
         * arraycopy(Object src,  int  srcPos, Object dest, int destPos, int length);
         */
        int[] src = {10, 20, 30, 40, 50, 60};
        int[] dest = new int[]{0, 0, 0, 0, 0, 0};  // --> {0, 0, 30, 40, 50, 0};
        System.arraycopy(src, 2, dest, 2, 3);
        System.out.println(Arrays.toString(dest));  // [0, 0, 30, 40, 50, 0]

        System.out.println("程序结束~~~~");

    }
}

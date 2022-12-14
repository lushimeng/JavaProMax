/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_printStream;

import java.io.*;

public class PrintDemo {
    public static void main(String[] args) throws Exception{
        // 1. 创建一个打印流对象
        PrintStream psm = new PrintStream("Day11/src/psm.txt");
        PrintStream psm1 = new PrintStream(new FileOutputStream("Day11/src/psm1.txt", true));  // 追加数据，在低级管道后面加True
        PrintStream psm2 = new PrintStream(new File("Day11/src/psm2.txt"));

        // 2. 打印东西
        psm.println(97);
        psm.println(true);
        psm.println(23.2);
        psm.println("我是打印流~~~~");  // 打印直接存入文件当中
        psm.write(97);  // 写入a

        psm1.println(97);
        psm1.println(true);
        psm1.println(23.2);
        psm1.println("我是打印流~~~~");

        psm2.println(97);
        psm2.println(true);
        psm2.println(23.2);
        psm2.println("我是打印流~~~~");


        psm.close();
        psm1.close();
        psm2.close();


        System.out.println("---------------------------------------------------");
        PrintWriter pwr = new PrintWriter("Day11/src/pwr.txt");
        PrintWriter pwr1 = new PrintWriter(new FileOutputStream("Day11/src/pwr1.txt", true));
        PrintWriter pwr2 = new PrintWriter(new File("Day11/src/pwr2.txt"));
        pwr.println(97);
        pwr.println(true);
        pwr.println(23.2);
        pwr.println("我是打印流~~~~");

        pwr1.println(97);
        pwr1.println(true);
        pwr1.println(23.2);
        pwr1.println("我是打印流~~~~");


        pwr2.println(97);
        pwr2.println(true);
        pwr2.println(23.2);
        pwr2.println("我是打印流~~~~");

        pwr.close();  // 有时候文件中没有内容要使用os.flush（）或者os.close()进行刷新缓冲流
        pwr2.close();
        pwr1.close();

    }
}

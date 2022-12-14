/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_charset;

import java.io.*;

public class FileInputStream3 {
    public static void main(String[] args) throws IOException {
        // 1、定义一个文件输入流，也就是打开一个管道
        InputStream is = new FileInputStream("Day10/src/test.txt");

        byte[] bytes = is.readAllBytes(); // 读取全部字节,由于上面的代码执行is已经指向了文件末尾，所以下面不会进行输出，要想输出，把上面的代码注释掉
        System.out.println(new String(bytes));
    }
}




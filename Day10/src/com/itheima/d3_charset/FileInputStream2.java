/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_charset;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream2 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个文件字节输入流管道与源文件接通
        InputStream is = new FileInputStream("Day10/src/test1.txt");

//        // 2、定义一个字节数组，用于读取字节数组
//        byte[] buffer = new byte[3];
//        int len = is.read(buffer);
//        System.out.println(len);
//        System.out.println(new String(buffer));
//
//        int len1 = is.read(buffer);
//        System.out.println(len1);
//        System.out.println(new String(buffer));
//
//        int len2 = is.read(buffer);
//        System.out.println(len2);
//        System.out.println(new String(buffer));
//
//        int len3 = is.read(buffer);
//        System.out.println(len3);
//        System.out.println(new String(buffer));
//
//        int len4 = is.read(buffer);
//        System.out.println(len4);
//        // 读取多少倒出多少
//        System.out.println(new String(buffer, 0, len4));
//
//        int len5 = is.read(buffer);
//        System.out.println(len5);  // 结束标志为 -1
//        System.out.println("----------------------------------------");
        byte[] bytes = new byte[3];
        int lens = 0;
        while ((lens = is.read(bytes)) != -1){
            System.out.print(new String(bytes, 0, lens));
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_transfer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharSetTest {
    public static void main(String[] args) {
        try(
                // 代码采用UTF-8编码，访问的文件也采用UTF-8编码，打印输出不会有问题。
                // 1. 创建文件输入流与目标文件创建连接, csb.txt采用的是utf-8编码
//                Reader fr = new FileReader("Day11\\src\\csb.txt");

                // 代码采用UTF-8编码，访问的文件test.txt采用的为GBK编码，打印输出会出现问题
                Reader fr = new FileReader("E:\\resource\\test.txt");
                // 2. 把低级的字符输入流包装成高级的缓冲字符输入流
                BufferedReader bfr = new BufferedReader(fr);
                ){
            String line;
            while ((line = bfr.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

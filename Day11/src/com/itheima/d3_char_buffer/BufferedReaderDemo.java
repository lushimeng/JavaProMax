/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try(
                // 1. 创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("Day11/src/text.txt");
                // 2. 把低级的字符输入流包装成高级的缓冲字符输入流。
                BufferedReader bfr = new BufferedReader(fr);
        ){

            // 1、一次读取单个字符
//            System.out.println((char)bfr.read());
//            System.out.println((char)bfr.read());
//            System.out.println((char)bfr.read());

            // 2、一次性读取一个数组的数据
//            char[] buffer = new char[1024]; // 这里对应的是字符输入流而不是字节，所以定义为char类型的数组而不是byte类型的数组
//            int len;
//            while ((len = bfr.read(buffer)) != -1){
//                String str = new String(buffer, 0, len);
//                System.out.println(str);
//            }

            // 3、每次读取一行数据
            String str;
            // 特别注意，readLine为BufferedReader的特有方法，在上面实例化对象bfr的时候
            // 就不能使用多态的形式了，如果继续使用多态，就只能使用Reader中定义的方法，不能使用BufferedReader独有的方法，这个要特别注意
            while ((str = bfr.readLine()) != null){
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

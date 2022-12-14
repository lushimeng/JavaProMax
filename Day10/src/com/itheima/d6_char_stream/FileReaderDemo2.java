/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_char_stream;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderDemo2 {
    public static void main(String[] args) throws Exception{
        // 1、创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("Day10/src/test3.txt");

        // 2、一次读取一定字符的字符数组
        char[] buffer = new char[1024];  // 1KB字符
        int len;
        while ((len = fr.read(buffer)) != -1){
            String s = new String(buffer, 0, len);
            System.out.println(s);
        }
    }
}

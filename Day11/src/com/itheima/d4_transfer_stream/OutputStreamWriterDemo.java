/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_transfer_stream;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) {
        try(
                // 1. 定义一个字节输出流。
                OutputStream os = new FileOutputStream("Day11\\src\\1090.txt");
                // 2. 把原始字节流输出流转换成字符输出流
                Writer osw = new OutputStreamWriter(os, "GBK");
                // 3. 把低级的字符输出流包装成高级的缓冲字符输出流
                // 是否为高级缓冲流的判断条件为是否有缓冲区
                BufferedWriter bw = new BufferedWriter(osw);
        ){
            bw.write("123我爱中国！！！");
            bw.newLine();
            bw.write("456我爱中国！！！");
            bw.newLine();
            bw.write("789我爱中国！！！");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

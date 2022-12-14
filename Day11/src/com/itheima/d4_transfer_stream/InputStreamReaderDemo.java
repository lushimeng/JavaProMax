/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_transfer_stream;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        try(
                // 1. 提取GBK文件的原始字节流。
                InputStream fr = new FileInputStream("E:\\resource\\test.txt");
                // 2. 把原始字节流转换成字符输入流
                Reader isr = new InputStreamReader(fr, "GBK");
                // 3. 转换成输入缓冲流
                BufferedReader bfr = new BufferedReader(isr);
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

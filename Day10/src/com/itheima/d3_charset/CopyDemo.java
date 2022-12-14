/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_charset;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws Exception{
        // 1、创建一个输入流对象
        InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\linf.gif");
        // 2、创建一个输出流对象
        OutputStream os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\new.gif"); // 可以追加

        // 方法1：把文件一次性读完，获取文件的字节数组
//        File file = new File("Day10/src/text1.txt");
//        byte[] buffer = new byte[(int)file.length()];
//        is.read(buffer); // 去读文件中的所有字节到buffer数组中
//        os.write(buffer);

        // 方式2，一次去掉一个字节
//        int b = 0;
//        while ((b = is.read()) != -1){
//            os.write(b);
//        }

        // 方式3：一小段字符数组的读写
        byte[] bytes = new byte[1024];
        int len;
        while ((len = is.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }

        // 关闭流
        is.close();
        os.close();
    }
}

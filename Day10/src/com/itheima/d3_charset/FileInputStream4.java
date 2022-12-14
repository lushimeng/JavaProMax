/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_charset;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class FileInputStream4 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("Day10/src/text1.txt", true); // 加上true之后可以不用覆盖原来文件中的内容了，可以在文件后面进行追加

        // 2、写数据出去
        // a.public void write(int a):写一个字节出去
        os.write('a');
        os.write('b');
//        os.write('是');  由于一个函数的UTF-8编码占用三个字节，所以不能用这种方式写进去
        os.write("\r\n".getBytes());  // 换行

        // b.public void write(byte[] buffer):写一个字节数组出去。
        byte[] bytes = "卢氏梦 && 杨新宇".getBytes();  // 把中文汉字先转化为对应的字节数组，然后调用对应的方法进行运用
        os.write(bytes);
        os.write("\r\n".getBytes());

        // c. public void write(byte[] buffer , int pos , int len):写一个字节数组的一部分出去。
        byte[] buffer = {'1', '2', '3', 'a', 'b', 'c'};
        os.write(buffer,0, 3);
        os.write("\r\n".getBytes());


        // os.flush(); // 写数据必须，刷新数据 可以继续使用流
        os.close(); // 释放资源，包含了刷新的！关闭后流不可以使用了
    }
}












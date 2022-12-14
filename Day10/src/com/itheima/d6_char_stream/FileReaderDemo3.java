/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_char_stream;

import java.io.FileWriter;
import java.io.Writer;

public class FileReaderDemo3 {
    public static void main(String[] args) throws Exception{
        // 1、创建一个字符输出流管道与目标文件接通
        Writer fw = new FileWriter("Day10/src/out08.txt", true); // 覆盖管道，每次启动都会清空文件之前的数据

//      a.public void write(int c):写一个字符出去
        fw.write('a');
        fw.write('卢');
        fw.write('c');
        fw.write("\r\n"); // 换行

//       b.public void write(String c)写一个字符串出去
        fw.write("jfklaksfjksajf炉石方式打开链接发");
        fw.write("\r\n"); // 换行


//       c.public void write(char[] buffer):写一个字符数组出去
        char[] buffer = {'x', '世', 'Y'};
        fw.write(buffer);
        fw.write("\r\n"); // 换行


//       d.public void write(String c ,int pos ,int len):写字符串的一部分出去
        fw.write("123456789", 0, 5);
        fw.write("\r\n"); // 换行


//       e.public void write(char[] buffer ,int pos ,int len):写字符数组的一部分出去
        fw.write(buffer, 0, 2);
        fw.write("\r\n"); // 换行


        // fw.flush();// 刷新后流可以继续使用
        fw.close(); // 关闭包含刷线，关闭后流不能使用

    }
}

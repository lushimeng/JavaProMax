/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_charset;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 目标：字节输入流的使用。

 IO流的体系：
            字节流                                         字符流
 字节输入流            字节输出流               字符输入流        字符输出流
 InputStream          OutputStream           Reader           Writer  (抽象类)
 FileInputStream      FileOutputStream       FileReader       FileWriter(实现类，可以使用的)

 文件字节输入流：FileInputStream
 -- 作用：以内存为基准，把磁盘文件中的数据以字节的形式读取到内存中去。
 按照字节读文件数据到内存中。
 -- 构造器：
 public FileInputStream(File file):创建字节输入流管道与源文件对象接通
 public FileInputStream(String pathname)：创建字节输入流管道与源文件路径接通。
 -- 方法：
 public int read(): 每次读取一个字节返回，读取完毕返回-1。

 小结：
 一个一个字节读取中文数据输出其实是被淘汰的，性能极差！
 一个一个字节读取中文数据输出，会出现截断中文字节的情况，无法避免读取中文输出乱码的问题。

 */
public class FileInputStream1 {
    public static void main(String[] args) throws IOException {
        // 1、创建一个文件字节流管道与源文件接通
//        InputStream is = new FileInputStream(new File("D:\\JavaProMax_day13\\Day10\\src\\test.txt"));
        // 简化写法
        InputStream is = new FileInputStream("Day10\\src\\test.txt");  // InputStream是一个抽象类，FileInputStream是其实现类

        // 每一次读取一个字节返回,is相当于一个指针，读取一个往后移动一下，知道移动到文件末尾，
//        int read = is.read();
//        System.out.println(read);  // 97
//        int read1 = is.read();
//        System.out.println(read1); // 98
//        int read2 = is.read();
//        System.out.println(read2); // 65
//        int read3 = is.read();
//        System.out.println(read3); // 66
//        int read4 = is.read();
//        System.out.println(read4);  // -1没有字节可以读取的时候会返回-1,根据这一特性可以用于判断循环的结束标志

        int b = 0;
        while ((b = is.read()) != -1){
            System.out.println(b);
        }
    }
}



















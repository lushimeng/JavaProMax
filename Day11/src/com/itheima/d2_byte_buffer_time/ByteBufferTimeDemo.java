/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_byte_buffer_time;

import jdk.internal.util.xml.impl.Input;

import java.io.*;

/**
 目标：利用字节流的复制统计各种写法形式下缓冲流的性能执行情况。

 复制流：
 （1）使用低级的字节流按照一个一个字节的形式复制文件。
 （2）使用低级的字节流按照一个一个字节数组的形式复制文件。
 （3）使用高级的缓冲字节流按照一个一个字节的形式复制文件。
 （4）使用高级的缓冲字节流按照一个一个字节数组的形式复制文件。

 源文件：C:\course\3-视频\18、IO流-文件字节输出流FileOutputStream写字节数据出去.avi
 目标文件：C:\course\

 小结：
 使用高级的缓冲字节流按照一个一个字节数组的形式复制文件，性能好，建议开发使用！
 */
public class ByteBufferTimeDemo {
    public static final String SRC_FILE = "C:\\Users\\lenovo\\Desktop\\1.mp4";
    private static final String DEST_FILE = "C:\\Users\\lenovo\\Desktop\\";
    public static void main(String[] args) {
//        copy01(); // 使用低级的字节流按照一个一个字节的形式复制文件：慢的让人简直无法忍受。直接被淘汰。
//        copy02(); // 使用低级的字节流按照一个一个字节数组的形式复制文件: 比较慢，但是还是可以忍受的！
//        copy03(); // 缓冲流一个一个字节复制：很慢，不建议使用。
        copy04(); // 缓冲流一个一个字节数组复制: 平常拷贝文件就是用这一个

    }

    private static void copy04() {
        System.out.println("缓冲流一个一个字节数组复制~~~");
        try(
                // 1. 创建一个输入流管道
                InputStream is = new FileInputStream(SRC_FILE);
                // a. 创建高级输入缓冲流
                InputStream bis = new BufferedInputStream(is); // 多态的写法
                // 2. 创建一个输出流管道
                OutputStream os = new FileOutputStream(DEST_FILE + "4.mp4");
                // b. 创建高级输出缓冲流
                OutputStream bos = new BufferedOutputStream(os);
        ){
            long start = System.currentTimeMillis();
            int len;
            byte[] buffer = new byte[1024];
            while ((len = bis.read()) != -1){
                bos.write(buffer, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("缓冲流一个一个字节数组复制: " + (end - start)/1000.0 + "s");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void copy03() {
        System.out.println("缓冲流一个一个字节复制~~~");
        try(
                // 1. 创建一个输入流管道
                InputStream is = new FileInputStream(SRC_FILE);
                // a. 创建高级输入缓冲流
                InputStream bis = new BufferedInputStream(is); // 多态的写法
                // 2. 创建一个输出流管道
                OutputStream os = new FileOutputStream(DEST_FILE + "3.mp4");
                // b. 创建高级输出缓冲流
                OutputStream bos = new BufferedOutputStream(os);

        ){
            long start = System.currentTimeMillis();
            int len;
            while ((len = bis.read()) != -1){
                bos.write(len);
            }
            long end = System.currentTimeMillis();
            System.out.println("缓冲流一个一个字节复制: " + (end - start)/1000.0 + "s");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void copy02() {
        System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件~~~");
        try(
                // 1. 创建一个输入流管道
                InputStream is = new FileInputStream(SRC_FILE);
                // 2. 创建一个输出流管道
                OutputStream os = new FileOutputStream(DEST_FILE + "2.mp4")
        ){
            long start = System.currentTimeMillis();
            int len;
            byte[] buffer = new byte[1024];
            while ((len = is.read()) != -1){
                os.write(buffer, 0, len);
            }
            long end = System.currentTimeMillis();
            System.out.println("使用低级的字节流按照一个一个字节数组的形式复制文件: " + (end - start)/1000.0 + "s");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void copy01() {
        System.out.println("使用低级的字节流按照一个一个字节的形式复制文件~~~");

        try(
                // 1. 创建一个输入流管道
                InputStream is = new FileInputStream(SRC_FILE);
                // 2. 创建一个输出流管道
                OutputStream os = new FileOutputStream(DEST_FILE + "1.pdf")
        ){
            long start = System.currentTimeMillis();
            int len;
            while ((len = is.read()) != -1){
                os.write(len);
            }
            long end = System.currentTimeMillis();
            System.out.println("使用低级的字节流按照一个一个字节的形式复制文件: " + (end - start)/1000.0 + "s");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

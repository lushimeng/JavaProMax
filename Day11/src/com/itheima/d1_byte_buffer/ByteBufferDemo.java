/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_byte_buffer;

import java.io.*;

public class ByteBufferDemo {
    public static void main(String[] args) throws Exception{
        try(
//                 这里面只能放置资源对象，用完会自动关闭；自动调用资源对象的close方法关闭资源
//                 1. 创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\1.mp4");
                // a. 把原始的字节输入流包装成高级的缓冲字节输入流
//                BufferedInputStream bis = new BufferedInputStream(is);
                InputStream bis = new BufferedInputStream(is);  // 两种写法都可以，为多态的写法；

                // 2. 创建一个字节输出流管道与目的连接
                OutputStream os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\2.mp4");
                // b. 把原始字节输出流包装成高级的缓冲字节输出流
//                BufferedOutputStream bos = new BufferedOutputStream(os);
                OutputStream  bos = new BufferedOutputStream(os);  // 多态的写法
        ){
            // 3. 定义一个字节数组转移数据
            long start =  System.currentTimeMillis();
            int len;
            while ((len = is.read()) != -1){
                os.write(len);
            }
            long end = System.currentTimeMillis();
            System.out.println("拷贝视频所需时间为：" + (end - start)/1000 + "s");

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}



























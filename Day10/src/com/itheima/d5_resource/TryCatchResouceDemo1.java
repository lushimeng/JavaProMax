/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_resource;

import java.io.*;

// JDK 7释放资源的方式
public class TryCatchResouceDemo1 {
    public static void main(String[] args) {
        // 推荐这种释放资源的方式，减少了代码量
        try (   // 资源对象都放在try()括号里面，这样就可以自动进行释放了，程序会自动调用close，关系管道
                // 这样也不用在用finally，简约了代码的行数
                // 资源对象的定义为：资源都是实现了Closeable/AutoCloseable接口的类对象
                // 1、创建一个输入流对象
                InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\linf.gif");
                // 2、创建一个输出流对象
                OutputStream os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\new.gif");
//                int age = 21; // 报错，Integer并没有实现Closeable/AutoCloseable接口的类对象
                ConnectionMysql conn = new ConnectionMysql();
        ){
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                os.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
class ConnectionMysql implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("实现了Closeable接口对象,自动调用close方法释放资源");
    }
}

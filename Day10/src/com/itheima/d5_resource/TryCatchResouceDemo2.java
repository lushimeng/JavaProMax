/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_resource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TryCatchResouceDemo2 {
    public static void main(String[] args) throws Exception{
        // 1、创建一个输入流对象
        InputStream is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\linf.gif");
        // 2、创建一个输出流对象
        OutputStream os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\new.gif");

        try (is; os){  // JDK 9,不推荐，原因是把inputStream,OutputStream定义在外面也要抛出错误或者try..catch
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                os.write(bytes, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

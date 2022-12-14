/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_resource;

import java.io.*;

public class Test4 {
    public static void main(String[] args){
        // 文件拷贝
        copy(new File("E:\\resource"), new File("E:\\aaa"));
    }
    public static void copy(File src, File dest){
        // 1. 判断源目录是否存在
        if(src != null && src.exists() && src.isDirectory()){
            // 2. 目标目录需要创建一下
            File destOne = new File(dest, src.getName());
            destOne.mkdirs();  // 创建多级目录

            // 3. 提取源目录下的全部一级文件对象
            File[] files = src.listFiles();

            // 4. 判断是否存在一级文件对象
            if(files != null && files.length > 0){
                // 5. 遍历一级文件对象
                for(File file : files){
                    // 6. 判断是文件还是文件夹，是文件直接复制过去
                    if(file.isFile()){
                        copyFile(file, new File(destOne, file.getName()));
                    }else {
                        // 7. 当前遍历的是文件夹，递归赋值
                        copy(file, destOne);
                    }
                }
            }

        }
    }
    public static void copyFile(File srcFile, File destFile){
        try (
                // 1、创建一个字节输入流对象
                InputStream is = new FileInputStream(srcFile);
                // 2、创建一个字节输出流对象
                OutputStream os = new FileOutputStream(destFile);
                ){
            // 3、 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1){
                os.write(buffer, 0, len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

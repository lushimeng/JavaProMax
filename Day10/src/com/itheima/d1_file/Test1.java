/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

public class Test1 {
    public static void main(String[] args) {
        File file = new File("E:/resource");

        File[] files = file.listFiles();  // 获取当前目录下所有的一级文件对象到一个文件对象数组中

        // 冒泡排序
        for (int i = 0; i < files.length-1; i++) {
            for (int j = i+1; j < files.length; j++) {
                if(files[i].lastModified() < files[j].lastModified()){
                    File temp = files[i];
                    files[i] = files[j];
                    files[j] = temp;
                }
            }
        }

        // 打印信息
        for(File tempFile : files){
            System.out.println(tempFile.getName() + ": " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(tempFile.lastModified()));
        }
    }
}

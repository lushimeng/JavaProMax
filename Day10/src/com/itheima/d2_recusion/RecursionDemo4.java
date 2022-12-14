/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_recusion;

import java.io.File;
import java.io.IOException;

public class RecursionDemo4 {
    public static void main(String[] args) {
        // 2、传入目录 和 文件名称
        searchFile(new File("D:/"), "devcpp.exe");
    }

    /**
     * 1、搜索某个目录下的全部文件，找到我们想要的文件
     * @param dir  被搜索的原目录
     * @param fileName  被搜索的文件名称
     */
    public static void searchFile(File dir, String fileName){
        // 3、判断dir是否是目录
        if(dir != null && dir.isDirectory()){
            // 4. 提取当前目录下的一级文件对象
            File[] files = dir.listFiles();  // 存在null，[]现象
            if(files != null && files.length > 0){
                // 5、遍历文件列表
                for (File file : files) {
                    // 6、判断当前遍历的一级文件对象是文件 还是  目录
                    if(file.isFile()){
                        // 7、是不是咱们要找的文件
                        if(file.getName().equals(fileName)){
                            System.out.println("文件查找成功：" + file.getAbsolutePath());
                            // 额外的知识，只能自启动.exe的文件
                            Runtime r = Runtime.getRuntime(); // 静态方法返回Runtime对象
                            try {
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }else {
                        // 8、如果是文件夹，继续遍历
                        searchFile(file, fileName);
                    }
                }
            }
        }else {
            System.out.println("对不起，当前被搜索的不是文件夹，不支持");
        }
    }
}






































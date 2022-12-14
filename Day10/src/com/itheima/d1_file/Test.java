/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_file;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        // 访问一个文件夹
        File file = new File("E:/resource");

        int txtCount = 0, jpgCount = 0, docCount = 0, otherCount = 0;
        String[] list = file.list();  // 获取当前目录下所有的”一级文件名称“到一个字符串数组中

        // 增强for循环遍历数组
        for (String name : list){
            if(name.endsWith("txt")){  // 调用String类的endsWith(String str)函数表示是否以str结尾，如果是返回true
                txtCount++;
            }else if(name.endsWith("doc")){
                docCount++;
            }else if(name.endsWith("jpg")){
                jpgCount++;
            }else {
                otherCount++;
            }
        }
        System.out.println("txt: " + txtCount);
        System.out.println("jpg: " + jpgCount);
        System.out.println("doc: " + docCount);
        System.out.println("other: " + otherCount);
    }
}

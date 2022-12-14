/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_file;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 目标：File针对目录的遍历
 - public String[] list()： 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回。
 - public File[] listFiles()(常用): 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回（重点）
 */
public class FileDemo4 {
    public static void main(String[] args) {
        // 1. 定位一个目录，要是一个文件会返回null
        File file = new File("E:/resourse");
        String[] names = file.list();
        for(String str : names){
            System.out.println(str);
        }
        System.out.println("------------------------------");
        // 2. 一级文件对象，
        // 获取当前目录下所有的一级文件对象到一个文件对象数组中去返回
        File[] files = file.listFiles();
        for(File fileList : files){
            System.out.println(fileList + "--" + fileList.length());
        }
        System.out.println("------------------------------------"
        );
        // 3. 注意事项
        File file1 = new File("G:/");  // 调用者不存在返回null
        File[] files1 = file1.listFiles();
        String[] list = file1.list();
        System.out.println(list);  // null
        System.out.println(files1);  // null

        System.out.println("-------------------------------");
        File file2 = new File("Day10\\src\\test.txt");  // 调用者是一个文件的时候返回null
        File[] files2 = file2.listFiles();
        String[] list1 = file2.list();
        System.out.println(list1);  // null
        System.out.println(files2);  // null

        System.out.println("================================");
        File file3 = new File("E:\\aaaa");  // 调用者是一个空的文件夹时候，返回空的数组
        File[] files3 = file3.listFiles();
        String[] list2 = file3.list();
        System.out.println(files3);  // 地址
        System.out.println(list2);  // 地址
        System.out.println(Arrays.toString(list2));  // []
        System.out.println(Arrays.toString(files3));  // []

    }
}


















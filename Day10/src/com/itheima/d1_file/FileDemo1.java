/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_file;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        // 1. 创建File对象(指定文件的路径)
        // 绝对路径有三种方法：
        // E:\resourse\4.jpg 但是这种的斜杠需要进行转义，原因在于\n,\t等，为了告诉\它本身是\，所以一般写成\\
        // E:/resorse/4.jpg 这种方式就不需要再进行斜杠专业了
        // 使用File.separator或者文件夹之间的连接
//        File file1 = new File("E:\\resourse\\4.jpg");
//        File file1 = new File("E:/resourse/4.jpg");
        File file1 = new File("E:" + File.separator + "resourse" + File.separator + "4.jpg");
        long size1 = file1.length();
        System.out.println(size1);

        System.out.println("==================================");
        // 2、 File创建文件对象，支持绝对路径和相对路径两种方式--重点掌握
        File file2 = new File("E:\\resourse\\test.txt");
        System.out.println(file2.length());

        // 相对路径：一般定位模块中的文件，相对到moudle工程下面
        File file3 = new File("Day10/src/test.txt");
        File file4 = new File(".../test.txt");
        System.out.println(file3.length());
        System.out.println(file4.exists());
        System.out.println(file4.length());
        System.out.println(file3.canRead());

        System.out.println("==================================");
        // 3、File创建对象，可以是文件也可以是一个文件夹
        File file = new File("E:\\resourse");
        System.out.println(file.exists());  // true
        System.out.println(file.length());  // 不可以直接获取文件夹的大小，要想获取文件夹的大小，需要依次遍历文件夹中的文件
        System.out.println(file.isFile());  // false
        System.out.println(file.isDirectory());  // true
        String name = file.getName();
        System.out.println(name);

    }
}





















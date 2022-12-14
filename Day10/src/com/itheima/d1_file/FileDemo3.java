/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_file;

import java.io.File;
import java.io.IOException;

/**
 目标：File类的创建和删除的方法
 - public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，
 创建一个新的空文件。 （几乎不用的，因为以后文件都是自动创建的！）
 - public boolean delete() ：删除由此File表示的文件或目录。 （只能删除空目录）
 - public boolean mkdir() ：创建由此File表示的目录。（只能创建一级目录）
 - public boolean mkdirs() ：可以创建多级目录（建议使用的）
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        // a.创建新文件，创建成功返回true ,反之 ,不需要这个，以后文件写出去的时候都会自动创建
        File f = new File("Day10\\src\\test.txt");
        boolean newFile = f.createNewFile();  // 在相对路径Day10\src下创建text.txt文件，如果存在创建失败，反之成功
        System.out.println(newFile);

        File f1 = new File("Day10\\src\\test2.txt");
        boolean newFile1 = f1.createNewFile();  //
        System.out.println(newFile1);

        // b.mkdir创建一级目录
        File file = new File("E:\\aaaaaa");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);

        // c.mkdirs创建多级目录(重点)
        File file1 = new File("E:/abc/efg/hig/eng");
        boolean mkdirs = file1.mkdirs();
        System.out.println(mkdirs);

        // d.删除文件或者空文件夹
         // 占用一样可以删除
        System.out.println(file.delete());  // true

        // 只能删除空文件夹,不能删除非空文件夹.
        System.out.println(file1.delete());  //
    }
}

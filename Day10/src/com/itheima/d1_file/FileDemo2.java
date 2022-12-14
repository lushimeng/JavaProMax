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

/**
    目标：File类的获取功能的API
    - public String getAbsolutePath()  ：返回此File的绝对路径名字符串。
    - public String getPath()  ： 获取创建文件对象的时候用的路径
    - public String getName()  ： 返回由此File表示的文件或目录的名称。
    - public long length()  ：    返回由此File表示的文件的长度。
 */
public class FileDemo2 {
    public static void main(String[] args) {
        // 1.绝对路径创建一个文件对象
        File file = new File("E:/resource/test.txt");  // 斜杆方向的盘符就不用再加上转义的斜杠了
        // a.获取它的绝对路径。
        File absoluteFile = file.getAbsoluteFile();
        System.out.println(absoluteFile);  // E:/resource/test.txt

        // b.获取文件定义的时候使用的路径。
        String path = file.getPath();
        System.out.println(path);  // E:/resource/test.txt

        // c.获取文件的名称：带后缀。
        String name = file.getName();
        System.out.println("文件名称：" + name);   // 文件名称：test.txt

        // d.获取文件的大小：字节个数。
        System.out.println("文件大写为：" + file.length());  // 7

        // e.获取文件的最后修改时间
        long l = file.lastModified();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS");
        String format = sdf.format(l);
        System.out.println("时间日期为：" + format);  // 2022-04-23 23:16:47:559

        // f、判断文件是文件还是文件夹
        System.out.println(file.isFile());  // true
        System.out.println(file.isDirectory()); // false


        System.out.println("---------------------------------------------------------");
        File file1 = new File("Day10\\src\\test.txt");  // 相对路径
        // a.获取它的绝对路径。
        File absoluteFile1 = file1.getAbsoluteFile();
        System.out.println(absoluteFile1);  // D:\JavaProMax_day13\Day10\src\test.txt

        // b.获取文件定义的时候使用的路径。
        String path1 = file1.getPath();
        System.out.println(path1);  // Day10\src\test.txt

        // c.获取文件的名称：带后缀。
        String name1 = file1.getName();
        System.out.println(name1);  // test.txt

        // d.获取文件的大小：字节个数。
        long length = file1.length();
        System.out.println(length);   // 46

        // e.获取文件的最后修改时间
        System.out.println(new SimpleDateFormat("yyyy/MM//dd HH:mm:ss:SS").format(file1.lastModified()));  // 2022/04//29 15:12:08:601

        // f、判断文件是文件还是文件夹
        System.out.println(file.isFile());  // true
        System.out.println(file.isDirectory());  // false

        System.out.println("-------------------------");
        File file3 = new File("D:/");
        System.out.println(file3.isFile());  // false
        System.out.println(file3.isDirectory());  // true
        System.out.println(file3.exists()); // true

        System.out.println("-------------------------");
        File file4 = new File("D:/aaa");  // 不存在该文件或者文件夹
        System.out.println(file4.isFile());  // false
        System.out.println(file4.isDirectory());  // false
        System.out.println(file4.exists());  // false
    }
}

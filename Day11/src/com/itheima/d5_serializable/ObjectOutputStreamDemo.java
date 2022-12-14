/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 目标：学会对象序列化，使用 ObjectOutputStream 把内存中的对象存入到磁盘文件中。

 1、transient修饰的成员变量不参与序列化了
 2、对象如果要序列化，必须实现Serializable序列化接口。
 3、申明序列化的版本号码，序列化的版本号与反序列化的版本号必须一致才不会出错！
    private static final long serialVersionUID = 1;
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws Exception{
        // 1. 创建学生对象
        Student s = new Student("赵六", "zhaoliu", "12345618", 18);

        // 2. 对象序列化：使用对象字节输出流包装字节输出流管道
        OutputStream os = new FileOutputStream("Day11/src/123.txt");
        ObjectOutputStream oos = new ObjectOutputStream(os);

        // 3. 直接调用序列化方法
        oos.writeObject(s);

        // 4. 释放资源
        oos.close();
    }
}

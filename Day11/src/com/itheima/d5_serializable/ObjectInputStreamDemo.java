/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_serializable;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

/**
 目标：学会对象序列化，使用 ObjectOutputStream 把内存中的对象存入到磁盘文件中。

 transient修饰的成员变量不参与序列化了
 对象如果要序列化，必须实现Serializable序列化接口。

 申明序列化的版本号码
 序列化的版本号与反序列化的版本号必须一致才不会出错！
 private static final long serialVersionUID = 1;
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws Exception{
        // 1. 创建对象字节输入流管道包装低级的字节输入流管道
        InputStream is = new FileInputStream("Day11/src/123.txt");
        ObjectInputStream ois = new ObjectInputStream(is);

        // 2. 调用对象字节输入流的反序列化方法
        Student s = (Student)ois.readObject();
        System.out.println(s);
    }
}

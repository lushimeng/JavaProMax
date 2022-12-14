/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_package;

import com.itheima.d1_package.Demo1.Cat;

public class Test {
    public static void main(String[] args) {
        // 导包：相同包下的类可以直接访问。
        Student student = new Student();

        // 不同包下的类必须导包才可以使用
        // 使用默认导包的类：demo1
        Cat cat = new Cat();
        cat.run();

        // 指定使用demo2下的Cat类
        com.itheima.d1_package.Demo2.Cat cat1 = new com.itheima.d1_package.Demo2.Cat();
        cat.run();
    }
}


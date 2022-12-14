/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_polymorphic;

public class Tortoise extends Animal{
    public String name = "子类tortoise名称";
    @Override
    public void run() {
        System.out.println("tortoise跑的很慢~~~");
    }
}

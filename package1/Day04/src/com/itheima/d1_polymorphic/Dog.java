/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_polymorphic;

public class Dog extends Animal{
    public String name = "子类dog名称";
    @Override
    public void run() {
        System.out.println("dog跑的很快~~~");
    }
}

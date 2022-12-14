/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_polymorphic;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.run();
        System.out.println(a1.name);

        Animal a2 = new Tortoise();
        a2.run();
        System.out.println(a2.name);
    }
}

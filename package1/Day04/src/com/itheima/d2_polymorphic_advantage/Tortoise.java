/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_polymorphic_advantage;

public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("tortoise跑的很慢~~~");
    }

    public void layEggs(){
        System.out.println("乌龟可以下蛋~~~~");
    }
}

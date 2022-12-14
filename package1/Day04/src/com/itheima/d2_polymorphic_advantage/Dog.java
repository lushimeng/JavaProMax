/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_polymorphic_advantage;

public class Dog extends Animal {
    @Override
    public void run() {
        System.out.println("dog跑的很快~~~");
    }

    public void lookDoor(){
        System.out.println("dog看门~~~");
    }
}

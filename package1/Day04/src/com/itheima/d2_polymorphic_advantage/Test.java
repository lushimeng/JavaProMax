/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_polymorphic_advantage;

public class Test {
    public static void main(String[] args) {
        Animal animalDog = new Dog();
        Animal animalTor = new Tortoise();
        // Dog dog = (Dog) animalTor;  // 转型后的类型和对象真实类型不是同一种类型，那么在转换的时候就会出现ClassCastException
        go(animalTor);
    }

    public static void go(Animal a){
        a.run();
        // a到底是狗还是乌龟
        if(a instanceof Tortoise){
            Tortoise t = (Tortoise)a;  // 从父类到子类类型，必须强制类型转换
            t.layEggs();
        }else if(a instanceof Dog){
            Dog d = (Dog)a;
            d.lookDoor();
        }
    }
}

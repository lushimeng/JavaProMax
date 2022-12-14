/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d11_genericity_limit;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
//        go(dogs);
    }
    public static void go(ArrayList<? extends Car> car){  // 上下限

    }
}

class Dog{

}

// 父类
class Car{

}

class BENZ extends Car{

}

class BMW extends Car{

}


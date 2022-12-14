/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_lambda;

public class LambdaDemo01 {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("dog跑的很快~~~");
            }
        };
        a.run();

//        // 错误示范
//        Animal a = () -> { System.out.println("dog跑的很快~~~"); };
//        a.run();
    }
}

abstract  class Animal{
    public abstract  void run();
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_innerclass_anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的很快~~~");
            }
        };

        a.run();  // 方法：编译看左边，运行看右边.  成员：编译看左边，运行也看左边
    }
}

abstract class Animal{
    public abstract void run();
}


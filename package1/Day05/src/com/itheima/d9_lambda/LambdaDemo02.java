/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_lambda;

public class LambdaDemo02 {
    public static void main(String[] args) {
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类形式（函数式接口）
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳很快~~~");
            }
        };
        go(s);
        System.out.println("-------------------------");
        Swimming s1 = () -> {
            System.out.println("学生游泳还可以~~~");
        };
        go(s1);
        System.out.println("-------------------------");
        go(() -> {
            System.out.println("教练游泳还可以~~~");
        });

    }
    public static void go(Swimming s){
        System.out.println("开始。。。");
        s.swim();
        System.out.println("结束。。。");
    }
}

// 一旦加上这个注解，必须是函数接口，里面只能有一个抽象方法
@FunctionalInterface
interface Swimming{
    void swim();
}
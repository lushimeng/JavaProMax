/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_innerclass_anonymous;

public class Test1 {
    public static void main(String[] args) {
        /**
         * 学生、老师、运动员参加比赛游泳
         */
        Swimming swimming = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生游泳还可以~~~~");
            }
        };
        swim(swimming);
        System.out.println("---------------------------");
        Swimming swimming1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师游泳比较快~~~~");
            }
        };
        swim(swimming1);
        System.out.println("---------------------------");
        swim(new Swimming() {         // 匿名内部类可以作为方法的实际参数进行传输。
            @Override
            public void swim() {
                System.out.println("运动员游泳最快~~~");
            }
        });

    }

    public static void swim(Swimming swim){
        System.out.println("开始~~~~");
        swim.swim();
        System.out.println("结束~~~~");
    }
}


interface Swimming{
    void swim();  // 在JDK8之前，接口中的方法只能是抽象方法，这里的swim方法就是抽象方法，只是省略了public abstract，变量只能是常量
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticTest;

public class Test {
    // 静态成员变量
    public static int onLineNumber;
    // 实例成员变量
    private String name;

    // 1. 静态方法可以直接访问静态成员变量
    // 不能直接访问实例成员变量，但可以通过实例化对象进行访问
    public static void getMax(){
        System.out.println(Test.onLineNumber);
        System.out.println(onLineNumber);
        //System.out.println(name);  // 错误，实例化成员变量只能有实例化对象去访问，不能放在静态方法中
        //System.out.println(this);  // 静态方法中不能出现this变量
        Test t = new Test();
        System.out.println(t.name);

        inAddress();
    }

    public static void inAddress(){
        System.out.println(onLineNumber);
    }

    // 2. 实例方法可以直接访问静态成员，也可以访问实例成员
    public void run(){
        System.out.println(onLineNumber);  // 访问静态成员变量
        System.out.println(name);  // 访问实例化成员变量
        System.out.println(this.name);
        inAddress();  // 访问静态方法
        getMax();
        sing();  // 访问实例化方法
    }

    public void sing(){

    }
}





















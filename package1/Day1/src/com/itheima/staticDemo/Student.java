/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticDemo;

public class Student {
    private String name;
    // 1. 实例方法： 无static修饰的，属于对象的
    public void study(){
        System.out.println(name + "在好好学习~~~~");
    }
    // 2. 静态方法：有static修饰，属于类和对象共享的
    public static int getMax(int a, int b){
       return (a > b ? a : b);
    }

    public static void main(String[] args) {
        // 1. 类名.静态成员方法
        System.out.println(Student.getMax(10, 100));
        // 注意： 同一个类中访问静态成员类名可以不写
        System.out.println(getMax(10, 100));

        // 2.对象.实例成员方法
        Student student = new Student();
        student.name = "lushimeng";
        student.study();

        // 3. 对象.静态成员方法(不推荐)
        System.out.println(student.getMax(10, 100));
    }
}

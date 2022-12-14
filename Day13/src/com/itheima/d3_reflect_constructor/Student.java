/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_reflect_constructor;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参构造器");
    }

    public Student(String name, int age){
        System.out.println("有参构造器");
        this.name = name;
        this.age = age;
    }

    public Student(String name){
        this.name = name;
    }

    public Student(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

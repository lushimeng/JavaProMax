/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_api_object;

import java.util.Objects;

public class Student{  //  extends Object
    private String name;
    private int age;
    private char sex;

    public Student() {
    }

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        // 1、判断是否是同一个对象比较，如果是返回true.
        if (this == o) return true;
        // 2、如果o是null返回false,
        // 如果o的类型和调用的类型（Student）不一致也返回false
        if (o == null || getClass() != o.getClass()) return false;
        // 说明o一定是学生类型而且不为null
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name);
    }

    //    @Override
//    public boolean equals(Object o){
//        if(o instanceof Student){
//            Student s = (Student)o; // 利用多态的强转
//            return this.age == s.age &&
//                    this.sex == s.sex &&
//                    ((Student) o).name.equals(this.name);
//        }else {
//            return false;
//        }
//    }

}

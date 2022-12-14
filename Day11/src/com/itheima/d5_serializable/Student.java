/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_serializable;

import java.io.Serializable;

public class Student implements Serializable {  // 要想对象序列化必须实现Serializable序列化接口
    // 有可能Student中的成员变量会发生变化，所以有版本之一说法
    // 序列化的版本号与反序列化的版本号必须一致才不会出错：stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
    private static final long serialVersionUID = 2;
    private String name;
    private String loginName;
    private transient String passWord;  // transient修饰的成员变量不参与序列化，这样可以隐藏敏感信息
    private int age;

    public Student(){

    }

    public Student(String name, String loginName, String passWord, int age) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
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
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}

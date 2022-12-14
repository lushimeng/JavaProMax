/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.constructor;

public class User {
    private String name;
    private String password;
    private String login;
    private int age;

    // 无参构造器
    public User(){
        System.out.println("无参构造器被执行~~~");
    }

    // 有参构造器
    public User(String name, String password, String login, int age){
        this.name = name;
        this.password = password;
        this.login = login;
        this.age = age;
        System.out.println("有参构造器被执行~~~");
    }

    // getXXX/setXXX方法


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

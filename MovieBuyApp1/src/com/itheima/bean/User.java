/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.bean;

/**
 * 用户类(客户和商家的父类)
 */
public class User {
    private String loginName;   // 登录名(唯一)
    private String passWord;    // 登录密码
    private  String userName;   // 用户名称(注册时候的真实姓名)
    private char sex;           // 性别
    private String phone;       // 手机号
    private double money;       // 账户的余额

    public User(){

    }

    public User(String loginName, String passWord, String userName, char sex, String phone, double money) {
        this.loginName = loginName;
        this.passWord = passWord;
        this.userName = userName;
        this.sex = sex;
        this.phone = phone;
        this.money = money;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", money=" + money;
    }


}































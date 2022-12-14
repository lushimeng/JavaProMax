/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_abstract_demo;

public abstract class FuCard {
    private String name;
    private double account;

    // 子类一定要支付的，但是每个子类支付情况不一样，所以父类把支付定义成抽象方法，交给子类实现功能
    public abstract void pay(double account);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccount() {
        return account;
    }

    public void setAccount(double account) {
        this.account = account;
    }
}

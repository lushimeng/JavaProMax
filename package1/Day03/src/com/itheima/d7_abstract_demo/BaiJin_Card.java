/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_abstract_demo;

public class BaiJin_Card extends FuCard {
    @Override
    public void pay(double account) {
       double payment = account * 0.8;
       double lastMoney = this.getAccount() - payment;
        System.out.println(this.getName() + "总金额为" + this.getAccount() +
                ", 共消费" + payment + ", 余额为" + lastMoney);

        this.setAccount(lastMoney);  // 更新用于余额
    }
}

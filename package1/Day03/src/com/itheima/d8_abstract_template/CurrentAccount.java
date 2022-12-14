/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_abstract_template;

public class CurrentAccount extends Account{

    public CurrentAccount(String cardId, double money){
        super(cardId, money);  // 调用父类有参构造器，给参数赋初值
    }

    @Override
    public double calc() {
        double result = this.getMoney() * 0.35 * 0.01;
        double money = this.getMoney() + result;  // 账户总金额
        this.setMoney(money);  // 更新账户总金额
        return result;
    }
}

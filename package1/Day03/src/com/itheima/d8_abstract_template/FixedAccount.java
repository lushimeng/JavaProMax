/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_abstract_template;

public class FixedAccount extends Account{

    public FixedAccount(String cardId, double money){
        super(cardId, money);  // 调用父类有参构造器，给参数赋初值
    }

    @Override
    public double calc() {
        double result = this.getMoney() * 1.75 * 0.01;
        if(this.getMoney() >= 100000){
            result += this.getMoney() * 0.03;
        }
        double money = this.getMoney() + result;
        this.setMoney(money);

        return result;
    }
}

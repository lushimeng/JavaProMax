/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_abstract_template;

public abstract class Account {
    public static final String LOGIN_NAME = "itheima"; // 常量
    public static final String PASS_WORD = "123456";  // 常量

    private String cardId;
    private double money;

    public Account(){}

    public Account(String cardId, double money){
        this.cardId = cardId;
        this.money = money;
    }

    /**
     * 登录结算利息
     */
    public void handle(String loginName, String passWord){
        // 1. 判断是否登录成功
        if(LOGIN_NAME.equals(loginName) && PASS_WORD.equals(passWord)){
            System.out.println("登录成功~~~");
            // 2. 结算利息
            double result = calc();
            System.out.println("本账户利息是:" + result);
        }else {
            // 3. 登录失败
            System.out.println("登录失败~~~");
        }
    }

    public abstract double calc();

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}

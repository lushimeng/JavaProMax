/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_thread_safe;

public class Account {
   private String cardId;
   private double money;

   public Account(){
   }

   public Account(String cardId, double money){
       this.cardId = cardId;
       this.money = money;
   }

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

    public void drawMoney(double money) {
       if(this.money >= money){
           System.out.println(Thread.currentThread().getName() + "取钱为：" + money);
           this.money -= money;
           System.out.println("账户余额为：" + this.money);
       }
    }
}

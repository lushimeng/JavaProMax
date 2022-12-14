/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_thread_synchronized_method;

/**
 * 同步方法的原理：
 * 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
 * 如果方法是实例方法：同步方法默认用this作为的锁对象。但是代码要高度面向对象！
 * 如果方法是静态方法：同步方法默认用类名.class作为的锁对象。
 */

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

    public synchronized void drawMoney(double money) {
        if(this.money >= money){
            System.out.println(Thread.currentThread().getName() + "取钱成功：" + money + ", 账户余额为：" + (this.money - money));
            this.money -= money;
        }else {
            System.out.println(Thread.currentThread().getName() + "发现账户余额不足，仅还有" + this.money +"， 无法进行取钱。");
        }
    }
}

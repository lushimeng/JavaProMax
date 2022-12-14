/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_thread_synchronized_code;

/**
 * 规范上：建议使用共享资源作为锁对象。
 * 对于实例方法建议使用this作为锁对象。
 * 对于静态方法建议使用字节码（类名.class）对象作为锁对象。
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

    public void drawMoney(double money) {
        synchronized (this) {
            if(this.money >= money){
                System.out.println(Thread.currentThread().getName() + "取钱成功：" + money + "账户余额为：" + (this.money - money));
                this.money -= money;
            }else {
                System.out.println(Thread.currentThread().getName() + "发现账户余额不足，仅还有" + this.money +"， 无法进行取钱。");
            }
        }
    }
}

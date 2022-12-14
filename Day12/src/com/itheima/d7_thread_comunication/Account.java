/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_thread_comunication;

public class Account {
    private String cardId;
    private double money;

    public Account(){}

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
    // TODO: 2022/5/11

    // 小明，小红这两个线程取钱，要上锁
    public synchronized void drawMoney(double money) {
        try {
            String name = Thread.currentThread().getName();
            if(this.money > 0){  // 可以取钱
                this.money -= money;
                System.out.println(name + "取款前账户余额为：" + (this.money + money) + ", 取款后账户余额为：" + this.money);

                this.notifyAll();  // 唤醒所有
                this.wait();  // 自己等待

            }else {
                this.wait();  // 自己等待
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    // 父亲，岳父以及干爹存钱
    public synchronized void depositMoney(double money){
        try {
            String name = Thread.currentThread().getName();
            if(this.money > 0){  // 证明还有钱，直接等待即可
                this.wait();  // 自己等待
            }else { // 证明账户里面没有钱了，需要往里面存钱
                this.money += money;
                System.out.println(name + "存款前账户余额为：" + (this.money - money) + ", 存款后账户余额为：" + this.money);

                this.notifyAll();  // 唤醒所有
                this.wait();  // 自己等待
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

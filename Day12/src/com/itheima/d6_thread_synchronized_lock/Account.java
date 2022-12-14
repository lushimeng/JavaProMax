/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_thread_synchronized_lock;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
   private String cardId;
   private double money;
   // final修饰后：锁对象是唯一和不可替换的，非常专业
   // Lock是一个接口，不能直接实例化对象，一般使用ReentrantLock()获取对象
//   private final Lock lock = new ReentrantLock();  // 多态的写法
   private final ReentrantLock lock = new ReentrantLock();

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

    public  void drawMoney(double money) {
       lock.lock();  // 上锁
//        System.out.println(lock.getHoldCount());
        try {
            if(this.money >= money){
                System.out.println(Thread.currentThread().getName() + "取钱成功：" + money + ", 账户余额为：" + (this.money - money));
                this.money -= money;
            }else {
                System.out.println(Thread.currentThread().getName() + "发现账户余额不足，仅还有" + this.money +"， 无法进行取钱。");
            }
        } finally {
            lock.unlock();  // 解锁，无论try中是否抛出异常都会运行finally中的解锁功能
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_thread_comunication;

/**
 * 线程类，继承Thread，
 */
public class DrawThread extends Thread{
    private Account account;
    public DrawThread(){};

    public DrawThread(Account account, String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            account.drawMoney(10000);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

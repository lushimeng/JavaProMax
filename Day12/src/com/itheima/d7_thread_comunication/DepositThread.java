/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_thread_comunication;

/**
 * 存钱线程类，需要继承Thread类
 */
public class DepositThread extends Thread{
    private Account account;

    public DepositThread(){}

    public DepositThread(Account account, String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true){
            account.depositMoney(10000);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

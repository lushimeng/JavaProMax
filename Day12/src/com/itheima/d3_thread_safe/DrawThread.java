/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_thread_safe;

public class DrawThread extends Thread {
    private Account account;

    DrawThread(){
    }

    public DrawThread(String name, Account account){
        super(name);  // 设置线程的名字
        this.account = account;
    }


    @Override
    public void run() {
        account.drawMoney(100000);
    }
}

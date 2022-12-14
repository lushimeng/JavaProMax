/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */

/**
 * 规范上：建议使用共享资源作为锁对象。
 * 对于实例方法建议使用this作为锁对象。
 * 对于静态方法建议使用字节码（类名.class）对象作为锁对象。
 */
package com.itheima.d4_thread_synchronized_code;

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

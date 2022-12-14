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
package com.itheima.d5_thread_synchronized_method;

/**
 * 同步方法的原理：
 * 同步方法其实底层也是有隐式锁对象的，只是锁的范围是整个方法代码。
 * 如果方法是实例方法：同步方法默认用this作为的锁对象。但是代码要高度面向对象！
 * 如果方法是静态方法：同步方法默认用类名.class作为的锁对象。
 */
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

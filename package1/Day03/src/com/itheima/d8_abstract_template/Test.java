/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_abstract_template;

public class Test {
    public static void main(String[] args) {
        CurrentAccount currentAccount = new CurrentAccount("ICBC_0111", 10000);
        currentAccount.handle("itheima", "123456");

        FixedAccount fixedAccount = new FixedAccount("JDBC_123", 100000);
        fixedAccount.handle("itheima", "123456");
    }
}

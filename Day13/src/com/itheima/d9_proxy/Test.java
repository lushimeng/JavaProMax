/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_proxy;

public class Test {
    public static void main(String[] args) throws Exception{
        // 1. 把业务对象，直接做成一个代理对象返回，代理对象的类型也是UserService类型
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        userService.selectUsers();
        System.out.println(userService.deleteUsers());
    }
}

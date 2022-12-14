/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_proxy;

public class Test {
    public static void main(String[] args) throws Exception{
       UserService userService = new UserServiceImpl();
        System.out.println(userService.login("admin", "123456"));
        userService.selectUsers();
        System.out.println(userService.deleteUsers());
    }
}

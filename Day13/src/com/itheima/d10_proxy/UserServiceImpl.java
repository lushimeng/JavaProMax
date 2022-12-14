/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_proxy;


public class UserServiceImpl implements UserService {
    @Override
    public String login(String loginName, String passWord) {
        System.out.println("----------------------运行login方法----------------------");
        try {
            long startTime = System.currentTimeMillis();
            Thread.sleep(1000);  // 模拟登录时间
            long endTime = System.currentTimeMillis();
            System.out.println("login方法运行时间为：" + (endTime - startTime) / 1000.0 + "s");
            if ("admin".equals(loginName) && "123456".equals(passWord)) {
                return "success";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "登录名或者密码错误";
    }

    @Override
    public void selectUsers() {
        System.out.println("--------------------运行selectUsers方法--------------------");
        try { // 模拟查询用户时间
            long startTime = System.currentTimeMillis();
            System.out.println("查询了100个用户！");
            Thread.sleep(1000);
            long endTime = System.currentTimeMillis();
            System.out.println("selectUsers方法运行时间为：" + (endTime - startTime) / 1000.0 + "s");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean deleteUsers() {
        System.out.println("--------------------运行deleteUsers方法--------------------");
        try {
            long startTime = System.currentTimeMillis();
            System.out.println("删除100个用户");
            Thread.sleep(2500);
            long endTime = System.currentTimeMillis();
            System.out.println("delectUsers方法运行时间为：" + (endTime - startTime) / 1000.0 + "s");
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}

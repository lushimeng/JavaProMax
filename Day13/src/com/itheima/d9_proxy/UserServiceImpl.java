/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_proxy;

public class UserServiceImpl implements UserService{
    @Override
    public String login(String loginName, String passWord) {
        System.out.println("----------------------运行login方法----------------------");
        try {
            Thread.sleep(1000);  // 模拟登录时间
            if("admin".equals(loginName) && "123456".equals(passWord)){
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
        System.out.println("查询了100个用户！");
        try { // 模拟查询用户时间
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean deleteUsers() {
        System.out.println("--------------------运行deleteUsers方法--------------------");
        System.out.println("查询了100个用户！");
        try {  // 模拟删除时间
            Thread.sleep(1000);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}

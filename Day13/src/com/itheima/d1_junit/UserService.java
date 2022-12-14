/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_junit;

public class UserService {
    public String loginName(String name, String passWord){
        if("admin".equals(name) && "123456".equals(passWord)){
            System.out.println("登录成功！！！");
            return "登录成功！！!";
        }else {
            System.out.println("登录失败！！！！");
            return "用户名或者密码出现问题！！！";
        }
    }

    public void selectNames(){
        System.out.println( 10 / 5);
        System.out.println("查询全部用户名称成功~~~");
    }
}

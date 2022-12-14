/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticDemo;

public class User {
    // 静态成员变量：有static修饰，属于类，加载一次，可以被共享访问
    public static int onLineNumber = 161;
    // 实例成员变量：无static修饰，属于每个对象
    private String name;
    private int age;

    public static void main(String[] args) {
        // 1.类名.静态成员变量
        System.out.println(User.onLineNumber);
        System.out.println(onLineNumber);
        User.onLineNumber++;

        //2. 创建用户对象：对象.实例成员
        User user = new User();
        user.name = "luShiMeng";
        user.age = 22;
        System.out.println(user.name);
        System.out.println(user.age);
        // 对象名称：静态成员变量(不推荐)
        System.out.println(user.onLineNumber);

        User user1 = new User();
        user1.name = "yangYinYu";
        user1.age = 18;
        System.out.println(user1.name);
        System.out.println(user1.age);
        // 对象名称：静态成员变量(不推荐)
        user1.onLineNumber++;

        System.out.println(User.onLineNumber);

    }
}

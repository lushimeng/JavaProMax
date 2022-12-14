/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.constructor;

public class Test {
    public static void main(String[] args){
        User user1 = new User();
        System.out.println(user1.getAge());
        System.out.println(user1.getName());
        System.out.println(user1.getLogin());
        System.out.println(user1.getPassword());

        User user2 = new User("lushimeng", "1234", "root", 22);
        System.out.println(user2.getAge());
        System.out.println(user2.getName());
        System.out.println(user2.getLogin());
        System.out.println(user2.getPassword());


    }

}

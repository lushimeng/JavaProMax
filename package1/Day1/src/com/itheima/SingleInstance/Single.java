/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.SingleInstance;
// 使用饿汉单例方式定义单例类
public class Single {
    /**
     * 2、定义一个公开的静态的成员变量来存储一个类的对象
     * 饿汉：在这里加载静态变量的时候就会创建对象了
     */
    public static Single single = new Single();
    /**
     * 1、把构造器私有起来
     */
    private Single(){
    }
}

















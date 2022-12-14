/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.test;

public class Test1<T> {
    // 泛型类中的普通方法，类接收到的T类型也会传到testMethod方法中
    public void testMethod(T t){
        System.out.println(t.getClass().getName());
    }

    // 泛型方法，与类后面的T是不一致的
    public <T> T testMethod1(T t){
        return t;
    }
}

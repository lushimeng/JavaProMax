/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_reflect_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws Exception{
        // 1. Class类中的一个静态方法：forName(权限名：包名+类名)
        Class c1 = Class.forName("com.itheima.d2_reflect_class.Student");
        System.out.println(c1);

        // 2. 类型.class。
        Class c2 = Student.class;
        System.out.println(c2);

        // 3. 对象.getClass() 获取对象对应类的Class对象。
        Student s = new Student("卢世猛", 23);
        Class c3 = s.getClass();
        System.out.println(c3);

        Constructor[] constructors = c3.getConstructors();  // 获得构造器
        System.out.println(constructors);

        Method[] methods = c3.getMethods();  // 获得Method方法
        System.out.println(methods);

        Field[] fields = c3.getFields();  // 得到成员变量
        System.out.println(fields);


    }
}














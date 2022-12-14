/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_reflect_framework.framework;

import java.lang.reflect.Field;

public class Util {
    public static void frameWorkToText(Object obj){
        try {
            // 1. 获取class对象
            Class c = obj.getClass();
            // c.getSimpleName()获取当前类名, c.getName获取全限名：包名+类名
            System.out.println("===================" + c.getSimpleName() + "===================");

            // 2. 获取所有的成员变量对象
            Field[] fields = c.getDeclaredFields();

            // 3. 成员变量对象
            for (Field field : fields) {
                field.setAccessible(true); // 开放权限，进行暴力反射
                String name = field.getName();  // 获取变量的名字
                String value = field.get(obj) + "";  // 获取变量的值
                System.out.println(name + " = " + value);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 目标：反射_获取Field成员变量对象。

 反射的第一步是先得到Class类对象。

 1、Field getField(String name): 根据成员变量名获得对应Field对象，只能获得public修饰
 2.Field getDeclaredField(String name): 根据成员变量名获得对应Field对象，只要申明了就可以得到
 3.Field[] getFields(): 获得所有的成员变量对应的Field对象，只能获得public的
 4.Field[] getDeclaredFields(): 获得所有的成员变量对应的Field对象，只要申明了就可以得到
 小结：
 获取全部成员变量：getDeclaredFields
 获取某个成员变量：getDeclaredField
 */
public class FieldDemo1 {
    @Test
    public void testGetFields(){
        System.out.println("\n---------------------------开始执行getFields()方法---------------------------");
        // 1. Field[] getFields(): 获得所有的成员变量对应的Field对象，只能获得public的
        // a. 定位Class对象
       Class c = Student.class;

       // b.
        Field[] fields = c.getFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "-------------->" + field.getType());
        }
    }

    @Test
    public void testGetDeclaredFields(){
        System.out.println("\n---------------------------开始执行getDeclaredFields()方法---------------------------");
        // 2.Field[] getDeclaredFields(): 获得所有的成员变量对应的Field对象，只要申明了就可以得到
        // a. 定位Class对象
        Class c = Student.class;

        // b.定位全部成员变量
        Field[] fields = c.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "-------------->" + field.getType());
        }
    }

    @Test
    public void testGetField() throws Exception {
        System.out.println("\n---------------------------开始执行getField()方法---------------------------");
        // 3. Field getField(String name): 根据成员变量名获得对应Field对象，只能获得public修饰
        // a. 定位Class对象
        Class c = Student.class;

        // b. 定位成员变量
        Field ageField = c.getField("age");

        System.out.println(ageField.getName() + "-------------->" + ageField.getType());

    }

    @Test
    public void testGetDeclaredField() throws Exception{
        System.out.println("\n---------------------------开始执行getDeclaredFields()方法---------------------------");
        // 4. Field getDeclaredField(String name): 根据成员变量名获得对应Field对象，只要申明了就可以得到
        // a. 定位Class对象
        Class c = Student.class;

        // b. 定位成员变量
        Field ageField = c.getDeclaredField("name");
        System.out.println(ageField.getName() + "-------------->" + ageField.getType());
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_reflect_constructor;

import org.junit.Test;
import java.lang.reflect.Constructor;


public class TestStudentDemo2 {
    @Test
    public void testGetDeclaredConstructor() throws Exception{
        // 1. 获取类对象
        Class aClass = Student.class;

        // 2. 获的构造器
        Constructor conns = aClass.getDeclaredConstructor();

        // 3. 创建对象（已经知道是Student，可以强制转换）
        /**
         * 设置为true,表示取消访问检查，进行暴力反射
         * 特别注意，如果构造器是私有的private不调用setAccessible会报错：java.lang.IllegalAccessException
         * java.lang.IllegalAccessException: Class com.itheima.d3_reflect_constructor.TestStudentDemo2 can not access a member of class com.itheima.d3_reflect_constructor.Student with modifiers "private"
         */
        conns.setAccessible(true);  // 进行暴力反射，即使构造器为私有的也可以打开权限

        Student student = (Student) conns.newInstance();  // 平常创建对象为new 构造器(参数列表)  现在变为了 构造器.newInstance(参数列表)
        System.out.println(student);  // Student{name='null', age=0}

        System.out.println("----------------------------------------------");

        // 2. 获的构造器,只用获得带有参数得构造器才可以传入参数
        Constructor conns1 = aClass.getDeclaredConstructor(String.class, int.class);
        Student student1 = (Student) conns1.newInstance("lushimeng", 23);
        System.out.println(student1);  // Student{name='lushimeng', age=23}



        System.out.println("----------------------------------------------");

        // 2. 获的构造器,只用获得带有参数得构造器才可以传入参数
        Constructor conns2 = aClass.getDeclaredConstructor(String.class);
        conns2.setAccessible(true);  // 设置为true,表示取消访问检查，进行暴力反射
        Student student2 = (Student) conns2.newInstance("lushimeng");
        System.out.println(student2);  // Student{name='lushimeng', age=0}

    }
}

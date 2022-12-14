/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_reflect_method;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 目标：反射——获取Method方法对象

 反射获取类的Method方法对象：
 1、Method getMethod(String name,Class...args): 根据方法名和参数类型获得对应的方法对象，只能获得public的

 2、Method getDeclaredMethod(String name,Class...args): 根据方法名和参数类型获得对应的方法对象，包括private的

 3、Method[] getMethods(): 获得类中的所有成员方法对象，返回数组，只能获得public修饰的且包含父类的

 4、Method[] getDeclaredMethods(): 获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。

 Method的方法执行：
 Object invoke(Object obj, Object... args)
 参数一：触发的是哪个对象的方法执行。
 参数二： args：调用方法时传递的实际参数
 */
public class MethodDemo1 {
    @Test
    public void testGetDeclaredMethods(){
        System.out.println("--------------------------开始运行getDeclaredMethods--------------------------");
        // 1、Method[] getDeclaredMethods(): 获得类中的所有成员方法对象，返回数组,只获得本类申明的方法。
        // a. 定位Class文件
        Class c = Dog.class;

        // b. 获取所有成员方法
        Method[] method = c.getDeclaredMethods();
        for (Method method1 : method) {
            System.out.println(method1.getName() + "返回类型：" + method1.getReturnType() + "，参数个数：" + method1.getParameterCount());
        }
    }

    @Test
    public void testGetDeclaredMethod() throws Exception{
        System.out.println("--------------------------开始运行getMethod--------------------------");
        // 2. Method getDeclaredMethod(String name,Class...args): 根据方法名和参数类型获得对应的方法对象，包括private的
        // a. 定位class对象
        Class c = Dog.class;

        // 获取单个成员方法
        Dog dog = new Dog();

        Method run = c.getDeclaredMethod("run");
        // 注意：方法如果是没有结果回来的，那么返回的是null.
        Object result = run.invoke(dog);
        System.out.println(result);


        Method eat = c.getDeclaredMethod("eat", String.class);
        // 暴力打开权限
        eat.setAccessible(true);  // 带有一个参数的eat方法在Dog类里面为私有方法
        Object result1 = eat.invoke(dog, "骨头");
        System.out.println(result1);

    }

}

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

/**
 目标：反射_获取Constructor构造器对象.

 反射的第一步是先得到Class类对象。（Class文件）

 反射中Class类型获取构造器提供了很多的API:
 1. Constructor getConstructor(Class... parameterTypes): 根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用！
 2. Constructor getDeclaredConstructor(Class... parameterTypes): 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
 3. Constructor[] getConstructors(): 获取所有的构造器，只能拿public修饰的构造器。几乎不用！！太弱了！
 4. Constructor[] getDeclaredConstructors(): 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
 小结：
 获取类的全部构造器对象： Constructor[] getDeclaredConstructors()
 -- 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
 获取类的某个构造器对象：Constructor getDeclaredConstructor(Class... parameterTypes)
 -- 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！

 */
public class TestStudentDemo1 {
    @Test
    public void testGetConstructors(){
        System.out.println("---------------------------开始执行getConstructor()方法---------------------------");
        // 1: Constructor[] getConstructors(): 获取所有的构造器，只能拿public修饰的构造器。几乎不用！！太弱了！
        // a. 通过类型.class获取类对象
        Class c = Student.class;
        Constructor[] constructors = c.getConstructors();

        // b. 遍历构造器数组constructors
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==========>" + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetDeclaredConstructors(){
        System.out.println("---------------------------开始执行getDeclaredConstructors()方法---------------------------");
        // 1: Constructor[] getDeclaredConstructors(): 获取所有申明的构造器，只要你写我就能拿到，无所谓权限。建议使用！！
        // a. 通过对象.getClass获取类对象
        Student student = new Student("lushimeng", 12);
        Class c = student.getClass();
        Constructor[] constructors = c.getDeclaredConstructors();

        // b. 遍历构造器数组constructors
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==========>" + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception{
        System.out.println("---------------------------开始执行getConstructor()方法---------------------------");
        // 3. Constructor getConstructor(Class... parameterTypes): 根据参数匹配获取某个构造器，只能拿public修饰的构造器，几乎不用！
        // a. 通过forName(权限名：包名+类名)获得类对象
        Class c = Class.forName("com.itheima.d3_reflect_constructor.Student");
        // b. 根据匹配获得某个构造器
        Constructor constructor = c.getConstructor();  // 可变参数：Class... parameterTypes
        System.out.println(constructor.getName() + "======>" + constructor.getParameterCount());

        Constructor constructor1 = c.getConstructor(String.class, int.class);  // 参数是什么类型就填写类型.class,而不是对应的包装类.class
        System.out.println(constructor1.getName() + "======>" + constructor1.getParameterCount());

        Constructor constructor2 = c.getConstructor(String.class);
        System.out.println(constructor2.getName() + "======>" + constructor2.getParameterCount());

        Constructor constructor3 = c.getConstructor(int.class);
        System.out.println(constructor3.getName() + "======>" + constructor3.getParameterCount());
    }

    @Test
    public void testGetDeclaredConstructor() throws Exception{
        System.out.println("---------------------------开始执行getDeclaredConstructor()方法---------------------------");
        // 4. Constructor getDeclaredConstructor(Class... parameterTypes): 根据参数匹配获取某个构造器，只要申明就可以定位，不关心权限修饰符，建议使用！
        // a. 通过类型.class获得类对象
        Class c = Student.class;
        // b. 根据匹配获得某个构造器
        Constructor constructor = c.getDeclaredConstructor();  // 可变参数：Class... parameterTypes
        System.out.println(constructor.getName() + "======>" + constructor.getParameterCount());

        Constructor constructor1 = c.getDeclaredConstructor(String.class, int.class);  // 参数是什么类型就填写类型.class,而不是对应的包装类.class
        System.out.println(constructor1.getName() + "======>" + constructor1.getParameterCount());

        Constructor constructor2 = c.getDeclaredConstructor(String.class);
        System.out.println(constructor2.getName() + "======>" + constructor2.getParameterCount());

        Constructor constructor3 = c.getDeclaredConstructor(int.class);
        System.out.println(constructor3.getName() + "======>" + constructor3.getParameterCount());
    }
}

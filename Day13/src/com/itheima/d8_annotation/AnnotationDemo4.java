/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_annotation;


import java.lang.reflect.Method;

public class AnnotationDemo4 {

    @MyTest
    public void test1(){
        System.out.println("=========test1============");
    }

    public void test2(){
        System.out.println("=========test2============");
    }

    @MyTest
    public void test3(){
        System.out.println("=========test3============");
    }

    public static void main(String[] args) throws Exception {
        // a. 获取类的对象
        AnnotationDemo4 annotationDemo4 = new AnnotationDemo4();
        Class c = annotationDemo4.getClass();
        // b. 获取全部方法
        Method[] methods = c.getDeclaredMethods();
        // c. 遍历方法
        for (Method method : methods) {
            // d. 查看该方法上面是否有注解
            if(method.isAnnotationPresent(MyTest.class)){
                method.invoke(annotationDemo4);  // 反射的应用，对象触发方法
            }
        }
    }
}


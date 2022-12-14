/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_annotation;

/**
 * 注解：
 * 对Java中类、构造器、方法、成员变量做标记，然后进行特殊处理
 */

@MyBook(name = "精通java", authors = {"1", "2"}, price = 23.23)  // 注解类
public class AnnotationDemo1 {

    @MyBook(name = "精通java", authors = {"1", "2"}, price = 23.23)  // 注解构造器
    public AnnotationDemo1(){

    }

    @MyBook(name = "精通java", authors = {"1", "2"}, price = 23.23)  // 注解方法
    public static void main(String[] args) {

        @MyBook(name = "精通java", authors = {"1", "2"}, price = 23.23)  // 注解成员变量
        int age = 10;

    }
}

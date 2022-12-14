package com.itheima.d8_annotation;

import java.lang.annotation.*;

/**
 * @Target中可使用的值定义在ElementType枚举类中，常用值如下:
 *  TYPE，类，接口
 *  FIELD, 成员变量
 *  METHOD, 成员方法
 *  PARAMETER, 方法参数
 *  CONSTRUCTOR, 构造器
 *  LOCAL_VARIABLE, 局部变量
 *
 *  @Retention中可使用的值定义在RetentionPolicy枚举类中，常用值如下：
 *  SOURCE： 注解只作用在源码阶段，生成的字节码文件中不存在
 *  CLASS：  注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值.
 *  RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})  // MyTest可以注解类、接口，成员方法
public @interface MyTest {
}

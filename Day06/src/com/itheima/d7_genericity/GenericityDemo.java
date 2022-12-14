/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_genericity;

import java.util.*;

/**
 目标：泛型的概述。

 什么是泛型？
 泛型就是一个标签：<数据类型>
 泛型可以在编译阶段约束只能操作某种数据类型。

 注意：
 JDK 1.7开始之后后面的泛型申明可以省略不写
 小结：
 泛型就是一个标签。
 泛型可以在编译阶段约束只能操作某种数据类型。
 泛型只能支持引用数据类型。
 */
public class GenericityDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java1");
//        list.add(345);

        List list1 = new ArrayList(); // 在无泛型类的限制情况下为Object类型
        list1.add(34);
        list1.add("jkd");
        list1.add(true);
        list1.add(false);
        list1.add(45.45);
        System.out.println(list1);

        for(Object o : list1){
//            String str = (String)o;  // 这种方法在遇到数字类型的时候会报错
            String str = o + ""; // 无论什么类型都转换为String类型
            System.out.println(str);
        }
    }
}

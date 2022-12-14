/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_reflect_genericity;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo {
    public static void main(String[] args) throws Exception{
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println(list1.getClass());  // class java.util.ArrayList
        System.out.println(list2.getClass());  // class java.util.ArrayList

        // 泛型只是在  编译阶段  可以约束集合只能操作某种数据类型，
        // 在编译成Class文件进入  运行阶段  的时候，其真实类型都是  ArrayList，泛型相当于被擦除了。
        System.out.println(list1.getClass() == list2.getClass());  // true

        System.out.println("-----------------------------------------------------");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(12);
        list3.add(34);
//        list3.add("路石门");  // 报错了


        Class c = list3.getClass();
        Method add = c.getDeclaredMethod("add", Object.class);
        boolean result = (boolean)add.invoke(list3, "黑马");
        System.out.println(result);  // true ， 成功插入字符串黑马
        System.out.println(list3);   // [12, 34, 黑马]

        System.out.println("-----------------------------------------------------");
        ArrayList list4 = list3;
        list4.add(false);
        list4.add("YYDS");
        System.out.println(list3);  // [12, 34, 黑马, false, YYDS]
    }
}





























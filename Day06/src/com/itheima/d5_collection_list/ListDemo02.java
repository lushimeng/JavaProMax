/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo02 {
    public static void main(String[] args) {
        // 1. 创建一个ArrayList集合对象
        // List: 有序，可重复，有索引
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("HTML");
        list.add("HTML");
        list.add("Mysql");
        list.add("Mysql");
        System.out.println(list);

        // 4. 根据索引获取元素
        // 4.1 for循环遍历方式
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("------------------------------");

        // 4.2 迭代器iterator遍历方式
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("------------------------------");

        // 4.3 foreach / 增强for循环
        for(String str : list){
            System.out.println(str);
        }
        System.out.println("------------------------------");

        // 4.4 JDK1.8之后开始有lambda表达式
        list.forEach(s -> System.out.println(s));
        System.out.println("------------------------------");
        list.forEach(System.out::println);


    }
}

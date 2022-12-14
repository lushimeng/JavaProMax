/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
    public static void main(String[] args) {
        // List接口(实现类：ArrayList && LinkList)
        // 有序，可重复 --- > 有索引
        Collection list = new ArrayList();  // 多态的写法
        list.add("java");
        list.add("java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list.toArray());
        System.out.println(list);
        System.out.println(list.toString());

        // set接口(实现类HashSet，TreeSet) 无序 不重复 -- > 无索引
        Collection list1 = new HashSet();
        list1.add("java");
        list1.add("java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);
        System.out.println(list1.toString());

        System.out.println("--------------------------------");
        // 集合和泛型都不支持基本数据类型
        Collection<String> list3 = new ArrayList<>();  // <包裹的为泛型>表示只能存储该引用类型的数据，其它类型不能进行存储
        list3.add("Java");
        list3.add("1234");
//        list3.add(1);
        System.out.println(list3);

        Collection<Integer> list2 = new ArrayList<>();
        list2.add(34);  // 自动装箱处理 int  -- > Integer
        list2.add(new Integer(23)); // 有参构造
        list2.add(34);
        System.out.println(list2);

    }
}

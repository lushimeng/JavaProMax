/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_map_impl;

import com.itheima.d1_collection_set.Apple;

import java.util.*;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(14, "王麻子");
        map.put(45, "张三");
        map.put(32, "赵六");
        System.out.println(map);

        /**
         * TreeSet()底层源码
         *  public TreeSet() {
         *         this(new TreeMap<E,Object>());
         *     }
         *     new TreeSet<>();
         */

        // 1. TreeMap集合自带排序。可排序，不重复， 无索引
        // 排序方式二：集合自定义Comparator比较器对象，重写比较规则
        Map<Apple, String> maps1 = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o2.getPrice(), o1.getPrice()); // 按照价格降序
            }
        });


        maps1.put(new Apple("红富士", "红色", 9.9, 500), "山东" );
        maps1.put(new Apple("青苹果", "绿色", 15.9, 300), "广州");
        maps1.put(new Apple("绿苹果", "青色", 29.9, 400), "江西");
        maps1.put(new Apple("黄苹果", "黄色", 9.6, 500), "湖北");

        System.out.println(maps1);

        // 2.1(推荐) 遍历map集合, 先通过keySet方法获得键，然后遍历键的集合获取值
        System.out.println("------------------------------------------------------------------");
        Set<Apple> apples = maps1.keySet();
        for (Apple apple : apples) {
            String value = maps1.get(apple);
            System.out.println(apple.toString() + "--->" + value);
        }

        // 2.2(不推荐) 遍历map集合, 通过调用entrySet方法，把集合中的键值对当做为一个整体进行访问
        System.out.println("------------------------------------------------------------------");
        Set<Map.Entry<Apple, String>> entries = maps1.entrySet();
        for (Map.Entry<Apple, String> entry : entries) {
            System.out.println(entry.getKey().toString() + "--->" + entry.getValue());
        }

        // 2.3 lambda遍历集合
        System.out.println("------------------------------------------------------------------");
        maps1.forEach( (apple, s) -> System.out.println(apple.toString() + "--->" + s));

    }
}

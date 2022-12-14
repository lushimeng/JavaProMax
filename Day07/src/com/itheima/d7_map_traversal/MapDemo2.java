package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 *     目标：Map集合的遍历方式。
 *
 *     Map集合的遍历方式有：3种。
 *         （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据键找值。
 *         （2）“键值对”的方式遍历：难度较大。
 *         （3）JDK 1.8开始之后的新技术：Lambda表达式。
 *
 *     b.“键值对”的方式遍历：
 *         1.把Map集合转换成一个Set集合:Set<Map.Entry<K, V>> entrySet();
 *         2.此时键值对元素的类型就确定了，类型是键值对实体类型：Map.Entry<K, V>
 *         3.接下来就可以用foreach遍历这个Set集合，类型用Map.Entry<K, V>
 *  */

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String , Integer> maps = new HashMap<>();
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);

        // {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
        // 1. 把Map集合转换成一个Set集合:Set<Map.Entry<K, V>> entrySet();
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();

        // 2. 此时键值对元素的类型就确定了，类型是键值对实体类型：Map.Entry<K, V>
        // 3. 接下来就可以用foreach遍历这个Set集合，类型用Map.Entry<K, V>
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + "-------->" + entry.getValue());
        }
    }
}

package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 目标：Map集合的遍历方式。

 Map集合的遍历方式有：3种。
 （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据键找值。
 （2）“键值对”的方式遍历：难度较大。
 （3）JDK 1.8开始之后的新技术：Lambda表达式。

 c.JDK 1.8开始之后的新技术：Lambda表达式。（暂时了解）
 */
public class MapDemo3 {
    public static void main(String[] args) {
        // 1.添加元素: 无序，不重复，无索引
        Map<String , Integer> maps = new HashMap<>();
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);

        // 2. 利用lambda表达式访问map集合
//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + "----->" + integer);
//            }
//        });

        // 3. 上述部分可以简写为
        maps.forEach((s, integer) -> System.out.println(s + "----->" + integer));
    }
}

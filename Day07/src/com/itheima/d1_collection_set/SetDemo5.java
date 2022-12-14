/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_collection_set;

import java.util.*;
// 底层实现方式为链表 + 红黑树
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>();  // 可排序 不重复 无索引
        sets.add(23);
        sets.add(12);
        sets.add(45);
        sets.add(9);
        System.out.println(sets);  // [9, 12, 23, 45]

        Set<String> set = new TreeSet<>();  // 有序 无重复  无索引
        set.add("Java");
        set.add("Java");
        set.add("angela");
        set.add("黑马");
        set.add("Java");
        set.add("About");
        set.add("UI");
        System.out.println(set);  // [About, Java, UI, angela, 黑马]

        System.out.println("-----------------------------------------");
        /**
         * 两种方式中，关于返回值的规则：
         * 如果认为第一个元素  大于  第二个元素返回正整数即可。
         * 如果认为第一个元素  小于  第二个元素返回负整数即可。
         * 如果认为第一个元素  等于  第二个元素返回0即可，此时TreeSet集合只会------->保留一个元素，认为两者重复。
         */
        Set<Apple> setApple = new TreeSet<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o2.getPrice(), o1.getPrice());  // 按照价格降序
//                return Double.compare(o1.getPrice(), o2.getPrice());  // 按照价格升序
//                return o1.getWeight() >= o2.getWeight() ? 1 : -1;  // 按照升序排列，但是当weight相同的时候会去掉一个，原因为集合的不可重复行原因，可以使用三目运算符解决
                return o2.getWeight() >= o1.getWeight() ? 1 : -1;  // 按照降序序排列，但是当weight相同的时候会去掉一个，原因为集合的不可重复行原因，可以使用三目运算符解决

            }
        });
        setApple.add(new Apple("红富士", "红色", 9.9, 500));
        setApple.add(new Apple("青苹果", "绿色", 15.9, 300));
        setApple.add(new Apple("绿苹果", "青色", 29.9, 400));
        setApple.add(new Apple("黄苹果", "黄色", 9.8, 500));
        System.out.println(setApple);

    }
}

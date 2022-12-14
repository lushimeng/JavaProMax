/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo2 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));


//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o2.getPrice(), o1.getPrice());
//            }
//        });

        // 升序排列，lambda表达式进行简化
        Collections.sort(apples, (o1,o2) -> Double.compare(o2.getPrice(), o1.getPrice()));  // 使用List进行排序不会去重，List
        System.out.println(apples);

        for(Apple apple : apples){  // 增强for循环
            System.out.println(apple.toString());
        }
    }
}

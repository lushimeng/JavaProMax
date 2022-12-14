/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_map;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        // 1. 创建一个Map集合对象
        Map<String, Integer> maps = new TreeMap<>();  // 多态的写法

        maps.put("ABC", 3);
        maps.put("Java", 1);
        maps.put("DEF", 100);
        maps.put("Java", 100);  // 会把前面的Java值覆盖为100
        System.out.println(maps);  // 集合都重写了toString方法,打印内容
    }
}

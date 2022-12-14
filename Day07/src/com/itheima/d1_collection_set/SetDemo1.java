/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {
    public static void main(String[] args) {
        // Set系列集合的特点：HashSet LinkedHashSet  TreeSet

        Set<String> set = new LinkedHashSet<>();  // 有序  不重复  无索引  [Java, Mysql, SpringBoot, A]
        set.add("Java");
        set.add("Java");
        set.add("Mysql");
        set.add("Mysql");
        set.add("SpringBoot");
        set.add("SpringBoot");
        set.add("A");
        System.out.println(set); // 默认调用toString方法，集合都重写了Object类中的toString方法
    }
}

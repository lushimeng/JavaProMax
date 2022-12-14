/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_map_impl;

import com.itheima.d1_collection_set.Student;
import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args) {
        // 1. Map集合是根据建去除重复元素
        Map<Student, String> maps = new HashMap<>();

        Student s1 = new Student("无恙", 20, '男');
        Student s2 = new Student("无恙", 20, '男');
        Student s3 = new Student("周雄", 21, '男');

        maps.put(s1, "北京");
        maps.put(s2, "上海");   // 由于s2与s1一样，键是一样的，所以s2的值会覆盖掉s1的值
        maps.put(s3, "广州");
        System.out.println(maps);
    }
}

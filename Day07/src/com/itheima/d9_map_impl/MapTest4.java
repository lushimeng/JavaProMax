/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_map_impl;

import java.sql.Array;
import java.util.HashMap;
import java.util.*;

public class MapTest4 {
    public static void main(String[] args) {
        // 1. 使用一个Map集合进行存储, K为String类型，V为List集合类型，属于集合套集合类型。
        Map<String, List<String>> mapData = new HashMap<>();

        // 2. 声明学生选择旅游景点的集合
        List<String> str1 = new ArrayList<>();
        Collections.addAll(str1, "A", "B", "D");

        List<String> str2 = new ArrayList<>();
        Collections.addAll(str2, "B", "D");

        List<String> str3 = new ArrayList<>();
        Collections.addAll(str3, "A", "C", "D");

        List<String> str4 = new ArrayList<>();
        Collections.addAll(str4, "A", "B");

        // 3. 添加学生信息到mapData集合中
        mapData.put("张艺谋", str1);
        mapData.put("李逵", str2);
        mapData.put("张明亮", str3);
        mapData.put("宋江", str4);

        System.out.println(mapData);

        // 4. 统计每一个旅游景点想去的人数
        Map<String, Integer> map = new HashMap<>();

        // 4.1 通过先拿到键然后再对值进行访问
//        Set<String> set = mapData.keySet();
//        for (String key : set){
//            // 根据key的值拿到对应的键值List集合
//            List<String> listTemp = mapData.get(key);
//
//            // 对得到的List集合进行遍历，拿到旅游地点信息
//            for (int i = 0; i < listTemp.size(); i++) {
//                String temp = listTemp.get(i);
//                if(map.containsKey(temp)){
//                    map.put(temp, map.get(temp) + 1);
//                }else {
//                    map.put(temp, 1);
//                }
//            }
//        }

        // 4.2 直接拿到键值对中的值，对值的集合进行访问
        Collection<List<String>> values = mapData.values();  // 得到所有键值对中的值，值得类型为List<String>类型
        for (List<String> value : values) {  // 每一个value对应一个List<String>集合
            for (String s : value) {
                if(map.containsKey(s)){
                    map.put(s, map.get(s)+1);
                }else {
                    map.put(s,1);
                }
            }
        }

        System.out.println(map);  // {A=3, B=3, C=1, D=3}

    }
}

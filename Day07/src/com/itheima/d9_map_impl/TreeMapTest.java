/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_map_impl;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 需求：字符串“aababcabcdabcde”
 * 请统计字符串中每一个字符出现的次数，并按照以下格式输出
 * 输出结果：a（5）b（4）c（3）d（2）e（1）
 */
public class TreeMapTest {
    public static void main(String[] args) {
        // 1. 创建一个Map集合用于存储信息, 集合和泛型只支持引用类型，8中基本类型有对应的包装类
        Map<Character, Integer> map = new TreeMap<>();

        // 2. 得到目标字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串：");
        String targetStr = sc.nextLine();

        // 3. 遍历字符串，加入map集合中
        for(int i = 0; i < targetStr.length(); i++){
            Character ch = targetStr.charAt(i);  // 自动装箱
            if(map.containsKey(ch)){  // 集合中是存在该字符， 把对应的值进行加一
                map.put(ch, map.get(ch) + 1);
            }else {  // 集合中不存在该字符，把该字符加入到集合中
                map.put(ch, 1);
            }
        }

        System.out.println(map);
    }
}

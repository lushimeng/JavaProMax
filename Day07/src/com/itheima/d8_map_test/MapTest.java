/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_map_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < 80; i++){
            int temp = random.nextInt(selects.length); // 0, 1, 2, 3
            String str = selects[temp];
            sb.append(str);
            // 组合成一句语句
//            sb.append(selects[random.nextInt(selects.length)]);
        }
        System.out.println(sb);

        // 1. 声明一个Map集合进行统计
        Map<String, Integer> map = new HashMap<>();

        // 2. 进行统计
        for(int i = 0; i < sb.length(); i++){
            String str = String.valueOf(sb.charAt(i)); // 将单独的A,B,C,D拿出来
            if(map.containsKey(str)){
                Integer integer = map.get(str);  // 如果存在，则根据建拿出里面的值，加一重新放回map集合中
                map.put(str, integer+1);
            }else {
                map.put(str, 1);
            }
        }
        System.out.println(map);

        // 3. 遍历map集合进行查看
        map.forEach((s, integer) -> System.out.println(s + "----------> " + integer));

        // 4. 找到最大的键值
        int max = 0;
        String target = null;

        Set<String> set = map.keySet();
        for(String key : set){
            int value = map.get(key);
            if(value > max){  // 统计最高票数和要去的地方
                max = value;
                target = key;
            }
        }

        // 5. 输出打印结果
        System.out.println("票数最高的旅游景点为: " + target + ", 票数为: " + max);


    }
}

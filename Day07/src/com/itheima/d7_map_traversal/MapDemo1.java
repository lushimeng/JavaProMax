package com.itheima.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        // 1.添加元素: 无序，不重复，无索引。
        Map<String, String> maps = new HashMap<>();  // 多态的写法

        maps.put("赵晓燕", "杨银与");
        maps.put("李伟", "高亮");
        maps.put("高占龙", "季亚玲");
        maps.put("刘邦", "小乔");
        maps.put("赵晓燕", "王志龙");  // 覆盖前面赵晓燕键对应的值
        System.out.println(maps);

        // 遍历方式1： 先得到建的集合，然后访问每一个建得到值的元素
        Set<String> keys = maps.keySet();

        for (String key : keys) {
            String value = maps.get(key);
            System.out.println(key + "\t" + value);
        }
    }
}


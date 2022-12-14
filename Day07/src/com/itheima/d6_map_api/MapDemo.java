/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_map_api;

import java.util.*;

/**
 目标：Map集合的常用API(重点中的重点)
 - public V put(K key, V value):  把指定的键与指定的值添加到Map集合中。
 - public V remove(Object key): 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
 - public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
 - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中。
 - public Set<Map.Entry<K,V>> entrySet(): 获取到Map集合中所有的键值对对象的集合(Set集合)。
 - public boolean containKey(Object key):判断该集合中是否有此键。
 - public boolean containValue(Object value):判断该集合中是否有此值。
 */
public class MapDemo {
    public static void main(String[] args) {
        // 1.添加元素: 无序，不重复，无索引。
        Map<String , Integer> maps = new HashMap<>();  // 多态的写法
        maps.put("iphoneX",10);
        maps.put("娃娃",20);
        maps.put("iphoneX",100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei",100);
        maps.put("生活用品",10);
        maps.put("手表",10);
        // {huawei=100, 手表=10, 生活用品=10, iphoneX=100, 娃娃=20}
        System.out.println(maps);

        // 2.清空集合
//        maps.clear();
//        System.out.println(maps);

        // 3.判断集合是否为空，为空返回true ,反之！
        System.out.println(maps.isEmpty());

        // 4.根据键获取对应值:public V get(Object key)
        Integer key = maps.get("huawei");
        System.out.println(key);
        System.out.println(maps.get("iphoneX"));
        System.out.println(maps.get("手表"));

        // 5.根据键删除整个元素。(删除键会返回键的值)
        maps.remove("huawei");
        System.out.println(maps);

        // 6.判断是否包含某个键 ，包含返回true ,反之
        System.out.println(maps.containsKey("手表")); // true
        System.out.println(maps.containsKey("iphoneX"));  // true
        System.out.println(maps.containsKey("sss"));  // false

        // 7.判断是否包含某个值。
        System.out.println(maps.containsValue(10));  // true
        System.out.println(maps.containsValue(100));  // true
        System.out.println(maps.containsValue(22));  // false

        // 8.获取全部键的集合：public Set<K> keySet()
        Set<String> sets = maps.keySet();
        System.out.println(sets);


        System.out.println("------------------------------");
        // 9.获取全部值的集合：Collection<V> values();
        Collection<Integer> it = maps.values();
        System.out.println(it);

        // 10.集合的大小
        System.out.println(maps.size());


        // 11.合并其他Map集合。(拓展)
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Java1", 100);
        map1.put("Java2", 200);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Java1", 300);
        map2.put("Java3", 400);

        map1.putAll(map2);
        System.out.println(map1);
        System.out.println(map2);

    }
}

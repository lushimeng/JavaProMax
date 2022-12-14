/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_collections;

import java.util.*;

/**
 *     目标：Collections工具类的使用。
 *     java.utils.Collections:是集合工具类
 *     Collections并不属于集合，是用来操作集合的工具类。
 *     Collections有几个常用的API:
 *          - public static <T> boolean addAll(Collection<? super T> c, T... elements): 给集合对象批量添加元素！
 *          - public static void shuffle(List<?> list) : 打乱集合顺序。
 *          - public static <T> void sort(List<T> list): 将集合中元素按照默认规则排序。
 *          - public static <T> void sort(List<T> list，Comparator<? super T> c): 将集合中元素按照指定规则排序。
 */
public class CollectionsDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 34, 56, 23, 89, 100);  // 调用Collections工具类中的addAll方法进添加元素
        System.out.println(list); // [34, 56, 23, 89, 100]

        Collections.shuffle(list); // 打乱集合元素
        System.out.println(list);  // [23, 89, 56, 100, 34]

        Collections.sort(list);    // 对集合元素进行排序
        System.out.println(list);  // [23, 34, 56, 89, 100]
    }
}































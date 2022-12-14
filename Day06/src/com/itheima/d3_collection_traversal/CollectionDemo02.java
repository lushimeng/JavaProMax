/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * foreach(增强for循环)遍历集合。
 *     foreach是一种遍历形式，可以遍历集合或者数组。
 *     foreach遍历集合实际上是迭代器遍历集合的简化写法。
 *     foreach遍历的关键是记住格式：
 *     for(被遍历集合或者数组中元素的类型 变量名称 : 被遍历集合或者数组){
 *
 *     }
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("校招");
        lists.add("潘晓");
        lists.add("王亮");
        System.out.println(lists);

        // foreach/增强for循环
        for(String str : lists){
            System.out.println(str);
        }
        System.out.println("-----------------------");
        double[] scores = {100, 98.5, 59.5};
        for (double score : scores) {
            System.out.println(score);
        }
        System.out.println(Arrays.toString(scores));

    }
}

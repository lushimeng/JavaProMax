/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 目标：Collection集合的遍历方式。

 Collection集合的遍历方式是全部集合都可以直接使用的，所以我们学习它。
 Collection集合的遍历方式有三种:
 （1）迭代器。
 （2）foreach(增强for循环)。
 （3）JDK 1.8开始之后的新技术Lambda表达式(了解)

 a.迭代器遍历集合。
 -- 方法：
 public Iterator iterator(): 获取集合对应的迭代器，用来遍历集合中的元素的
 boolean hasNext():判断是否有下一个元素，有返回true ,反之。
 E next():获取下一个元素值！
 --流程：
 1.先获取当前集合的迭代器
 Iterator<String> it = lists.iterator();
 2.定义一个while循环，问一次取一次。
 通过it.hasNext()询问是否有下一个元素，有就通过
 it.next()取出下一个元素。
 小结：
 记住代码。
 */

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.add(200);
        collection.add(300);
        collection.add(400);
        System.out.println(collection);

        // 1. 得到当前集合的迭代器对象
        Iterator<Integer> it = collection.iterator();  // iterator静态方法，返回一个Iterator<Integer>对象

        while (it.hasNext()){
            int number = it.next();
            System.out.println(number);
        }
    }
}

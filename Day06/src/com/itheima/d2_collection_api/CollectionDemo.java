/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 目标：Collection集合的常用API.
 Collection是集合的祖宗类，它的功能是全部集合都可以继承使用的，所以要学习它。
 Collection API如下:
 - public boolean add(E e)：  把给定的对象添加到当前集合中 。
 - public void clear() :清空集合中所有的元素。
 - public boolean remove(E e): 把给定的对象在当前集合中删除。
 - public boolean contains(Object obj): 判断当前集合中是否包含给定的对象。
 - public boolean isEmpty(): 判断当前集合是否为空。
 - public int size(): 返回集合中元素的个数。
 - public Object[] toArray(): 把集合中的元素，存储到数组中。
 小结：
 记住以上API。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        // 1. 添加元素
        collection.add("Java");
        collection.add("HTML");
        collection.add("Mysql");
        collection.add("黑马");
        collection.add("Java");
        collection.add("Mysql");
        System.out.println(collection);  // 直接打印实例化对象的名称，会默认调用toString方法，如果打印的为地址的话说明没有重写toString
        System.out.println(collection.toString());

        // 2. 清空元素集合
//        collection.clear();
//        System.out.println(collection);

        // 3. 判断集合是否为空，是空返回true, 反之返回false
        System.out.println(collection.isEmpty());

        // 4. 获得集合大小
        System.out.println(collection.size());

        // 5. 判断集合中是否包含某个元素
        System.out.println(collection.contains("java"));  // false
        System.out.println(collection.contains("Java"));  // true
        System.out.println(collection.contains("黑马"));  // true

        // 6. 删除某个元素：如果有多个重复元素，默认删除第一个
        System.out.println(collection.remove("Java")); // ture
        System.out.println(collection);
        System.out.println(collection.remove("lushimeng"));  // false
        System.out.println(collection);

        // 7. 把集合转换成数组
        // 集合转换为数组只能是Object类型，原因在于防止数组集合中有其他类型的数据
        // 虽然通过<类型>进行了限制，但是可以绕过限制把其他类型的数据加入到集合中，
        // 所以为了安全起见都转化为Object类型的数组
        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));

        // 8. 把一个集合加到另一个集合后面
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(10);
        collection1.add(20);
        collection1.add(30);
        System.out.println(collection1);

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(40);
        collection2.add(50);
        System.out.println(collection2);

        // addAll把collection2集合中的元素全部加入到collection中
        collection1.addAll(collection2);
        System.out.println(collection1);
        System.out.println(collection2);

    }
}

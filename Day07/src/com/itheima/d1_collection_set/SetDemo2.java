/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_collection_set;

import java.util.HashSet;
import java.util.Set;

/**
 * 在set集合中把把对象内容重复的去掉一个。
 */
public class  SetDemo2 {
    public static void main(String[] args) {
        Set<Student> sets = new HashSet<>();
        Student student1 = new Student("卢世猛", 20, '男');
        Student student2 = new Student("卢世猛", 20, '男');
        Student student3 = new Student("杨鑫育", 10, '女');
        sets.add(student1);
        sets.add(student2);
        sets.add(student3);

        // 如果在Student类中补充些toString方法，会默认调用Object类中的toString方法，打印地址
        System.out.println(sets);
        System.out.println(sets.toString());
    }
}

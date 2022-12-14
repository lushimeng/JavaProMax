/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_genericity_class;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(21);
        list.add(2);
        list.add(45);
        list.add(32);
        System.out.println(list);

        list.remove(2);
        System.out.println(list);

    }
}

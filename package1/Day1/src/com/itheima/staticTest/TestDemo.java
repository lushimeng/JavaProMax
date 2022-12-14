/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticTest;

public class TestDemo {
    public static void main(String[] args) {
        int[] array = {485, 45, 85, 45, 10, 20};
        System.out.println(ArraysUtils.toString(array));
        int[] arr = null;
        System.out.println(ArraysUtils.toString(arr));
        float[] floats = {0, 2, 3, 4, 5, 6, 7, 8, 9, 1000};
        System.out.println(ArraysUtils.getAverage(floats));
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_arraysw;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 44, 23, 24, 200};
        System.out.println(arr);  // arr默认调用toString方法，打印的是地址说明没有重写toString方法
        System.out.println(arr.toString());

        // 1. 返回数组内容的toString(数组)
        String rs = Arrays.toString(arr);  // Arrays类中重写了toString方法，且该方法是静态的
        System.out.println(rs);

        // 2、 排序的API(默认自动对数组元素进行升序排序)
        Arrays.sort(arr);  //  Arrays类有静态方法sort
        System.out.println(Arrays.toString(arr));

        // 3、利用二分搜索技术(前提数组必须排好序才支持，否则出bug)
        int index = Arrays.binarySearch(arr, 44);  //  Arrays类有静态方法binarySearch
        System.out.println(index);  // 返回的数组下标

        // 返回不存在元素的规律： -(应该插入的位置索引+1)
        // [2, 10, 23, 24, 44, 200]
        System.out.println(Arrays.binarySearch(arr, 0));  // -1
        System.out.println(Arrays.binarySearch(arr, 30));  // -5
        System.out.println(Arrays.binarySearch(arr, 100));  // -6
        System.out.println(Arrays.binarySearch(arr, 1000));  // -7

    }
}

















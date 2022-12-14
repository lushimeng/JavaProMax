/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_sort_binarysearch;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        // 1. 定义数组
        int[] arr = {5, 1, 3, 2, 34, 4, 52, 12, 45, 89};

        for(int i = 0; i < arr.length-1; i++){  // 选择排序
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

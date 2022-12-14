/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_sort_binarysearch;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Test2.binarySearch(array, 4));
    }

    public static int binarySearch(int[] array, int number){
        int left = 0;
        int right = array.length - 1;
        while (left <= right){  // 主要是这个结束条件的判断，要加上等号的
            int mid = (left + right) / 2;
            if(number > array[mid]){
                left = mid + 1;
            }else if(number < array[mid]){
                right = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

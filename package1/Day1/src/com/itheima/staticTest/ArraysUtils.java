/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticTest;

import java.util.ArrayList;

public class ArraysUtils {
    // 构造器私有化
    private ArraysUtils(){

    }
//返回的字符串格式如：[10, 20, 50, 34, 100]（只考虑整数数组，且只考虑一维数组）
    public static String toString(int[] array){
        if(array != null){
            String str = "[";
            for(int i = 0; i < array.length; i++){
                str += (i == array.length-1 ? array[i] : array[i] + ", ");
            }
            str += "]";
            return str;
        }else {
            return null;
        }
    }

    public static float getAverage(float[] array){
        float max = array[0], min = array[0];
        float sum = 0.0f;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            if(array[i] > max){  // 寻找最大值
                max = array[i];
            }
            if(array[i] < min){  // 寻找最小值
                min = array[i];
            }
        }

        // 去掉最大值和最小值
        sum = sum - max - min;
        float average = sum / (array.length - 2);


        return average;
    }
}

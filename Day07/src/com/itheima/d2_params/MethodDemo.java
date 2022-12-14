/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_params;

import java.util.Arrays;

public class MethodDemo {
    public static void main(String[] args) {
        sum();  // 1、不传参数
        sum(10);  // 2、可以传输一个参数
        sum(10, 20, 30);  // 3、可以传输多个参数
        sum(new int[]{10, 20, 30, 40, 50});  // 4、可以传输一个数组
    }

    /**
     * 注意：一个形参列表中只能------有一个可变参数,可变参数-------必须放在形参列表的------最后面
     * @param nums
     */
    public static void sum(int...nums){
        // 注意：可变参数在方法里面就相当于一个数组，外面是显示为一个可变参数
        System.out.println("元素个数: " + nums.length);
        System.out.println("元素内容: " + Arrays.toString(nums));
    }
}

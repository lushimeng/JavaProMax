/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_final;

public class Test {
    public static void main(String[] args) {
        final int age = 21;
        //age = 22;

        final int[] array = {10, 20, 30};
        System.out.println(array);
        array[0] = 1000;
        System.out.println(array[0] + "  " + array[1] + "  " + array[2]);
        System.out.println(array);
    }
}


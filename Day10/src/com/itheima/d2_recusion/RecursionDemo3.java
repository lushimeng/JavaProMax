/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_recusion;

/**
 * 递归的精髓：
 * 递归的公式： f(x) = 2f(x+1) + 2;
 * 递归的终结点：f(10)
 * 递归的方向必须走向终结点：
 */
public class RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    /**
     * 推到公式,最重要的就是公式的提取能力
     * f(x) - f(x)/2 - 1 = f(x+1)===> f(x) = 2f(x+1) + 2
     */
    public static int f(int n){
        if(n == 10){
            return 1;
        }else {
            return 2 * f(n+1) + 2;
        }

    }
}

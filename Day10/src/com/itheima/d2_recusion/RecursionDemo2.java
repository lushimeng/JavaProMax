/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_recusion;

public class RecursionDemo2 {
    public static void main(String[] args) {
        System.out.println(jieCheng(5));
    }

    public static int jieCheng(int n){
        if(n == 1){
            return 1;
        }else {
            return n * jieCheng(n-1);
        }
    }
}

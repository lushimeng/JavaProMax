/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_regex;

public class RegexDemo04 {
    public static void main(String[] args) {
        String names = "健康kd00fjk安全jkld0fjk重要";

        String[] split = names.split("\\w+");  // \\w：代表数字，字母下划线
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String s = names.replaceAll("\\d+", "  ");  // \\W：代表非字符
        System.out.println(s);
    }
}

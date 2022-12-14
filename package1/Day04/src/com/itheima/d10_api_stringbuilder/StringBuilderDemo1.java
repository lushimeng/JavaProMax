/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_api_stringbuilder;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // sb可以拼接任意类型的数据
        sb.append("a");
        sb.append(1);
        sb.append('c');
        sb.append(false);
        sb.append("abc");
        System.out.println(sb);  // a1cfalseabc
        System.out.println("------------------------");
        StringBuilder sb1 = new StringBuilder();
        // StringBuilder支持链式编程
        sb1.append(1).append("a").append('c');
        System.out.println(sb1);  // 1ac
        System.out.println("------------------------");
        // 反转
        sb1.reverse().append(100);
        System.out.println(sb1);  // ca1100
        System.out.println(sb1.length());  // 6
        System.out.println("------------------------");
        // 注意：StringBulider只是拼接字符串的手段，效率好
        // 最终的目的还是要通过toString函数恢复成String类型。
        StringBuilder sb2 = new StringBuilder();
        sb2.append("123").append("456");
        // 恢复成String类型
        String rs = sb2.toString();
        check(rs);  // 123456
    }
    public static void check(String date){
        System.out.println(date);
    }
}

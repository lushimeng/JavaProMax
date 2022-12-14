/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        // public boolean matches(String regex):
        // a, b , c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false

        // 不能出现abc
        System.out.println("a".matches("[^abc]"));  // false
        System.out.println("z".matches("[^abc]"));  // true

        // 下面都是单个字符进行匹配
        System.out.println("a".matches("\\d"));  // false
        System.out.println("3".matches("\\d"));  // ture
        System.out.println("333".matches("\\d"));  // false
        System.out.println("z".matches("\\w"));  // true   "\w": [a-zA-Z_0-9] 英文、数字、下划线
        System.out.println("2".matches("\\w"));  // true\W
        System.out.println("21".matches("\\w")); // false
        System.out.println("宁".matches("\\w"));;  // false
        System.out.println("宁".matches("\\W"));  // true  "\W"或者[^\w]： 一个非单词字符


        System.out.println("----------------------------");
        // 密码校验，必须是数字 字母，下划线，至少六位
        System.out.println("dkjfk_3489".matches("[\\w]{6,}"));  // true
        System.out.println("2345".matches("[\\w]{6,}"));  // false

        System.out.println("----------------------------");
        // 验证码 必须是数字和字母 4位数  \\w: 字母，数字，下划线；
        System.out.println("89er".matches("[\\w&&[^_]]{4}"));  // true
        System.out.println("8_er".matches("[\\w&&[^_]]{4}"));  // false
        System.out.println("89df".matches("[0-9a-zA-Z]{4}"));  // true
        System.out.println("89_f".matches("[0-9a-zA-Z]{4}"));  // false
    }
}









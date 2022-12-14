/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_regex;

public class RegexDemo1 {
    public static void main(String[] args) {
        // 校验qq号码，必须全部数字 6 - 20
        System.out.println(checkQQ("432785734895"));  // true
        System.out.println(checkQQ("2342354jk"));  // false
        System.out.println(checkQQ(null));  // false
        System.out.println(checkQQ("83745832787234809672834"));  // false
        System.out.println("---------------------------------");
        System.out.println(checkQQ1("432785734895"));  // true
        System.out.println(checkQQ1("2342354jk"));  // false
        System.out.println(checkQQ1(null));  // false
        System.out.println(checkQQ1("809672834"));  // true



    }
    public static boolean checkQQ1(String QQ){
        // return QQ != null && QQ.matches("\\d{6,21}");  // {6,21}中间没有空格的哦
        return QQ != null && QQ.matches("[0-9]{6,21}"); // 官方文档里面都是没有空格的
    }
    public static boolean checkQQ(String QQ){
        if(QQ == null || QQ.length() < 6 || QQ.length() > 20){
            return false;
        }

        for (int i = 0; i < QQ.length(); i++) {
            char ch = QQ.charAt(i);
            if(ch < '0' || ch > '9'){
                return false;
            }
        }

        return true;
    }
}

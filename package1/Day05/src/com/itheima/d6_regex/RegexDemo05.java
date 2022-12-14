/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo05 {
    public static void main(String[] args) {
        String rs = "学习Java,电话020-43422424，或者联系邮箱" +
                "itcast@itcast.cn,电话18762832633，0203232323" +
                "邮箱bozai@itcast.cn，400-100-3233 ，4001003232";
        // 1、定义爬取规则，字符串形式
        String regex = "(1[3-9]\\d{9})|" +
                "(\\w{1,20}@[a-z0-9A-Z]{1,10}(\\.[a-z0-9A-Z]{1,3}){1,2})|" +
                "(0\\d{2,6}-?\\d{5,20})|" +
                "(400-?100-?\\d{3,6})";
        // 2. 把这个爬取规则编译称匹配对象
        Pattern pattern = Pattern.compile(regex);
        // 3、得到一个内容匹配器对象
        Matcher matcher = pattern.matcher(rs);
        // 4、开始寻找
        while (matcher.find()){
            String rs1 = matcher.group();
            System.out.println(rs1);
        }
    }
}

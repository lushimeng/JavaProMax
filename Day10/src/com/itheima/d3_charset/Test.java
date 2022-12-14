/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_charset;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        // 1、 编码：把文字转换成字节(使用指定的编码)
        String str = "aIloveyou中国aA";
        byte[] byte1 = str.getBytes();  // 系统默认方式进行编码：UTF-8，一个汉字对应三个字节
        System.out.println(byte1.length);  // 17
        System.out.println(Arrays.toString(byte1));  // [97, 73, 108, 111, 118, 101, 121, 111, 117, -28, -72, -83, -27, -101, -67, 97, 65]
        System.out.println("----------------------------------------------------");
        byte[] gbks = str.getBytes("GBK");  // 指定编码方式：GBK编码方式，一个汉字对应两个字节
        System.out.println(gbks.length);  // 15
        System.out.println(Arrays.toString(gbks));  // [97, 73, 108, 111, 118, 101, 121, 111, 117, -42, -48, -71, -6, 97, 65]

        // 2、 解码：把字节转化为对应的文字，要特别注意编码和解码方式独赢的编码要是要一致，如果不一致会报错
        System.out.println("----------------------------------------------------");
        String s = new String(byte1);  // 使用系统默认编码方式进行解码
        System.out.println(s);  // aIloveyou中国aA

        String s1 = new String(gbks); // 会出现乱码，由于编码方式为GBK方式，而解码方式确是UTF-8,所以会出现问题。
        System.out.println(s1);  // aIloveyou�й�aA 出现乱码

        String gbk = new String(gbks, "GBK");
        System.out.println(gbk);  // aIloveyou中国aA

        System.out.println("----------------------------------------------------");
        byte[] bytes = {-28, -72, -83, -27, -101, -67};  // UTF-8进行编码，打印出中国字样
        String name = new String(bytes);
        System.out.println(name);  // 中国
    }
}

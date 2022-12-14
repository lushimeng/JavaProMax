/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_char_buffer;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        try(
                // 1、创建字符输出流管道与目标文件联通
                Writer wr = new FileWriter("Day11/src/1.txt", true);  // 可以追加数据
                // 2、把低级字符输出流封装成高级字符输出流
                BufferedWriter bwr = new BufferedWriter(wr);
                ){
            // 写一个字符进去
            bwr.write(97);
            bwr.write('a');
            bwr.write("卢");
            bwr.newLine();  // 自动换算
            // 写一个字符串进去
            bwr.write("sdkjfklsjdfkljs;adf就看电视剧付款了撒看拉萨的减肥决胜巅峰来看");
            bwr.newLine();

            // 写一个字符数组进去
            char[] chars = "jfklasjdfkljasdklf接口的撒九分裤".toCharArray();
            bwr.write(chars);
            bwr.newLine();

            // 写一个字符串的一段进去
            bwr.write("担惊受恐垃圾啊弗兰克阿所经历的咖啡机", 0, 5);
            bwr.newLine();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}





















/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_char_buffer;

import java.io.*;
import java.util.*;

public class BufferedCharTest {
    public static void main(String[] args) {
        try(
                // 1. 定义字符输入流
                Reader fr = new FileReader("Day11/src/csb.txt");
                // a. 把低级的字符输入流封装为高级的字符输入流
                BufferedReader bfr = new BufferedReader(fr);
                // 2. 定义字符输出流
                Writer wr = new FileWriter("Day11/src/csbNew.txt");
                // b. 把低级的字符输出流封装成高级的字符输出流
                BufferedWriter bwr = new BufferedWriter(wr);
                ){
            // 3. 一行一行读取文件中的数据加入到LinkedList集合中去
            List<String> list = new ArrayList<>();

            String str;
            while ((str = bfr.readLine()) != null){
                list.add(str);  // 一次添加到集合中
            }

            // 4. 排序
            // 要是自定义类的话就要换成其他的方法了，实现Compareble接口中的compareTo方法，或者new Compareble()匿名内部类
            // 自定义比较器
            List<Integer> listSort = new ArrayList<>();
            Collections.addAll(listSort, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13,14, 15);

            Collections.sort(list, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return listSort.indexOf(Integer.parseInt(o1.substring(0, o1.indexOf('.')))) -
                            listSort.indexOf(Integer.parseInt(o2.substring(0, o2.indexOf('.'))));
                }
            });

            // 5. 遍历结合吸入文件中
            for(String strTemp : list){
                bwr.write(strTemp);
                bwr.newLine();  // 换行
            }


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

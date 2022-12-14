/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.codeblock;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StaticCode {
    /**
     * 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
     * 花色: "♠", "♥", "♣", "♦"
     */
    public static ArrayList<String> cards = new ArrayList<>();
    static {
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        for(int i = 0; i < colors.length; i++){
            for(int j = 0; j < numbers.length; j++){
                cards.add(colors[i] + numbers[j]);
            }
        }
        // 添加大小王
        cards.add("大王");
        cards.add("小王");
    }


    public static void main(String[] args) {
        System.out.println(cards);
    }
}

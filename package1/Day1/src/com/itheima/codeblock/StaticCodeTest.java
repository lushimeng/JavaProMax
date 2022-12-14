/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.codeblock;

import java.util.ArrayList;

public class StaticCodeTest {
    /**
     * 模拟初始牌操作
     * 点数: "3","4","5","6","7","8","9","10","J","Q","K","A","2"
     * 花色: "♠", "♥", "♣", "♦"
     * 1. 准备一个容器，存储54张牌对象，这个容器建议使用静态的集合。静态的集合只加载一次
     */
    public static ArrayList<String> cards = new ArrayList<>();
    // 2、在游戏启动之前需要准备好54张牌放进去，静态代码快，随着类的加载而加载，并且自动触发、只执行一次
    static {
        // 3、加载54张牌进去
        // 4、准备4中花色，类型确定，个数确定
        String[] colors = {"♠", "♥", "♣", "♦"};
        // 5、 定义点数
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        // 6、先定义点数再定义花色
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < colors.length; j++) {
                cards.add(numbers[i] + colors[j]);  // 组装牌
            }
        }

        // 7、添加大王小王
        cards.add("大王");
        cards.add("小王");

    }

    public static void main(String[] args) {
        System.out.println("初始化牌：" + cards);
    }
}

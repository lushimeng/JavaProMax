/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_collection_Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameDemo {
    // 1. 声明一个集合用来存储54张牌
    public static List<Card> listCard = new ArrayList<>();

    // 2. 静态代码快, 只加载一次
    static {
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        // 3. 组装牌，先花色后数字
        for(String color : colors){
            int index = 1;
            for(String number : numbers){
                listCard.add(new Card(color, number, index++));  // index为1-13等级
            }
        }

        // 4. 大小王进行特殊处理
        Card card1 = new Card("", "小王", 14);
        Card card2 = new Card("", "大王", 15);

        // 5. 调用Collections工具类对即可进行批量添加，主要用到的是Java可变参数的思想
        Collections.addAll(listCard, card1, card2);
//        System.out.println(listCard);
    }


    public static void main(String[] args) {
        // 6. 调用Collections集合中的shuffle方法将集合中的牌进行打乱
        Collections.shuffle(listCard);
//        System.out.println(listCard);

        // 7. 定义三个用户的集合以及底牌集合
        List<Card> user1 = new ArrayList<>();
        List<Card> user2 = new ArrayList<>();
        List<Card> user3 = new ArrayList<>();
        List<Card> diPai = new ArrayList<>();

        // 8. 分发牌，由于要得到集合下标，建议使用for循环
        for(int i = 0; i < listCard.size() - 3; i++){
            Card card = listCard.get(i);
            switch (i % 3){
                case 0:
                    user1.add(card);
                    break;
                case 1:
                    user2.add(card);
                    break;
                case 2:
                    user3.add(card);
                    break;
            }
        }

        // 9. 利用Collections工具类把剩下的三张牌加入到底牌集合中
        Collections.addAll(diPai, listCard.get(53), listCard.get(53), listCard.get(51));

        // 10. Card类实现   Comparable接口   中的   compareTo方法进行排序
        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);
        Collections.sort(diPai);

        // 11. 对用户的牌进行打印
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(diPai);


    }
}

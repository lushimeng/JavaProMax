/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_collection_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GameDemo {
    public static List<Card> cards = new ArrayList<>();
    // 在游戏启动之前需要准备好54张牌放进去，静态代码块随着类的加载而加载，并且自动触发，只执行一次
    static {
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        // 进行卡片组装
        int index = 0;
        for(String color : colors){
            index = 0;
            for(String number: numbers){
                cards.add(new Card(color, number, index++));
            }
        }



        Card card1 = new Card("", "小王", index++);
        Card card2 = new Card("", "大王", index++);

        // 利用Collections工具对集合进行操作
        Collections.addAll(cards, card1, card2);
    }

    public static void main(String[] args) {
        Collections.shuffle(cards);  // 使用Collections工具调用shuffle对牌进行打乱处理
        System.out.println(cards);
        List<Card> user1 = new ArrayList<>();  // 用户1
        List<Card> user2 = new ArrayList<>();  // 用户2
        List<Card> user3 = new ArrayList<>();  // 用户3
        List<Card> lastCard = new ArrayList<>();  // 底牌

        // 进行发牌操作， 要留下三张做底牌
        Card card = null;
        for (int i = 0; i < cards.size() - 3; i++) {
            card = cards.get(i);
            switch((i+1) % 3){
                case 1:
                    user1.add(card);
                    break;
                case 2:
                    user2.add(card);
                    break;
                case 0:
                    user3.add(card);
                    break;
            }
        }
        lastCard = cards.subList(cards.size()-3, cards.size());


        // 使用Collections工具类对用户手中的牌进行排序
        // 方式一：排序方式选择类实现Compareble接口中的CompareTo方法
//        Collections.sort(user1);
//        Collections.sort(user2);
//        Collections.sort(user3);
//        Collections.sort(lastCard);

        // 方式二：使用Comparator比较大小
        Collections.sort(user1, ( o1,  o2) -> (o2.getIndex() - o1.getIndex()));  // 降序
        Collections.sort(user2, ( o1,  o2) -> (o2.getIndex() - o1.getIndex()));
        Collections.sort(user3, ( o1,  o2) -> (o2.getIndex() - o1.getIndex()));
        Collections.sort(lastCard, ( o1,  o2) -> (o2.getIndex() - o1.getIndex()));

        // 打印输出
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
        System.out.println(lastCard);

    }
}

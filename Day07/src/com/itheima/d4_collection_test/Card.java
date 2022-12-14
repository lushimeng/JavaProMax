/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_collection_test;

public class Card implements Comparable<Card>{
    private String color;
    private String number;
    private int index;   // 用来记录牌的固有属性

    public Card() {
    }

    public Card(String color, String number, int index) {
        this.color = color;
        this.number = number;
        this.index = index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return  color + number;
    }

    @Override
    public int compareTo(Card o) {
        return this.index - o.index > 0 ? 1 : -1;
    }
}

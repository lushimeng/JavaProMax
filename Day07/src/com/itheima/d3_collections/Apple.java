/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_collections;

public class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double price;
    private int weight;

    /**
     * 类实现Comparable 接口中的  compareTo方法
     * this.compareTo(o)
     * @param o
     * @return
     */
    @Override
    public int compareTo(Apple o) {
        return this.weight - o.weight;  // this.XX - o.XX为升序，反之为降序
    }


    public Apple(){

    }
    public Apple(String name, String color, double price, int weight){
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }



}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_reflect_method;

public class Dog {
    private String name;
    public Dog(){

    }

    public Dog(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("狗跑的很快~~~");
    }

    private void eat(){
        System.out.println("狗吃骨头~~~");
    }

    private String eat(String name){
        System.out.println("狗吃" + name);
        return "吃的很开心~~~";
    }

    public static void inAddr(){
        System.out.println("河南省周口市");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_interface_implements;

public class PingPongMan implements Law, SportMan {
    private String name;

    public PingPongMan(){}
    public  PingPongMan(String name){
        this.name = name;
    }

    @Override
    public void rule() {
        System.out.println(this.name + "遵守规则~~~");
    }

    @Override
    public void run() {
        System.out.println(this.name + "按时跑步~~~");
    }

    @Override
    public void competition() {
        System.out.println(this.name + "参加竞赛~~~");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

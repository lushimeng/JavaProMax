/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_factory_pattern;

/**
 * 工厂设计模式的作用:
 * 1. 对象通过工厂的方法创建返回，工厂的方法可以为该对象进行加工和数据注入
 *
 * 2. 可以实现类与类之间的解耦操作（核心思想）
 */
public class FactoryDemo {
    public static void main(String[] args) {
        // 使用工厂方法创建对象
        Computer huawei = FactoryPattern.createComputer("huawei");
        if(huawei == null){
            System.out.println("对象池里还没有创建该Huawei对象~~~");
        }else {
            huawei.start();
        }


        Computer mac = FactoryPattern.createComputer("mac");
        if(mac == null){
            System.out.println("对象池里还没有创建该Mac对象~~~");
        }else {
            mac.start();
        }

        Computer viVo = FactoryPattern.createComputer("viVo");
        if(viVo == null){
            System.out.println("对象池里还没有创建该viVo对象~~~");
        }else {
            viVo.start();
        }
    }
}

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
 * 2. 可以实现类与类之间的解耦操作（核心思想）
 */
public class FactoryPattern {
    // 定义一个方法，创建对象返回
    public static Computer createComputer(String info){
        switch (info){
            case "huawei":
                Computer huawei = new Huawei();
                huawei.setName("huawei");
                huawei.setPrice(4999.9);
                return huawei;   // 有了return就不在需要break了
            case "mac":
                Computer mac = new Mac();
                mac.setName("mac");
                mac.setPrice(6999.9);
                return mac;
            case "viVo":
                Computer viVo = new ViVo();
                viVo.setName("viVo");
                viVo.setPrice(3999.9);
                return viVo;
            default:
                return null;
        }

    }
}

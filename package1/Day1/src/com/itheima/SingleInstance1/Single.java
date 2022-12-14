/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.SingleInstance1;

public class Single {
    // 1. 把构造器私有
    private Single(){}

    // 2. 定义一个私有的静态的成员变量来存储一个类的对象(初始时并不实例化对象)
    private static Single single; // 默认为null

    // 3. 提供一个返回单例对象的方法
    public static Single getInstance(){
        if(single == null){
            // 只在第一次调用getInstance方法的时候才会创建一个实例化对象，其余共享该实例化对象
            single = new Single();
        }

        return single;
    }
}

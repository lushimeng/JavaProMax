/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_factory_pattern;

public class Mac extends Computer{
    @Override
    public void start() {
        System.out.println(this.getName() + "以非常优雅的方法启动了，展示了一个苹果logo");
    }
}

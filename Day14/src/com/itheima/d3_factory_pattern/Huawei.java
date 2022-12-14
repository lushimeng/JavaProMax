/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_factory_pattern;

public class Huawei extends Computer{
    @Override
    public void start() {
        System.out.println(this.getName() +  "开机了，展示了华为的菊花图标~~~~");
    }
}

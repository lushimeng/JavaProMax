/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_polymorphic_Test;

public class Mouse implements USB {
    @Override
    public void insertComputer() {
        System.out.println("鼠标插入电脑了~~~");
    }

    @Override
    public void outputComputer() {
        System.out.println("鼠标拔出电脑了~~~");
    }

    public void click(){
        System.out.println("鼠标点击功能被调用了~~~");
    }
}

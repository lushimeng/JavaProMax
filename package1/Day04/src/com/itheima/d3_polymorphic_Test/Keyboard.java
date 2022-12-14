/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_polymorphic_Test;

public class Keyboard implements USB {
    @Override
    public void insertComputer() {
        System.out.println("键盘插入电脑了~~~");
    }

    @Override
    public void outputComputer() {
        System.out.println("键盘拔出电脑了~~~");
    }

    public void print(){
        System.out.println("键盘打字功能被调用了~~~");
    }
}

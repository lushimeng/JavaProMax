/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.setAge(10);
        inner.setName("lushimeng");
        inner.show();

        Outer outer = new Outer();
    }
}

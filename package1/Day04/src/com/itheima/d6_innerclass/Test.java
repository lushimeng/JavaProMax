/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();  // 成员内部类的创建方式
        in.setAge(10);
        in.setName("yangXinYu");
        in.show();
        // Outer.Inner.test(); 访问内部类的静态方法

        System.out.println("---------------------");
        Outer.Inner inner = new Outer("爱听课").new Inner();
        inner.show();
    }
}

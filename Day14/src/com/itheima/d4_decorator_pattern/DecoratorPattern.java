/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_decorator_pattern;
// 装饰模式指的是在不改变原类的基础上, 动态地扩展一个类的功能。
public class DecoratorPattern {
    public static void main(String[] args) {
        InputStream is = new BufferedInputStream(new FileInputStream());
        System.out.println(is.read());
        System.out.println(is.read(new byte[3]));
    }
}

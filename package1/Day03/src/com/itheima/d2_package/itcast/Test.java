/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_package.itcast;

public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        //fu.show1();  // 私用方法、变量只能在本类中进行访问
        fu.show2(); // 缺省
        fu.show3(); // protected
        fu.show4(); // public
    }
}

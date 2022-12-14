/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_package.itheima;

import com.itheima.d2_package.itcast.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show3();  // protected
        zi.show4();  // public
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d11_api_Math;

public class MathTest {
    public static void main(String[] args) {
        // 1.绝对值，返回正数
        System.out.println(Math.abs(10));     // 返回值类型为double型10
        System.out.println(Math.abs(-10.3));  // 10.3

        // 2. 向上取整
        System.out.println(Math.ceil(4.0001));  // 返回值类型为double型5.0
        System.out.println(Math.ceil(4.9999));  // 5.0

        // 3. 向下取整
        System.out.println(Math.floor(4.999));  // 返回值类型为double型4.0
        System.out.println(Math.floor(4.001));  // 4.0

        // 4. 求指数次方
        System.out.println(Math.pow(2, 3));  // 返回值类型为double型8.0

        // 5. 四舍五入10
        System.out.println(Math.round(4.56));  // 返回值类型为long型  6
        System.out.println(Math.round(4.499));  // 4

        // 随机数
        System.out.println(Math.random());   // 0  ~ 1随机小数













    }
}

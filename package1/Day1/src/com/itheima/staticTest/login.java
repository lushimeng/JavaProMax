/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticTest;

import java.util.Random;

public class login {
    public static void main(String[] args) {
        // 调用工具类，随机产生5位数验证码
        String code = VerifyTool.generateCode(5);
        System.out.println(code);
    }
}

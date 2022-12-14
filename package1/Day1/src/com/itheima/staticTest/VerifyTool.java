/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticTest;

import java.util.Random;

public class VerifyTool {

    // 定义成私有变量的原因防止工具类实例化，浪费内存，访问静态方法可以直接通过类名的方式进行访问
    private VerifyTool(){

    }

    /**
     * 随机产生n位验证码
     * @param n
     * @return
     */
    public static String generateCode(int n){
        String str = "0123456789QWERTYUIOPASDFGHJKLZXCVBNMqwertyuiopasdfghjklzxcvbnm";
        String code = "";
        Random random = new Random();
        for(int i = 0; i < n; i++){
            int index = random.nextInt(str.length());
            code += str.charAt(index);
        }

        return code;
    }

}

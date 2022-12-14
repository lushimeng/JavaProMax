/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_decorator_pattern;

import java.util.Arrays;

public class FileInputStream extends InputStream{
    @Override
    public int read() {
        System.out.println("低性能的方式读取一个字节a");
        return 97;
    }

    @Override
    public int read(byte[] buffer) {
        buffer[0] = 97;
        buffer[1] = 98;
        buffer[2] = 99;
        System.out.println("低性能的方式读取一个字节素组：" + Arrays.toString(buffer));
        return 3;
    }
}

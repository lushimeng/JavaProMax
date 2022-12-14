/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_decorator_pattern;

public class BufferedInputStream extends InputStream{
    private InputStream is;
    public BufferedInputStream(InputStream is){
        this.is = is;
    }

    @Override
    public int read() {
        System.out.println("提供8KB的缓冲区，提高读数据性能~~~");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8KB的缓冲区，提高读数据性能~~~");
        return is.read(buffer);
    }
}

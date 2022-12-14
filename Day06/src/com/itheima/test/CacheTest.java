/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.test;

public class CacheTest {
    public static void main(String[] args) {
        Cache<String> cache = new Cache();
        cache.setValue("1234");
        System.out.println(cache.getValue());

        Cache<Integer> cache1 = new Cache<>();
        cache1.setValue(1234);
        System.out.println(cache1.getValue());
    }
}

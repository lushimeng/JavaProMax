/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.test;

public class Cache<T> {
    T value;

    public Object getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

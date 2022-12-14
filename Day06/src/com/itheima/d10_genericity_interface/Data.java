/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_genericity_interface;

public interface Data<T> {
    void add(T t);
    void delete(int id);
    void update(T t);
    T queryById(int id);
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d8_genericity_class;
import java.util.ArrayList;

public class MyArrayList<E> {
    // 外面相当于包装了一层壳，实际上里面还是运用到ArrayList集合
    ArrayList list = new ArrayList();
    public void add(E e){
        list.add(e);
    }

    public void remove(E e){
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}

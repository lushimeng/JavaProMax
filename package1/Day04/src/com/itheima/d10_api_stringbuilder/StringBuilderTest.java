/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_api_stringbuilder;

/**
 * 分析：
 * 1、定义一个方法，要求该方法能够接收数组，并输出数组内容。 ---> 需要参数吗？需要返回值类型申明吗？
 * 2、定义一个静态初始化的数组，调用该方法，并传入该数组。
 *
 * 设计一个方法用于输出任意整型数组的内容，要求输出成如下格式：
 *       “该数组内容为：[11, 22, 33, 44, 55]”
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55};
        String str = print(array);
        System.out.println(str);
    }
    public static String print(int[] array){
        if(array == null){
            return null;
        }
        // 开始拼接内容
        StringBuilder s = new StringBuilder("[");
        for(int i = 0; i < array.length; i++){
            s.append(array[i]).append(i == array.length - 1 ? "" : ", ");  // 链式编程 + 三元运算符
        }
        s.append("]");
        return s.toString();
    }

}

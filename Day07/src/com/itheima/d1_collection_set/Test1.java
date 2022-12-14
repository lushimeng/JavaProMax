/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_collection_set;

public class Test1 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";  // 共用同一个常量池中的数组，所以地址也相同
        String str3 = "abd";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());

    }

    /**
     * 重写hashCodeTest
     */
    public static void hashcodeTest(){
        String name = new String("abc");
        int hash = 0;
        char[] array = name.toCharArray();
        // 生成自己的hashcode
        for (int i = 0; i < array.length; i++) {
            System.out.println(hash);
            hash = 31*hash + array[i];
        }
        System.out.println(hash);
        System.out.println(name.hashCode());
    }
}

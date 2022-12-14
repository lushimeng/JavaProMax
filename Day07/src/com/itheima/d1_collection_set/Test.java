/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_collection_set;
// 文章连接：https://www.cnblogs.com/zhengyixin/p/14891400.html
public class Test {
    public static void main(String[] args) {
        // 获取对象的哈希值，同一对象的hash值一样，不同对象的hash值不一样
        String str1 = new String("hashCode");
        String str2 = new String("hashCode");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1.equals(str2));  // true, 重写了Object类型的equals方法
        System.out.println(str1.hashCode() == str2.hashCode());  // 由于String类重写了equals, 所以也必须重写了hashCode方法 true
    }
}

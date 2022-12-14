/**
 * @Time:     2021/00/00
 * @Author:   LSM
 * @Email:    3108763730@qq.com
 * @File:     test.java
 * @Software: IDEA
 */
package com.itheima.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;

public class TestDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("速速");
        System.out.println(list);

        // 4.2 倒叙删除法，这种方式就不会出现并发修改异常问题
        for(int i = list.size() - 1; i >= 0; i--){
            String str = list.get(i);
            if("Java".equals(str)){
                list.remove(str);  // 根据内容进行删除
            }
        }
        System.out.println(list);  // [黑马, 赵敏, 赵敏, 速速]
    }
}

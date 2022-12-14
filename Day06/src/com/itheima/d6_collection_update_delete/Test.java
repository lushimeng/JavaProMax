/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;

/**
 目标：研究集合遍历并删除元素可能出现的：并发修改异常问题。
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("黑马");
        list.add("Java");
        list.add("Java");
        list.add("赵敏");
        list.add("赵敏");
        list.add("速速");
        System.out.println(list);

        // 删除全部的java信息
        // [黑马, Java, Java, 赵敏, 赵敏, 速速]
        //         it：出错的原因在于用list.remove("Java")进行删除第一个Java后，it向后移动，直接指到赵敏的位置
        // 没有进行完全删除, 而使用迭代器自带的it.remove()在进行并发操作的时候进行删除向后退一个
        // 1. 使用迭代器进行删除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String ele = it.next();
//            if("Java".equals(ele)){
//                // 删除Java
//                //list.remove(ele);  // ConcurrentModificationException并发修改异常
//                it.remove();  // 使用迭代器自在的删除可以成功, 因为执行成功后会自动进行减1操作
//            }
//        }
//        System.out.println(list);

        // 2. foreach、增强for循环删除(会出现问题，这种无法解决的，foreach不能边遍历边删除，会出bug)
//        for(String s : list){
//            if("Java".equals(s)){
//                list.remove(s);  // ConcurrentModificationException
//            }
//        }

        // 3. lambda表达式(会出现问题，这种无法解决的，Lambda遍历不能边遍历边删除，会出bug)
//        list.forEach(s -> {
//            if("Java".equals(s)){
//                list.remove(s); // ConcurrentModificationException
//            }
//        });

        // 4.1 for循环(可以一边遍历一边进行删除)
        for(int i = 0; i < list.size(); i++){
            if("Java".equals(list.get(i))){
                list.remove(i);  // 根据索引进行删除
                i--;  // 防止并发修改异常问题
            }
        }
        System.out.println(list);  // [黑马, 赵敏, 赵敏, 速速]

        // 4.2 倒叙删除法，这种方式就不会出现并发修改异常问题
        for(int i = list.size() - 1; i >= 0; i--){
            String str = list.get(i);
            if("赵敏".equals(str)){
                list.remove(str);  // 根据内容进行删除
            }
        }
        System.out.println(list);  // [黑马, 赵敏, 赵敏, 速速]

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_collection_traversal;


import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("赵敏");
        lists.add("校招");
        lists.add("潘晓");
        lists.add("王亮");
        System.out.println(lists);

//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        // lambda应用
//        lists.forEach((String s) -> {
//            System.out.println(s);
//        });

        // lambda应用
//        lists.forEach( s -> System.out.println(s)
//        );

        lists.forEach(System.out::println);

    }

}

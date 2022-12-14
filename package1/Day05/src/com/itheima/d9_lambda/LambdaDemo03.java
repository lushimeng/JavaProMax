/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo03 {
    public static void main(String[] args) {
        Integer[] age = {34, 12, 42, 23};
        /**
         * 参数1：被排序的数组 必须是引用类型的元素
         * 参数二：匿名内部类对象，代表一个比较器
         */

        // 第一种写法
//        Arrays.sort(age, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 -o1;  // 降序
//            }
//        });

        // 第二种写法
//        Arrays.sort(age, (Integer o1, Integer o2) -> {
//            return o2 -o1;  // 降序
//        });

        // 第三种写法
//        Arrays.sort(age, (o1, o2) -> {
//            return o2 - o1;  // 降序
//        });

        // 第四种写法
        Arrays.sort(age, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(age));

        System.out.println("------------------------------");
        JFrame win = new JFrame("登录界面");
        JButton btn = new JButton("我是一个很大的按钮");

//        // 第一种写法
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("有人点我，点我，点我~~~");
//            }
//        });

//        // 第2种写法
//        btn.addActionListener((ActionEvent e) -> {
//            System.out.println("有人点我，点我，点我~~~");
//        });

//        // 第3种写法
//        btn.addActionListener( e -> {
//            System.out.println("有人点我，点我，点我~~~");
//        });


        // 第4种写法
        btn.addActionListener( e -> System.out.println("有人点我，点我，点我~~~"));

        win.add(btn);
        win.setSize(400, 300);
        win.setVisible(true);

    }
}












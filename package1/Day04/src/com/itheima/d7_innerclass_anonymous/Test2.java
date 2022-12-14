/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_innerclass_anonymous;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        // 1，创建窗口
        JFrame win = new JFrame("登录界面");
        JPanel panel = new JPanel();
        win.add(panel);

        // 2，创建一个按钮对象
        JButton btn = new JButton("登录");

        // 注意：讲解匿名内部类的使用
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(win, "点我一下，说明爱我！");
//            }
//        });

        // 和上面一样的效果， 能够简化代码
        btn.addActionListener(e -> JOptionPane.showMessageDialog(win, "点我一下，说明爱我！"));


        // 3, 包按钮对象添加到桌布上展示
        panel.add(btn);

        // 4, 展示窗口
        win.setSize(800, 600);
        win.setLocationRelativeTo(null);
        win.setVisible(true);
    }
}

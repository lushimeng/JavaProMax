/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_polymorphic_Test;

public class Test {
    public static void main(String[] args) {
        USB usb = new Mouse();
        usb.insertComputer();
        usb.outputComputer();

        // 利用强制转换调用子类特有的方法
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.print();
        }

        usb = new Keyboard();
        usb.insertComputer();
        usb.outputComputer();


        // 利用强制转换调用子类特有的方法
        if(usb instanceof Mouse){
            Mouse mouse = (Mouse)usb;
            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard)usb;
            keyboard.print();
        }
    }
}

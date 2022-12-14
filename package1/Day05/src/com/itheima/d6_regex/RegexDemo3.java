/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_regex;

import java.util.Scanner;

public class RegexDemo3 {
    public static void main(String[] args) {
//        checkPhone();
        checkMobilePhone();
//          checkEmail();


    }
    public static void checkMobilePhone(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入你的手机号: ");
            String phone = sc.next();
            if(phone.matches("(400-?100-?\\d{3,6})")){
                System.out.println("手机号合法！！");
                break;
            }else {
                System.out.println("手机号输入错误，请重新输入：");
            }
        }
    }
    public static void checkEmail(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("输入你的邮箱: ");
            String phone = sc.next();
            /**
             判断邮箱格式是否正确   3268847878@qq.com
             判断邮箱格式是否正确   3268847dsda878@163.com
             判断邮箱格式是否正确   3268847dsda878@pci.com.cn
             */
            if(phone.matches("\\w{1,20}@[a-z0-9A-Z]{1,5}(\\.[a-z0-9A-Z]{1,3}){1,2}")){
                System.out.println("邮箱合法！！");
                break;
            }else {
                System.out.println("邮箱输入错误，请重新输入：");
            }
        }
    }
    public static void checkPhone(){
        Scanner sc = new Scanner(System.in);
        while (true){
          System.out.println("输入你的手机号: ");
          String phone = sc.next();
          if(phone.matches("1[3-9]\\d{9}")){
              System.out.println("手机号合法！！");
              break;
          }else {
              System.out.println("手机号输入错误，请重新输入：");
          }
      }
    }
}

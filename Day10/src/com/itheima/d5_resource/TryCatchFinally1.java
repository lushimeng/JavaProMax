/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_resource;

import java.io.*;

public class TryCatchFinally1 {
    public static void main(String[] args){
        InputStream is = null;
        OutputStream os = null;
        try {
            // 1、创建一个输入流对象
            is = new FileInputStream("C:\\Users\\lenovo\\Desktop\\linf.gif");
            // 2、创建一个输出流对象
            os = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\new.gif"); // 可以追加

//            System.out.println(10 / 0);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = is.read(bytes)) != -1){
                os.write(bytes, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 无论代码是否正常结束，都要最后执行这里，即便上面的try或者catch中又return,也要等finally执行完比之后才可以返回
            try {
                if(is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("----------finally-------------------");
        }
        System.out.println(test(10, 1));

    }

    public static int test(int a, int b){
        try {
            int c = a / b;
            System.out.println("执行了try阶段，返回: " + c);
            return c;
        } catch (Exception e) {
            System.out.println("执行了catch阶段，返回-1111");
            e.printStackTrace();
            return -1111;
        }finally {
            // 哪怕上面的try...catch语句中有return语句，也必须先执行完finally里面的语句
            // 在finally中加入return语句，则一定是返回finally中的return
            System.out.println("执行了finally阶段，返回: 100");
            return 100;
        }
    }
}

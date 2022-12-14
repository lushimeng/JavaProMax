/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_reflect_framework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

// 保存任意类型的对象
public class MybatisUtil {
    public static void save(Object obj){
        try(
                PrintStream ps = new PrintStream(new FileOutputStream("E:/new.log", true));
                ) {
            // 1. 获取class
            Class c = obj.getClass();

            System.setOut(ps);  // 这行代码一下的输出都会重定向ps所指向的文件中

            // 2. 获取全部成员变量
            Field[] fields = c.getDeclaredFields();

            //  c.getSimpleName()获取当前类名, c.getName获取全限名：包名+类名
            //  System.out.println("==============" + c.getSimpleName() + "==============");
            System.out.println("==============" + c.getSimpleName() + "==============");

            // 3. 遍历Field数组，获取成员变量信息
            for (Field field : fields) {
                field.setAccessible(true);  // 暴力修改权限
                String name = field.getName();  // 获取变量名
                String value = field.get(obj) + ""; // field.get(obj)不一定为字符串，但是考虑到都是存入到文件中可以把变量的值以字符串的方式进行存储
                System.out.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

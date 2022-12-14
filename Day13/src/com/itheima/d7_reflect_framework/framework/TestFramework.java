/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_reflect_framework.framework;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class TestFramework {
    public static void main(String[] args){
        try(
                // 把打印流放在try（）中的原因在于不用任务释放资源了,不需要程序员自己来写ps.close()语句
                PrintStream ps = new PrintStream(new FileOutputStream("Day13/src/com/itheima/d7_reflect_framework/framework/Object.log", true));
                ) {

            System.setOut(ps);  // 在该行之后输出在控制台上的重定向到文件中


            // 2. 创建对象
            Teacher teacher = new Teacher("张老师", '男', 12000);
            Util.frameWorkToText(teacher);

            Student student = new Student("冰糖小葫卢", '男', 23, "网络空间安全2班", "唱跳Rapper打篮球");
            Util.frameWorkToText(student);

            Dog dog = new Dog("棕色", 12.5, 5);
            Util.frameWorkToText(dog);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

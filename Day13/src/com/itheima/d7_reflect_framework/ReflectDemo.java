/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_reflect_framework;

public class ReflectDemo {
    public static void main(String[] args) {
        Student student = new Student("卢世猛", '男', 23, "1802", "唱跳打篮球");
        MybatisUtil.save(student);

        Teacher teacher = new Teacher("杨旭", '男', 10000.0);
        MybatisUtil.save(teacher);

        Dog dog = new Dog("棕色", 12.4, 4);
        MybatisUtil.save(dog);


    }
}

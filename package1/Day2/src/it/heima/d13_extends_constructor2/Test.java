/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d13_extends_constructor2;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("lushimeng", 22, "1班");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getClassName());
    }
}

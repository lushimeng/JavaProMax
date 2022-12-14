/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d10_extends_field_method;

public class ExtendsDemo1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.run();
        student.go();
    }
}

class People{
    public void run(){
        System.out.println("父类可以跑~~~");
    }
}

class Student extends People{
    public void run(){
        System.out.println("子类可以跑~~~");
    }
    public void go(){
        run(); // 子类的
        super.run();  // 父类的
    }
}

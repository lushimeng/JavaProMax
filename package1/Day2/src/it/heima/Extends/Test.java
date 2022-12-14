/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setAge(20); // Teacher类中并没有定义这些变量，但是继承了父类的变量，就可以直接使用了
        teacher.setName("lilaoshi");
        teacher.teach();

        Student student = new Student();
        student.setAge(17);
        student.setName("lushimeng");
        student.study();


    }
}

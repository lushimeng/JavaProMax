/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends1;

public class Test {
    public static void main(String[] args) {
        // 实例化学生对象
        Student student = new Student();
        student.setName("lushimeng");
        student.setAge(18);
        student.setClassName("网安2班");
        student.stuAction();  // 学生行为
        student.showInfo();
        System.out.println(student.getName() + "  " +
                student.getAge() + "  " +
                student.getClassName());

        // 实例化老师对象
        Teacher teacher = new Teacher();
        teacher.setName("zhanghengru");
        teacher.setAge(45);
        teacher.setDept("计算机部门");
        teacher.teaAction();  // 学生行为
        teacher.showInfo();
        System.out.println(teacher.getName() + "  " +
                teacher.getAge() + "  " +
                teacher.getDept());
    }
}

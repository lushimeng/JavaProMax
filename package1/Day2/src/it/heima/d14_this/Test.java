/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d14_this;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("王亮", "西南石油大学");
        System.out.println(student1.getName());
        System.out.println(student1.getSchoolName());

        Student student2 = new Student("lushimeng");
        System.out.println(student2.getName());
        System.out.println(student2.getSchoolName());
    }
}



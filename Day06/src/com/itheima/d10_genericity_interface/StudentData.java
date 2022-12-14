/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d10_genericity_interface;

public class StudentData implements Data<Student>{
    @Override
    public void add(Student o) {
    }

    @Override
    public void delete(int id) {
    }

    @Override
    public void update(Student o) {
    }

    @Override
    public Student queryById(int id) {
        return null;
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends;

public class Student extends People{
    /**
     * 学生独有行为
     */
    public void study(){
        System.out.println(getName() + "正在认真的学习");
    }
}

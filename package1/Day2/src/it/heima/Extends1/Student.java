/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends1;

public class Student extends People {
     public String className;

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void stuAction(){
        System.out.println("填写听课反馈~~~");
    }
}

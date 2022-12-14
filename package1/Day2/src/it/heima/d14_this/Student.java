/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d14_this;

public class Student {
    private String name;
    private String schoolName;
    public Student(){}

    public Student(String name){
        //super();
        this(name, "网安1班");
    }

    public Student(String name, String schoolName){
        this.name = name;
        this.schoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}

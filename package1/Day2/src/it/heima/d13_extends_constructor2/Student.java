/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d13_extends_constructor2;

public class Student extends People{
    public String className;
    public Student(){
        //  super();  // 系统会默认使用super()调用父类的无参构造器,可写可不写
    }

    public Student(String name, int age, String className){
        super(name, age);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}

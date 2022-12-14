/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends1;

public class Teacher extends People{
    public String dept;

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void teaAction(){
        System.out.println("发布问题~~~");
    }

}

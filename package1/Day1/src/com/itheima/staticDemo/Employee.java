/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.staticDemo;

public class Employee {
    public int age;
    public String name;
    public String dept;
    public static String company = "alibaba";

    public void showInfos(){
        System.out.println("员工age:" + age + ", 员工name:" + name + ", 员工dept:" + dept + ", 公司名称:" + Employee.company);
    }

    public static int compareByAge(int age1, int age2){
        return ( age1 > age2 ? age1 : age2);
    }

    public static void main(String[] args) {
        System.out.println(Employee.compareByAge(10, 20));

        Employee employee = new Employee();
        employee.age = 100;
        employee.name = "lushimeng";
        employee.dept = "计算机技术部门";
        employee.showInfos();

    }
}

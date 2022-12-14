/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_params;

public class Student implements Comparable<Student>{
    private String name;
    private double chinese;
    private double math;
    private double english;
    private double sum;

    public Student() {
    }

    public Student(String name, double chinese, double math, double english) {
//        this.sum = chinese + math + english;
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;

        // 必须放在chinese, math, english都已经赋值后的后面才可以，放在其前面，变量还没有被赋值，则sum计算结果为0
        this.SUM();
    }

    public void SUM(){
        this.sum = this.chinese + this.math + this.english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + sum +
                '}';
    }

    /**
     * 类自定义比较规则，实现  Comparable接口   重写   里面的   compareTo方法    来定制比较规则
     * o2.compareTo(o1);
     * @param o
     * @return
     */
    @Override
    public int compareTo(Student o) {
//        return this.sum >= o.sum ? 1 : -1;  // 按照升序排列
        return o.sum >= this.sum ? 1 : -1;  // 按照降序排列
    }
}

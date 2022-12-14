/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_innerclass_static;

public class Outer {
    public static int a = 100;
    private String hobby;

    // 学习静态成员内部类
    public static class Inner{
        private String name;
        private int age;
        public static String schoolName;

        public Inner(){}
        public Inner(String name, int age){
            this.name = name;
            this.age = age;
        }

        public void show(){
            System.out.println("名称：" + name);
            System.out.println(a);
            // System.out.println(hobby);;
            Outer outer = new Outer();
            System.out.println(outer.hobby);
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public static String getSchoolName() {
            return schoolName;
        }

        public static void setSchoolName(String schoolName) {
            Inner.schoolName = schoolName;
        }
    }

}

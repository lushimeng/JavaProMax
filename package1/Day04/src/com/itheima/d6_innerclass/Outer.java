/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d6_innerclass;

public class Outer {
    public static int num = 111;
    private String hobby;

    public Outer(){}
    public Outer(String hobby){
        this.hobby = hobby;
    }

    // 成员内部类， 不能加static修饰，属于外部类对象
    public class Inner{
        private String name;
        private int age;
       /* public static int a = 100;  // JDK 16开始支持静态成员了

        public static void test(){  // JDK 16开始支持静态方法了
            System.out.println(a);
        }*/
        public void show(){
            System.out.println("名称：" + name);
            System.out.println("数量：" + num);  // 可以直接访问外部类的静态变量
            System.out.println("爱好：" + hobby); // 可以直接访问外部类的实例成员变量
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
    }

}

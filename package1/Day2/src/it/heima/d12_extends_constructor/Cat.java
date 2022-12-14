/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d12_extends_constructor;

public class Cat extends Animal {
    public Cat(){
        super();// 默认的，写不写都有，找到父类的无参构造器
        System.out.println("==子类Cat无参构造器被执行==");
    }

    public Cat(String n){
        // super(); // 默认有super的，写不写都可以
        System.out.println("==子类Cat有参构造器被执行==");
    }
}

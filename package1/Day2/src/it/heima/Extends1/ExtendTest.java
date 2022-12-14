/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends1;
/**
 * 继承的特点
 * 子类可以继承父类的属性和行为，但是子类不能继承父类的构造器。
 * Java是单继承模式：一个类只能继承一个直接父类。
 * Java不支持多继承、但是支持多层继承。
 * Java中所有的类都是Object类的子类。
 */
public class ExtendTest {
    public static void main(String[] args) {

    }
}

class A extends Object{
    A(){}
}

class B extends A{

}

class C extends B{

}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d10_extends_field_method;

public class ExtendsDemo {
    public static void main(String[] args) {
        // 实例化对象
        Wolf wolf = new Wolf();
        System.out.println(wolf.name);
        wolf.show();
    }
}
// 在一个类中只能有一个对象用public修饰
class Animal{  public String name = "父类动物";}

class Wolf extends Animal{
    public String name = "子类动物";

    public void show(){
        String name = "局部动物名称";
        System.out.println(name); // 局部name
        System.out.println(this.name); // 子类name
        System.out.println(super.name); // 父类name
    }
}
/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package come.itheima.thisDemo;

public class Car {
    private String name;
    private double price;

    public Car(){

    }

    // 谁new Car(), this就指向谁,和该对象有同样的地址
    public Car(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void game(String name){
        // this出现在构造器，或者方法中，哪个对象调用他们，this就代表哪个对象
        System.out.println(this);
        System.out.println(this.name + "正在和" + name + "比赛~~~");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}



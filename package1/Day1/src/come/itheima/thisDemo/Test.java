/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package come.itheima.thisDemo;

public class Test {
    public static void main(String[] args){
        Car car = new Car("法拉利", 5000000);
        System.out.println(car.getName());
        System.out.println(car.getPrice());

        car.game("五菱");
        System.out.println(car);


    }
}

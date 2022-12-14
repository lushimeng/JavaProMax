/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.Extends;

public class Teacher extends People {
    /**
     * 老师都有的行为，这也是继承的子类比父类强大的原因
     */
    public void teach(){
        System.out.println(getName() + "在快乐的教书~~~");
    }
}

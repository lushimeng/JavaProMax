/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d12_interface_jdk8;

import com.itheima.d11_interface_extends.SportMan;

public interface SportManInter {
    /**
     * 1、JDK 8开始：默认方法(实例方法)
     * -- 必须default，默认用public修饰
     * -- 默认方法，接口不能创建对象，这个方法智能过继给实现类，由实现类的对象调用。
     */
    default void run(){
        go();
        System.out.println("跑的非常快~~~");
    }

    /**
     * 2、静态方法
     * 必须使用static修饰，默认用public修饰
     * -- 接口静态方法，必须接口名自己调用
     */
    static void inAddress(){
        System.out.println("University");
    }

    /**
     * 3、私用方法
     * -- JDK 1.9开始支持的
     * -- 必须在接口内部才能被访问
     */
    private void go(){
        System.out.println("跑的快~~~");
    }
}

class PingPongMan implements SportManInter{

}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();
        // PingPongMan.inAddress();  // 接口名称不可调用接口的静态方法
        // p.inAddress();           // 接口实现类不可调用接口的静态方法错误

        SportManInter.inAddress();  // 接口中的静态方法只能用接口名称.静态方法的调用方式
    }
}

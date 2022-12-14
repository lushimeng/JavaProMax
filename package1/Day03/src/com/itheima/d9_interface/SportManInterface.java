package com.itheima.d9_interface;

public interface SportManInterface {
    // 接口中的成员：JDK 1.8之前只有 常量 和 抽象方法

    // 1、抽象类
    public final static String SCHOOL_NAME = "University";
    String PASS_WORD = "123456";

    // 2、抽象方法
    public abstract void run();
    void eat();

}

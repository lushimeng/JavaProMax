package com.itheima.d8_annotation;

/**
 * 注解的格式
 * public @interface 注解名称 {
 *     public 属性类型 属性名() default 默认值 ;
 * }
 */
public @interface MyBook {
    public String name();  // public为灰色的可以省略不写
    public String[] authors();
    public double price();
}

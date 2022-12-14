package com.itheima.d8_annotation;

public @interface Book {
    public String value();
    public double price() default 2.43;
}

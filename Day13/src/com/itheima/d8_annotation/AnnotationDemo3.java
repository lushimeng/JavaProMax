package com.itheima.d8_annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 *  解析注解的技巧
 *  1: 注解在哪个成分上，我们就先拿哪个成分对象。
 *  2: 比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解
 *  3: 比如注解作用在类上，则要该类的Class对象，再来拿上面的注解
 *  4: 比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解
 *
 *
 *  Annotation[]  getDeclaredAnnotations()
 * T getDeclaredAnnotation(Class<T> annotationClass)
 * boolean isAnnotationPresent(Class<Annotation> annotationClass)
 */

public class AnnotationDemo3 {
    @Test
    public void testClass(){
        System.out.println("----------------解析Class上的注解--------------------");
        // 1. 获取类的对象
        Class c = BookStore.class;

        // 2. 判断该类上面是否有指定的注解
        if(c.isAnnotationPresent(Bookk.class)){
            // 3. 获取注解对象
//            Annotation book = c.getDeclaredAnnotation(Bookk.class);  // 多态的写法，这里为了获得注解里面的内容就不要使用多态的方法
            Bookk book = (Bookk) c.getDeclaredAnnotation(Bookk.class);  // 强制转换
            System.out.println(book.value() + "----------" + book.price() + "----------" + Arrays.toString(book.authors()));
        }
    }


    @Test
    public void testMethod() throws Exception {
        System.out.println("\n----------------解析Method上的注解--------------------");
        // 1. 获取Class对象
        Class c = BookStore.class;
        // 2. 通过Class对象获取方法
        Method method = c.getDeclaredMethod("test");  // 得到BookStore类中名字为test，无参数的方法
        // 3. 判断该方法上面是否含有指定的注解
        if(method.isAnnotationPresent(Bookk.class)){
            // 4. 获得注解对象
            Bookk book = method.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value() + "----------" + book.price() + "----------" + Arrays.toString(book.authors()));
        }

    }
}


@Bookk(value = "情深深雨蒙蒙", price = 26.8, authors = {"xxx", "yyy"})
class BookStore{

    @Bookk(value = "精通java", authors = {"冰糖小葫卢", "碳烤小肥羊"})
    public void test(){

    }
}

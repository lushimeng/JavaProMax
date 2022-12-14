/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 public static Object newProxyInstance(ClassLoader loader,  Class<?>[] interfaces, InvocationHandler h)
 参数一：类加载器，负责加载代理类到内存中使用。
 参数二：获取被代理对象实现的全部接口。代理要为全部接口的全部方法进行代理
 参数三：代理的核心处理逻辑

 动态代理实现方法可以按照java开发文档的示例方法进行查找：Proxy
 动态代理类 （以下简称为代理类 ）是一个实现在类创建时在运行时指定的接口列表的类，具有如下所述的行为。
 代理接口是由代理类实现的接口。 代理实例是代理类的一个实例。 每个代理实例都有一个关联的调用处理程序对象，它实现了接口InvocationHandler 。
 通过其代理接口之一的代理实例上的方法调用将被分派到实例调用处理程序的invoke方法，传递代理实例，
 java.lang.reflect.Method被调用方法的java.lang.reflect.Method对象以及包含参数的类型Object Object的数组。
 调用处理程序适当地处理编码方法调用，并且返回的结果将作为方法在代理实例上调用的结果返回。
 */
public class ProxyUtil {
    public static  UserService getProxy(UserService obj) throws Exception {  // 利用接口当作参数，多态的方式
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // 参数1：代理对象本身，一般不管
                // 参数2：正在被代理的方法
                // 参数3：被代理方法，应该传入的参数
                long startTime = System.currentTimeMillis();
                // 触发真正的方法
                Object result = method.invoke(obj, args);
                long endTime = System.currentTimeMillis();
                System.out.println(method.getName() + "方法耗时：" + (endTime - startTime) / 1000.0 + "s");

                return result;
            }
        };


        // 这里要区分获得类对象的三种方式
        // 1. forName(全类名)方式   2. 类型.class      3. 实例化对象.getClass（也就是new出来的对象）

        //  Class proxyClass = Proxy.getProxyClass(obj.getClass().getClassLoader(), UserService.class);
        Class proxyClass = Proxy.getProxyClass(UserService.class.getClassLoader(), UserService.class);  // 第二个参数为什么必须是类名.class呐？？？？

        UserService us = (UserService) proxyClass.getConstructor(InvocationHandler.class).newInstance(handler);


        // 返回一个代理对象
        return us;
    }
}


























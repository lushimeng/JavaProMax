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
 *  public static Object newProxyInstance(ClassLoader loader,  Class<?>[] interfaces, InvocationHandler h)
 *  参数一：类加载器，负责加载代理类到内存中使用。
 *  参数二：获取被代理对象实现的全部接口。代理要为全部接口的全部方法进行代理
 *  参数三：代理的核心处理逻辑
 */
public class ProxyUtilTest {
    /**
     * 动态代理
     */
    public static  <T> T getProxy(T obj) throws Exception{
        return (T) Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 参数1：代理对象本身，一般不管
                        // 参数2：正在被代理的方法
                        // 参数3：被代理方法，应该传入的参数
                        long startTimer = System.currentTimeMillis();
                        // 触犯真正的方法
                        Object result = method.invoke(obj, args);

                        long endTimer = System.currentTimeMillis();
                        System.out.println(method.getName() + "消耗时间为：" + (endTimer - startTimer) / 1000.0 + "s");

                        return result;
                    }
                });
    }
}

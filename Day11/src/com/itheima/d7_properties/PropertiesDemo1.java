/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_properties;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 目标：Properties读取属性文件中的键值对信息。（读取）
 Properties的方法：
 -- public Object setProperty(String key, String value) ： 保存一对属性。
 -- public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值
 -- public Set<String> stringPropertyNames() ：所有键的名称的集合
 -- public void store(OutputStream out, String comments):保存数据到属性文件中去
 -- public synchronized void load(InputStream inStream):加载属性文件的数据到属性集对象中去
 -- public synchronized void load(Reader fr):加载属性文件的数据到属性集对象中去
 小结：
 属性集对象可以加载读取属性文件中的数据!!
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        // 1. 需求： 使用Properties把键值对信息存入到属性文件中去
        Properties properties = new Properties();  // Properties  extends Hashtable<Object,Object>  implements Map<K,V>,
        /**
         *  public synchronized Object setProperty(String key, String value) {
         *         return put(key, value);
         *     }
         *  可以发现setProperty底层源码还是put函数,相当于对put函数进行了一层封装，这种思想要学会。
         */
        properties.setProperty("admin", "1213456");
        properties.setProperty("lushm", "09346e");
        properties.setProperty("heima", "itcast");
        System.out.println(properties);

        // 2. 加载属性文件中的键值对数据到属性对象properties中去
        // 参数1：保存管道，字符输出流管道
        // 参数2：个人新的，随便写
        properties.store(new FileWriter("Day11/src/login.properties"), "第一次使用Properties保存信息~~~");
    }
}

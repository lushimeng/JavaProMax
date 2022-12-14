/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_properties;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;
import java.util.Set;

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
public class PropertiesDemo2 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        System.out.println(properties);  // {}

        // 加载属性文件中的键值对数据到属性对象properties中去
        properties.load(new FileReader("Day11/src/login.properties"));
        System.out.println(properties);  // {admin=1213456, lushm=09346e, heima=itcast}

        Set<String> set = properties.stringPropertyNames();
        for(String key : set){
            System.out.println(key + "----------" + properties.getProperty(key));  //getProperty的底层原理实际上为get,Object oval = super.get(key);
        }
    }
}

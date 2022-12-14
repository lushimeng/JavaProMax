/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_reflect_field;

import org.junit.Test;

import java.lang.reflect.Field;

public class FieldDemo2 {
    @Test
    public void setField() throws Exception {
       // a. 反射第一步，获取类对象
        Class c = Student.class;
        // b. 提取某个成员变量
        Field name = c.getDeclaredField("name");

        name.setAccessible(true); // 暴力打开权限

        // c. 赋值
        Student s = new Student();
        name.set(s, "lushimeng");  // 对象.方法(参数列表) 即s.method(参数) -----变化为------>  method.set(s, 参数列表)
        System.out.println(s);  // Student{name='lushimeng', age=0}

        // d.取值
        String getName = (String)name.get(s);
        System.out.println(getName);  // lushimeng
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_params;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * 在自定义类进行比较的时候，如果不设定比较规则会报错：ClassCastException
 */

public class StudentTest {
    public static void main(String[] args) {
        // 方法二：集合自定义Comparator比较器对象，重写比较规则。
        // Comparator前面有@FunctionalInterface，可以使用lambda负责
//        Set<Student> set = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getSum(), o2.getSum());  // 升序
////                return Double.compare(o2.getSum(), o1.getSum()); // 降序
//            }
//        });
//        Set<Student> set = new TreeSet<>( (o1,o2) -> Double.compare(o1.getSum(), o2.getSum()));  // 升序
        Set<Student> set = new TreeSet<>( (o1,o2) -> Double.compare(o2.getSum(), o1.getSum()));  // 降序
        set.add(new Student("卢一", 100, 100, 100));
        set.add(new Student("赵二", 99, 93, 34));
        set.add(new Student("王三", 99, 99, 99));
        set.add(new Student("宋四", 87, 78, 78));

        System.out.println(set.toString());
        Student student1 = null; // 接收变量

        // 迭代器访问集合
        Iterator<Student> it = set.iterator(); // 获取迭代器对象
        while (it.hasNext()){  // 访问当前指针所指向的位置,是否有值
            student1 = it.next();  // 把内容取出来赋给student,然后指针向后移动一位
            System.out.println(student1.getName() + "\t" +
                    student1.getChinese() + "\t" +
                    student1.getMath() + "\t" +
                    student1.getEnglish() + "\t" +
                    student1.getSum());
        }

        System.out.println("--------------------------------------------------------");
        // 增强for循环访问集合
        for(Student stu : set){
            System.out.println(stu.getName() + "\t" +
                    stu.getChinese() + "\t" +
                    stu.getMath() + "\t" +
                    stu.getEnglish() + "\t" +
                    stu.getSum());
        }
        System.out.println("--------------------------------------------------------");
        // lambda访问集合
        set.forEach(student -> System.out.println(student.getName() + "\t" + student.getChinese() + "\t" +
                                                  student.getMath() + "\t" +
                                                  student.getEnglish() + "\t" +
                                                  student.getSum()));

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_arraysw;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysDemo2 {
    public static void main(String[] args) {
        // 自定义数组的排序规则：Comparator比较器对象。
        // 1. Arrays的sort方法对于有值特性的数组是默认升序排序
        int[] ages = {34, 12, 42, 23};
        Arrays.sort(ages);
        System.out.println(ages);
        System.out.println(Arrays.toString(ages));

        // 2. 需求，降序排序！(自定义比较器对象，只能支持引用类型的排序)
        Integer[] ages1 = {12, 45, 56, 567};
        /**
         * 参数1：被排序的数组必须是引用类型的元素。
         * 参数2：匿名内部类对象，代表了一个比较器对象。
         */
        Arrays.sort(ages1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 -o1;  // 后面减去见面是降序
//                return o1 - o2; // 前面减去后面是升序
            }
        });
        System.out.println(Arrays.toString(ages1));

        System.out.println("-----------------------");
        Student[] students = new Student[3];
        students[0] = new Student("吴磊",23 , 175.5);
        students[1] = new Student("谢鑫",18 , 185.5);
        students[2] = new Student("王亮",20 , 195.5);

//        Arrays.sort(students);   // 程序直接崩掉
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 返回值必须是int的
//                return o2.getAge() - o1.getAge();  // 按照年龄降序
//                return o1.getAge() - o2.getAge(); // 按照年龄升序
//                return Double.compare(o1.getHeight(), o2.getHeight());  // 按照升高升序
                return Double.compare(o2.getHeight(), o1.getHeight());  // 按照身高降序
            }
        });
        System.out.println(Arrays.toString(students));



    }
}































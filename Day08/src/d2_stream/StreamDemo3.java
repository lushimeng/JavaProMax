/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
    目标：Stream流的常用API
    forEach : 逐一处理(遍历)
    count：统计个数
    -- long count();
    filter : 过滤元素
    -- Stream<T> filter(Predicate<? super T> predicate)
    limit : 取前几个元素
    skip : 跳过前几个
    map : 加工方法
    concat : 合并流。
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        // 1. filter : 过滤元素
        //Stream<T> filter(Predicate<? super T> predicate);
        // 链式编程，输出结果：张无忌 张强 张三丰 张三丰
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        // count：统计个数,
        long size = list.stream().filter(s -> s.length() == 2).count();  // 返回值为long类型而不是int类型
        System.out.println(size);  // 2

        // limit : 取前几个元素
        // 链式编程，输出结果：张无忌 张强
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));

        // skip : 跳过前几个
        // 链式编程，输出结果：张三丰 张三丰
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(s -> System.out.println(s));

        // map : 加工方法, 第一个参数原材料 --> 第二个参数是加工后的结果
        // 链式编程，输出结果：
        /**
         * xyz张无忌
         * xyz周芷若
         * xyz赵敏
         * xyz张强
         * xyz张三丰
         * xyz张三丰
         */
        list.stream().map(s -> "xyz" + s). forEach(s -> System.out.println(s));

        // 把所有的名称都加工成一个学生对象
        list.stream().map(s -> new Student(s)).forEach(student -> System.out.println(student));
        list.stream().map(Student::new).forEach(System.out::println);  // 构造器引用   方法引用（要求前后参数一致）

        // concat : 合并流。
        // 链式编程，输出结果：
        /**
         * 周芷若
         * Java1
         * Java2
         */
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("周"));
        Stream<String> s2 = Stream.of("Java1", "Java2");
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.forEach(s -> System.out.println(s));
    }
}







/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d2_stream;

import java.awt.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo04 {
    public static double allMoney = 0;
    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒",'男',30000 , 25000, null));
        one.add(new Employee("孙悟空",'男',25000 , 1000, "顶撞上司"));
        one.add(new Employee("沙僧",'男',20000 , 20000, null));
        one.add(new Employee("小白龙",'男',20000 , 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松",'男',15000 , 9000, null));
        two.add(new Employee("李逵",'男',20000 , 10000, null));
        two.add(new Employee("西门庆",'男',50000 , 100000, "被打"));
        two.add(new Employee("潘金莲",'女',3500 , 1000, "被打"));
        two.add(new Employee("武大郎",'女',20000 , 0, "下毒"));

        Employee oneMax = one.stream().max((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).get();
        System.out.println(oneMax);

        Topperformer oneTopperformer = one.stream().max((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).map(
                employee -> new Topperformer(employee.getName(), employee.getBonus() + employee.getSalary())
        ).get();
        System.out.println(oneTopperformer);

        Employee twoMax = two.stream().max((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).get();
        System.out.println(twoMax);

        Topperformer twoTopperformer = two.stream().max((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).map(
                employee -> new Topperformer(employee.getName(), employee.getBonus() + employee.getSalary())
        ).get();
        System.out.println(twoTopperformer);

        System.out.println("----------------------------------------------------------------");
        one.stream().sorted((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).  // 升序
                skip(1).limit(one.size()-2).forEach(employee -> {
                    allMoney += (employee.getBonus() + employee.getSalary());
        });
        System.out.println("部门1的平均工资为：" + allMoney / (one.size() - 2));

        allMoney = 0;
        two.stream().sorted((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).
                skip(1).limit(two.size() - 2).forEach(employee -> {
                    allMoney += (employee.getBonus() + employee.getSalary());
                });
        System.out.println("部门2的平均工资为：" + allMoney / (two.size() - 2));
        System.out.println("----------------------------------------------------------------");

        allMoney = 0;
        Stream<Employee> s1_stream = one.stream();  // 需要指定泛型，如果不指定返回的就死Object类型
        Stream<Employee> s2_stream = two.stream();
        Stream<Employee> s3 = Stream.concat(s1_stream, s2_stream); // 合并两个流
        s3.sorted((o1, o2) -> Double.compare(o1.getBonus() + o1.getSalary(), o2.getSalary() + o2.getBonus())).
                skip(1).limit(one.size() + two.size() - 2).forEach(employee -> {
                    allMoney += (employee.getBonus() + employee.getSalary());
                });

        // BigDecimal精度问题
        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println("开发部门平均工资为：" + a.divide(b, 4, RoundingMode.HALF_UP));
    }
}





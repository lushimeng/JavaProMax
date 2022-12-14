/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d2_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 目标：收集Stream流的数据到 集合或者数组中去。
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  // 多态的写法

        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList());  // 可变集合
        System.out.println(zhangList);  // [张无忌, 张强, 张三丰, 张三丰]
        zhangList.add("赵六");
        System.out.println(zhangList);  // [张无忌, 张强, 张三丰, 张三丰, 赵六]

        // stream has already been operated upon or closed
        // 特别注意注意注意： stream流只能用一次，要不然会报错：stream has already been operated upon or closed
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("赵"));
        List<String> luList = s2.collect(Collectors.toList());
        System.out.println(luList);  // [赵敏]


//        List<String> list1 = s1.toList();  // 直接进行toList为不可变集合，只能进行查看操作，不能进行增加，删除，更新操作
//        System.out.println(list1);
//        list1.add("杨银羽");
        System.out.println("----------------------------------------------------");
        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = s3.collect(Collectors.toSet());
        System.out.println(zhangSet);  // [张强, 张三丰, 张无忌]
        System.out.println("----------------------------------------------------");
        Stream<String> s4 = list.stream().filter(s -> s.startsWith("张"));
        Object[] objects = s4.toArray();
        System.out.println("数组内容为：" + Arrays.toString(objects));  // 数组内容为：[张无忌, 张强, 张三丰, 张三丰]
    }
}


























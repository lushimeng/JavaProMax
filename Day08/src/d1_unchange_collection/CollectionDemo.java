/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d1_unchange_collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class CollectionDemo {
    public static void main(String[] args) {
        // 1. 不可变的List集合,掉一共of方法创建的集合为不可变集合，不能进行增删改，但是可以进查找。
        // List集合特性：有序，可重复， 有索引
        List<Integer> list = List.of(1, 2, 1, 2, 3);
        System.out.println(list);
//        list.set(1, 1000);  // 改： UnsupportedOperationException
//        list.add(100);  // 增： UnsupportedOperationException
//        list.remove(0); // 删： UnsupportedOperationException

        // 1.1 利用增强for循环访问集合
        for(Integer integer : list){
            System.out.println(integer);
        }
        System.out.println("---------------------------------------------");

        // 2. 不可变的Set集合
        // Set集合的特性：不可重复，无索引， 无顺序
        // 下面这一行报错：IllegalArgumentException，应为在添加元素的时候有两个迪丽热巴，系统会自动抛出异常，不会帮你自动去掉
//        Set<String> set = Set.of("马尔查哈", "迪丽热巴", "古力娜招", "齐齐哈尔", "迪丽热巴");  // IllegalArgumentException
        Set<String> set = Set.of("马尔查哈", "古力娜招", "齐齐哈尔", "迪丽热巴");
        System.out.println(set);

//        set.add("赵六"); // 增加：UnsupportedOperationException
//        set.remove("迪丽热巴"); // 删除：UnsupportedOperationException
        // 2. 1 利用迭代器进行查看集合元素
        Iterator<String> iterator = set.iterator();  // 获取迭代器对象， 多态的写法，iterator方法的所在的类有Iterator的实现类
        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("------------------------------------------");
        // 3. 不可变的Map集合
        // map集合特性：无序，无索引，不可重复(键)
        Map<String, Integer> map = Map.of("huawei", 100, "三星", 200, "苹果", 10000);
        System.out.println(map);
//        map.put("vivo", 100);  // 增加：UnsupportedOperationException
//        map.remove("huawei");  // 删除：UnsupportedOperationException
//        map.replace("三星", 200, 20000);  // 修改：UnsupportedOperationException

        // 3.1 利用lambda访问集合
        map.forEach(( s, integer) -> System.out.println(s + "-------->" + integer));
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d2_stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        /*------------------Collection集合获取流--------------------*/
        Collection<String> list = new ArrayList<>();  // 多态
        Stream<String> s = list.stream();

        /*------------------Map集合获取流--------------------*/
        Map<Integer, String> map = new HashMap<>();  // 多态

        // 获取键流
        Stream<Integer> keyStream = map.keySet().stream();  //  map.keySet(): 获取键的集合

        // 获取值流
        Stream<String> valueStream = map.values().stream();  //  map.values(): 获取值的集合

        // 获取键值对流
        Stream<Map.Entry<Integer, String>> keyAndValueStream = map.entrySet().stream();  // map.entrySet(): 获取键值对的集合

        /*------------------数组获取流--------------------*/
        String[] names = {"1", "2"};
        // 1.1 数组获取流的方式
        Stream<String> namesStream = Arrays.stream(names);
        // 1.2 数组获取流的方式
        Stream<String> stringStream = Stream.of(names);
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Collections.addAll(list, "张无忌", "张强", "赵敏", "张三丰", "周芷若");
        System.out.println(list);

//        List<String> listLi = new ArrayList<>();
//
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()){
//            String value = it.next();
//            if(value.charAt(0) == '张'){
//                listLi.add(value);
//            }
//        }
//
//        System.out.println(listLi);
//
//
//        List<String> listLiThree = new ArrayList<>();
//        for(String str : listLi){
//            if(str.length() == 3){
//                listLiThree.add(str);
//            }
//        }
//
//        System.out.println(listLiThree);
        // Stream流
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length()==3).forEach(s -> System.out.println(s));

    }
}

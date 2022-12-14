/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d5_collection_list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * LinkedList也是List的实现类：底层是基于双链表的，增删比较快，查询慢！！
 *      LinkedList是支持双链表，定位前后的元素是非常快的，增删首尾的元素也是最快的
 *      所以LinkedList除了拥有List集合的全部功能还多了很多操作首尾元素的特殊功能：
 *          - public void addFirst(E e):将指定元素插入此列表的开头。
 *          - public void addLast(E e):将指定元素添加到此列表的结尾。
 *          - public E getFirst():返回此列表的第一个元素。
 *          - public E getLast():返回此列表的最后一个元素。
 *          - public E removeFirst():移除并返回此列表的第一个元素。
 *          - public E removeLast():移除并返回此列表的最后一个元素。
 *          - public E pop():从此列表所表示的堆栈处弹出一个元素。
 *          - public void push(E e):将元素推入此列表所表示的堆栈。
 *
 *     小结：
 *          LinkedList是支持双链表，定位前后的元素是非常快的，增删首尾的元素也是最快的。
 *          所以提供了很多操作首尾元素的特殊API可的实以做栈和队列现。
 *
 *          如果查询多而增删少用ArrayList集合。(用的最多的)
 *          如果查询少而增删首尾较多用LinkedList集合。
 */
public class ListDemo03 {
    public static void main(String[] args) {
        // LinkedList可以完成队列结构和栈结构(双链接)
        // 1. 做一个队列
        LinkedList<String> queue = new LinkedList<>();

        // 1. 入队
        queue.addLast("1");
        queue.addLast("2");
        queue.addLast("3");
        queue.addLast("4");
        queue.addLast("5");
        System.out.println(queue);  // [1, 2, 3, 4, 5]

        // 出队
        System.out.println(queue.getFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);  // [2, 3, 4, 5]

        // 1. 做一个栈
        LinkedList<String> stack = new LinkedList<>();

        // 入栈
        stack.push("第1颗子弹");
        stack.push("第2颗子弹");
        stack.push("第3颗子弹");
        stack.push("第4颗子弹");
        System.out.println(stack);  // [第4颗子弹, 第3颗子弹, 第2颗子弹, 第1颗子弹]

        // 出栈
        System.out.println(stack.removeFirst());  // 第4颗子弹
        System.out.println(stack.pop());  // 第3颗子弹
        System.out.println(stack);  // [第2颗子弹, 第1颗子弹]

        System.out.println("------------------------------------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addLast(6);
        linkedList.addLast(7);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + "  ");
        }
        System.out.println();
        System.out.println("------------------------------------");
        // 迭代器
        Iterator<Integer> it = linkedList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------------------------");
        // foreach/增强for循环
        for(Integer integer : linkedList){
            System.out.println(integer);
        }
        System.out.println("------------------------------------");
        // jdk 1.8之后lambda表达式遍历集合方式
        linkedList.forEach(s -> System.out.println(s));


    }
}

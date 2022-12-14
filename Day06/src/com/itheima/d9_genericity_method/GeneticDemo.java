/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d9_genericity_method;
public class GeneticDemo {
    public static void main(String[] args) {
        String[] names = {"lushimeng", "yangyinyu", "wangliang", "xigua", "xiangjia"};
        printArray(names);
        Character[] character = {'2', 'd', 'd', 'r'};
        printArray(character);
        Integer[] ages = {23, 435, 56, 67, 67};
        printArray(ages);

    }

    public static <T> void printArray(T[] array){
        if(array != null){
            StringBuilder sb = new StringBuilder("[");
            for(int i = 0; i < array.length; i++){
                sb.append(array[i]).append(i != array.length - 1 ? ", ": "");  // StringBuilder的链式编程
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(array);
        }
    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_collection_object;

import java.util.*;
import java.util.function.Consumer;

public class TestDemo {
    public static void main(String[] args) {
        Collection<Movie> movieCollection = new ArrayList<>();
        movieCollection.add(new Movie("《你好, 李焕英》", 9.5 , "贾玲"));
        movieCollection.add(new Movie("《唐人街探案》", 8.5, "王宝强"));
        movieCollection.add(new Movie("《刺杀小说家》", 8.6 , "雷佳音"));

        System.out.println(movieCollection);  // 默认调用toString方法,

        // 1. 迭代器访问集合
        Iterator<Movie> it = movieCollection.iterator();
        while (it.hasNext()){
            Movie movie = it.next();
            System.out.println(movie.toString());
        }

        System.out.println("--------------------------------------------");
        // 2. foreach/增强for循环访问集合
        for(Movie movie : movieCollection){
            System.out.println("电影名称：" + movie.getName() + ", 评分：" + movie.getScore() + ", 演员：" + movie.getActor());
        }

        System.out.println("--------------------------------------------");
        // 3. lambda访问集合
//        movieCollection.forEach(new Consumer<Movie>() {
//            @Override
//            public void accept(Movie movie) {
//                System.out.println("电影名称：" + movie.getName() +
//                        ", 评分：" + movie.getScore() +
//                        ", 演员：" + movie.getActor());
//
//            }
//        });


//        movieCollection.forEach((Movie movie) -> {
//            System.out.println("电影名称：" + movie.getName() +
//                    ", 评分：" + movie.getScore() +
//                    ", 演员：" + movie.getActor());
//
//        });

//        movieCollection.forEach(movie -> System.out.println("电影名称：" + movie.getName() + ", 评分：" + movie.getScore() + ", 演员：" + movie.getActor()));


//        movieCollection.forEach(System.out::println);  // Movie类中要重写toString方法，要不然输出的为地址

    }
}

/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d4_collection_object;

public class Movie {
    private String name;
    private double score;
    private String actor;

    public Movie(){

    }

    public Movie(String name, double score, String actor){
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }


    @Override
    public String toString() {  // 返回值类型为String类型， 在Movie类中重写toString，要不然会打印地址而不是内容
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actor='" + actor + '\'' +
                '}';
    }
}

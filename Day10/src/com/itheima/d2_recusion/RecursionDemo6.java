/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_recusion;

/**
 * 思想概述：
 * 1、对于递归，自己掌握的不好也可以说成是非常差劲的，要好好总给思路是如何来的。
 * 2、本题设置了三个静态变量解决了累加的问题，这是自己需要学习的地方
 * 3、递归函数的三个特性(关系式、递归的方向、结束条件)；
 */
public class RecursionDemo6 {
    public static int totalNumber;  // 总数量
    public static int lastBottleNumber; // 记录每次剩余的瓶子个数
    public static int lastBottleCapNumber;  // 记录每次剩余的盖子个数

    public static void main(String[] args) {
        buy(10);
        System.out.println("总数：" + totalNumber);
        System.out.println("剩余盖子数：" + lastBottleCapNumber);
        System.out.println("剩余瓶子数：" + lastBottleNumber);
    }
    public static void buy(int money){
      int buyNumber = money / 2;
      totalNumber += buyNumber;

      // 当前拥有的瓶子数和瓶盖数
      int currBottleNumber = lastBottleNumber + buyNumber;
      int currBottleCapNumber = lastBottleCapNumber + buyNumber;

      // 把瓶子和瓶盖换钱
      int totalMoney = 0;  // 统计瓶子和瓶盖换的钱数
      if(currBottleNumber >= 2){
          totalMoney += (currBottleNumber / 2) * 2;
      }
      lastBottleNumber = currBottleNumber % 2;

      if(currBottleCapNumber >= 4){
          totalMoney += (currBottleCapNumber / 4) * 2;
      }
      lastBottleCapNumber = currBottleCapNumber % 4;

      if(totalMoney >= 2){
          buy(totalMoney);
      }
    }
}














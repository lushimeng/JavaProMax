/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d7_abstract_demo;

public class Test {
    public static void main(String[] args) {
       BaiJin_Card baiJin_card = new BaiJin_Card();
       baiJin_card.setAccount(10000);
       baiJin_card.setName("LuShiMeng");
       baiJin_card.pay(300);

       YIn_Card yIn_card = new YIn_Card();
       yIn_card.setName("YangXinYu");
       yIn_card.setAccount(5000);
       yIn_card.pay(300);
    }
}

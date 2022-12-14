/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d8_exception_default_runtime;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 1. 创建一个输入类
        Scanner sc = new Scanner(System.in);

        while (true){
            try {
                System.out.println("请输入价格：");
                String priceStr = sc.nextLine();
                double price = Double.valueOf(priceStr);
                if(price > 0){
                    System.out.println("价格：" + price);
                    break;
                }else {
                    System.out.println("输入价格有误，请重新输入~~~");
                }
            } catch (NumberFormatException e) {
                System.out.println("输入价格有误，请重新输入~~~");
            }
        }
    }
}
































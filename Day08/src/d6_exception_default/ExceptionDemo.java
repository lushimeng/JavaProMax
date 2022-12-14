/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d6_exception_default;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
        chu(10, 0);
        System.out.println("程序结束。。。");

    }

    public static void chu(int a, int b){
        System.out.println(a);
        System.out.println(b);
        int c = a / b; // 异常点
        System.out.println(c);
    }
}

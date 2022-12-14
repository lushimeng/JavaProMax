/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d4_exception_tuntimeException;

import java.util.Objects;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。");
        // 1. 数组索引越界异常：ArrayIndexOutOfBoundsException
        int[] array = {1, 2, 3, 4};
        System.out.println(array[3]);
//        System.out.println(array[4]);
        // 2. 空指针异常：NullPointerException
        String name = null;
        System.out.println(name);
//        System.out.println(name.equals("abc"));
        System.out.println(Objects.equals(name, "abc"));

        // 3. 类型转换异常：ClassCastException
        Object o = 34;  // 多态的写法
//        String str = (String) o;
        System.out.println(o);

        // 4. 数学操作异常：ArithmeticException
//        int c = 10 / 0;

        // 5. 数字转换异常：NumberFormatException
        String number = "23";
//        String number1 = "23abc";
        Integer it = Integer.parseInt(number);
        System.out.println(it);

    }
}

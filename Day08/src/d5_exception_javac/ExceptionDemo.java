/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d5_exception_javac;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String date = "2022.04.13 17:00:00";
        // 1. 创建一个简单日期格式化类：
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

        // 2. 解析字符串时间成为日期对象
        Date parse = sdf.parse(date);
        System.out.println(parse);
    }
}

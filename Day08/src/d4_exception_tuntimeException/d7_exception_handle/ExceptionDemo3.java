/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d4_exception_tuntimeException.d7_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
        try {
            parseTime("2022-4-13 17:15:00");
            System.out.println("程序执行成功。。。");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序执行失败。。。");
        }
        System.out.println("程序结束。。。");
    }
    public static void parseTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf.parse(date);
        System.out.println(date1);

//        InputStream is = new FileInputStream("C:/picture.jpg");

    }
}

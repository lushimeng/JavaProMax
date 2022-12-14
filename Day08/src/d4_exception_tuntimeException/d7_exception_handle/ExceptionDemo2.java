/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package d4_exception_tuntimeException.d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println("程序开始。。。");
            String date = "2022-4-13 17:15:00";
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy、MM-dd HH:mm:ss");
            Date date1 = sdf.parse(date);
            System.out.println(date1);

            InputStream is = new FileInputStream("C:/picture.jpg");
            System.out.println("程序结束。。。");
        } catch (ParseException|FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("程序出现异常了。。。。");
        }
    }
}

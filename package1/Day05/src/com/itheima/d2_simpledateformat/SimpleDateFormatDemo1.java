/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // 请计算出 2021年08月06日11点11分11秒，往后走2天14小时49分06秒后的时间是多少。
        String timeBefore = "2021年08月06日 11点11分11秒";

        // 1. 格式化这个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH点mm分ss秒");

        // 2. 利用parse解析方法进行解析, parse源码
        /**
         * public Date parse(String source) throws ParseException
         *     {
         *         ParsePosition pos = new ParsePosition(0);
         *         Date result = parse(source, pos);
         *         if (pos.index == 0)
         *             throw new ParseException("Unparseable date: \"" + source + "\"" ,
         *                 pos.errorIndex);
         *         return result;
         *     }
         */
        Date dateParse = sdf.parse(timeBefore);

        // 3. 转换为毫秒值2天14小时49分06秒后的时间是多少
        long time = dateParse.getTime();
        // 特别注意这个细节的地方，在2的后面加上一个L转换为long型的计算，要不然有可能超出int的范围
        time += (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;

        // 4. 调用format格式化毫秒值
        String timeAfter = sdf.format(time);
        System.out.println(timeAfter);
    }
}

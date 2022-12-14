/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d3_calendr;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        /**
         * |  **public final Date getime()**|**拿到此刻日期对象**  |
         * | **public long getTimeInMillis()** | **拿到此刻时间毫秒值*
         * **1、Calendar如何去得到日历对象的？**
         * public static Calendar getInstance() ： 获取当前日历对象
         */
        // 1. 拿到系统此刻日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        // 2. 获取日历的信息：public int get(int field):取日期中的某个字段信息
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int mm = calendar.get(Calendar.MONTH) + 1;
        System.out.println(mm);
        int day = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        // 3. 修改日历的某个字段信息: public void set(int field, int value)
//        calendar.set(Calendar.HOUR, 12);  // Calendar某一个字段值
//        System.out.println(calendar);

        // 4. public void add(int field, int amount): 为某个字段增加/减少指定的值
        calendar.add(Calendar.DAY_OF_YEAR, 64);
        calendar.add(Calendar.MINUTE, 59);

        // 5. public final Date getTime(): 拿到此刻日期对象
        Date date = calendar.getTime();
        System.out.println(date);

        // 6. public long getTimeInMillis(): 拿到此刻时间毫秒值
        long time = calendar.getTimeInMillis();
        System.out.println(time);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--MM--dd--HH--mm--ss");
        String format = sdf.format(date);
        System.out.println(format);
        String format1 = sdf.format(time);
        System.out.println(format1);
    }
}

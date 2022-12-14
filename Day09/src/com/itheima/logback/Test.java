/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *  目标： 快速搭建LogBack日志框架，记录程序的执行情况到控制台 到文件中
 */
public class Test {
    // 创建Logback的日志对象，代表了日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("Test.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行~~~");
            LOGGER.info("我开始记录第二行日志，我要开始做出发~~~");
            int a = 10;
            int b = 0;
            LOGGER.trace("a = " + a);
            LOGGER.trace("b = " +b);

            System.out.println(a / b);
        } catch (Exception e) {
            LOGGER.error("功能异常，" + e);
        }
    }
}


































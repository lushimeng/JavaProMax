/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_junit;

import org.junit.*;


public class TestUserService {
    // 修饰实例方法的，实例方法前执行一次，实例方法后执行一次
    // before用于加载资源，after用于释放资源
    @Before
    public void before(){
        System.out.println("=========实例方法前执行一次AA=========");
    }
    @After
    public void after(){
        System.out.println("=========实例方法后执行一次BB=========");
    }

    // 修饰静态方法
    @BeforeClass
    public static void beforeClass(){
        System.out.println("=========静态方法前执行一次AA=========");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println( "=========静态方法前执行一次BB=========");
    }

    /**
     * 测试方法
     * 1、必须是公开的  无参数  无返回值的方法
     * 2、测试方法必须使用@Test注解标记
     */
    @Test
    public void testLoginName(){
       UserService userService = new UserService();
        String str = userService.loginName("admin", "123456");

        // 进行预期结果的正确性测试：断言
        Assert.assertEquals("您的登录月舞可能出现问题", "登录成功！！!", str);
    }

    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }
}

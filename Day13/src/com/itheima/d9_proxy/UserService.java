package com.itheima.d9_proxy;

/**
 * 模拟用户接口
 */
public interface UserService {
    String login(String loginName, String passWord);
    void selectUsers();
    boolean deleteUsers();
}

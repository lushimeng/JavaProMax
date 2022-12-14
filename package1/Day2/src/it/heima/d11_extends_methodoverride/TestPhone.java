/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d11_extends_methodoverride;

public class TestPhone {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();
        newPhone.call();
        newPhone.sendMessage();
    }
}

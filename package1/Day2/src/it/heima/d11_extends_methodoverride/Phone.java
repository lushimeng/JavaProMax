/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d11_extends_methodoverride;

public class Phone {
    public void call(){
        System.out.println("打电话开始~~~");
    }
    public void sendMessage(){
        System.out.println("发短信开始~~");
    }
    public static void methodStatic(){
        System.out.println("静态方法不能被重写~~~");
    }
    private void methodPrivate(){
        System.out.println("私用方法不能被重写~~~");
    }
}

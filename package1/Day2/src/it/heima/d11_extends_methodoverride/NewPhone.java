/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package it.heima.d11_extends_methodoverride;

public class NewPhone extends Phone{
    @Override
    public void call(){
        super.call();
        System.out.println("支持视频通话~~~");
    }

    @Override
    public void sendMessage(){
        super.sendMessage();
        System.out.println("支持发送图片和视频~~~");
    }
}

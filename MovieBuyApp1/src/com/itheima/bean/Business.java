/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.bean;

/**
 * 商家类
 */
public class Business extends User{
    private String shopName; // 店铺名称
    private String address;  // 店铺地址

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Business{" + super.toString()  +
                ", shopName='" + shopName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

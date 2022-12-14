/**
 * @Time: 2021/00/00
 * @Author: LSM
 * @Email: 3108763730@qq.com
 * @File: test.java
 * @Software: IDEA
 */
package com.itheima.d1_dom4j;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
/**
 *          方法名	                             说明
 *
 * List<Element> elements()	              得到当前元素下所有子元素
 *
 * List<Element> elements(String name)	  得到当前元素下指定名字的子元素返回集合
 *
 * Element element(String name)	          得到当前元素下指定名字的子元素,如果有很多名字相同的返回第一个
 *
 * String getName()	                      得到元素名字
 *
 * String  attributeValue(String name)	  通过属性名直接得到属性值
 *
 * String elementText(子元素名)	          得到指定名称的子元素的文本
 *
 * String getText()	                      得到文本
 */
public class Demo4JTest2 {
    public static void main(String[] args) throws Exception{
        // a. 对输出在控制台上的文件进行重定向
        PrintStream ps = new PrintStream(new FileOutputStream("Day14\\src\\com\\itheima\\d1_dom4j\\Contact.log", true));
        System.setOut(ps);

        // 解析XML中的数据成为一个List集合对象
        // 1. 创建一个Dom4j的解析器对象，代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();

        // 2. 把XML文件加载到内存中成为一个Document文档对象
//        Document document = saxReader.read("Day14\\src\\Contacts.xml");
        Document document = saxReader.read(Demo4JTest2.class.getResourceAsStream("/Contacts.xml"));  // 最优雅加载文件的方式，在src下寻找

        // 3. 获取根节点
        Element root = document.getRootElement();

        // 5. 创建List集合
        List<Contact> list = new ArrayList<>();

        // 6. 获取所有的二级节点
        List<Element> elementSecond = root.elements("contact");  // 只获取节点名为contact
        for (Element element : elementSecond) {
            try {
                // 7. 创建一个Contact对象
                Contact contact = new Contact();

                String id = element.attributeValue("id");
                contact.setId(Integer.parseInt(id));  // 设置Id
                String vip = element.attributeValue("vip");
                contact.setVip(Boolean.parseBoolean(vip));  // 设置vip
                String name = element.elementTextTrim("name");
                contact.setName(name);  // 去空格的，设置姓名
                String gender = element.elementText("gender");
                contact.setGender(gender.charAt(0));  // 不去空格的，设置性别
                String email = element.elementTextTrim("email");
                contact.setEmail(email);  // 去空格的，设置email

                list.add(contact);  // 添加到list集合中
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        // 8. 遍历list集合
        for (Contact contact : list) {
            System.out.println(contact);
        }

        // 9. 释放资源
        ps.close();
    }
}

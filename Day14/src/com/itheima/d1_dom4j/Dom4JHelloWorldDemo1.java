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
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
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
public class Dom4JHelloWorldDemo1 {
    @Test
    public void parseXMLData() throws Exception{
        // 1. 创建一个Dom4j的解析器对象，代表了整个dom4j框架
        SAXReader saxReader = new SAXReader();
        // 2. 把XML文件加载到内存中成为一个Document文档对象
//        Document document = saxReader.read(new File("Day14\\src\\Contacts.xml"));
//        Document document = saxReader.read(new FileInputStream("Day14\\src\\Contacts.xml"));
        // 为了防止Day14\\src被修改，可以使用以下方式获取document
        InputStream is = Dom4JHelloWorldDemo1.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);

        // 3. 获取根元素对象
        Element root = document.getRootElement();
        System.out.println(root.getName());  // contactList
        // List<Element> elements = root.elements(); ["contact", "contact", "contact", "user"]
        List<Element> elements = root.elements("contact");  // 得到当前元素下指定名字的子元素返回集合,["contact", "contact", "contact"]
        for (Element element : elements) {
            System.out.println("------------" + element.getName() + "------------");
            System.out.println("id = " + element.attributeValue("id"));  // 通过id属性名直接得到属性值
            System.out.println("vip = " + element.attributeValue("vip"));  // 通过vip属性名直接得到属性值
            System.out.println("name = " + element.elementTextTrim("name"));  // 得到指定名称name的子元素的文本,并且会去掉文本两端的空格
            System.out.println("gender = " + element.elementText("gender"));  // 得到指定名称gender的子元素的文本
            System.out.println("email = " + element.elementTextTrim("email"));  // 得到指定名称email的子元素的文本,并且会去掉文本两端的空格
        }
    }
}












